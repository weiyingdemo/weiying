package com.example.weiying.view.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.weiying.MyViewGroup;
import com.example.weiying.R;
import com.example.weiying.model.bean.FindBean;
import com.example.weiying.model.bean.SearchListBeans;
import com.example.weiying.model.bean.SelectedBeans;
import com.example.weiying.view.activity.DetailsActivity;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by nyj on 2018/7/12.
 */
public class SearchListAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<SearchListBeans.RetBean.ListBean> listBeans;
    private String id;

    public SearchListAdapter(Context context, List<SearchListBeans.RetBean.ListBean> listBeans) {
        this.context = context;
        this.listBeans = listBeans;
        Log.e("li",listBeans.get(0).getTitle());
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = View.inflate(context, R.layout.searchlist_layout, null);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyViewHolder viewHolder = (MyViewHolder) holder;
        final SearchListBeans.RetBean.ListBean listBean = listBeans.get(position);
        String title = listBean.getTitle();
        String pic = listBean.getPic();
        if (!title.equals("") || !pic.equals("")) {
            viewHolder.searchlist_tv.setText(title);
            Uri parse = Uri.parse(pic);
            viewHolder.searchlist_sdv.setImageURI(parse);
        }
        String loadURL = listBean.getLoadURL();
        String[] split = loadURL.split("=");
        for (int i = 0; i < split.length; i++) {
            String s = split[1];
            String[] split1 = s.split("&");
            for (int j = 0; j < split1.length; j++) {
                id = split1[0];
            }
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailsActivity.class);
                intent.putExtra("mediaId",id);
                context.startActivity(intent);
            }
        });

}

    @Override
    public int getItemCount() {
        return listBeans.size();
    }

class MyViewHolder extends RecyclerView.ViewHolder {


    private final SimpleDraweeView searchlist_sdv;
    private final TextView searchlist_tv;

    public MyViewHolder(View itemView) {
        super(itemView);
        searchlist_sdv = itemView.findViewById(R.id.searchlist_sdv);
        searchlist_tv = itemView.findViewById(R.id.searchlist_tv);

    }
}
}
