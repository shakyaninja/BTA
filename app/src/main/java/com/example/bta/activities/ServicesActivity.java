package com.example.bta.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bta.R;
import com.example.bta.adapters.AdapterServices;
import com.example.bta.modals.Services;

import java.util.ArrayList;
public class ServicesActivity extends AppCompatActivity {
ArrayList<Services> arrayList;
RecyclerView recyclerView;
AdapterServices adapterServices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        linearServices();
        recyclerView = findViewById(R.id.serviceGrid);
        RecyclerView.LayoutManager  layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        adapterServices= new AdapterServices(this, arrayList);
        recyclerView.setAdapter(adapterServices);
    }
    private void linearServices(){
        arrayList = new ArrayList<>();
        arrayList.add(new Services("Restaurant","Nearby Service",R.drawable.restaurant_image));
        arrayList.add(new Services("Emergency","Safety Service",R.drawable.emergency_image));
        arrayList.add(new Services("Washroom","Comfort Service",R.drawable.washroom_image2));
        arrayList.add(new Services("Nearby Washroom","Nearby Service",R.drawable.restroom_image));
        arrayList.add(new Services("Bus Stop","Destination Service",R.drawable.busstop_image));
        arrayList.add(new Services("Money Exchange","Comfort Service",R.drawable.currency_image));
        arrayList.add((new Services("Hospitals","Health Care Service",R.drawable.health_image)));
        arrayList.add((new Services("Guide","Comfort Service",R.drawable.guide_img)));
    }
}
