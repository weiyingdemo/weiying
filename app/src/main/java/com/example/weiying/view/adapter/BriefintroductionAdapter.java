package com.example.weiying.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
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

public class BriefintroductionAdapter extends RecyclerView.Adapter {
    List<DetailsBean.RetBean.ListBean> list;
    Context context;

    public BriefintroductionAdapter(List<DetailsBean.RetBean.ListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.briefintro_item,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
       MyHolder hh= (MyHolder) holder;

        List<DetailsBean.RetBean.ListBean.ChildListBean> childList = list.get(position).getChildList();

        hh.brieitem_recy.setLayoutManager(new GridLayoutManager(context,3));
        BrieChildAdapter adapter = new BrieChildAdapter(childList,context);
        hh.brieitem_recy.setAdapter(adapter);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class MyHolder extends RecyclerView.ViewHolder{


        private  RecyclerView brieitem_recy;

        public MyHolder(View itemView) {
            super(itemView);
            brieitem_recy = (RecyclerView) itemView.findViewById(R.id.brieitem_recy);

        }
    }

}
