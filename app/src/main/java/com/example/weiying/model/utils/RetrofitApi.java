package com.example.weiying.model.utils;

import com.example.weiying.model.bean.SelectedBeans;


import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by nyj on 2018/7/5.
 */
public interface RetrofitApi {
    //首页接口
    @GET("homePageApi/homePage.do")
    Observable<SelectedBeans> getSelected();
}
