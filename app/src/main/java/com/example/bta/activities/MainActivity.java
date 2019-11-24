package com.example.bta.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bta.R;
import com.example.bta.adapters.AdapterJatras;
import com.example.bta.adapters.AdapterSquares;
import com.example.bta.adapters.AdapterWorld;
import com.example.bta.adapters.ImageAdapter;
import com.example.bta.modals.ImageTitleSquares;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    CardView nyatapola,dattatraya,potterysquare;
    TextView findus;
    private RecyclerView recyclerView;
    private FloatingActionButton fab_main, fab1_mail, fab2_share;
    private Animation fab_open, fab_close, fab_clock, fab_anticlock;
    TextView textview_mail, textview_share;

    Boolean isOpen = false;
    RecyclerView.LayoutManager layoutManager;

    private RecyclerView recyclerViewWHS;
    RecyclerView.LayoutManager layoutManagerWHS;

    private RecyclerView recyclerViewJatra;
    RecyclerView.LayoutManager layoutManagerJatra;

    AdapterSquares adapterSquares;
    AdapterWorld adapterWorld;
    AdapterJatras adapterJatras;

    ArrayList<ImageTitleSquares> arrayList;
    ArrayList<ImageTitleSquares> arrayList2;
    ArrayList<ImageTitleSquares> arrayList3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //for floating action  button
        fab_main = findViewById(R.id.fab);
        fab1_mail = findViewById(R.id.fab1);
        fab2_share = findViewById(R.id.fab2);
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close);
        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fab_clock = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_rotate_clock);
        fab_anticlock = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_rotate_anticlock);

        textview_mail = (TextView) findViewById(R.id.textview_mail);
        textview_share = (TextView) findViewById(R.id.textview_share);

        fab_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isOpen) {

                    textview_mail.setVisibility(View.INVISIBLE);
                    textview_share.setVisibility(View.INVISIBLE);
                    fab2_share.startAnimation(fab_close);
                    fab1_mail.startAnimation(fab_close);
                    fab_main.startAnimation(fab_anticlock);
                    fab2_share.setClickable(false);
                    fab1_mail.setClickable(false);
                    isOpen = false;
                } else {
                    textview_mail.setVisibility(View.VISIBLE);
                    textview_share.setVisibility(View.VISIBLE);
                    fab2_share.startAnimation(fab_open);
                    fab1_mail.startAnimation(fab_open);
                    fab_main.startAnimation(fab_clock);
                    fab2_share.setClickable(true);
                    fab1_mail.setClickable(true);
                    isOpen = true;
                }

            }
        });


        fab2_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Share", Toast.LENGTH_SHORT).show();

            }
        });

        fab1_mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Email", Toast.LENGTH_SHORT).show();

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

//        nyatapola = findViewById(R.id.nyatapola);
//        dattatraya = findViewById(R.id.dattatrya);
//        potterysquare = findViewById(R.id.potterysquare);
        findus = findViewById(R.id.find_us);

        findus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FindusActivity.class);
                startActivity(intent);
            }
        });
//
//        nyatapola.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
//                intent.putExtra("KEY",1);
//                startActivity(intent);
//            }
//        });
//
//        dattatraya.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
//                intent.putExtra("KEY",2);
//                startActivity(intent);
//            }
//        });
//
//        potterysquare.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
//                intent.putExtra("KEY",3);
//                startActivity(intent);
//            }
//        });
    }


    //world heritage sites

    private void linearWHS() {
        arrayList2 = new ArrayList<>();

        arrayList2.add(new ImageTitleSquares("Durbar Squares",R.drawable.durbar_square_bhaktapur));
        arrayList2.add(new ImageTitleSquares("Changunarayan",R.drawable.changunarayan));
    }

    //jatras lists
    private void linearJatra() {
        arrayList3 = new ArrayList<>();

        arrayList3.add(new ImageTitleSquares("Ghintangisi",R.drawable.gaijatra));
        arrayList3.add(new ImageTitleSquares("Tahamacha",R.drawable.tahamacha));
        arrayList3.add(new ImageTitleSquares("Yomari punhi",R.drawable.yomaripunhi));
        arrayList3.add(new ImageTitleSquares("Gathamuga chare",R.drawable.ghantagarna));
        arrayList3.add(new ImageTitleSquares("Biska Jatra",R.drawable.bisket));
        arrayList3.add(new ImageTitleSquares("Pulu Kisi",R.drawable.pulu_kisi));
    }

//popular squares
    private void linearSquaresList() {
        arrayList = new ArrayList<>();

        arrayList.add(new ImageTitleSquares("Nyatapola",R.drawable.nyatapola));
        arrayList.add(new ImageTitleSquares("Dattatraya",R.drawable.dattatraya));
        arrayList.add(new ImageTitleSquares("Pottery Square",R.drawable.potterysquare));
        arrayList.add(new ImageTitleSquares("Durbar Square",R.drawable.durbar_square_bhaktapur));

    }
}
