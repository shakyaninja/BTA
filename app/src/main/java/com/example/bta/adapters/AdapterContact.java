package com.example.bta.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bta.R;
import com.example.bta.modals.EmergencyContact;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AdapterContact  extends RecyclerView.Adapter<AdapterContact.MyViewHolder> {
    Context context;

    public AdapterContact(Context context, ArrayList<EmergencyContact> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    ArrayList<EmergencyContact> arrayList;
    @NonNull
    @Override
    public AdapterContact.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.emergency_card,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterContact.MyViewHolder holder, int position) {
        holder.serviceprovider.setText(arrayList.get(position).getServiceProvider());
        holder.contact.setText(arrayList.get(position).getContactno());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        protected TextView serviceprovider;
        protected TextView contact;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            serviceprovider = itemView.findViewById(R.id.emergencyServiceProvider);
            contact = itemView.findViewById(R.id.emergencyContact);
        }
    }
}
