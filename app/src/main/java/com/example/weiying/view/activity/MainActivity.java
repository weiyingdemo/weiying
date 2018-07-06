package com.example.weiying.view.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.weiying.R;
import com.example.weiying.presenter.BasePresenter;
import com.example.weiying.view.fragment.FindFragment;
import com.example.weiying.view.fragment.MineFragment;
import com.example.weiying.view.fragment.SelectedFragment;
import com.example.weiying.view.fragment.SpecialFragment;
import com.example.weiying.view.interfaces.IMainView;
import com.hjm.bottomtabbar.BottomTabBar;

public class MainActivity extends BaseActivity implements IMainView {

    private BottomTabBar mMainBtb;
    private TextView inclu_titles;

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
                        }
                    }
                })
                .isShowDivider(false);
    }


    @Override
    BasePresenter setPresenter() {
        return new BasePresenter();
    }

    @Override
    protected void initView() {
        inclu_titles = findViewById(R.id.inclu_titles);
        mMainBtb = (BottomTabBar) findViewById(R.id.main_btb);

    }

    @Override
    public void onSuccess(String s) {

    }

    @Override
    public void onFail(String fail) {

    }

}
