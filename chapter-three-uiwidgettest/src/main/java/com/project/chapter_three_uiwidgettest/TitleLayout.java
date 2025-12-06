package com.project.chapter_three_uiwidgettest;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;

public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        //加载布局(入参context, layoutId, 父布局)
        inflate(context, R.layout.title, this);
        //获取控件实例
        Button back = findViewById(R.id.back);
        Button next = findViewById(R.id.next);
        back.setOnClickListener(view -> {
            ((Activity) getContext()).finish();
        });
        next.setOnClickListener(view -> {

        });
    }

}
