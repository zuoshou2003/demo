package com.project.chapter_one;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HelloWorldActivity extends AppCompatActivity {
    private String TAG = "HelloWorldActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置加载的页面
        setContentView(R.layout.hello_world_layout);
        //日志记录输出
        Log.d(TAG, "onCreate: execute");

    }
}
