package com.example.weiying.view.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.weiying.R;
import com.example.weiying.presenter.BasePresenter;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SettingActivity extends BaseActivity implements View.OnClickListener {

    private ImageView mIncluBack;
    /**
     * 删除
     */
    private TextView mIncluDelete;
    /**
     * 精选
     */
    private TextView mIncluTitles;
    private RelativeLayout mRelativeTj;
    /**
     * 36kb
     */
    private TextView mQlTv;
    private RelativeLayout mRelativeQl;
    private RelativeLayout mRelativeGy;
    private RelativeLayout mRelativeFk;
    private TextView dilog_close;
    private TextView dialog_tv;
    private TextView dialog_t;
    private EditText advise_edit_email;
    private TextView advise_text_phone;
    private EditText advise_edit_con;
    private Button advise_btn_voice;
    private Button advise_btn_cancel;
    private Button advise_btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int setLayout() {
        return R.layout.activity_setting;
    }

    @Override
    protected void initData() {

    }

    @Override
    BasePresenter setPresenter() {
        return new BasePresenter();
    }

    @Override
    protected void initView() {

        mIncluBack = (ImageView) findViewById(R.id.inclu_back);
        mIncluBack.setOnClickListener(this);
        mIncluBack.setVisibility(View.VISIBLE);
        mIncluTitles = (TextView) findViewById(R.id.inclu_titles);
        mIncluTitles.setOnClickListener(this);
        mIncluTitles.setText("设置");
        mRelativeTj = (RelativeLayout) findViewById(R.id.relative_tj);
        mRelativeTj.setOnClickListener(this);
        mQlTv = (TextView) findViewById(R.id.ql_tv);
        mQlTv.setOnClickListener(this);
        mRelativeQl = (RelativeLayout) findViewById(R.id.relative_ql);
        mRelativeQl.setOnClickListener(this);
        mRelativeGy = (RelativeLayout) findViewById(R.id.relative_gy);
        mRelativeGy.setOnClickListener(this);
        mRelativeFk = (RelativeLayout) findViewById(R.id.relative_fk);
        mRelativeFk.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.inclu_back://返回
                finish();
                break;
            case R.id.relative_tj://推荐
                AlertDialog.Builder builder = new AlertDialog.Builder(SettingActivity.this);
                builder.setMessage("https://my.csdn.net/niu_yue_jiao");// 提示的内容
                builder.setTitle("发现一个看片神器");// 提示框的标题
                // 设置确定(积极)按钮
                builder.setPositiveButton("复制", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // 点击监听执行的逻辑操作
                        Toast.makeText(SettingActivity.this, "已复制到粘贴板", Toast.LENGTH_SHORT).show();
                    }
                });
                // 设置取消(消极)按钮
                builder.setNegativeButton("关闭", null);
                // 3.显示对话框
                builder.show();
                break;
            case R.id.relative_ql://清理缓存
                mQlTv.setText("0kb");
                break;
            case R.id.relative_gy://关于我们
                //1.创建构造器对象
                AlertDialog.Builder builder1 = new AlertDialog.Builder(SettingActivity.this);
                //2.通过构造器对象,,,创建出来一个AlertDialog的对象
                final AlertDialog dialog = builder1.create();
                //3.通过AlertDialog的对象,,,去设置自己的布局(视图对象)
                View contentView = View.inflate(SettingActivity.this, R.layout.dialog_layout, null);
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
                        startActivity(new Intent(SettingActivity.this, WebViewActivity.class));
                    }
                });
                dialog_tv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(SettingActivity.this, WebViewActivity.class));
                    }
                });
                //5.显示对话框
                dialog.show();
                break;
            case R.id.relative_fk://反馈
                AlertDialog.Builder builder02 = new AlertDialog.Builder(SettingActivity.this);
                final AlertDialog alertDialog = builder02.create();
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
                            Toast.makeText(SettingActivity.this,"ok",Toast.LENGTH_LONG).show();
                        }else {
                            Toast.makeText(SettingActivity.this,"你输入的邮箱格式不正确",Toast.LENGTH_LONG).show();
                        }

                    }
                });
                advise_text_phone.setText("设备详情"+ Build.BRAND+Build.VERSION.RELEASE);
                alertDialog.show();
                break;
        }
    }
}
