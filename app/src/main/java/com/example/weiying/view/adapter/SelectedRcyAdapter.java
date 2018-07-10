package com.example.weiying.view.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.weiying.R;
import com.example.weiying.model.bean.SelectedBeans;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by nyj on 2018/7/9.
 */
public class SelectedRcyAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<SelectedBeans.RetBean.ListBean.ChildListBean> listBeans;

    public SelectedRcyAdapter(Context context, List<SelectedBeans.RetBean.ListBean.ChildListBean> listBeans) {
        this.context = context;
        this.listBeans = listBeans;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = View.inflate(context, R.layout.selected_rcy_layout, null);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyViewHolder viewHolder = (MyViewHolder) holder;
        viewHolder.rcy_title.setText(listBeans.get(position).getTitle());
        String pic = listBeans.get(position).getPic();
        if (!pic.equals("")) {
            Uri parse = Uri.parse(pic);
            viewHolder.rcy_sdv.setImageURI(parse);
        }
    }

    @Override
    public int getItemCount() {
        return listBeans.size();
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView rcy_title;
        private SimpleDraweeView rcy_sdv;

        public MyViewHolder(View itemView) {
            super(itemView);
            rcy_sdv = itemView.findViewById(R.id.rcy_sdv);
            rcy_title = itemView.findViewById(R.id.rcy_title);
        }
    }
}
