package com.example.weiying.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.weiying.R;
import com.example.weiying.view.activity.CollectionActivity;
import com.example.weiying.view.activity.SettingActivity;
import com.example.weiying.view.activity.SetupActivity;

/**
 * Created by nyj on 2018/7/6.
 */
public class MineFragment extends Fragment implements View.OnClickListener {

    private ImageView shezhi_mine;
    private LinearLayout lishi_mine;
    private LinearLayout huancun_mine;
    private LinearLayout shouzang_mine;
    private LinearLayout zhuti_mine;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.mine_layout, container, false);
        shezhi_mine = inflate.findViewById(R.id.shezhi_mine);
        lishi_mine = inflate.findViewById(R.id.lishi_mine);
        huancun_mine = inflate.findViewById(R.id.huancun_mine);
        shouzang_mine = inflate.findViewById(R.id.shouzang_mine);
        zhuti_mine = inflate.findViewById(R.id.zhuti_mine);
        shezhi_mine.setOnClickListener(this);
        zhuti_mine.setOnClickListener(this);
        shouzang_mine.setOnClickListener(this);
        lishi_mine.setOnClickListener(this);
        huancun_mine.setOnClickListener(this);
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //getActivity().finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.huancun_mine://缓存
                Toast.makeText(getActivity(), "敬请期待!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.shouzang_mine://收藏
                startActivity(new Intent(getActivity(), CollectionActivity.class));
                break;
            case R.id.shezhi_mine://设置
                startActivity(new Intent(getActivity(), SettingActivity.class));
                break;
            case R.id.zhuti_mine://主题

                break;
        }
    }
}
