package com.example.weiying.presenter;

import com.example.weiying.model.https.RetrofitUntils;

/**
 * Created by nyj on 2018/7/5.
 */
public class MainPresenter extends BasePresenter {

    private final RetrofitUntils instance;

    public MainPresenter(){
        instance = RetrofitUntils.getInstance();
    }
    //加载数据的方法
    public void loadData(){

    }

}
