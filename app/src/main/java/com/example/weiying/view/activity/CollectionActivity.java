package com.example.weiying.view.activity;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.weiying.R;
import com.example.weiying.presenter.BasePresenter;
import com.example.weiying.view.interfaces.IMainView;

public class CollectionActivity extends BaseActivity implements View.OnClickListener {

    private RecyclerView mCollectionRcy;
    private ImageView inclu_back;
    private TextView inclu_delete;
    private TextView inclu_titles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int setLayout() {
        return R.layout.activity_collection;
    }

    @Override
    protected void initData() {
        inclu_back.setVisibility(View.VISIBLE);
        inclu_delete.setVisibility(View.VISIBLE);
        //设置布局管理器
        GridLayoutManager gridLayoutManager = new GridLayoutManager(CollectionActivity.this,3);
        mCollectionRcy.setLayoutManager(gridLayoutManager);
    }

    @Override
    BasePresenter setPresenter() {
        return new BasePresenter();
    }

    @Override
    protected void initView() {
        mCollectionRcy = (RecyclerView) findViewById(R.id.collection_rcy);
        inclu_back = findViewById(R.id.inclu_back);
        inclu_delete = findViewById(R.id.inclu_delete);
        inclu_titles = findViewById(R.id.inclu_titles);
        inclu_titles.setText("收藏");
        inclu_back.setOnClickListener(this);
        inclu_delete.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.inclu_back://返回
                finish();
                break;
            case R.id.inclu_delete://删除

                break;
        }
    }
}
