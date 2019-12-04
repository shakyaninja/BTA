package com.example.bta.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.bta.R;
import com.example.bta.modals.Guides;

import java.util.ArrayList;

public class AdapterGuides extends RecyclerView.Adapter<AdapterGuides.MyHolder> {

    Context context;
    ArrayList<Guides> arrayList;
    public AdapterGuides(Context context, ArrayList<Guides> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView location;
        TextView description;
        TextView phone;
        ImageView image;

        public MyHolder(final View itemView){
            super(itemView);
            name = itemView.findViewById(R.id.name);
            location = itemView.findViewById(R.id.location);
            description = itemView.findViewById(R.id.description);
            phone = itemView.findViewById(R.id.phone);
            image = itemView.findViewById(R.id.image);
        }
    }

    @NonNull
    @Override
    public AdapterGuides.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.content_card_guide, parent,false);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int position) {
        myHolder.name.setText(arrayList.get(position).getName());
        Glide
                .with(context)
                .load(arrayList.get(position).getImage())
                .into(myHolder.image);
        myHolder.location.setText(arrayList.get(position).getLocation());
        myHolder.description.setText(arrayList.get(position).getDescription());
        myHolder.phone.setText(arrayList.get(position).getPhoneNumber());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}

