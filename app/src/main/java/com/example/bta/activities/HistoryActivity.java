package com.example.bta.activities;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.bta.R;
import com.example.bta.fragments.HistoryPlaceFragment;

public class HistoryActivity extends AppCompatActivity {

    FrameLayout frameLayout;
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
    }
}
