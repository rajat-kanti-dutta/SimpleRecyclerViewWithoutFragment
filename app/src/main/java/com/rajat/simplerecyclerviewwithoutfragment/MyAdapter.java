package com.rajat.simplerecyclerviewwithoutfragment;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
      private List<String> mData;
      private LayoutInflater mInflater;

    public MyAdapter(Context context, List<String> mData) {
        this.mData = mData;
        this.mInflater = LayoutInflater.from(context);
        Log.d("RECYCLERVIEW","in Constructor of MyAdapter...");
    }
    //inflates the row layout from xml when needed
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("RECYCLERVIEW","in onCreateViewHolder...");
       View view = mInflater.inflate(R.layout.recycleview_row,parent,false);
       return new ViewHolder(view);//passed to onBindViewHolder

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            Log.d("RECYCLERVIEW","in onBindViewHolder of MyAdapter...");
            //fill the view creted in onCreateViewHolder from List<String> passed to Constructor

            String animal = mData.get(position);
            holder.myTextView.setText(animal);
            //this construct a single row
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    //stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        //stores Ref. of Widgets of single row xml file
        TextView myTextView;
         ViewHolder(View itemView){
             super(itemView);
             Log.d("RECYCLERVIEW","in Constructor of ViewHolder...");
             myTextView = itemView.findViewById(R.id.tvAnimalNames);



         }

    }
}


