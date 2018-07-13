package com.example.weiying.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.weiying.R;
import com.example.weiying.model.bean.CommentBean;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;

public class CommentAdapter extends RecyclerView.Adapter {
    ArrayList<CommentBean.RetBean.ListBean> list;
    Context context;

    public CommentAdapter(ArrayList<CommentBean.RetBean.ListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.comment_item,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
      MyHolder hh= (MyHolder) holder;
      hh.my_image_view.setImageURI(list.get(position).getUserPic());
      hh.phone.setText(list.get(position).getPhoneNumber());
      hh.comm_time.setText(list.get(position).getTime());
      hh.content_item.setText(list.get(position).getMsg());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{

        private final TextView phone;
        private final TextView comm_time;
        private final SimpleDraweeView my_image_view;
        private final TextView content_item;

        public MyHolder(View itemView) {
            super(itemView);
            phone = (TextView) itemView.findViewById(R.id.phone);
            comm_time = (TextView) itemView.findViewById(R.id.comm_time);
            my_image_view = (SimpleDraweeView)itemView.findViewById(R.id.my_image_view);
            content_item = (TextView)itemView.findViewById(R.id.content_item);


        }
    }
}
