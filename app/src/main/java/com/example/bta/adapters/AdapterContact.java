package com.example.bta.adapters;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bta.R;
import com.example.bta.modals.EmergencyContact;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AdapterContact  extends RecyclerView.Adapter<AdapterContact.MyViewHolder> {
    Context context;
    String telNum;

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
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(),"Contact: "+arrayList.get(getAdapterPosition()).getContactno() ,Toast.LENGTH_SHORT).show();
                    Intent intentCall = new Intent(Intent.ACTION_CALL);
                    telNum=arrayList.get(getAdapterPosition()).getContactno();
                    if(telNum.trim().isEmpty()){
                        //intentCall.setData(Uri.parse("tel:9841637912"));
                        Toast.makeText(itemView.getContext(),"Please Enter Number",Toast.LENGTH_SHORT).show();
                    }else{
                        intentCall.setData(Uri.parse("tel:"+telNum));
                    }
                    if(ActivityCompat.checkSelfPermission(itemView.getContext(), Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        Toast.makeText(itemView.getContext(),"Please grant permission",Toast.LENGTH_SHORT).show();
                        requestPermissions();
                    }else{
                        context.startActivity(intentCall);
                    }

                }

                private void requestPermissions() {
                    ActivityCompat.requestPermissions((Activity)context, new String[]{Manifest.permission.CALL_PHONE},1);
                }
            });
        }
    }
}
