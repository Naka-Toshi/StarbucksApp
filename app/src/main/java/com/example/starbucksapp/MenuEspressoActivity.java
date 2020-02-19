package com.example.starbucksapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MenuEspressoActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_espresso);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view_espresso);
        recyclerView.setHasFixedSize(true);

        String[] title = {"Starbucks Latte", "Soy Latte", "Cappuccino", "Caffe Mocha", "White Mocha", "Caramel Macchiato", "Caffe Americano", "Espresso", "Espresso con Panna", "Espresso Macchiato", "Decaffe starbucks latte", "Moussed foam Latte", "Moussed foam Caramel Macchiato"};
        String[] subtitle = {"Starbucks Latte desc", "Soy Latte desc", "Cappuccino desc", "Caffe Mocha desc", "White Mocha desc", "Caramel Macchiato desc", "Caffe Americano desc", "Espresso desc", "Espresso con Panna desc", "Espresso Macchiato desc", "Decaffe starbucks latte desc", "Moussed foam Latte desc", "Moussed foam Caramel Macchiato desc"};
        //Integer[] images =


        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < title.length; i++){
            Product product = new Product();

            product.setTitle(title[i]);
            product.setSubtitle(subtitle[i]);
            productList.add(product);
        }

        mAdapter = new MenuEspressoViewAdapter(productList, this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);

    }

}
