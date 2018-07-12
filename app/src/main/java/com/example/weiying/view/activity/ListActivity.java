package com.example.weiying.view.activity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.weiying.R;
import com.example.weiying.model.bean.DaoMaster;
import com.example.weiying.model.bean.DaoSession;
import com.example.weiying.model.bean.MyBeans;
import com.example.weiying.model.bean.MyBeansDao;
import com.example.weiying.model.bean.SearchListBeans;
import com.example.weiying.model.bean.SelectedBeans;
import com.example.weiying.presenter.BasePresenter;
import com.example.weiying.presenter.SearchListPresenter;
import com.example.weiying.presenter.SelectedPresenter;
import com.example.weiying.view.adapter.SearchListAdapter;
import com.example.weiying.view.interfaces.ISearchListView;
import com.example.weiying.view.interfaces.ISelectedView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends BaseActivity<SearchListPresenter> implements ISearchListView, View.OnClickListener {

    private RecyclerView list_rcy;
    private String name;
    private EditText search_edit;
    private TextView mSearchCancel;
    private TextView search;
    List<SearchListBeans.RetBean.ListBean> listAll = new ArrayList<>();

    private SearchListAdapter searchListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int setLayout() {
        return R.layout.activity_list;
    }

    @Override
    protected void initData() {
        //设置布局
        GridLayoutManager gridLayoutManager = new GridLayoutManager(ListActivity.this, 3, GridLayoutManager.VERTICAL, false);
        list_rcy.setLayoutManager(gridLayoutManager);
        //接收值
        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        //  Log.e("name", name);
        basePresenter.attachView(this);
        basePresenter.loadSearchListData(name);
    }

    @Override
    SearchListPresenter setPresenter() {
        return new SearchListPresenter();
    }

    @Override
    protected void initView() {
        list_rcy = findViewById(R.id.list_rcy);
        search_edit = findViewById(R.id.search_edit);
        mSearchCancel = (TextView) findViewById(R.id.search_cancel);
        mSearchCancel.setOnClickListener(this);
        search_edit.setHint(name);
        search_edit.setOnClickListener(this);
        search = findViewById(R.id.search);
        search.setOnClickListener(this);
    }


    @Override
    public void onSuccess(SearchListBeans searchListBeans) {
        List<SearchListBeans.RetBean.ListBean> list = searchListBeans.getRet().getList();
        Log.e("sear", list.get(0).getTitle());
        listAll.addAll(list);
        //设置适配器
        searchListAdapter = new SearchListAdapter(this, listAll);
        list_rcy.setAdapter(searchListAdapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        basePresenter.deachView(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.search_edit:
                //输入框的监听
                search_edit.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        if (count > 0) {
                            search.setVisibility(View.VISIBLE);
                            mSearchCancel.setVisibility(View.GONE);
                        } else {
                            search.setVisibility(View.GONE);
                            mSearchCancel.setVisibility(View.VISIBLE);
                        }
                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                });
                break;
            case R.id.search:
                listAll.clear();
                searchListAdapter.notifyDataSetChanged();
                String s = search_edit.getText().toString();
                basePresenter.attachView(this);
                basePresenter.loadSearchListData(s);
                break;
        }
    }
}
