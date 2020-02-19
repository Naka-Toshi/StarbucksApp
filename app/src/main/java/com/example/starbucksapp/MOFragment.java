package com.example.starbucksapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MOFragment extends Fragment implements View.OnClickListener {

    Button btn1, btn2;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) { super.onCreateView(inflater, container, savedInstanceState);

        View v =  inflater.inflate(R.layout.fragment_mo,null);
        btn1 = v.findViewById(R.id.menu_btn);
        btn2 = v.findViewById(R.id.order_btn);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menu_btn:
                Intent intent1 = new Intent(getActivity(), MenuActivity.class);
                startActivity(intent1);
                break;
            case R.id.order_btn:
                Intent intent2 = new Intent(getActivity(), OrderActivity.class);
                startActivity(intent2);
                break;
        }
    }
}


