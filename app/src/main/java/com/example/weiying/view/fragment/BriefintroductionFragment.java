package com.example.weiying.view.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.Transformation;
import android.widget.TextView;

import com.example.weiying.R;
import com.example.weiying.model.bean.DetailsBean;
import com.example.weiying.model.bean.FirstEvent;
import com.example.weiying.view.adapter.BriefintroductionAdapter;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.List;

public class BriefintroductionFragment extends Fragment {

    private TextView brie_actors;
    private TextView brie_director;
    private TextView brie_description;
    private RecyclerView brie_recyc;
    private boolean flag;
    private int maxLines = 1;
    private TextView brie_all;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.briefintroduction_layout, container, false);
        EventBus.getDefault().register(this);
        brie_actors = (TextView)inflate.findViewById(R.id.brie_actors);
        brie_director = (TextView)inflate.findViewById(R.id.brie_director);
        brie_description = (TextView)inflate.findViewById(R.id.brie_description);
        brie_recyc = (RecyclerView)inflate.findViewById(R.id.brie_recyc);
        brie_all = (TextView)inflate.findViewById(R.id.brie_all);
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        brie_recyc.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
    }
    @Subscribe
    public  void onEvent(FirstEvent event){
        String msglog = "----onEvent收到了消息："+event.description;
        Log.d("hml",msglog);
        brie_actors.setText(event.getActors());
        brie_director.setText(event.getDirecto());
        brie_description.setText(event.getDescription());
        List<DetailsBean.RetBean.ListBean> list = event.getList();

        BriefintroductionAdapter adapter = new BriefintroductionAdapter(list,getActivity());
        brie_recyc.setAdapter(adapter);
        brie_description.setHeight(brie_description.getLineHeight() * maxLines);

        brie_all.setOnClickListener(new View.OnClickListener() {
            boolean isExpand = false;//默认指定3行，是折叠情形

            @Override
            public void onClick(View v) {
                isExpand = !isExpand;
                //需要判断是展开还是收缩
                brie_description.clearAnimation();//清除原有动画
                final int dealHeight;//动画执行相对距离
                final int startHeight = brie_description.getHeight();//开始的距离
                int duringAnimationTime = 200;//动画执行时间
                if (isExpand) {
                    dealHeight = brie_description.getLineHeight() * brie_description.getLineCount() - startHeight;
                    RotateAnimation animation = new RotateAnimation(0, 0, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                    animation.setDuration(duringAnimationTime);
                    animation.setFillAfter(true);
                } else {
                    dealHeight = brie_description.getLineHeight() * maxLines - startHeight;
                    RotateAnimation animation = new RotateAnimation(0, 0, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                    animation.setDuration(duringAnimationTime);
                    animation.setFillAfter(true);
                    brie_all.startAnimation(animation);
                }
                Animation animation = new Animation() {//内容展示动画
                    protected void applyTransformation(float interpolatedTime, Transformation t) {
                        brie_description.setHeight((int) (startHeight + dealHeight * interpolatedTime));
                    }
                };
                animation.setDuration(duringAnimationTime);
                brie_description.startAnimation(animation);
                if (flag){

                    brie_all.setText("展开");
                }else{

                    brie_all.setText("收起");
                }
                flag =! flag;

            }
        });


    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);//反注册EventBus
    }
}
