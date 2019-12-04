package com.example.bta.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.bta.R;
import com.example.bta.activities.DetailActivity;
import com.example.bta.modals.ImageTitle;

import java.util.ArrayList;

public class AdapterSquares extends RecyclerView.Adapter<AdapterSquares.MyHolder> {
    private int imageWidthPixels = 1024;
    private int imageHeightPixels = 768;
    Context context;
    ArrayList<ImageTitle> arrayList;
    public AdapterSquares(Context context, ArrayList<ImageTitle> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public AdapterSquares.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.content_card, parent,false);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterSquares.MyHolder myHolder, int position) {
        myHolder.title.setText(arrayList.get(position).getTitle());
        Glide
                .with(context)
                .load(arrayList.get(position).getImages())
                .into(myHolder.image);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView image;

        public MyHolder(final View itemView){
            super(itemView);
            title = itemView.findViewById(R.id.title);
            image = itemView.findViewById(R.id.image);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, DetailActivity.class);
                    intent.putExtra("KEY",getAdapterPosition()+1);
                    context.startActivity(intent);
                }
            });
        }
    }
}
