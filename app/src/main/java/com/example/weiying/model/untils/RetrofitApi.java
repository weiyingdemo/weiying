package com.example.weiying.model.untils;

import com.example.weiying.model.bean.SelectedBeans;
import com.example.weiying.model.bean.SpecialListBean;


import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * Created by nyj on 2018/7/5.
 */
public interface RetrofitApi {
    //首页接口
    @GET("homePageApi/homePage.do")
    Observable<SelectedBeans> getSelected();

    //专题
    @FormUrlEncoded
    @POST("columns/getVideoList.do")
    Observable<SpecialListBean> getSpecialList(@Field("catalogId") String catalogId);

}
