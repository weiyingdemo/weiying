package com.example.weiying.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.weiying.R;
import com.example.weiying.presenter.BasePresenter;
import com.example.weiying.view.interfaces.IMainView;

public class MainActivity extends BaseActivity implements IMainView {

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

    }

    @Override
    BasePresenter setPresenter() {
        return new BasePresenter();
    }

    @Override
    protected void initView() {

    }

    @Override
    public void onSuccess(String s) {

    }

    @Override
    public void onFail(String fail) {

    }
}
