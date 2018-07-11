package com.example.weiying.presenter;

import com.example.weiying.model.https.RetrofitUtils;

/**
 * Created by nyj on 2018/7/5.
 */
public class MainPresenter extends BasePresenter {

    private final RetrofitUtils instance;

    public MainPresenter(){
        instance = RetrofitUtils.getInstance();
    }
    //加载数据的方法
    public void loadData(){

    }

}
