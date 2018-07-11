package com.example.weiying.view.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.weiying.R;
import com.example.weiying.model.bean.DetailsBean;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
    }



    public static void start(Context context, DetailsBean bean) {
        Intent starter = new Intent(context, DetailsActivity.class);
      //  starter.putExtra("bean", bean);
        context.startActivity(starter);
    }

}
