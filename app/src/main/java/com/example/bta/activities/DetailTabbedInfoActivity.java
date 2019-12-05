package com.example.bta.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.bta.R;
import com.example.bta.activities.ui.main.SectionsPagerAdapter;
import com.example.bta.adapters.SectionsPageAdapter;
import com.example.bta.fragments.DetailedFragment;
import com.example.bta.fragments.FamousHereFragment;
import com.example.bta.fragments.MapFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class DetailTabbedInfoActivity extends AppCompatActivity {
TextView titletext;
AppBarLayout appBarLayout;
ViewPager viewPager;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tabbed_info);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        viewPager = findViewById(R.id.view_pager);
        titletext = findViewById(R.id.title_detail);
        appBarLayout= findViewById(R.id.app_bar);
        Bundle bundle= getIntent().getExtras();
        final int new_key = bundle.getInt("newKey");
        setupViewPager(viewPager,new_key);
    }
    public void setupViewPager(ViewPager viewPager,int key) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        switch(key){
            case 1:
                titletext.setText(getText(R.string.nyatapola_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 2:
                titletext.setText(getText(R.string.dattatraya_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 3:
                titletext.setText(getText(R.string.pottery_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                 break;
            case 4:
            case 10:
                titletext.setText(getText(R.string.durbar_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 11:
            case 22:
                titletext.setText(getText(R.string.changu_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 12:
                titletext.setText(getText(R.string.ghintangisi_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 13:
                titletext.setText(getText(R.string.tahamacha_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 14:
                titletext.setText(getText(R.string.yomaripunhi_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 15:
                titletext.setText(getText(R.string.gathamuga_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 16:
                titletext.setText(getText(R.string.biskajatra_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 17:
                titletext.setText(getText(R.string.pulukisi_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 18:
                titletext.setText(getText(R.string.nagarkot_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 19:
                titletext.setText(getText(R.string.pilotbaba_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 20:
                titletext.setText(getText(R.string.ranikot_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 21:
                titletext.setText(getText(R.string.manjushree_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 23:
                titletext.setText(getText(R.string.ghyampe_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 24:
                titletext.setText(getText(R.string.muhan_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 40:
                titletext.setText(getText(R.string.dhau_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 41:
                titletext.setText(getText(R.string.yomari_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 42:
                titletext.setText(getText(R.string.samebaji_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 43:
                titletext.setText(getText(R.string.swo_puka_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 44:
                titletext.setText(getText(R.string.choila_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 45:
                titletext.setText(getText(R.string.kachila_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 46:
                titletext.setText(getText(R.string.nyakhwa_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 47:
                titletext.setText(getText(R.string.takha_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 48:
                titletext.setText(getText(R.string.bara_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            case 49:
                titletext.setText(getText(R.string.chatamari_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
            default:
                titletext.setText(getText(R.string.service_text));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
                break;
        }
        viewPager.setAdapter(adapter);
    }
}