package com.example.weiying.view.activity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.example.weiying.R;
import com.example.weiying.model.bean.DetailsBean;
import com.example.weiying.model.bean.FirstEvent;
import com.example.weiying.presenter.DetailsPresenter;
import com.example.weiying.view.fragment.BriefintroductionFragment;
import com.example.weiying.view.fragment.CommentFragment;
import com.example.weiying.view.interfaces.IDetailsview;
import com.squareup.picasso.Picasso;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

import cn.jzvd.JZVideoPlayer;
import cn.jzvd.JZVideoPlayerStandard;

public class DetailsActivity extends BaseActivity<DetailsPresenter> implements IDetailsview{
    private TabLayout tabLayout;
    private ViewPager viewPager;
    ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();
    ArrayList<String> titleList = new ArrayList<String>();
    private View title_include;
    private JZVideoPlayerStandard details_videoplayer;
    private ImageView title_back;
    private TextView title_name;
    private RecyclerView details_recycler;
    ArrayList<DetailsBean.RetBean.ListBean> biglist= new ArrayList<DetailsBean.RetBean.ListBean>();
    private BriefintroductionFragment briefintroductionFragment;
    private CommentFragment commentFragment;
    private LinearLayout details_linea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    protected int setLayout() {
        return R.layout.activity_details;
    }
    @Override
    protected void initView() {
       title_include = findViewById(R.id.details_title);
        details_linea = (LinearLayout)findViewById(R.id.details_linea);
        title_back = (ImageView) title_include.findViewById(R.id.title_back);
        title_name = (TextView)title_include.findViewById(R.id.title_name);
        details_videoplayer = (JZVideoPlayerStandard)findViewById(R.id.details_videoplayer);
        tabLayout = (TabLayout) findViewById(R.id.details_tabLayout);
        viewPager = (ViewPager) findViewById(R.id.details_viewPager);

       initfragment();
        MPagerAdapter mPagerAdapter = new MPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mPagerAdapter);
        //设置TabLayout的模式
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        //让tablayout和Viewpager关联;
        tabLayout.setupWithViewPager(viewPager);
    }

    private void initfragment() {
        briefintroductionFragment = new BriefintroductionFragment();
        commentFragment = new CommentFragment();
        fragmentList.add(briefintroductionFragment);
        titleList.add("简介" );

        fragmentList.add(commentFragment);
        titleList.add("评论" );

    }


    @Override
    protected void initData() {
        //获取id
        Intent intent = getIntent();
        String mediaId = intent.getStringExtra("mediaId");
        Log.e("==========",mediaId);
        basePresenter.detailsShow(mediaId);


    }

    @Override
    DetailsPresenter setPresenter() {
        return new DetailsPresenter();
    }




    @Override
    public void onBackPressed() {
        if (JZVideoPlayer.backPress()) {
            return;
        }
        super.onBackPressed();
    }


    @Override
    protected void onPause() {
        super.onPause();
        JZVideoPlayer.releaseAllVideos();

    }

    @Override
    public void onDetailsSuccess(DetailsBean.RetBean ret) {
        title_name.setText(ret.getTitle());
        //设置播放器播放地址
        details_videoplayer.setUp(ret.getHDURL()
                , JZVideoPlayerStandard.SCREEN_WINDOW_NORMAL, "");

        //设置播放器封面
        Picasso.with(this)
                .load(ret.getPic())
                .into(details_videoplayer.thumbImageView);
        //简介
        String description = ret.getDescription();
        //主演
        String actors = ret.getActors();
        //导演
        String director = ret.getDirector();
        List<DetailsBean.RetBean.ListBean> list = ret.getList();

        EventBus.getDefault().post(new FirstEvent(description,actors,director,list));


    }

    class MPagerAdapter extends FragmentPagerAdapter {

        public MPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        //需要重写个返回标题的方法;
        @Override
        public CharSequence getPageTitle(int position) {
            return titleList.get(position);
        }
    }
}
