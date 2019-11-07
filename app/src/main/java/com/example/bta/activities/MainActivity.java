package com.example.bta.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.bta.R;
import com.example.bta.adapters.ImageAdapter;

public class MainActivity extends AppCompatActivity {

    CardView nyatapola,dattatraya,potterysquare;
    TextView findus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager mViewPager = findViewById(R.id.viewPage);
        ImageAdapter adapterView = new ImageAdapter(this);
        mViewPager.setAdapter(adapterView);

        nyatapola = findViewById(R.id.nyatapola);
        dattatraya = findViewById(R.id.dattatrya);
        potterysquare = findViewById(R.id.potterysquare);
        findus = findViewById(R.id.find_us);

        findus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FindusActivity.class);
                startActivity(intent);
            }
        });

        nyatapola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("KEY",1);
                startActivity(intent);
            }
        });

        dattatraya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("KEY",2);
                startActivity(intent);
            }
        });

        potterysquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("KEY",3);
                startActivity(intent);
            }
        });
    }
}
