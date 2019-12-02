package com.example.bta.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.bta.R;
import com.example.bta.fragments.DetailBisketFragment;
import com.example.bta.fragments.DetailChangunarayanFragment;
import com.example.bta.fragments.DetailDattatrayaFragment;
import com.example.bta.fragments.DetailDurbarSquareFragment;
import com.example.bta.fragments.DetailGathamugaFragment;
import com.example.bta.fragments.DetailGhintangisiFragment;
import com.example.bta.fragments.DetailGhyampeFragment;
import com.example.bta.fragments.DetailManjushreeFragment;
import com.example.bta.fragments.DetailMuhanFragment;
import com.example.bta.fragments.DetailNagarkotFragment;
import com.example.bta.fragments.DetailNyatapolaFragment;
import com.example.bta.fragments.DetailPilotbabaFragment;
import com.example.bta.fragments.DetailPotterysqFragment;
import com.example.bta.fragments.DetailPulukisiFragment;
import com.example.bta.fragments.DetailRanikotFragment;
import com.example.bta.fragments.DetailTahamachaFragment;
import com.example.bta.fragments.DetailYomariFragment;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

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
            case 4:
            case 10:
                DetailDurbarSquareFragment fragmentTen = new DetailDurbarSquareFragment();
                transaction.replace(R.id.container, fragmentTen);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.durbar_square_bhaktapur);
                toolbar.setTitle(R.string.durbar_title);
                Toast.makeText(this, "fragment 10", Toast.LENGTH_SHORT).show();
                break;
            case 11:
            case 22:
                DetailChangunarayanFragment fragment11 = new DetailChangunarayanFragment();
                transaction.replace(R.id.container, fragment11);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.changunarayan);
                toolbar.setTitle(R.string.changu_title);
                Toast.makeText(this, "fragment 11", Toast.LENGTH_SHORT).show();
                break;

            case 12:
                DetailGhintangisiFragment fragment12 = new DetailGhintangisiFragment();
                transaction.replace(R.id.container, fragment12);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.gaijatra);
                toolbar.setTitle(R.string.ghintangisi_title);
                Toast.makeText(this, "fragment 12", Toast.LENGTH_SHORT).show();
                break;
            case 13:
                DetailTahamachaFragment fragment13 = new DetailTahamachaFragment();
                transaction.replace(R.id.container, fragment13);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.tahamacha);
                toolbar.setTitle(R.string.tahamacha_title);
                Toast.makeText(this, "fragment 13", Toast.LENGTH_SHORT).show();
                break;
            case 14:
                DetailYomariFragment fragment14 = new DetailYomariFragment();
                transaction.replace(R.id.container, fragment14);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.yomaripunhi);
                toolbar.setTitle(R.string.yomaripunhi_title);
                Toast.makeText(this, "fragment 14", Toast.LENGTH_SHORT).show();
                break;
            case 15:
                DetailGathamugaFragment fragment15 = new DetailGathamugaFragment();
                transaction.replace(R.id.container, fragment15);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.ghantagarna);
                toolbar.setTitle(R.string.gathamuga_title);
                Toast.makeText(this, "fragment 15", Toast.LENGTH_SHORT).show();
                break;
            case 16:
                DetailBisketFragment fragment16 = new DetailBisketFragment();
                transaction.replace(R.id.container, fragment16);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.bisketjatra);
                toolbar.setTitle(R.string.biskajatra_title);
                Toast.makeText(this, "fragment 16", Toast.LENGTH_SHORT).show();
                break;
            case 17:
                DetailPulukisiFragment fragment17 = new DetailPulukisiFragment();
                transaction.replace(R.id.container, fragment17);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.pulu_kisi);
                toolbar.setTitle(R.string.pulukisi_title);
                Toast.makeText(this, "fragment 17", Toast.LENGTH_SHORT).show();
                break;
            case 18:
                DetailNagarkotFragment fragment18 = new DetailNagarkotFragment();
                transaction.replace(R.id.container, fragment18);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.nagarkot);
                toolbar.setTitle(R.string.nagarkot_title);
                Toast.makeText(this, "fragment 18", Toast.LENGTH_SHORT).show();
                break;
            case 19:
                DetailPilotbabaFragment fragment19 = new DetailPilotbabaFragment();
                transaction.replace(R.id.container, fragment19);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.pilot_baba);
                toolbar.setTitle(R.string.pilotbaba_title);
                Toast.makeText(this, "fragment 19", Toast.LENGTH_SHORT).show();
                break;
            case 20:
                DetailRanikotFragment fragment20 = new DetailRanikotFragment();
                transaction.replace(R.id.container, fragment20);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.ranikot);
                toolbar.setTitle(R.string.ranikot_title);
                Toast.makeText(this, "fragment 17", Toast.LENGTH_SHORT).show();
                break;
            case 21:
                DetailManjushreeFragment fragment21 = new DetailManjushreeFragment();
                transaction.replace(R.id.container, fragment21);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.mahamanjushree);
                toolbar.setTitle(R.string.manjushree_title);
                Toast.makeText(this, "fragment 17", Toast.LENGTH_SHORT).show();
                break;
            case 23:
                DetailGhyampeFragment fragment23 = new DetailGhyampeFragment();
                transaction.replace(R.id.container, fragment23);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.ghyampedada);
                toolbar.setTitle(R.string.ghyampe_title);
                Toast.makeText(this, "fragment 23", Toast.LENGTH_SHORT).show();
                break;
            case 24:
                DetailMuhanFragment fragment24 = new DetailMuhanFragment();
                transaction.replace(R.id.container, fragment24);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.muhan);
                toolbar.setTitle(R.string.muhan_title);
                Toast.makeText(this, "fragment 24", Toast.LENGTH_SHORT).show();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + key);
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
