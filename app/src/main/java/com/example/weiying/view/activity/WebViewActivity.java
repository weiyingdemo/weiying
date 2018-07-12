package com.example.weiying.view.activity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.example.weiying.R;
import com.example.weiying.presenter.BasePresenter;

public class WebViewActivity extends BaseActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int setLayout() {
        return R.layout.activity_web_view;
    }

    @Override
    protected void initData() {
        mWebView.loadUrl("https://my.csdn.net/niu_yue_jiao");
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);//允许使用js
        //支持屏幕缩放
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
    }

    @Override
    BasePresenter setPresenter() {
        return new BasePresenter();
    }

    @Override
    protected void initView() {

        mWebView = (WebView) findViewById(R.id.webView);

    }

}
