package com.example.weiying.model.https;

import com.example.weiying.model.untils.Constant;
import com.example.weiying.model.untils.RetrofitApi;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by nyj on 2018/7/5.
 */
public class RetrofitTwoUntils {

    private final Retrofit retrofit;

    public RetrofitTwoUntils() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient build = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .build();
        retrofit = new Retrofit.Builder()
                .client(build)
                .baseUrl(Constant.twoUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    //单例
    private static RetrofitTwoUntils INSTANCE;

    public static RetrofitTwoUntils getInstance() {
        if (INSTANCE == null) {
            synchronized (RetrofitTwoUntils.class) {
                if (INSTANCE == null) {
                    INSTANCE = new RetrofitTwoUntils();
                }
            }
        }
        return INSTANCE;
    }

    //接口供调用
    public RetrofitApi getApi() {

        return retrofit.create(RetrofitApi.class);
    }
}
