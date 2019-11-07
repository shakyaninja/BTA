package com.example.bta.activities;

import android.os.Bundle;

import com.example.bta.fragments.DetailDattatrayaFragment;
import com.example.bta.fragments.DetailNyatapolaFragment;
import com.example.bta.fragments.DetailPotterysqFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.Toast;

import com.example.bta.R;

public class DetailsActivity extends AppCompatActivity {

    int key;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        Bundle bundle= getIntent().getExtras();
        key = bundle.getInt("KEY");

        switch (key){
            case 1:
                    DetailNyatapolaFragment fragmentOne = new DetailNyatapolaFragment();
                    transaction.replace(R.id.container, fragmentOne);
                    transaction.commit();
                Toast.makeText(this, "fragment 1", Toast.LENGTH_SHORT).show();
                    break;
            case 2:
                    DetailDattatrayaFragment fragmentTwo = new DetailDattatrayaFragment();
                    transaction.replace(R.id.container, fragmentTwo);
                    transaction.commit();
                Toast.makeText(this, "fragment 2", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                DetailPotterysqFragment fragmentThree = new DetailPotterysqFragment();
                transaction.replace(R.id.container,fragmentThree);
                transaction.commit();
                Toast.makeText(this, "fragment 3", Toast.LENGTH_SHORT).show();
                break;
        }

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
