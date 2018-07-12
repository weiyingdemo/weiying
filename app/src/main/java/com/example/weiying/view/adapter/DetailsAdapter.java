package com.example.weiying.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.weiying.R;
import com.example.weiying.model.bean.DetailsBean;

import java.util.ArrayList;

import cn.jzvd.JZVideoPlayerStandard;

public class DetailsAdapter extends RecyclerView.Adapter {
    ArrayList<DetailsBean.RetBean.ListBean> list;
    Context context;

    public DetailsAdapter(ArrayList<DetailsBean.RetBean.ListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.details_item,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyHolder hh= (MyHolder) holder;

        hh.title_name.setText(list.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{
        private View title_include;
        private JZVideoPlayerStandard details_videoplayer;
        private ImageView title_back;
        private TextView title_name;
        public MyHolder(View itemView) {
            super(itemView);
            title_include = itemView.findViewById(R.id.details_title);
            title_back = (ImageView) title_include.findViewById(R.id.title_back);
            title_name = (TextView)title_include.findViewById(R.id.title_name);
            details_videoplayer = (JZVideoPlayerStandard)itemView.findViewById(R.id.details_videoplayer);

        }
    }
}
