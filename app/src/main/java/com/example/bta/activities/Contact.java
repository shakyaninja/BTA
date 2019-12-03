package com.example.bta.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.bta.R;
import com.example.bta.adapters.AdapterContact;
import com.example.bta.adapters.AdapterServices;
import com.example.bta.modals.EmergencyContact;

import java.util.ArrayList;

public class Contact extends AppCompatActivity {
ArrayList<EmergencyContact> arrayList;
protected RecyclerView recyclerView;
protected AdapterContact adapterContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        Toast.makeText(this, "Emergency Contact", Toast.LENGTH_SHORT).show();
        generateList();
        recyclerView = findViewById(R.id.emergencyhealth);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        adapterContact = new AdapterContact(this,arrayList);
        recyclerView.setAdapter(adapterContact);
    }

    public void generateList(){
        arrayList = new ArrayList<>();
        arrayList.add(new EmergencyContact("Bhaktapur Hospital","9843803828"));
        arrayList.add(new EmergencyContact("Janswasthaya","5122035"));
        arrayList.add(new EmergencyContact("Bhaktapur Hospital","9843803828"));
        arrayList.add(new EmergencyContact("Janswasthaya","5122035"));
        arrayList.add(new EmergencyContact("Bhaktapur Hospital","9843803828"));
        arrayList.add(new EmergencyContact("Janswasthaya","5122035"));
        arrayList.add(new EmergencyContact("Bhaktapur Hospital","9843803828"));
        arrayList.add(new EmergencyContact("Janswasthaya","5122035"));
        arrayList.add(new EmergencyContact("Bhaktapur Hospital","9843803828"));
        arrayList.add(new EmergencyContact("Janswasthaya","5122035"));
        arrayList.add(new EmergencyContact("Bhaktapur Hospital","9843803828"));
        arrayList.add(new EmergencyContact("Janswasthaya","5122035"));
        arrayList.add(new EmergencyContact("Bhaktapur Hospital","9843803828"));
        arrayList.add(new EmergencyContact("Janswasthaya","5122035"));
        arrayList.add(new EmergencyContact("Bhaktapur Hospital","9843803828"));
        arrayList.add(new EmergencyContact("Janswasthaya","5122035"));
        

    }
}
