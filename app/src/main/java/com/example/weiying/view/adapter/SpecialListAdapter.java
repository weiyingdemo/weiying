package com.example.weiying.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.weiying.R;
import com.example.weiying.model.bean.SpecialListBean;

import java.util.List;

public class SpecialListAdapter extends RecyclerView.Adapter implements View.OnClickListener {
    private Context context;
    private List<SpecialListBean.RetBean.ListBean> list;
    private SpecialAdapter.OnItemClickListener mItemClickListener;

    public SpecialListAdapter(Context context, List<SpecialListBean.RetBean.ListBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = View.inflate(context, R.layout.adapter_speciallist, null);
        inflate.setOnClickListener(this);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.speciallist_imgview.setScaleType(ImageView.ScaleType.FIT_XY);
        myViewHolder.speciallist_textview.setText(list.get(position).getTitle());
        Glide.with(context).load(list.get(position).getPic()).into(myViewHolder.speciallist_imgview);
        myViewHolder.itemView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onClick(View v) {
        if (mItemClickListener!=null){
            mItemClickListener.onItemClick((Integer) v.getTag());
        }
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private final ImageView speciallist_imgview;
        private final TextView speciallist_textview;

        public MyViewHolder(View itemView) {
            super(itemView);

            speciallist_imgview = itemView.findViewById(R.id.speciallist_imgview);
            speciallist_textview = itemView.findViewById(R.id.speciallist_textview);
        }
    }

    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setItemClickListener(SpecialAdapter.OnItemClickListener itemClickListener) {
        mItemClickListener = itemClickListener;
    }
}

