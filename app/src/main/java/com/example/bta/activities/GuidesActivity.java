package com.example.bta.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bta.R;
import com.example.bta.adapters.AdapterGuides;
import com.example.bta.modals.Guides;

import java.util.ArrayList;

public class GuidesActivity extends AppCompatActivity {
    private RecyclerView recyclerViewGuide;
    AdapterGuides adapterGuides;
    RecyclerView.LayoutManager layoutManagerGuide;
    Toolbar toolbar;
    ArrayList<Guides> arrayList5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guides);
        Toolbar toolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);

        linearGuide();

        recyclerViewGuide = findViewById(R.id.recyclerGuides);
        layoutManagerGuide = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerViewGuide.setLayoutManager(layoutManagerGuide);
        adapterGuides = new AdapterGuides(this, arrayList5);
        recyclerViewGuide.setAdapter(adapterGuides);
    }
    //guides
    private void linearGuide(){
        arrayList5 = new ArrayList<>();

        arrayList5.add(new Guides("Sailesh Deshemaru",R.drawable.akhijhyal,"Inacho","desc............................................. ","9860685929"));
        arrayList5.add(new Guides("Ram Bahadur gurung",R.drawable.durbar_square_bhaktapur,"Skuldhoka","desc............................................. ","9860685929"));
        arrayList5.add(new Guides("Subin raj pokhrel",R.drawable.nyatapola,"Gundu","desc............................................. ","9860685929"));

    }
}
