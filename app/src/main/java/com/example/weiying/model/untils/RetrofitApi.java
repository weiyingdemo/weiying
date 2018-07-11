package com.example.weiying.model.untils;

import com.example.weiying.model.bean.FindBean;
import com.example.weiying.model.bean.SelectedBeans;


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

    //发现接口
    @FormUrlEncoded
    @POST("columns/getVideoList.do")
    Observable<FindBean> showfind(@Field("catalogId") String catalogId, @Field("pnum") int pnum);

    //详情接口
    //http://api.svipmovie.com/front/videoDetailApi/videoDetail.do
    @FormUrlEncoded
    @POST("videoDetailApi/videoDetail.do")
    Observable<FindBean> showDetails(@Field("mediaId") String mediaId);
}
