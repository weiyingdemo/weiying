package com.example.weiying.model.utils;

import com.example.weiying.model.bean.CommentBean;
import com.example.weiying.model.bean.DetailsBean;
import com.example.weiying.model.bean.FindBean;
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

    //详情页面
    @POST("videoDetailApi/videoDetail.do")
    @FormUrlEncoded
    Observable<DetailsBean> showDetail(@Field("mediaId")String mediaId);

    //评论页面

    @POST("Commentary/getCommentList.do")
    @FormUrlEncoded
    Observable<CommentBean> ShowComment(@Field("mediaId") String mediaId, @Field("pnum") int pnum);

}
