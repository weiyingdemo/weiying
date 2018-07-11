package com.example.weiying.view.fragment;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.weiying.BannerImagerLoder;
import com.example.weiying.GradationScrollView;
import com.example.weiying.R;
import com.example.weiying.model.bean.SelectedBeans;
import com.example.weiying.presenter.SelectedPresenter;
import com.example.weiying.view.activity.SearchActivity;
import com.example.weiying.view.adapter.SelectedRcyAdapter;
import com.example.weiying.view.interfaces.ISelectedView;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nyj on 2018/7/6.
 */
public class SelectedFragment extends Fragment implements ISelectedView, SwipeRefreshLayout.OnRefreshListener, View.OnClickListener {
    ArrayList<SelectedBeans.RetBean.ListBean.ChildListBean> beans = new ArrayList<SelectedBeans.RetBean.ListBean.ChildListBean>();
    private Banner selected_banner;
    private RecyclerView selected_rcy;
    private SwipeRefreshLayout selected_srl;
    private EditText selected_edit;
    private GradationScrollView selected_sv;
    private RelativeLayout include_relative;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //找控件
        View inflate = inflater.inflate(R.layout.selected_layout, container, false);
        selected_banner = inflate.findViewById(R.id.selected_banner);
        selected_rcy = inflate.findViewById(R.id.selected_rcy);
        selected_srl = inflate.findViewById(R.id.selected_srl);
        selected_edit = inflate.findViewById(R.id.selected_edit);
        selected_sv = inflate.findViewById(R.id.selected_sv);
        include_relative = inflate.findViewById(R.id.include_relative);
        include_relative.setVisibility(View.GONE);
        //设置监听
        selected_edit.setOnClickListener(this);
        return inflate;
    }

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //banner
        SelectedPresenter selectedPresenter = new SelectedPresenter();
        selectedPresenter.attachView(this);
        selectedPresenter.loadDataSelected();
        //设置布局管理器
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        selected_rcy.setLayoutManager(linearLayoutManager);
        //刷新
        selected_srl.setOnRefreshListener(this);
        //滑动监听
        selected_sv.setScrollViewListener(new GradationScrollView.ScrollViewListener() {
            @Override
            public void onScrollChanged(GradationScrollView scrollView, int x, int y, int oldx, int oldy) {
                if (y <= 1) {  //设置标题的背景颜色
                    include_relative.setBackgroundColor(Color.argb((int) 0, 144,151,166));
                    include_relative.setVisibility(View.GONE);
                } else if (y > 0 && y <= 500) { //滑动距离小于banner图的高度时，设置背景和字体颜色颜色透明度渐变
                    include_relative.setVisibility(View.VISIBLE);
                    float scale = (float) y / 500;
                    float alpha = (255 * scale);
                    // inclu_titles.setTextColor(Color.argb((int) alpha, 255,255,255));
                    include_relative.setBackgroundColor(Color.argb((int) alpha, 255,0,0));
                } else {  //滑动到banner下面设置普通颜色
                    include_relative.setBackgroundColor(Color.argb((int) 255, 255,0,0));
                }
            }
        });


    }


    @Override
    public void onSuccess(SelectedBeans selectedBeans) {
        ArrayList<String> strings = new ArrayList<>();
        List<SelectedBeans.RetBean.ListBean> list = selectedBeans.getRet().getList();

        List<SelectedBeans.RetBean.ListBean.ChildListBean> childList = list.get(0).getChildList();
        for (int j = 0; j < childList.size(); j++) {
            String pic = childList.get(j).getPic();
            if (!pic.equals("")) {
                strings.add(pic);
            }
        }
        selected_banner.setImageLoader(new BannerImagerLoder());
        selected_banner.setImages(strings);
        selected_banner.start();

        //请求数据
        List<SelectedBeans.RetBean.ListBean.ChildListBean> childListBeans = list.get(2).getChildList();
        beans.addAll(childListBeans);
        //加载数据
        SelectedRcyAdapter selectedRcyAdapter = new SelectedRcyAdapter(getActivity(), beans);
        selected_rcy.setAdapter(selectedRcyAdapter);
    }

    @Override
    public void onRefresh() {
        //延时刷新
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //停止刷新
                selected_srl.setRefreshing(false);
            }
        }, 1000);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.selected_edit:
                startActivity(new Intent(getActivity(), SearchActivity.class));
                break;
        }
    }
}
