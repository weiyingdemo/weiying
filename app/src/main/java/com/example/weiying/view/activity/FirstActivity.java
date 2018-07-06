package com.example.weiying.view.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.weiying.R;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        LinearLayout bg = findViewById(R.id.bg);

        int array[] = {R.drawable.bg,R.drawable.bg_blue,R.drawable.bg_colorful};
        Random rnd = new Random();
        int index = rnd.nextInt(2);
        Resources resources = getBaseContext().getResources();
        Drawable cur = resources.getDrawable(array[index]);
        bg.setBackgroundDrawable(cur);

        final Intent it = new Intent(this, MainActivity.class); //你要转向的Activity
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                startActivity(it); //执行
                finish();
            }
        };
        timer.schedule(task, 1000 * 2); //2秒后
    }
}
