package com.example.weiying.view.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.weiying.R;
import com.example.weiying.model.bean.DetailsBean;
import com.example.weiying.model.custom.GlideRoundTransform;
import com.example.weiying.view.activity.DetailsActivity;

import java.util.List;

public class BrieChildAdapter extends RecyclerView.Adapter {
    String mediaId = null;
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
        //分割
        String loadURL = list.get(position).getLoadURL();
        String[] split = loadURL.split("=");
        for (int i = 0; i < split.length; i++) {
            String a = split[1];
            String[] b = a.split("&");
            for (int j = 0; j < b.length; j++) {
                mediaId = b[0];
            }
        }
        Log.e("child",mediaId);
        hh.rela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,DetailsActivity.class);
                intent.putExtra("mediaId",mediaId);
                context.startActivity(intent);
                
            }
        });



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{

        private  ImageView brie_img;
        private  TextView brie_title;
        private  RelativeLayout rela;

        public MyHolder(View itemView) {
            super(itemView);
            brie_img = (ImageView) itemView.findViewById(R.id.brie_img);
            brie_title = (TextView) itemView.findViewById(R.id.brie_title);
            rela = (RelativeLayout) itemView.findViewById(R.id.rela);

        }
    }


}
