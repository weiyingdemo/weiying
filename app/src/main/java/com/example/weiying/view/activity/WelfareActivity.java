package com.example.weiying.view.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.weiying.R;
import com.example.weiying.model.bean.ImgBeans;
import com.example.weiying.presenter.BasePresenter;
import com.example.weiying.view.adapter.StoreItemDecoration;
import com.example.weiying.view.adapter.WelfareAdapter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class WelfareActivity extends BaseActivity implements View.OnClickListener {

    private RecyclerView mWelfareRcy;
    List<ImgBeans> stringList = new ArrayList<>();
    private ArrayList<Integer> mHeight;
    private ImageView inclu_back;
    private TextView inclu_titles;
    private SmartRefreshLayout welfare_srl;
    private StaggeredGridLayoutManager staggeredGridLayoutManager;
    private WelfareAdapter welfareAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initListData();
    }

    private void initListData() {
        //加载数据
        String[] imgUrs = {"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2542046325,4139753326&fm=27&gp=0.jpg", "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1907928680,2774802011&fm=27&gp=0.jpg",
                "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3748170600,230950278&fm=27&gp=0.jpg", "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=859921736,1746908410&fm=27&gp=0.jpg",
                "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2914888012,2293664887&fm=27&gp=0.jpg", "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1160066708,3406792117&fm=27&gp=0.jpg"

        };
        for (int i = 0; i < 6; i++) {
            ImgBeans imgBeans = new ImgBeans();
            imgBeans.avatarUrl = imgUrs[i];
            imgBeans.imgHeight = (i % 2) * 150 + 500; //偶数和奇数的图片设置不同的高度，以到达错开的目的
            stringList.add(imgBeans);
        }

    }

    @Override
    protected int setLayout() {
        return R.layout.activity_welfare;
    }

    @Override
    protected void initData() {
        //布局管理器
        staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, OrientationHelper.VERTICAL);
        mWelfareRcy.setLayoutManager(staggeredGridLayoutManager);
        //设置分割线
        mWelfareRcy.addItemDecoration(new StoreItemDecoration(30, 30));

        //设置适配器
        welfareAdapter = new WelfareAdapter(this, stringList);
        mWelfareRcy.setAdapter(welfareAdapter);

        //======刷新
        welfare_srl.setOnRefreshLoadMoreListener(new OnRefreshLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshLayout) {
                refreshLayout.finishLoadMore(1000);
                initListData();
                welfareAdapter.notifyDataSetChanged();
            }

            @Override
            public void onRefresh(RefreshLayout refreshLayout) {
                refreshLayout.finishRefresh(1000);

            }
        });
    }

    @Override
    BasePresenter setPresenter() {
        return new BasePresenter();
    }

    @Override
    protected void initView() {
        mWelfareRcy = (RecyclerView) findViewById(R.id.welfare_rcy);
        inclu_back = findViewById(R.id.inclu_back);
        inclu_titles = findViewById(R.id.inclu_titles);
        welfare_srl = findViewById(R.id.welfare_srl);

        inclu_back.setVisibility(View.VISIBLE);
        inclu_titles.setText("福利");
        inclu_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.inclu_back:
                finish();
                break;
        }
    }
}
