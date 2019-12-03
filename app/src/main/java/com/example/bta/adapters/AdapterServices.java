package com.example.bta.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bta.R;
import com.example.bta.activities.Contact;
import com.example.bta.activities.FindusActivity;
import com.example.bta.activities.ServicesActivity;
import com.example.bta.modals.Services;

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
        View view = LayoutInflater.from(context).inflate(R.layout.services_card,parent,false);
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
        int position;
        public MyViewHolder(@NonNull final View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.serviceImage);
            textView = itemView.findViewById(R.id.serviceTitle);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    position = getAdapterPosition();
                    switch (position){
                        case 0:
                            Toast.makeText(itemView.getContext(), "Restaurant", Toast.LENGTH_SHORT).show();
                            break;
                        case 1:
                            Toast.makeText(itemView.getContext(), "Emergency Contact", Toast.LENGTH_SHORT).show();
                            Intent intent1 = new Intent(context, Contact.class);
                            context.startActivity(intent1);
                            break;
                        case 2:
                            Toast.makeText(itemView.getContext(), "Toilet", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(context,FindusActivity.class);
                            intent.putExtra("KEY",1000);
                            context.startActivity(intent);
                            break;
                        case 3:
                            Toast.makeText(itemView.getContext(), "Bus Stand", Toast.LENGTH_SHORT).show();
                            break;
                        case 4:
                            Toast.makeText(itemView.getContext(), "Currency Conversion", Toast.LENGTH_SHORT).show();
                            break;
                        case 5:
                            Toast.makeText(itemView.getContext(), "Health", Toast.LENGTH_SHORT).show();
                            Intent intent5 = new Intent(context,FindusActivity.class);
                            intent5.putExtra("KEY",1001);
                            context.startActivity(intent5);
                            break;
                        default:
                            Toast.makeText(itemView.getContext(), "Health", Toast.LENGTH_SHORT).show();

                    }

                }
            });
        }
    }
}
