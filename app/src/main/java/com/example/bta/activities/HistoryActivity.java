package com.example.bta.activities;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.bta.R;
import com.example.bta.fragments.HistoryPlaceFragment;

public class HistoryActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    Bundle bundle= getIntent().getExtras();
    final int key = bundle.getInt("Key_location");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        frameLayout = findViewById(R.id.historyframe);

        HistoryPlaceFragment historyPlaceFragment = new HistoryPlaceFragment();
        transaction.replace(R.id.historyframe, historyPlaceFragment);
        transaction.commit();
        switch(key){
            case 1:
                Toast.makeText(this, "This is wiki/nyatapola", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "This os wiki/Dattatraya", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
