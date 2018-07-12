package com.example.weiying.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.weiying.R;
import com.example.weiying.model.bean.DetailsBean;
import com.example.weiying.model.custom.GlideRoundTransform;

import java.util.List;

public class BrieChildAdapter extends RecyclerView.Adapter {

    List<DetailsBean.RetBean.ListBean.ChildListBean> list;
    Context context;

    public BrieChildAdapter(List<DetailsBean.RetBean.ListBean.ChildListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.briechild_item,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyHolder hh= (MyHolder) holder;
        Glide.with(context)
                .load(list.get(position).getPic())
                .placeholder(R.drawable.default_200)
                .crossFade()
                .transform(new GlideRoundTransform(context))
                .into(hh.brie_img);
        hh.brie_title.setText(list.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{

        private  ImageView brie_img;
        private  TextView brie_title;

        public MyHolder(View itemView) {
            super(itemView);
            brie_img = (ImageView) itemView.findViewById(R.id.brie_img);
            brie_title = (TextView) itemView.findViewById(R.id.brie_title);
        }
    }


}
