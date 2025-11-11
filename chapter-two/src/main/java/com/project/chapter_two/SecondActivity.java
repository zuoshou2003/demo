package com.project.chapter_two;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;


public class SecondActivity extends BaseActivity {
    private String TAG = "SecondActivity";
    private Button mButton2;

   //对外暴露启动方法
    public void actionStart(Context context){
        Intent intent = new Intent(context,SecondActivity.class);
        context.startActivity(intent);

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        Log.d(TAG, data);
        initview();
    }

    private void initview(){
        //绑定控件，获得按钮实例
        mButton2 = findViewById(R.id.button_2);
        //注册监听
        mButton2.setOnClickListener(view -> {
            //仅用intent存储数据不用于跳转
            Intent intent = new Intent();
            intent.putExtra("data_return","Hello FirstActivity");
            //setResult 入参 处理结果 intent
            setResult(RESULT_OK, intent);
            finish();
        });
    }

    //SecondActivity活动back返回的处理
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent();
        intent.putExtra("data_return","Hello FirstActivity");
        setResult(RESULT_OK, intent);
        finish();
    }
}
