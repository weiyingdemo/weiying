package com.example.weiying.model.https;

import com.example.weiying.model.utils.Constant;
import com.example.weiying.model.utils.RetrofitApi;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by nyj on 2018/7/5.
 */
public class RetrofitUntils {

    private final Retrofit retrofit;

    public RetrofitUntils() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient build = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .build();
        retrofit = new Retrofit.Builder()
                .client(build)
                .baseUrl(Constant.baseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    //单例
    private static RetrofitUntils INSTANCE;

    public static RetrofitUntils getInstance() {
        if (INSTANCE == null) {
            synchronized (RetrofitUntils.class) {
                if (INSTANCE == null) {
                    INSTANCE = new RetrofitUntils();
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
