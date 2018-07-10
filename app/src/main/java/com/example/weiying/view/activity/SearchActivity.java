package com.example.weiying.view.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.weiying.MyViewGroup;
import com.example.weiying.R;
import com.example.weiying.presenter.BasePresenter;

import org.w3c.dom.Text;

public class SearchActivity extends BaseActivity implements View.OnClickListener {

    /**
     * 请输入您喜欢的电影
     */
    private EditText mSearchEdit;
    /**
     * 取消
     */
    private TextView mSearchCancel;
    /**
     * 历史记录
     */
    private TextView mSearchHistotry;
    private ImageView mSearchDeleate;
    private RecyclerView mSearchRcy;
    private MyViewGroup search_myVg;
    private Intent intent;
    private TextView search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int setLayout() {
        return R.layout.activity_search;
    }

    @Override
    protected void initData() {

       /* ViewGroup.MarginLayoutParams lp = new ViewGroup.MarginLayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.leftMargin = 5;
        lp.rightMargin = 5;
        lp.topMargin = 5;
        lp.bottomMargin = 5;
        for (int i = 0; i < list.size(); i++) {
            TextView textView = new TextView(SearchActivity.this);
            textView.setText(list.get(i).getName());
            textView.setTextColor(Color.BLUE);
            textView.setTextSize(18);
            textView.setBackgroundResource(R.drawable.liushi);
            main_myviewgroup.addView(textView, lp);
        }*/
        //输入框的监听
        mSearchEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.e("msg", count + "");
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
    }

    @Override
    BasePresenter setPresenter() {
        return new BasePresenter();
    }

    @Override
    protected void initView() {

        mSearchEdit = (EditText) findViewById(R.id.search_edit);
        mSearchEdit.setOnClickListener(this);
        mSearchCancel = (TextView) findViewById(R.id.search_cancel);
        mSearchCancel.setOnClickListener(this);
        mSearchHistotry = (TextView) findViewById(R.id.search_histotry);
        mSearchHistotry.setOnClickListener(this);
        mSearchDeleate = (ImageView) findViewById(R.id.search_deleate);
        mSearchDeleate.setOnClickListener(this);
        mSearchRcy = (RecyclerView) findViewById(R.id.search_rcy);
        mSearchRcy.setOnClickListener(this);
        search_myVg = findViewById(R.id.search_myVg);
        search = findViewById(R.id.search);
        search.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.search://搜索
                String name = mSearchEdit.getText().toString();
                if (!name.isEmpty()) {
                    ViewGroup.MarginLayoutParams lp = new ViewGroup.MarginLayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    lp.leftMargin = 5;
                    lp.rightMargin = 5;
                    lp.topMargin = 5;
                    lp.bottomMargin = 5;
                    TextView textView = new TextView(SearchActivity.this);
                    textView.setText(name);
                    textView.setTextColor(Color.BLUE);
                    textView.setTextSize(18);
                    textView.setBackgroundResource(R.drawable.liushi);
                    search_myVg.addView(textView, lp);
                    //查添加数据库
                    // myBeansDao.insert(new MyBeans(null, name));
                    //跳转
                    intent = new Intent(SearchActivity.this, ListActivity.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                }
                break;
            case R.id.search_cancel://取消
                finish();
                break;
            case R.id.search_deleate://删除
                search_myVg.removeAllViews();

                break;
        }
    }
}
