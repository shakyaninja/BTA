package com.example.bta.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.bta.R;
import com.example.bta.adapters.AdapterFoods;
import com.example.bta.adapters.AdapterJatras;
import com.example.bta.adapters.AdapterNatural;
import com.example.bta.adapters.AdapterSquares;
import com.example.bta.adapters.AdapterWorld;
import com.example.bta.adapters.ImageAdapter;
import com.example.bta.modals.ImageTitle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    private RecyclerView recyclerView;
    private FloatingActionButton fab_main;
    private CardView fab1_location, fab2_currency,fab3_services;
    private Animation fab_open, fab_close, fab_clock, fab_anticlock;

    Boolean isOpen = false;
    RecyclerView.LayoutManager layoutManager;

    private RecyclerView recyclerViewWHS;
    RecyclerView.LayoutManager layoutManagerWHS;

    private RecyclerView recyclerViewJatra;
    RecyclerView.LayoutManager layoutManagerJatra;

    private RecyclerView recyclerViewNatural;
    RecyclerView.LayoutManager layoutManagerNatural;

    private RecyclerView recyclerViewFood;
    RecyclerView.LayoutManager layoutManagerFood;

    AdapterSquares adapterSquares;
    AdapterWorld adapterWorld;
    AdapterJatras adapterJatras;
    AdapterNatural adapterNatural;
    AdapterFoods adapterFoods;

    ArrayList<ImageTitle> arrayList;
    ArrayList<ImageTitle> arrayList2;
    ArrayList<ImageTitle> arrayList3;
    ArrayList<ImageTitle> arrayList4;
    ArrayList<ImageTitle> arrayList5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab_main = findViewById(R.id.fab);
        fab1_location = findViewById(R.id.fab1);
        fab2_currency = findViewById(R.id.fab2);
        fab3_services = findViewById(R.id.fab3);
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close);
        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fab_clock = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_rotate_clock);
        fab_anticlock = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_rotate_anticlock);

        fab_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOpen) {
                    fab3_services.startAnimation(fab_close);
                    fab2_currency.startAnimation(fab_close);
                    fab1_location.startAnimation(fab_close);
                    fab_main.startAnimation(fab_anticlock);
                    fab3_services.setClickable(false);
                    fab2_currency.setClickable(false);
                    fab1_location.setClickable(false);
                    isOpen = false;
                } else {
                    fab3_services.startAnimation(fab_open);
                    fab2_currency.startAnimation(fab_open);
                    fab1_location.startAnimation(fab_open);
                    fab_main.startAnimation(fab_clock);
                    fab3_services.setClickable(true);
                    fab2_currency.setClickable(true);
                    fab1_location.setClickable(true);
                    isOpen = true;
                }
            }
        });
        fab2_currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ViewWeb.class);
                intent.putExtra("key",1005);
                startActivity(intent);
            }
        });

        fab1_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FindusActivity.class);
                intent.putExtra("KEY",239842978);
                startActivity(intent);
            }
        });
        fab3_services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ServicesActivity.class);
                startActivity(intent);
            }
        });

        //for the top horizontal scrolling images
        ViewPager mViewPager = findViewById(R.id.viewPage);
        ImageAdapter adapterView = new ImageAdapter(this);
        mViewPager.setAdapter(adapterView);

        //declaration of lists
        linearSquaresList();
        linearWHS();
        linearJatra();
        linearNatural();
        linearFoods();


        recyclerView = findViewById(R.id.recycler);

        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        adapterSquares = new AdapterSquares(this, arrayList);
        recyclerView.setAdapter(adapterSquares);

        recyclerViewWHS = findViewById(R.id.recyclerWHS);

        layoutManagerWHS = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewWHS.setLayoutManager(layoutManagerWHS);
        adapterWorld = new AdapterWorld(this, arrayList2);
        recyclerViewWHS.setAdapter(adapterWorld);

        recyclerViewJatra = findViewById(R.id.recyclerJatra);

        layoutManagerJatra = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewJatra.setLayoutManager(layoutManagerJatra);
        adapterJatras = new AdapterJatras(this, arrayList3);
        recyclerViewJatra.setAdapter(adapterJatras);

        recyclerViewNatural = findViewById(R.id.recyclerNatural);

        layoutManagerNatural = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewNatural.setLayoutManager(layoutManagerNatural);
        adapterNatural = new AdapterNatural(this, arrayList4);
        recyclerViewNatural.setAdapter(adapterNatural);

        recyclerViewFood = findViewById(R.id.recyclerFood);

        layoutManagerFood = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewFood.setLayoutManager(layoutManagerFood);
        adapterFoods = new AdapterFoods(this, arrayList5);
        recyclerViewFood.setAdapter(adapterFoods);
    }
    private void linearWHS() {
        arrayList2 = new ArrayList<>();

        arrayList2.add(new ImageTitle("Durbar Square",R.drawable.durbar_square_bhaktapur));
        arrayList2.add(new ImageTitle("Changunarayan",R.drawable.changunarayan));
    }
    private void linearJatra() {
        arrayList3 = new ArrayList<>();
        arrayList3.add(new ImageTitle("Ghintangisi",R.drawable.gaijatra));
        arrayList3.add(new ImageTitle("Tahamacha",R.drawable.tahamacha));
        arrayList3.add(new ImageTitle("Yomari punhi",R.drawable.yomaripunhi));
        arrayList3.add(new ImageTitle("Gathamuga chare",R.drawable.ghantagarna));
        arrayList3.add(new ImageTitle("Biska Jatra",R.drawable.bisket));
        arrayList3.add(new ImageTitle("Pulu Kisi",R.drawable.pulu_kisi));
    }
    private void linearSquaresList() {
        arrayList = new ArrayList<>();
        arrayList.add(new ImageTitle("Taumadhi Square",R.drawable.nyatapola));
        arrayList.add(new ImageTitle("Dattatraya Square",R.drawable.dattatraya));
        arrayList.add(new ImageTitle("Pottery Square",R.drawable.potterysquare));
        arrayList.add(new ImageTitle("Durbar Square",R.drawable.durbar_square_bhaktapur));
    }
    private void linearNatural() {
        arrayList4 = new ArrayList<>();
        arrayList4.add(new ImageTitle("Nagarkot",R.drawable.nagarkot));
        arrayList4.add(new ImageTitle("Pilot Baba",R.drawable.pilot_baba));
        arrayList4.add(new ImageTitle("Ranikot Dada",R.drawable.ranikot));
        arrayList4.add(new ImageTitle("Maha Manjushree",R.drawable.mahamanjushree));
        arrayList4.add(new ImageTitle("Changu",R.drawable.changu));
        arrayList4.add(new ImageTitle("Ghyampe Dada",R.drawable.ghyampedada));
        arrayList4.add(new ImageTitle("MuhanPokhari",R.drawable.muhanpokhari));
    }
    private void linearFoods() {
        arrayList5 = new ArrayList<>();
        arrayList5.add(new ImageTitle("Juju Dhau",R.drawable.juju_dhau));
        arrayList5.add(new ImageTitle("Yomari",R.drawable.yomaris));
        arrayList5.add(new ImageTitle("Newari Samebaji",R.drawable.newari_khaja_set));
        arrayList5.add(new ImageTitle("Swoo Puka",R.drawable.swoo_puka));
        arrayList5.add(new ImageTitle("Choyela",R.drawable.choila));
        arrayList5.add(new ImageTitle("Kachila",R.drawable.kachila));
        arrayList5.add(new ImageTitle("Nyakhwa",R.drawable.sanyakhuna));
        arrayList5.add(new ImageTitle("Takhaa",R.drawable.takhwa));
        arrayList5.add(new ImageTitle("Bara wo",R.drawable.bara));
        arrayList5.add(new ImageTitle("Chatamari",R.drawable.chatamari));
    }
}
