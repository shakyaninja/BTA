package com.example.bta.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.example.bta.R;
import com.example.bta.adapters.AdapterBus;
import com.example.bta.modals.Bus;

import java.util.ArrayList;

public class BusStand extends AppCompatActivity {
protected RecyclerView recyclerView;
protected ArrayList<Bus> arrayList;
protected AdapterBus adapterBus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_stand);
        getBusStandList();
        recyclerView = findViewById(R.id.busRecycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        adapterBus = new AdapterBus(this,arrayList);
        recyclerView.setAdapter(adapterBus);
    }

    private void getBusStandList() {
        arrayList = new ArrayList<>();
        arrayList.add(new Bus("Nagarkot","Kamal Binayak"));
        arrayList.add(new Bus("Nala Gumba","Chayamasingh"));
        arrayList.add(new Bus("Changu Narayan Temple","Dekocha"));
        arrayList.add(new Bus("Kalanki","Chayamasingh"));
        arrayList.add(new Bus("Ratna Park","Chayamasingh"));
        arrayList.add(new Bus("Gausala","Kamal Binayak"));
    }
}
