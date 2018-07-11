package com.example.weiying.model.utils;

import com.example.weiying.model.bean.FindBean;
import com.example.weiying.model.bean.SelectedBeans;
import com.example.weiying.model.bean.SpecialListBean;


import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by nyj on 2018/7/5.
 */
public interface RetrofitApi {
    //首页接口
    @GET("homePageApi/homePage.do")
    Observable<SelectedBeans> getSelected();

    //发现接口
    @POST("columns/getVideoList.do")
    @FormUrlEncoded
    Observable<FindBean> showfind(@Field("catalogId") String catalogId, @Field("pnum") int pnum);

    //详情接口
    //http://api.svipmovie.com/front/videoDetailApi/videoDetail.do
    @FormUrlEncoded
    @POST("videoDetailApi/videoDetail.do")
    Observable<FindBean> showDetails(@Field("mediaId") String mediaId);

    //专题频道下的---列表
    @POST("columns/getVideoList.do")
    @FormUrlEncoded
    Observable<SpecialListBean> getSpecialList(@Field("catalogId") String catalogId);
}
