package com.example.starbucksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn1 = findViewById(R.id.btn_coffee);
        btn2 = findViewById(R.id.btn_esprsso);
        btn3 = findViewById(R.id.btn_frappuccino);
        btn4 = findViewById(R.id.btn_others);



        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
           case R.id.btn_coffee:
               Intent intent1 = new Intent(MenuActivity.this, MenuCoffeeActivity.class);
               startActivity(intent1);
               break;

           case R.id.btn_esprsso:
                Intent intent2 = new Intent(MenuActivity.this, MenuEspressoActivity.class);
                startActivity(intent2);
                break;

           case R.id.btn_frappuccino:
                Intent intent3 = new Intent(MenuActivity.this, MenuFrappuccinoActivity.class);
                startActivity(intent3);
                break;

            case R.id.btn_others:
                Intent intent4 = new Intent(MenuActivity.this, MenuOthersActivity.class);
                startActivity(intent4);
                break;
        }

    }
}
