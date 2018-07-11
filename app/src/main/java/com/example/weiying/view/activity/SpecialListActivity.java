package com.example.weiying.view.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.example.weiying.R;

import com.example.weiying.presenter.BasePresenter;


public class SpecialListActivity extends BaseActivity{

    private String catalogid;
    private RecyclerView speciallist_recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int setLayout() {
        return R.layout.activity_special_list;
    }

    @Override
    protected void initData() {

}

    @Override
    BasePresenter setPresenter() {
        return new BasePresenter();
    }

    @Override
    protected void initView() {
        Intent intent = getIntent();
        catalogid = intent.getStringExtra("catalogId");

        speciallist_recycler = findViewById(R.id.speciallist_recycler);
        speciallist_recycler.setLayoutManager(new GridLayoutManager(SpecialListActivity.this,3, LinearLayoutManager.VERTICAL,false));
    }


}
