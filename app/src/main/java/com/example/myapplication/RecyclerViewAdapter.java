package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewholder>

{

    Context context;
    List<Item> mItem;

    public RecyclerViewAdapter(Context context, List < Item > mItem) {
        this.context = context;
        this.mItem = mItem;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder (@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(context).inflate(R.layout.itemlayout, parent, false);
        return new MyViewholder(view);
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public void onBindViewHolder ( @NonNull final RecyclerViewAdapter.MyViewholder holder,
                                   int position){
        Item item = mItem.get(position);
        holder.textView2.setText(item.name);
        holder.clickbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.textView.setVisibility(View.VISIBLE);
            }
        });

    }

    @Override
    public int getItemCount () {
        return mItem.size();
    }


    static class MyViewholder extends RecyclerView.ViewHolder {
        public TextView textView,textView2;
        public Button clickbutton;

        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            textView2 = itemView.findViewById(R.id.textname);
            textView = itemView.findViewById(R.id.textclicked);
            clickbutton = itemView.findViewById(R.id.clickbutton);

        }
    }
}

