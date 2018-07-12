package com.example.weiying.view.activity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.weiying.R;
import com.example.weiying.presenter.BasePresenter;
import com.example.weiying.view.fragment.FindFragment;
import com.example.weiying.view.fragment.LiveBroadcastFragment;
import com.example.weiying.view.fragment.MineFragment;
import com.example.weiying.view.fragment.SelectedFragment;
import com.example.weiying.view.fragment.SpecialFragment;
import com.example.weiying.view.interfaces.IMainView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.hjm.bottomtabbar.BottomTabBar;

public class MainActivity extends BaseActivity implements IMainView, View.OnClickListener {

    private BottomTabBar mMainBtb;
    private TextView inclu_titles;
    private SimpleDraweeView main_sdv;
    private TextView main_name;
    private SimpleDraweeView mMainSdv;
    private TextView mMainName;
    private LinearLayout mLinearCollection;
    private LinearLayout mLinearDownload;
    private LinearLayout mLinearWelfare;
    private LinearLayout mLinearShare;
    private LinearLayout mLinearSuggest;
    private LinearLayout mLinearSetting;
    private LinearLayout mLinearTheme;
    private LinearLayout mLinearAbout;
    /**
     * 精选
     */
    private TextView mIncluTitles;
    private TextView dialog_t;
    private TextView dialog_tv;
    private TextView dilog_close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        //底部导航栏
        mMainBtb.init(getSupportFragmentManager())
                .setImgSize(80, 80)
                .setFontSize(14)
                .setTabPadding(4, 6, 10)
                .setChangeColor(Color.RED, Color.DKGRAY)
                //.setTabBarBackgroundResource(R.drawable.bottom_bg)
                .isShowDivider(true)  //是否包含分割线
                .addTabItem("精选", R.mipmap.found_select, R.mipmap.found, SelectedFragment.class)
                .addTabItem("专题", R.mipmap.special_select, R.mipmap.special, SpecialFragment.class)
                .addTabItem("直播", R.mipmap.fancy_select, R.mipmap.fancy, LiveBroadcastFragment.class)
                .addTabItem("发现", R.mipmap.fancy_select, R.mipmap.fancy, FindFragment.class)
                .addTabItem("我的", R.mipmap.my_select, R.mipmap.my, MineFragment.class)
                .setOnTabChangeListener(new BottomTabBar.OnTabChangeListener() {
                    @Override
                    public void onTabChange(int position, String name, View view) {
                        switch (position) {
                            case 0:
                                inclu_titles.setText(name);
                                break;
                            case 1:
                                inclu_titles.setText(name);
                                break;
                            case 2:
                                inclu_titles.setText(name);
                                break;
                            case 3:
                                inclu_titles.setText(name);
                                break;
                            case 4:
                                inclu_titles.setText(name);
                                break;
                        }
                    }
                })
                .isShowDivider(false);
        //加载圆形图片
        Uri uri = Uri.parse("res://com.example.weiying/" + R.mipmap.photo);
        main_sdv.setImageURI(uri);
        main_name.setText("微影,微一下");
    }


    @Override
    BasePresenter setPresenter() {
        return new BasePresenter();
    }

    @Override
    protected void initView() {
        inclu_titles = findViewById(R.id.inclu_titles);
        mMainBtb = (BottomTabBar) findViewById(R.id.main_btb);
        main_sdv = findViewById(R.id.main_sdv);
        main_name = findViewById(R.id.main_name);


        mMainSdv = (SimpleDraweeView) findViewById(R.id.main_sdv);
        mMainSdv.setOnClickListener(this);
        mMainName = (TextView) findViewById(R.id.main_name);
        mMainName.setOnClickListener(this);
        mLinearCollection = (LinearLayout) findViewById(R.id.linear_collection);
        mLinearCollection.setOnClickListener(this);
        mLinearDownload = (LinearLayout) findViewById(R.id.linear_download);
        mLinearDownload.setOnClickListener(this);
        mLinearWelfare = (LinearLayout) findViewById(R.id.linear_welfare);
        mLinearWelfare.setOnClickListener(this);
        mLinearShare = (LinearLayout) findViewById(R.id.linear_share);
        mLinearShare.setOnClickListener(this);
        mLinearSuggest = (LinearLayout) findViewById(R.id.linear_suggest);
        mLinearSuggest.setOnClickListener(this);
        mLinearSetting = (LinearLayout) findViewById(R.id.linear_setting);
        mLinearSetting.setOnClickListener(this);
        mLinearTheme = (LinearLayout) findViewById(R.id.linear_theme);
        ;
        mLinearTheme.setOnClickListener(this);
        mLinearAbout = (LinearLayout) findViewById(R.id.linear_about);
        mLinearAbout.setOnClickListener(this);
        mIncluTitles = (TextView) findViewById(R.id.inclu_titles);
        mIncluTitles.setOnClickListener(this);
        mMainBtb.setOnClickListener(this);
    }

    @Override
    public void onSuccess(String s) {

    }

    @Override
    public void onFail(String fail) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.linear_collection://收藏
                startActivity(new Intent(MainActivity.this, CollectionActivity.class));
                break;
            case R.id.linear_download://下载
                break;
            case R.id.linear_welfare://福利
                startActivity(new Intent(MainActivity.this, WelfareActivity.class));
                break;
            case R.id.linear_share://分享

                break;
            case R.id.linear_suggest://建议
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                AlertDialog alertDialog = builder.create();
                View inflate = View.inflate(this, R.layout.dialog_advise, null);
                alertDialog.setView(inflate);
                TextView t = inflate.findViewById(R.id.t);
                t.setText(Build.BRAND+Build.MODEL);
                alertDialog.show();

                break;
            case R.id.linear_setting://设置
                startActivity(new Intent(MainActivity.this, SettingActivity.class));
                break;
            case R.id.linear_theme://主题

                break;
            case R.id.linear_about://关于
                //1.创建构造器对象
                AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                //2.通过构造器对象,,,创建出来一个AlertDialog的对象
                final AlertDialog dialog = builder1.create();
                //3.通过AlertDialog的对象,,,去设置自己的布局(视图对象)
                View contentView = View.inflate(MainActivity.this, R.layout.dialog_layout, null);
                dialog.setView(contentView);
                //4.可以执行逻辑操作,,,按钮的监听,,,找控件还是必须通过,视图对象去找
                dialog_t = contentView.findViewById(R.id.dialog_t);
                dialog_tv = contentView.findViewById(R.id.dialog_tv);
                dilog_close = contentView.findViewById(R.id.dilog_close);
                dilog_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog_t.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this, WebViewActivity.class));
                    }
                });
                dialog_tv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this, WebViewActivity.class));
                    }
                });
                //5.显示对话框
                dialog.show();
                break;
        }
    }
}
