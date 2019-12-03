package com.example.bta.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bta.R;
import com.example.bta.activities.ServicesActivity;
import com.example.bta.modals.Services;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AdapterServices extends RecyclerView.Adapter<AdapterServices.MyViewHolder> {
    ServicesActivity context;
    ArrayList<Services> arrayList;

    public AdapterServices(ServicesActivity context, ArrayList<Services> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public AdapterServices.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.services_card,parent,true);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterServices.MyViewHolder holder, int position) {
        holder.imageView.setImageResource(arrayList.get(position).getImage());
        holder.textView.setText(arrayList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        protected ImageView imageView;
        protected TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.serviceImage);
            textView = itemView.findViewById(R.id.serviceTitle);
        }
    }
}
