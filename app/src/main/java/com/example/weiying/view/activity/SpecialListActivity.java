package com.example.weiying.view.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.weiying.R;
import com.example.weiying.model.bean.SpecialListBean;
import com.example.weiying.presenter.BasePresenter;
import com.example.weiying.presenter.SpecialListPresenter;
import com.example.weiying.view.adapter.SpecialListAdapter;
import com.example.weiying.view.interfaces.ISpecialListView;

import java.util.List;

public class SpecialListActivity extends BaseActivity<SpecialListPresenter> implements ISpecialListView {

    private String catalogid;
    private RecyclerView speciallist_recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_special_list);
    }

    @Override
    protected int setLayout() {
        return R.layout.activity_special_list;
    }

    @Override
    protected void initData() {
        basePresenter.getSpecialListData(catalogid);
    }

    @Override
    SpecialListPresenter setPresenter() {
        return new SpecialListPresenter();
    }

    @Override
    protected void initView() {
        Intent intent = getIntent();
        catalogid = intent.getStringExtra("catalogId");

        speciallist_recycler = findViewById(R.id.speciallist_recycler);
        speciallist_recycler.setLayoutManager(new GridLayoutManager(SpecialListActivity.this,3, LinearLayoutManager.VERTICAL,false));
    }

    @Override
    public void onSuccess(SpecialListBean.RetBean ret) {
        List<SpecialListBean.RetBean.ListBean> list = ret.getList();
        SpecialListAdapter specialListAdapter = new SpecialListAdapter(this, list);
        speciallist_recycler.setAdapter(specialListAdapter);
    }
}
