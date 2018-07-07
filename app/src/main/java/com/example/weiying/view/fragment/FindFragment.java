package com.example.weiying.view.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.weiying.R;
import com.example.weiying.view.activity.MainActivity;
import com.example.weiying.view.custom.SwipeCardLayout;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by nyj on 2018/7/6.
 */
public class FindFragment extends Fragment {

    private SwipeCardLayout scl_layout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.find_layout, container, false);
        scl_layout = (SwipeCardLayout) inflate.findViewById(R.id.scl_layout);

        Queue<CardEntity> data = new LinkedList<>();
        CardEntity cardEntity1 = new CardEntity(R.drawable.f1, "这里是美丽的湖畔");
        CardEntity cardEntity2 = new CardEntity(R.drawable.f2, "这里游泳比较好");
        CardEntity cardEntity3 = new CardEntity(R.drawable.f3, "向往的蓝天白云");
        CardEntity cardEntity4 = new CardEntity(R.drawable.f4, "繁华的都市");
        CardEntity cardEntity5 = new CardEntity(R.drawable.f5, "草原象征着理想");
        data.add(cardEntity1);
        data.add(cardEntity2);
        data.add(cardEntity3);
        data.add(cardEntity4);
        data.add(cardEntity5);
        scl_layout.setAdapter(new SwipeCardLayout.CardAdapter<CardEntity>(data) {
            @Override
            public View bindLayout() {
                return LayoutInflater.from(getActivity()).inflate(R.layout.card_layout, null);
            }

            @Override
            public void bindData(CardEntity data, View convertView) {

                ImageView iv_card = (ImageView) convertView.findViewById(R.id.iv_card);
                TextView tv_card = (TextView) convertView.findViewById(R.id.tv_card);
                iv_card.setImageResource(data.resId);
                tv_card.setText(data.content);
            }
        });
        scl_layout.setOnSwipeListener(new SwipeCardLayout.OnSwipeListener() {
            @Override
            public void onSwipe(int type) {
                switch (type) {
                    case SwipeCardLayout.TYPE_RIGHT:
                        Toast.makeText(getActivity(), "right", Toast.LENGTH_SHORT).show();

                        break;
                    case SwipeCardLayout.TYPE_LEFT:
                        Toast.makeText(getActivity(), "left", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }

    class CardEntity {

        public CardEntity(int resId, String content) {
            this.resId = resId;
            this.content = content;
        }

        public int resId;
        public String content;
    }
}
