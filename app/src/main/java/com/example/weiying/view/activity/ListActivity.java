package com.example.weiying.view.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.weiying.R;
import com.example.weiying.model.bean.SelectedBeans;
import com.example.weiying.presenter.BasePresenter;
import com.example.weiying.presenter.SelectedPresenter;
import com.example.weiying.view.interfaces.ISelectedView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends BaseActivity<SelectedPresenter> implements ISelectedView {

    private RecyclerView list_rcy;
    private String name;
    List<SelectedBeans.RetBean.ListBean.ChildListBean> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    @Override
    protected int setLayout() {
        return R.layout.activity_list;
    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        Log.e("name", name);
        //设置布局
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ListActivity.this, LinearLayoutManager.VERTICAL, false);
        //添加分割线
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        list_rcy.setLayoutManager(linearLayoutManager);
    }

    @Override
    SelectedPresenter setPresenter() {
        return new SelectedPresenter();
    }

    @Override
    protected void initView() {
        list_rcy = findViewById(R.id.list_rcy);
    }

    @Override
    public void onSuccess(SelectedBeans selectedBeans) {

    }
}
