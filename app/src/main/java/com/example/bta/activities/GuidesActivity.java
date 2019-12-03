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

        arrayList5.add(new Guides("Sailesh Deshemaru",R.drawable.dattatarya,"Dattatraya","Hi I'm Sailesh! I really love traveling and tourism industry. I have graduated in travel and tourism management and at the moment I organize tours, treks and other activities. I have experience of 3 years in this field.","9860688916"));
        arrayList5.add(new Guides("Roshan ",R.drawable.durbar_square_bhaktapur,"Skuldhoka","I am born and raised in Bhaktapur. We are working hard to rebuild our lives after the horrible earthquake. I work as a guide for about 6 years and I love meeting travellers from all over the world. I want to tell them everything I know about our city and culture, which I am very proud of. Hope to see you soon! ","9864238945"));
        arrayList5.add(new Guides("Anil",R.drawable.nyatapola,"Gundu","Namaste and Greetings from the land of Mt. Everest. I am a local certified guide from Kathmandu to make your holiday the most memorable and pleasant one. No lots of researches and investigation on internet. Simply book me.","9860695379"));

    }
}
