package com.example.weiying.view.activity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.weiying.R;
import com.example.weiying.presenter.BasePresenter;
import com.example.weiying.view.interfaces.IBaseView;

/**
 * Created by nyj on 2018/7/5.
 */
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements IBaseView{

    public P basePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayout());
        initNoBar();
        initView();
        initBaseView();
        initData();
    }
    //
    private void initNoBar() {
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.KITKAT){
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //透明导航栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }

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
