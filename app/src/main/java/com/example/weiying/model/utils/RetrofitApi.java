package com.example.weiying.model.utils;

import com.example.weiying.model.bean.DetailsBean;
import com.example.weiying.model.bean.FindBean;
import com.example.weiying.model.bean.SearchListBeans;
import com.example.weiying.model.bean.SelectedBeans;
import com.example.weiying.model.bean.SpecialListBean;


import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by nyj on 2018/7/5.
 */
public interface RetrofitApi {
    //首页接口
    @GET("homePageApi/homePage.do")
    Observable<SelectedBeans> getSelected();

    //发现
    @POST("columns/getVideoList.do")
    @FormUrlEncoded
    Observable<FindBean> showfind(@Field("catalogId")String catalogId, @Field("pnum")int pnum);


    //专题频道列表
    @POST("columns/getVideoList.do")
    @FormUrlEncoded
    Observable<SpecialListBean> getSpecialList(@Field("catalogId")String catalogId);

    //查询接口
    @GET("searchKeyWordApi/getVideoListByKeyWord.do")
    Observable<SearchListBeans> getSearchList(@Query("keyword") String keyword, @Query("pnum") String pnum);

    //详情页面
    @POST("videoDetailApi/videoDetail.do")
    @FormUrlEncoded
    Observable<DetailsBean> showDetail(@Field("mediaId")String mediaId);
}
