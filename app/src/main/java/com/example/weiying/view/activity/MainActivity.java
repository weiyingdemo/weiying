package com.example.weiying.view.activity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.color.ColorChooserDialog;
import com.example.weiying.R;
import com.example.weiying.ResideLayout;
import com.example.weiying.presenter.BasePresenter;
import com.example.weiying.view.fragment.FindFragment;
import com.example.weiying.view.fragment.LiveBroadcastFragment;
import com.example.weiying.view.fragment.MineFragment;
import com.example.weiying.view.fragment.SelectedFragment;
import com.example.weiying.view.fragment.SpecialFragment;
import com.example.weiying.view.interfaces.IMainView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.hjm.bottomtabbar.BottomTabBar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class MainActivity extends BaseActivity implements IMainView, View.OnClickListener, ColorChooserDialog.ColorCallback {

    private BottomTabBar mMainBtb;
    private TextView inclu_titles;
    private SimpleDraweeView main_sdv;
    private TextView main_name;
    private SimpleDraweeView mMainSdv;
    private TextView mMainName;
    private LinearLayout mLinearCollection;
    private LinearLayout mLinearDownload;
    private LinearLayout mLinearWelfare;
    private LinearLayout mLinearShare;
    private LinearLayout mLinearSuggest;
    private LinearLayout mLinearSetting;
    private LinearLayout mLinearTheme;
    private LinearLayout mLinearAbout;
    /**
     * 精选
     */
    private TextView mIncluTitles;
    private TextView dialog_t;
    private TextView dialog_tv;
    private TextView dilog_close;
    private int[]
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
    private ResideLayout reside_layout;
    private View include_relative;
    private LinearLayout main_liner;
    private EditText advise_edit_email;
    private TextView advise_text_phone;
    private EditText advise_edit_con;
    private Button advise_btn_voice;
    private Button advise_btn_cancel;
    private Button advise_btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences sharedPreferences = getSharedPreferences("register_user", Context.MODE_PRIVATE);
        boolean islogin = sharedPreferences.getBoolean("islogin", false);
        if(islogin){
            int selectedColor = sharedPreferences.getInt("selectedColor", 0);
            reside_layout.setBackgroundColor(selectedColor);
            include_relative.setBackgroundColor(selectedColor);
            main_liner.setBackgroundColor(selectedColor);
        }

    }



    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        //底部导航栏
        mMainBtb.init(getSupportFragmentManager())
                .setImgSize(80, 80)
                .setFontSize(14)
                .setTabPadding(4, 6, 10)
                .setChangeColor(Color.RED, Color.DKGRAY)
                //.setTabBarBackgroundResource(R.drawable.bottom_bg)
                .isShowDivider(true)  //是否包含分割线
                .addTabItem("精选", R.mipmap.found_select, R.mipmap.found, SelectedFragment.class)
                .addTabItem("专题", R.mipmap.special_select, R.mipmap.special, SpecialFragment.class)
                .addTabItem("直播", R.mipmap.fancy_select, R.mipmap.fancy, LiveBroadcastFragment.class)
                .addTabItem("发现", R.mipmap.fancy_select, R.mipmap.fancy, FindFragment.class)
                .addTabItem("我的", R.mipmap.my_select, R.mipmap.my, MineFragment.class)
                .setOnTabChangeListener(new BottomTabBar.OnTabChangeListener() {
                    @Override
                    public void onTabChange(int position, String name, View view) {
                        switch (position) {
                            case 0:
                                inclu_titles.setText(name);
                                break;
                            case 1:
                                inclu_titles.setText(name);
                                break;
                            case 2:
                                inclu_titles.setText(name);
                                break;
                            case 3:
                                inclu_titles.setText(name);
                                break;
                            case 4:
                                inclu_titles.setText(name);
                                break;
                        }
                    }
                })
                .isShowDivider(false);
        //加载圆形图片
        Uri uri = Uri.parse("res://com.example.weiying/" + R.mipmap.photo);
        main_sdv.setImageURI(uri);
        main_name.setText("微影,微一下");
    }


    @Override
    BasePresenter setPresenter() {
        return new BasePresenter();
    }

    @Override
    protected void initView() {

         main_liner = findViewById(R.id.main_liner);
        inclu_titles = findViewById(R.id.inclu_titles);
        mMainBtb = (BottomTabBar) findViewById(R.id.main_btb);
        main_sdv = findViewById(R.id.main_sdv);
        main_name = findViewById(R.id.main_name);
        reside_layout = (ResideLayout)findViewById(R.id.reside_layout);
        include_relative = findViewById(R.id.include_relative);
        mMainSdv = (SimpleDraweeView) findViewById(R.id.main_sdv);
        mMainSdv.setOnClickListener(this);
        mMainName = (TextView) findViewById(R.id.main_name);
        mMainName.setOnClickListener(this);
        mLinearCollection = (LinearLayout) findViewById(R.id.linear_collection);
        mLinearCollection.setOnClickListener(this);
        mLinearDownload = (LinearLayout) findViewById(R.id.linear_download);
        mLinearDownload.setOnClickListener(this);
        mLinearWelfare = (LinearLayout) findViewById(R.id.linear_welfare);
        mLinearWelfare.setOnClickListener(this);
        mLinearShare = (LinearLayout) findViewById(R.id.linear_share);
        mLinearShare.setOnClickListener(this);
        mLinearSuggest = (LinearLayout) findViewById(R.id.linear_suggest);
        mLinearSuggest.setOnClickListener(this);
        mLinearSetting = (LinearLayout) findViewById(R.id.linear_setting);
        mLinearSetting.setOnClickListener(this);
        mLinearTheme = (LinearLayout) findViewById(R.id.linear_theme);
        ;
        mLinearTheme.setOnClickListener(this);
        mLinearAbout = (LinearLayout) findViewById(R.id.linear_about);
        mLinearAbout.setOnClickListener(this);
        mIncluTitles = (TextView) findViewById(R.id.inclu_titles);
        mIncluTitles.setOnClickListener(this);
        mMainBtb.setOnClickListener(this);
    }

    @Override
    public void onSuccess(String s) {

    }

    @Override
    public void onFail(String fail) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.linear_collection://收藏
                startActivity(new Intent(MainActivity.this, CollectionActivity.class));
                break;
            case R.id.linear_download://下载
                Toast.makeText(this, "亲,暂时未数据!", Toast.LENGTH_SHORT).show();
                ;
                break;
            case R.id.linear_welfare://福利
                startActivity(new Intent(MainActivity.this, WelfareActivity.class));
                break;
            case R.id.linear_share://分享

                break;
            case R.id.linear_suggest://建议
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                final AlertDialog alertDialog = builder.create();
                View inflate = View.inflate(this, R.layout.dialog_advise, null);
                alertDialog.setView(inflate);
                //邮箱
                advise_edit_email = inflate.findViewById(R.id.advise_edit_email);
                advise_text_phone = inflate.findViewById(R.id.advise_text_phone);
                //反馈内容
                advise_edit_con = inflate.findViewById(R.id.advise_edit_con);
                //录音
                advise_btn_voice = inflate.findViewById(R.id.advise_btn_voice);
                //取消
                advise_btn_cancel = inflate.findViewById(R.id.advise_btn_cancel);
                //发送
                advise_btn_send = inflate.findViewById(R.id.advise_btn_send);
                //点击取消按钮
                advise_btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                //点击发送按钮
                advise_btn_send.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //验证邮箱输入格式
                        String ademail = advise_edit_email.getText().toString();
                        Pattern pattern = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
                        Matcher mc = pattern.matcher(ademail);
                        boolean matches = mc.matches();
                        if (matches){
                            Toast.makeText(MainActivity.this,"ok",Toast.LENGTH_LONG).show();
                        }else {
                            Toast.makeText(MainActivity.this,"你输入的邮箱格式不正确",Toast.LENGTH_LONG).show();
                        }

                    }
                });
                advise_text_phone.setText("设备详情"+Build.BRAND+Build.VERSION.RELEASE);

                alertDialog.show();

                break;
            case R.id.linear_setting://设置
                startActivity(new Intent(MainActivity.this, SettingActivity.class));
                break;
            case R.id.linear_theme://主题
                new ColorChooserDialog.Builder(MainActivity.this, R.string.color_palette)
                        .accentMode(true)//
                        .customColors(primary, null)//两个颜色数组
                        .dynamicButtonColor(true)//动态按钮颜色
                        .customButton(0)//设置颜色不显示
                        .cancelButton(R.string.cancle)
                        .doneButton(R.string.done)
                        .show(MainActivity.this);//传入上下文
                break;
            case R.id.linear_about://关于
                //1.创建构造器对象
                AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                //2.通过构造器对象,,,创建出来一个AlertDialog的对象
                final AlertDialog dialog = builder1.create();
                //3.通过AlertDialog的对象,,,去设置自己的布局(视图对象)
                View contentView = View.inflate(MainActivity.this, R.layout.dialog_layout, null);
                dialog.setView(contentView);
                //4.可以执行逻辑操作,,,按钮的监听,,,找控件还是必须通过,视图对象去找
                dialog_t = contentView.findViewById(R.id.dialog_t);
                dialog_tv = contentView.findViewById(R.id.dialog_tv);
                dilog_close = contentView.findViewById(R.id.dilog_close);
                dilog_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog_t.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this, WebViewActivity.class));
                    }
                });
                dialog_tv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this, WebViewActivity.class));
                    }
                });
                //5.显示对话框
                dialog.show();
                break;
        }
    }

    @Override
    public void onColorSelection(@NonNull ColorChooserDialog dialog, int selectedColor) {
        reside_layout.setBackgroundColor(selectedColor);
        include_relative.setBackgroundColor(selectedColor);
        main_liner.setBackgroundColor(selectedColor);
        SharedPreferences sharedPreferences = getSharedPreferences("register_user", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("selectedColor",selectedColor);
        edit.putBoolean("islogin",true);
        edit.commit();



    }

    @Override
    public void onColorChooserDismissed(@NonNull ColorChooserDialog dialog) {

    }

}
