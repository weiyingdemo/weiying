package com.example.weiying.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.weiying.R;
import com.example.weiying.presenter.BasePresenter;
import com.example.weiying.view.interfaces.IBaseView;

/**
 * Created by nyj on 2018/7/5.
 */
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements IBaseView{

    private P basePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayout());

        initView();
        initBaseView();
        initData();
    }

    protected abstract int setLayout();

    protected abstract void initData();

    private void initBaseView() {
        basePresenter = setPresenter();
        if(basePresenter!=null){
            basePresenter.attachView(this);
        }
    }

    abstract P setPresenter();
    protected abstract void initView();


}
