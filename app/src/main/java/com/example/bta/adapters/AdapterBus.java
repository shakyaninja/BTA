package com.example.bta.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bta.R;
import com.example.bta.activities.ViewWeb;
import com.example.bta.modals.Bus;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AdapterBus extends RecyclerView.Adapter<AdapterBus.MyViewHolder> {
    Context context;
    ArrayList<Bus> arrayList;

    public AdapterBus(Context context, ArrayList<Bus> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public AdapterBus.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.bus_card,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterBus.MyViewHolder holder, int position) {
        holder.destination.setText(arrayList.get(position).getDestination());
        holder.busStand.setText((arrayList.get(position).getFrom()));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
    protected TextView destination;
    protected TextView busStand;
    protected ImageView direction;
    protected int position;
        public MyViewHolder(@NonNull final View itemView) {
            super(itemView);
            destination = itemView.findViewById(R.id.destination);
            busStand = itemView.findViewById(R.id.busStand);
            direction = itemView.findViewById(R.id.showDirection);
            direction.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    position = getAdapterPosition();
                    Intent intent = new Intent(context,ViewWeb.class);
                    intent.putExtra("key",2000+position);
                    context.startActivity(intent);
                }
            });
        }
    }
}
