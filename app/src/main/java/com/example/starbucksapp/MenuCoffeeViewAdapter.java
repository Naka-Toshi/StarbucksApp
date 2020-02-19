package com.example.starbucksapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import android.widget.ImageView;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class MenuCoffeeViewAdapter extends RecyclerView.Adapter<MenuCoffeeViewAdapter.ViewHolder> {

    private List<Product> productList;
    Activity activity;

    public MenuCoffeeViewAdapter (List<Product> products, Activity activiyty) {
        productList = products;
        this.activity = activity;
    }


    @NonNull
    @Override
    public MenuCoffeeViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View v  = inflater.inflate(R.layout.row_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuCoffeeViewAdapter.ViewHolder holder,final int position) {

       // holder.imageView.setImageResource(productList.get(position).getImage());
        holder.textFooter.setText(productList.get(position).getSubtitle());
        holder.textHeader.setText(productList.get(position).getTitle());
        holder.textHeader.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                remove(position);
            }
        });
    }

    private void remove(int position) {
        productList.remove(position);
        notifyItemRemoved(position);
    }


    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textHeader;
        public TextView textFooter;
        public ImageView imageView;
        public View layout;


        public ViewHolder(@NonNull View v) {
            super(v);
            layout = v;
            textHeader = v.findViewById(R.id.first_line_text);
            textFooter = v.findViewById(R.id.second_line_text);
            imageView = v.findViewById(R.id.icon);
        }
    }
}

