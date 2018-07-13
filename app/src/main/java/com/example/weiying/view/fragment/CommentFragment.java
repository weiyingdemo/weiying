package com.example.weiying.view.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.weiying.R;
import com.example.weiying.model.bean.CommentBean;
import com.example.weiying.model.bean.FirstEvent;
import com.example.weiying.model.bean.TwoEvent;
import com.example.weiying.presenter.CommentPresenter;
import com.example.weiying.view.adapter.CommentAdapter;
import com.example.weiying.view.interfaces.ICommentview;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;

public class CommentFragment extends Fragment implements ICommentview{

    private CommentPresenter commentPresenter;
    private RecyclerView comment_rcyl;
    ArrayList<CommentBean.RetBean.ListBean> biglist= new ArrayList<CommentBean.RetBean.ListBean>();
    private CommentAdapter adapter;
    private TextView comment_name;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.comment_layout, container, false);
        comment_name = (TextView)inflate.findViewById(R.id.comment_name);
        comment_name.setVisibility(View.GONE);
        Log.e("commentfragment","commentfragment");
        EventBus.getDefault().register(this);
        comment_rcyl = (RecyclerView)inflate.findViewById(R.id.comment_rcyl);

        commentPresenter = new CommentPresenter();
        commentPresenter.attachView(this);
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        comment_rcyl.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
    }

    @Subscribe
    public void onEvent(FirstEvent event){
        String mid = event.getMid();
        Log.e("commentfragment",mid);
        commentPresenter.showcomment(mid,1);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);//反注册EventBus
    }

    @Override
    public void onCommentSuccess(List<CommentBean.RetBean.ListBean> list) {

        if(list!=null && !list.isEmpty()){
            biglist.addAll(list);
        }else {

            comment_name.setVisibility(View.VISIBLE);
        }




        if(adapter==null ){
            adapter = new CommentAdapter(biglist,getActivity());
            comment_rcyl.setAdapter(adapter);
        }



    }
}
