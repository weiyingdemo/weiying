package com.example.weiying.view.activity;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.weiying.R;
import com.example.weiying.model.utils.CleanupCache;
import com.example.weiying.presenter.BasePresenter;

import java.io.File;

public class SetupActivity extends BaseActivity{
    private TextView tv_size;
    private RelativeLayout rl_Cache;
    private String dataSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);
        tv_size = (TextView) findViewById(R.id.tv_size);
        rl_Cache = (RelativeLayout) findViewById(R.id.rl_Cache);
        //获取缓存大小
        dataSize = getDataSize();
        tv_size.setText(dataSize);
        rl_Cache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SetupActivity.this);
                builder.setTitle("提示");
                builder.setMessage("是否清空缓存");
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        CleanupCache.cleanApplicationDataNoSP(SetupActivity.this);
                        dataSize = getDataSize();//获取缓存大小
                        tv_size.setText( dataSize);
                        Toast.makeText(SetupActivity.this,"已清除缓存",Toast.LENGTH_LONG).show();
                    }
                });
                builder.show();
            }
        });
    }

    private String getDataSize() {
        long fileSize = 0;
        File fileDir = getFilesDir();
        File cacheDir = getCacheDir();
        fileSize += CleanupCache.getDirSize(fileDir);
        fileSize += CleanupCache.getDirSize(cacheDir);
        String formatSize = CleanupCache.getFormatSize(fileSize);
        return formatSize;
    }


    @Override
    protected int setLayout() {
        return R.layout.activity_setup;
    }

    @Override
    protected void initData() {

    }

    @Override
    BasePresenter setPresenter() {
        return null;
    }

    @Override
    protected void initView() {

    }
}
