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
        arrayList.add(new EmergencyContact("Fire Brigade","101"));
        arrayList.add(new EmergencyContact("Police Control","100"));
        arrayList.add(new EmergencyContact("Department of Immigration","01-4223509/ 01-4472257"));
        arrayList.add(new EmergencyContact("Tribhuvan International Airport(TIA)","01-4472256/ 01-4472257"));
        arrayList.add(new EmergencyContact("Electricity Bhaktapur(Power Failure)","01-6610065"));
        arrayList.add(new EmergencyContact("Ambulance(Bhaktapur Municipality)","01-6613200/ 9851082799"));
        arrayList.add(new EmergencyContact("Ambulance(Siddhi Smriti Hospital)","01-6610570/ 9841204991"));
        arrayList.add(new EmergencyContact("Ambulance(Dr. Iwamura Hospital)","01-6612705"));
        arrayList.add(new EmergencyContact("Ambulance(Bhaktapur Cancer Hospital)","01-6611532/ 9860171552"));
        arrayList.add(new EmergencyContact("Ambulance(Red Cross)","01-6612266/ 9841489408"));
        arrayList.add(new EmergencyContact("Ambulance(Madyapur Thimi Hospital)","9851133613"));
        arrayList.add(new EmergencyContact("Bhaktapur Hospital","01-6610676"));
        arrayList.add(new EmergencyContact("Blood Blank, Kathmandu","01-4229344/ 01-4225344"));
        arrayList.add(new EmergencyContact("Blood Blank, Bhaktapur","01-6612266/ 01-6611661"));
        arrayList.add(new EmergencyContact("Tilganga Eye Hospital","01-4250691"));
        arrayList.add(new EmergencyContact("Bhaktapur RedCross","01-6612266"));
        arrayList.add(new EmergencyContact("Madyapur Thimi Hospital","01-5093388"));


    }
}
