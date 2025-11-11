package com.project.chapter_two;


import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.widget.Button;

import androidx.annotation.Nullable;

public class ThirdActivity extends BaseActivity {
    private String TAG = "ThirdActivity";

    private Button mbtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");
        setContentView(R.layout.third_layout);
        mbtn = findViewById(R.id.button_3);
        mbtn.setOnClickListener(view -> {
            //通过活动管理结束所有
            ActivityCollector.finishAll();
            Process.killProcess(Process.myPid());
        });
    }
}
