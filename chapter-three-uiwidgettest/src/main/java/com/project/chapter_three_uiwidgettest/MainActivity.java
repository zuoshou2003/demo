package com.project.chapter_three_uiwidgettest;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mButton;

    private EditText mEditText;

    private ProgressBar mProgressBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView(){
        mButton = findViewById(R.id.button);
        mEditText = findViewById(R.id.edit_text);
        mProgressBar = findViewById(R.id.progress_circular);
        //非匿名类监听，改接口形式
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button){
//            String str = mEditText.getText().toString();
//            Toast.makeText(this,str,Toast.LENGTH_SHORT).show();

            //圆形进度条
//            if(mProgressBar.getVisibility() == View.GONE){
//                mProgressBar.setVisibility(View.VISIBLE);
//            }else{
//                mProgressBar.setVisibility(View.GONE);
//            }

            //条状进度条
//            int progress = mProgressBar.getProgress();
//            progress += 10;
//            mProgressBar.setProgress(progress);

            AlertDialog.Builder dialog = new AlertDialog.Builder(this);
            dialog.setTitle("This is dialog");
            dialog.setMessage("Sth important");
            //注意此时设置了setCancelable为false，即使调用dismiss方法关闭对话框
            dialog.setCancelable(false);
            dialog.setPositiveButton("ok", (dialogInterface, i) -> {

            });
            dialog.setNegativeButton("Cancel", (dialogInterface, i) -> {

            });
            dialog.show();
        }
    }
}
