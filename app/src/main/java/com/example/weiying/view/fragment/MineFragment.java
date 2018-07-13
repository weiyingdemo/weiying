package com.example.weiying.view.fragment;

import android.content.Intent;
import android.graphics.Color;
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

import com.afollestad.materialdialogs.color.ColorChooserDialog;
import com.example.weiying.R;
import com.example.weiying.ResideLayout;
import com.example.weiying.view.activity.MainActivity;
import com.example.weiying.view.activity.CollectionActivity;
import com.example.weiying.view.activity.SettingActivity;
import com.example.weiying.view.activity.SetupActivity;

/**
 * Created by nyj on 2018/7/6.
 */
public class MineFragment extends Fragment  implements ColorChooserDialog.ColorCallback, View.OnClickListener {


    private ImageView shezhi_mine;
    private LinearLayout lishi_mine;
    private LinearLayout huancun_mine;
    private LinearLayout shouzang_mine;
    private LinearLayout zhuti_mine;
    private int[] primary;
    private ResideLayout reside_layout;
    private LinearLayout linaer_min;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.mine_layout, container, false);
        linaer_min = inflate.findViewById(R.id.linaer_min);
        shezhi_mine = inflate.findViewById(R.id.shezhi_mine);
        lishi_mine = inflate.findViewById(R.id.lishi_mine);
        huancun_mine = inflate.findViewById(R.id.huancun_mine);
        shouzang_mine = inflate.findViewById(R.id.shouzang_mine);
        zhuti_mine = inflate.findViewById(R.id.zhuti_mine);
        reside_layout = (ResideLayout) inflate.findViewById(R.id.reside_layout);



        //颜色的数组
        primary = new int[]{

                Color.parseColor("#F44336"),
                Color.parseColor("#FF0000"),
                Color.parseColor("#FFFF00"),
                Color.parseColor("#00FF00"),
                Color.parseColor("#0000FF"),
                Color.parseColor("#00FFFF"),
                Color.parseColor("#FF00FF"),
                Color.parseColor("#ff6600"),
                Color.parseColor("#ff9966"),
                Color.parseColor("#cc0000"),
                Color.parseColor("#993399"),
                Color.parseColor("#cc6699"),
                Color.parseColor("#ffccff"),
                Color.parseColor("#cc66cc"),
                Color.parseColor("#cc33cc"),
                Color.parseColor("#00ff33"),
                Color.parseColor("#3399cc"),
                Color.parseColor("#0066ff"),
                Color.parseColor("#0099ff"),
                Color.parseColor("#00cc99"),
        };

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
    //颜色选择改变事件
    @Override
    public void onColorSelection(@NonNull ColorChooserDialog dialog, int selectedColor) {
        linaer_min.setBackgroundColor(selectedColor);
    }

    @Override
    public void onColorChooserDismissed(@NonNull ColorChooserDialog dialog) {

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
                new ColorChooserDialog.Builder(getActivity(), R.string.color_palette)
                        .accentMode(true)//
                        .customColors(primary, null)//两个颜色数组
                        .dynamicButtonColor(true)//动态按钮颜色
                        .customButton(0)//设置颜色不显示
                        .cancelButton(R.string.cancle)
                        .doneButton(R.string.done)
                        .show(getActivity());//传入上下文
                break;
        }
    }
}
