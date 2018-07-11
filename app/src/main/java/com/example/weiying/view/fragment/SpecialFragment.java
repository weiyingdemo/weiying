package com.example.weiying.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.weiying.R;
import com.example.weiying.model.bean.SelectedBeans;
import com.example.weiying.presenter.SelectedPresenter;
import com.example.weiying.view.activity.SpecialListActivity;
import com.example.weiying.view.adapter.SpecialAdapter;
import com.example.weiying.view.interfaces.ISelectedView;

import java.util.List;

/**
 * Created by nyj on 2018/7/6.
 */
public class SpecialFragment extends Fragment implements ISelectedView {

    private RecyclerView special_recycler;
    String catalogId;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.special_layout, container, false);

        special_recycler = inflate.findViewById(R.id.special_recycler);
        //设置布局管理器
        special_recycler.setLayoutManager(new GridLayoutManager(getActivity(),2, LinearLayoutManager.VERTICAL,false));
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //专题的首页展示
        SelectedPresenter selectedPresenter = new SelectedPresenter();
        selectedPresenter.attachView(this);
        selectedPresenter.loadDataSelected();
    }

    @Override
    public void onSuccess(SelectedBeans selectedBeans) {
        final List<SelectedBeans.RetBean.ListBean> list = selectedBeans.getRet().getList();

        //适配器
        SpecialAdapter specialAdapter = new SpecialAdapter(getActivity(), list);
        special_recycler.setAdapter(specialAdapter);
        //回调监听---点击条目
        specialAdapter.setItemClickListener(new SpecialAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                String moreURL = list.get(position).getMoreURL();
                if (!moreURL.equals("")){
                    String[] split = moreURL.split("=");
                    for (int i = 0; i < split.length; i++) {
                        String a = split[1];
                        String[] b = a.split("&");
                        for (int j = 0; j < b.length; j++) {
                            catalogId = b[0];
                        }
                    }
                    Intent intent = new Intent(getActivity(), SpecialListActivity.class);
                    intent.putExtra("catalogId",catalogId);
                    startActivity(intent);
                }else {
                    Toast.makeText(getActivity(),"亲，暂时还木有数据",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
