package com.example.starbucksapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.starbucksapp.BottomNavigationActivity;

public class HomeFragment extends Fragment implements View.OnClickListener {

    Button btn1, btn2, btn3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //When I move on fragment to another fragment, use View.v
        View v = inflater.inflate(R.layout.fragment_home, null);
        btn1 = v.findViewById(R.id.search_btn);
        btn2 = v.findViewById(R.id.mo_btn);
        btn3 = v.findViewById(R.id.post_btn);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

        return v;
    }

    public void replaceFragment(Fragment someFragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, someFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onClick(View v) {
        Fragment fragment = null;
        switch (v.getId()) {
            case R.id.search_btn:
                fragment = new SearchFragment();
                replaceFragment(fragment);
                break;
            case R.id.mo_btn:
                fragment = new MOFragment();
                replaceFragment(fragment);
                break;
            case R.id.post_btn:
                fragment = new PostFragment();
                replaceFragment(fragment);
                break;
        }
    }
}
