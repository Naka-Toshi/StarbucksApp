package com.example.starbucksapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MenuCoffeeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_coffee);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view_coffee);
        recyclerView.setHasFixedSize(true);

        String[] title = {"Drip coffee", "Plunger coffee", "Caffe Misto", "Cold Brew Coffee"};
        String[] subtitle = {"drip coffee desc", "plunger coffee desc", "caffe misto desc", "cold brew coffee desc"};
        //Integer[] images


        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < title.length; i++) {
            Product product = new Product();
         //product.setImages(images[i]);
            product.setTitle(title[i]);
            product.setSubtitle(subtitle[i]);
            productList.add(product);
        }

        mAdapter = new MenuCoffeeViewAdapter(productList, this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);
    }
 }
