package com.example.bta.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.bta.R;
import com.example.bta.fragments.DetailBaraFragment;
import com.example.bta.fragments.DetailBisketFragment;
import com.example.bta.fragments.DetailChangunarayanFragment;
import com.example.bta.fragments.DetailChatamariFragment;
import com.example.bta.fragments.DetailChoyelaFragment;
import com.example.bta.fragments.DetailDattatrayaFragment;
import com.example.bta.fragments.DetailDhauFragment;
import com.example.bta.fragments.DetailDurbarSquareFragment;
import com.example.bta.fragments.DetailGathamugaFragment;
import com.example.bta.fragments.DetailGhintangisiFragment;
import com.example.bta.fragments.DetailGhyampeFragment;
import com.example.bta.fragments.DetailKachilaFragment;
import com.example.bta.fragments.DetailManjushreeFragment;
import com.example.bta.fragments.DetailMuhanFragment;
import com.example.bta.fragments.DetailNagarkotFragment;
import com.example.bta.fragments.DetailNyakhwaFragment;
import com.example.bta.fragments.DetailNyatapolaFragment;
import com.example.bta.fragments.DetailPilotbabaFragment;
import com.example.bta.fragments.DetailPotterysqFragment;
import com.example.bta.fragments.DetailPulukisiFragment;
import com.example.bta.fragments.DetailRanikotFragment;
import com.example.bta.fragments.DetailSamebajiFragment;
import com.example.bta.fragments.DetailSwopukaFragment;
import com.example.bta.fragments.DetailTahamachaFragment;
import com.example.bta.fragments.DetailTakhaaFragment;
import com.example.bta.fragments.DetailYomariFragment;
import com.example.bta.fragments.DetailYomarisFragment;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Arrays;


public class DetailActivity extends AppCompatActivity {

    CollapsingToolbarLayout collapsingToolbarLayout;

    Toolbar toolbar;
    TextView link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        collapsingToolbarLayout = findViewById(R.id.toolbar_layout);
        toolbar = findViewById(R.id.toolbar);
        link = findViewById(R.id.linkwiki);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        Bundle bundle= getIntent().getExtras();
        final int key = bundle.getInt("KEY");

        switch (key){
            case 1:
                DetailNyatapolaFragment fragmentOne = new DetailNyatapolaFragment();
                transaction.replace(R.id.container, fragmentOne);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.nyatapola);
                toolbar.setTitle(R.string.nyatapola_title);
                break;
            case 2:
                DetailDattatrayaFragment fragmentTwo = new DetailDattatrayaFragment();
                transaction.replace(R.id.container, fragmentTwo);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.dattatraya);
                toolbar.setTitle(R.string.dattatraya_title);
                break;
            case 3:
                DetailPotterysqFragment fragmentThree = new DetailPotterysqFragment();
                transaction.replace(R.id.container,fragmentThree);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.potterysquare);
                toolbar.setTitle(R.string.pottery_title);
                break;
            case 4:
            case 10:
                DetailDurbarSquareFragment fragmentTen = new DetailDurbarSquareFragment();
                transaction.replace(R.id.container, fragmentTen);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.durbar_square_bhaktapur);
                toolbar.setTitle(R.string.durbar_title);
                break;
            case 11:
            case 22:
                DetailChangunarayanFragment fragment11 = new DetailChangunarayanFragment();
                transaction.replace(R.id.container, fragment11);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.changunarayan);
                toolbar.setTitle(R.string.changu_title);
                break;
            case 12:
                fab.setVisibility(View.INVISIBLE);
                DetailGhintangisiFragment fragment12 = new DetailGhintangisiFragment();
                transaction.replace(R.id.container, fragment12);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.gaijatra);
                toolbar.setTitle(R.string.ghintangisi_title);
                break;
            case 13:
                fab.setVisibility(View.INVISIBLE);
                DetailTahamachaFragment fragment13 = new DetailTahamachaFragment();
                transaction.replace(R.id.container, fragment13);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.tahamacha);
                toolbar.setTitle(R.string.tahamacha_title);
                break;
            case 14:
                fab.setVisibility(View.INVISIBLE);
                DetailYomariFragment fragment14 = new DetailYomariFragment();
                transaction.replace(R.id.container, fragment14);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.yomaripunhi);
                toolbar.setTitle(R.string.yomaripunhi_title);
                break;
            case 15:
                fab.setVisibility(View.INVISIBLE);
                DetailGathamugaFragment fragment15 = new DetailGathamugaFragment();
                transaction.replace(R.id.container, fragment15);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.ghantagarna);
                toolbar.setTitle(R.string.gathamuga_title);
                break;
            case 16:
                fab.setVisibility(View.INVISIBLE);
                DetailBisketFragment fragment16 = new DetailBisketFragment();
                transaction.replace(R.id.container, fragment16);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.bisketjatra);
                toolbar.setTitle(R.string.biskajatra_title);
                break;
            case 17:
                fab.setVisibility(View.INVISIBLE);
                DetailPulukisiFragment fragment17 = new DetailPulukisiFragment();
                transaction.replace(R.id.container, fragment17);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.pulu_kisi);
                toolbar.setTitle(R.string.pulukisi_title);
                break;
            case 18:
                link.setVisibility(View.INVISIBLE);
                DetailNagarkotFragment fragment18 = new DetailNagarkotFragment();
                transaction.replace(R.id.container, fragment18);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.nagarkot);
                toolbar.setTitle(R.string.nagarkot_title);
                break;
            case 19:
                link.setVisibility(View.INVISIBLE);
                DetailPilotbabaFragment fragment19 = new DetailPilotbabaFragment();
                transaction.replace(R.id.container, fragment19);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.pilotbaba1);
                toolbar.setTitle(R.string.pilotbaba_title);
                break;
            case 20:
                link.setVisibility(View.INVISIBLE);
                DetailRanikotFragment fragment20 = new DetailRanikotFragment();
                transaction.replace(R.id.container, fragment20);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.ranikot);
                toolbar.setTitle(R.string.ranikot_title);
                break;
            case 21:
                link.setVisibility(View.INVISIBLE);
                DetailManjushreeFragment fragment21 = new DetailManjushreeFragment();
                transaction.replace(R.id.container, fragment21);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.mahamanjushree);
                toolbar.setTitle(R.string.manjushree_title);
                break;
            case 23:
                fab.setVisibility(View.INVISIBLE);
                link.setVisibility(View.INVISIBLE);
                DetailGhyampeFragment fragment23 = new DetailGhyampeFragment();
                transaction.replace(R.id.container, fragment23);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.ghyampedada);
                toolbar.setTitle(R.string.ghyampe_title);
                break;
            case 24:
                link.setVisibility(View.INVISIBLE);
                DetailMuhanFragment fragment24 = new DetailMuhanFragment();
                transaction.replace(R.id.container, fragment24);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.muhan);
                toolbar.setTitle(R.string.muhan_title);
                break;
            case 40:
                link.setVisibility(View.INVISIBLE);
                fab.setVisibility(View.INVISIBLE);
                DetailDhauFragment fragment40 = new DetailDhauFragment();
                transaction.replace(R.id.container, fragment40);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.juju_dhau);
                toolbar.setTitle(R.string.dhau_title);
                break;
            case 41:
                fab.setVisibility(View.INVISIBLE);
                link.setVisibility(View.INVISIBLE);
                DetailYomarisFragment fragment41 = new DetailYomarisFragment();
                transaction.replace(R.id.container, fragment41);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.yomaris);
                toolbar.setTitle(R.string.yomari_title);
                break;
            case 42:
                fab.setVisibility(View.INVISIBLE);
                link.setVisibility(View.INVISIBLE);
                DetailSamebajiFragment fragment42 = new DetailSamebajiFragment();
                transaction.replace(R.id.container, fragment42);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.newari_khaja_set);
                toolbar.setTitle(R.string.samebaji_title);
                break;
            case 43:
                fab.setVisibility(View.INVISIBLE);
                link.setVisibility(View.INVISIBLE);
                DetailSwopukaFragment fragment43 = new DetailSwopukaFragment();
                transaction.replace(R.id.container, fragment43);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.swoo_puka);
                toolbar.setTitle(R.string.swo_puka_title);
                break;
            case 44:
                fab.setVisibility(View.INVISIBLE);
                link.setVisibility(View.INVISIBLE);
                DetailChoyelaFragment fragment44 = new DetailChoyelaFragment();
                transaction.replace(R.id.container, fragment44);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.choila);
                toolbar.setTitle(R.string.choila_title);
                break;
            case 45:
                fab.setVisibility(View.INVISIBLE);
                link.setVisibility(View.INVISIBLE);
                DetailKachilaFragment fragment45 = new DetailKachilaFragment();
                transaction.replace(R.id.container, fragment45);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.kachila);
                toolbar.setTitle(R.string.kachila_title);
                break;
            case 46:
                fab.setVisibility(View.INVISIBLE);
                link.setVisibility(View.INVISIBLE);
                DetailNyakhwaFragment fragment46 = new DetailNyakhwaFragment();
                transaction.replace(R.id.container, fragment46);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.sanyakhuna);
                toolbar.setTitle(R.string.nyakhwa_title);
                break;
            case 47:
                fab.setVisibility(View.INVISIBLE);
                link.setVisibility(View.INVISIBLE);
                DetailTakhaaFragment fragment47 = new DetailTakhaaFragment();
                transaction.replace(R.id.container, fragment47);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.takhwa);
                toolbar.setTitle(R.string.takha_title);
                break;
            case 48:
                fab.setVisibility(View.INVISIBLE);
                link.setVisibility(View.INVISIBLE);
                DetailBaraFragment fragment48 = new DetailBaraFragment();
                transaction.replace(R.id.container, fragment48);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.bara);
                toolbar.setTitle(R.string.bara_title);
                break;
            case 49:
                fab.setVisibility(View.INVISIBLE);
                link.setVisibility(View.INVISIBLE);
                DetailChatamariFragment fragment49 = new DetailChatamariFragment();
                transaction.replace(R.id.container, fragment49);
                transaction.commit();
                collapsingToolbarLayout.setBackgroundResource(R.drawable.chatamari);
                toolbar.setTitle(R.string.chatamari_title);
                break;
            default:
                Toast.makeText(this, "Invalid Choice", Toast.LENGTH_SHORT).show();
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        link = findViewById(R.id.linkwiki);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity.this, ViewWeb.class);
                intent.putExtra("key",key);
                startActivity(intent);
            }
        });

    collapsingToolbarLayout.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(DetailActivity.this, GalleryActivity.class);
            intent.putExtra("photo",key);
            startActivity(intent);
        }
    });
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer []arr = {18,19,20,21,22,24,1,2,3,4,10,11,22};
                if(check(arr,key)){
                    Intent intent = new Intent(DetailActivity.this,ViewWeb.class);
                    intent.putExtra("key",key);
                    startActivity(intent);

                }
                else{
                    Intent intent = new Intent(DetailActivity.this,FindusActivity.class);
                    intent.putExtra("KEY",key);
                    startActivity(intent);

                }

            }
        });
    }
    private static boolean check(Integer[] arr, int toCheckValue)
    {
        boolean test
                = Arrays.asList(arr)
                .contains(toCheckValue);
        return test;
    }
}
