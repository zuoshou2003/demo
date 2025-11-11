package com.project.chapter_two_activitylifecircletest;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button mBtnDialogActivity;
    Button mBtnNormalActivity;
    private String TAG = "MainActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if(savedInstanceState != null)
        {
            String tempData = savedInstanceState.getString("data_key");
            Log.d(TAG, "onCreate: " + tempData);
        }
        initview(savedInstanceState);
    }

    private void initview(@Nullable Bundle savedInstanceState){
        mBtnDialogActivity = findViewById(R.id.start_dialog_activity);
        mBtnNormalActivity = findViewById(R.id.start_normal_activity);
        mBtnDialogActivity.setOnClickListener(view -> {
            Intent intent = new Intent(this,DialogActivity.class);
            //尝试通过intent传输bundle对象，跳转的活动获取时要先拿intent，再拿bundle，再get数据
            intent.putExtra("bundle",savedInstanceState);
            startActivity(intent);
        });
        mBtnNormalActivity.setOnClickListener(view -> {
            Intent intent = new Intent(this,NormalActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    //用于活动可能被回收临时数据存储
    //例子：MainActivity中存在文本输入框，启动NormalActivity时，MainActivity被回收导致输入框内容丢失
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String tempData = "Sth you just type";
        outState.putString("data_key", tempData);
    }
}
