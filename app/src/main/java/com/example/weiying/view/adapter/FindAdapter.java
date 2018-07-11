package com.example.weiying.view.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.weiying.R;
import com.example.weiying.model.bean.FindBean;
import com.example.weiying.model.custom.GlideRoundTransform;
import com.example.weiying.model.custom.RoundImageView;
import com.example.weiying.view.activity.DetailsActivity;

import java.util.List;

public class FindAdapter extends RecyclerView.Adapter {


    List<FindBean.RetBean.ListBean> list;
    Context context ;
    String mediaId = null;
    public FindAdapter(List<FindBean.RetBean.ListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(context).inflate(R.layout.find_item,parent,false);

            return new MyViewHolder(view);



    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {


            MyViewHolder h= (MyViewHolder) holder;
            h.finditem_title.setText(list.get(position).getTitle());
            h.finditem_maggess.setText(list.get(position).getDescription());
            Glide.with(context)
                    .load(list.get(position).getPic())
                    .placeholder(R.drawable.default_200)
                    .crossFade()
                    .transform(new GlideRoundTransform(context))
                    .into(h.img);
        //分割字符串    获取mid
        //http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_6150d950c6154763a4b68b753cd0a173

        String loadURL = list.get(position).getLoadURL();
        String[] split = loadURL.split("=");
        for (int i = 0; i < split.length; i++) {
            String a = split[1];
            String[] b = a.split("&");
            for (int j = 0; j < b.length; j++) {
                mediaId = b[0];
            }
            }


            //点击视图  跳转到详情页面
            h.find_lin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.e("findadapter",mediaId);
                 //   DetailsActivity.start(context, videoInfo);
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

  public  class MyViewHolder extends RecyclerView.ViewHolder{
        View itemView;
        public   RoundImageView img;
      private  TextView finditem_title;
      private  TextView finditem_maggess;
      private final LinearLayout find_lin;

      public MyViewHolder(View itemView) {
            super(itemView);
            img = (RoundImageView) itemView.findViewById(R.id.img);
          finditem_title = (TextView)itemView.findViewById(R.id.finditem_title);
          finditem_maggess = (TextView)itemView.findViewById(R.id.finditem_maggess);
          find_lin = (LinearLayout)itemView.findViewById(R.id.find_lin);

      }
    }



}
