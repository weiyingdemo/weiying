package com.example.weiying.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.weiying.R;
import com.example.weiying.model.bean.SelectedBeans;

import java.util.List;

public class SpecialAdapter extends RecyclerView.Adapter implements View.OnClickListener {
    private Context context;
    private List<SelectedBeans.RetBean.ListBean> list;
    private OnItemClickListener mItemClickListener;

    public SpecialAdapter(Context context, List<SelectedBeans.RetBean.ListBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = View.inflate(context, R.layout.adapter_special, null);
        inflate.setOnClickListener(this);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;

        myViewHolder.special_imgview.setScaleType(ImageView.ScaleType.FIT_XY);
        ViewGroup.LayoutParams params = myViewHolder.special_imgview.getLayoutParams();
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        int width = dm.widthPixels / 2;//宽度为屏幕宽度一半
        //int height = data.getHeight()*width/data.getWidth();//计算View的高度

        params.height = (int) (width / 1.8);
        myViewHolder.special_imgview.setLayoutParams(params);

        if (!list.get(position).getChildList().get(0).getPic().equals("")&&!list.get(position).getTitle().equals("")){
            Glide.with(context).load(list.get(position).getChildList().get(0).getPic()).into(myViewHolder.special_imgview);
            myViewHolder.special_textview.setText(list.get(position).getTitle());
        }else {
            myViewHolder.itemView.setVisibility(View.GONE);
        }

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

        private final TextView special_textview;
        private final ImageView special_imgview;

        public MyViewHolder(View itemView) {
            super(itemView);

            special_textview = itemView.findViewById(R.id.special_textview);
            special_imgview = itemView.findViewById(R.id.special_imgview);
        }
    }

    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setItemClickListener(OnItemClickListener itemClickListener) {
        mItemClickListener = itemClickListener;
    }
}
