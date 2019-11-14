package com.example.bta.activities;

import android.os.Bundle;

import com.example.bta.fragments.DetailDattatrayaFragment;
import com.example.bta.fragments.DetailNyatapolaFragment;
import com.example.bta.fragments.DetailPotterysqFragment;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.View;
import android.widget.Toast;

import com.example.bta.R;

public class DetailActivity extends AppCompatActivity {

    CollapsingToolbarLayout collapsingToolbarLayout;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        collapsingToolbarLayout = findViewById(R.id.toolbar_layout);
        toolbar = findViewById(R.id.toolbar);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        Bundle bundle= getIntent().getExtras();
        int key = bundle.getInt("KEY");

        switch (key){
            case 1:
                DetailNyatapolaFragment fragmentOne = new DetailNyatapolaFragment();
                transaction.replace(R.id.container, fragmentOne);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.nyatapola);
                toolbar.setTitle(R.string.nyatapola_title);
                Toast.makeText(this, "fragment 1", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                DetailDattatrayaFragment fragmentTwo = new DetailDattatrayaFragment();
                transaction.replace(R.id.container, fragmentTwo);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.dattatraya);
                toolbar.setTitle(R.string.dattatraya_title);
                Toast.makeText(this, "fragment 2", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                DetailPotterysqFragment fragmentThree = new DetailPotterysqFragment();
                transaction.replace(R.id.container,fragmentThree);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.potterysquare);
                toolbar.setTitle(R.string.pottery_title);
                Toast.makeText(this, "fragment 3", Toast.LENGTH_SHORT).show();
                break;
            case 10:
                DetailNyatapolaFragment fragmentTen = new DetailNyatapolaFragment();
                transaction.replace(R.id.container, fragmentTen);
                transaction.commit();
                Toast.makeText(this, "fragment 10", Toast.LENGTH_SHORT).show();
                break;
            case 20:
                DetailNyatapolaFragment fragmentTwenty = new DetailNyatapolaFragment();
                transaction.replace(R.id.container, fragmentTwenty);
                transaction.commit();
                Toast.makeText(this, "fragment 20", Toast.LENGTH_SHORT).show();
                break;
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayShowTitleEnabled(false);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });
    }
}
