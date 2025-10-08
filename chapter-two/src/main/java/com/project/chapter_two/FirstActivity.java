package com.project.chapter_two;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {
	private Button mButton1;
	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first_layout);
		initview();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		//getMenuInflater获得MenuInflater对象，调用inflate给当前活动创建菜单
		//inflate入参 资源文件中的惨淡 指定菜单添加到哪个menu对象
		getMenuInflater().inflate(R.menu.main, menu);
		//true显示
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(@NonNull MenuItem item) {
		int itemId = item.getItemId();
		if (itemId == R.id.add_item) {
			Toast.makeText(this,"You clicked add",Toast.LENGTH_SHORT).show();
		} else if (itemId == R.id.remove_item) {
			Toast.makeText(this,"You clicked remove",Toast.LENGTH_SHORT).show();
		}
		return true;
	}

	private void initview(){
		//绑定控件，获得按钮实例
		mButton1 = findViewById(R.id.button_1);
		//注册监听
		mButton1.setOnClickListener(view -> {
			//Toast通过makeText弹出Toast对象，调用show显示
			//makeText入参 Context 显示内容 显示时间（LONG或者SHORT）
//			Toast.makeText(this, "You clicked Button 1",
//					Toast.LENGTH_SHORT).show();

			//销毁活动
//			finish();

			//显示intent  intent构造之一 context class
//			Intent intent = new Intent(this, SecondActivity.class);
//			startActivity(intent);

			//隐式intent intent构造 action
//			Intent intent = new Intent("android.intent.action.ACTION_START");
			//SecondActivity的category为默认，自动添加到intent中
//			startActivity(intent);

			//每个intent只能指定一个action，却能指定多个category
//			Intent intent = new Intent("android.intent.action.ACTION_START");
			//不使用默认category
//			intent.addCategory("android.intent.category.MY_CATEGORY");
//			startActivity(intent);

			//利用intent多应用功能共享
			Intent intent = new Intent(Intent.ACTION_VIEW);
			//Uri.parse 网址解析网址字符串到Uri对象。setData传递对象
			intent.setData(Uri.parse("https://www.baidu.com"));
			startActivity(intent);
        });

	}
}
