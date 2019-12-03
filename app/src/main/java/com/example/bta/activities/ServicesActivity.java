package com.example.bta.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
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
        RecyclerView.LayoutManager  layoutManager = new GridLayoutManager(this,2,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        adapterServices= new AdapterServices(this, arrayList);
        recyclerView.setAdapter(adapterServices);

    }
    private void linearServices(){
        arrayList = new ArrayList<>();
        arrayList.add(new Services("Restaurant",R.drawable.ic_restaurant));
        arrayList.add(new Services("Car Stand",R.drawable.ic_car_stand));
        arrayList.add(new Services("Toiled",R.drawable.ic_toilet));
        arrayList.add(new Services("Bus Stand",R.drawable.ic_bus_stop));
        arrayList.add(new Services("Money Exchange",R.drawable.ic_currency));
        arrayList.add((new Services("Health",R.drawable.ic_local_hospital_black_24dp)));
    }
}
