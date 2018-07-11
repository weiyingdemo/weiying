package com.example.weiying.view.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.weiying.MyViewGroup;
import com.example.weiying.R;
import com.example.weiying.model.bean.ImgBeans;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by nyj on 2018/7/11.
 */
public class WelfareAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<ImgBeans> list;

    public WelfareAdapter(Context context, List<ImgBeans> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = View.inflate(context, R.layout.welfare_rcy_layout, null);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyViewHolder viewHolder = (MyViewHolder) holder;
        ImgBeans imgBeans = list.get(position);
        // Glide.with(context).load(s).into(viewHolder.welfare_rcy_sdv);
        viewHolder.welfare_rcy_sdv.getLayoutParams().height=imgBeans.imgHeight;
        Uri parse = Uri.parse(imgBeans.avatarUrl);
        viewHolder.welfare_rcy_sdv.setImageURI(parse);
       // viewHolder.welfare_rcy_sdv.setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    @Override
    public int getItemCount() {
        if (list != null) {
            return list.size();
        }
        return 0    ;
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView welfare_rcy_sdv;

        public MyViewHolder(View itemView) {
            super(itemView);
            welfare_rcy_sdv = itemView.findViewById(R.id.welfare_rcy_sdv);
        }
    }
}
