package com.example.bta.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bta.R;
import com.example.bta.modals.EmergencyContact;

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
        public MyViewHolder(@NonNull final View itemView) {
            super(itemView);
            serviceprovider = itemView.findViewById(R.id.emergencyServiceProvider);
            contact = itemView.findViewById(R.id.emergencyContact);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch(getAdapterPosition()){
                        case 0:
                            Intent intent = new Intent(Intent.ACTION_CALL);
                            Intent intent1 = intent.putExtra("phoneno", arrayList.get(getAdapterPosition()));
                            break;
                    }
                    Toast.makeText(context, "contact:", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
