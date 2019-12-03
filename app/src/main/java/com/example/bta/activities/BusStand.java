package com.example.bta.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.example.bta.R;
import com.example.bta.modals.Bus;

import java.util.ArrayList;

public class BusStand extends AppCompatActivity {
protected RecyclerView recyclerView;
protected ArrayList<Bus> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_stand);
    }
}
