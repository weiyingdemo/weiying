package com.example.weiying.view.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;

import com.example.weiying.R;
import com.example.weiying.presenter.BasePresenter;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class FirstActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_first);

    }

    @Override
    protected int setLayout() {
        return R.layout.activity_first;
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

        LinearLayout bg = findViewById(R.id.bg);

        int array[] = {R.drawable.timg1,R.drawable.timg2,R.drawable.timg3,R.drawable.timg4,R.drawable.timg5,R.drawable.timg6,R.drawable.timg7,R.drawable.timg8};
        Random rnd = new Random();
        int index = rnd.nextInt(7);
        Resources resources = getBaseContext().getResources();
        Drawable cur = resources.getDrawable(array[index]);
        bg.setBackgroundDrawable(cur);

        Animation alphaAnimation = new AlphaAnimation(0.0f, 2.0f);
        alphaAnimation.setDuration(3000);//设置动画持续时间为3000毫秒
        alphaAnimation.setFillAfter(true);//设置动画结束后保持当前的位置（即不返回到动画开始前的位置）
        bg.startAnimation(alphaAnimation);

        final Intent it = new Intent(this, MainActivity.class); //你要转向的Activity
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                startActivity(it); //执行
                finish();
            }
        };
        timer.schedule(task, 1000 * 3); //2秒后
    }
}
