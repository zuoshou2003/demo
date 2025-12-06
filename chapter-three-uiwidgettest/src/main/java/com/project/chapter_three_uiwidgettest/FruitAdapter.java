package com.project.chapter_three_uiwidgettest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceID;

    public FruitAdapter(@NonNull Context context, int resource, List<Fruit> fruits) {
        super(context, resource);
        resourceID = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceID, parent, false);
        ImageView fruitImage = view.findViewById(R.id.fruit_image);
        TextView fruitName = view.findViewById(R.id.fruit_name);
        fruitImage.setImageResource(fruit.getImageId());
        fruitName.setText(fruit.getName());
        return view;
    }
}
