package com.project.chapter_three_uiwidgettest;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButton;

    private EditText mEditText;

    private ProgressBar mProgressBar;

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.list_view);
        initFruits();
        initView();
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit("Apple", R.drawable.ic_launcher_background);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana", R.drawable.ic_launcher_background);
            fruitList.add(banana);
            Fruit orange = new Fruit("Orange", R.drawable.ic_launcher_background);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("Watermelon", R.drawable.ic_launcher_background);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("Pear", R.drawable.ic_launcher_background);
            fruitList.add(pear);
            Fruit grape = new Fruit("Grape", R.drawable.ic_launcher_background);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("Pineapple", R.drawable.ic_launcher_background);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("Strawberry", R.drawable.ic_launcher_background);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit("Cherry", R.drawable.ic_launcher_background);
            fruitList.add(cherry);
            Fruit mango = new Fruit("Mango", R.drawable.ic_launcher_background);
            fruitList.add(mango);
        }
    }

    private void initView() {
//        mButton = findViewById(R.id.button);
//        mEditText = findViewById(R.id.edit_text);
//        mProgressBar = findViewById(R.id.progress_circular);
//        //非匿名类监听，改接口形式
//        mButton.setOnClickListener(this);

//        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, data);

        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private String[] data = {"Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango", "Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango", "Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango"};

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
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
