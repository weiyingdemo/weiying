package com.example.weiying.view.fragment;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.weiying.R;
import com.example.weiying.model.bean.FindBean;
import com.example.weiying.model.custom.CardItemTouchHelperCallback;
import com.example.weiying.model.custom.CardLayoutManager;
import com.example.weiying.model.custom.OnSwipeListener;
import com.example.weiying.presenter.FindPresenter;
import com.example.weiying.view.adapter.FindAdapter;
import com.example.weiying.view.interfaces.IFindview;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by nyj on 2018/7/6.
 */
public class FindFragment extends Fragment implements IFindview{


    private RecyclerView find_recyclers;
    private TextView find_none;
    private Button find_huanyipi;
    ArrayList<FindBean.RetBean.ListBean> biglist= new ArrayList<FindBean.RetBean.ListBean>();
    int page=1;
    private FindAdapter adapter;
    private FindPresenter findPresenter;
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            adapter.notifyDataSetChanged();
        }
    };


    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View inflate = inflater.inflate(R.layout.find_layout, container, false);
            find_recyclers = (RecyclerView) inflate.findViewById(R.id.find_recyclers);
            find_none = (TextView) inflate.findViewById(R.id.find_none);
            find_huanyipi = (Button) inflate.findViewById(R.id.find_huanyipi);


            findPresenter = new FindPresenter();
            findPresenter.attachView(this);
            findPresenter.showfind("402834815584e463015584e539330016",page);



        return inflate;
    }
    public void initData() {

        CardItemTouchHelperCallback cardCallback = new CardItemTouchHelperCallback(find_recyclers.getAdapter(), biglist);
        cardCallback.setOnSwipedListener(new OnSwipeListener<FindBean.RetBean.ListBean>() {
            @Override
            public void onSwiping(RecyclerView.ViewHolder viewHolder, float ratio, int direction) {
                FindAdapter.MyViewHolder myHolder = (FindAdapter.MyViewHolder) viewHolder;
                viewHolder.itemView.setAlpha(1 - Math.abs(ratio) * 0.2f);

            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, FindBean.RetBean.ListBean listBean, int direction) {
                FindAdapter.MyViewHolder myHolder = (FindAdapter.MyViewHolder) viewHolder;
                viewHolder.itemView.setAlpha(1f);
            }





            @Override
            public void onSwipedClear() {
                Toast.makeText(getActivity(), "data clear", Toast.LENGTH_SHORT).show();
                find_recyclers.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        initData();
                        find_recyclers.getAdapter().notifyDataSetChanged();
                    }
                }, 3000L);
            }

        });


        final ItemTouchHelper touchHelper = new ItemTouchHelper(cardCallback);
        final CardLayoutManager cardLayoutManager = new CardLayoutManager(find_recyclers, touchHelper);
        find_recyclers.setLayoutManager(cardLayoutManager);
        touchHelper.attachToRecyclerView(find_recyclers);


    }



    @Override
    public void onFindSussecc(List<FindBean.RetBean.ListBean> list) {

        Log.e("findadapter",list.get(0).getTitle());

          biglist.addAll(list);
        Log.e("find_adapter",biglist.get(0).getTitle());
          adapter = new FindAdapter(biglist,getActivity());
          find_recyclers.setAdapter(adapter);

        initData();

        find_huanyipi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                biglist.clear();
                //随机数
                int min=1;
                int max=9;
                Random random = new Random();
                int num = random.nextInt(max)%(max-min+1) + min;
                findPresenter.showfind("402834815584e463015584e539330016",num);
                handler.sendEmptyMessage(0);

            }
        });

    }
}
