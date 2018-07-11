package com.example.weiying;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;


/**
 * Created by nyj on 2018/7/7.
 */
public class MyFresco extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);

    }
}
