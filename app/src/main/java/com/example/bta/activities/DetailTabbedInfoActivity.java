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
                adapter.addFragment(new FamousHereFragment("The broad-fronted, triple-roofed Bhairabnath Temple is dedicated to Bhairab, the fearsome incarnation of Shiva, whose consort occupies the Nyatapola Temple across the square.",R.drawable.bhairav), "Bhairavnath");
                adapter.addFragment(new MapFragment("It was built in only 17 months from the time it started.\n" +
                        "\tIt was built in a time when the Taj Mahal was under construction.\n" +
                        "\tIt is the tallest pagodas in the country and stands 30m high.\n" +
                        "\tThis is the only temple that is named after the dimension of architecture rather than from the deity residing inside.",R.drawable.detailnyatapola), "Sky View");
                adapter.addFragment(new DetailedFragment("The broad-fronted, triple-roofed Bhairabnath Temple is dedicated to Bhairab, the fearsome incarnation of Shiva, whose consort occupies the Nyatapola Temple across the square.",R.drawable.bhairav2), "God Bhairav");
                break;
//            case 2:
//                titletext.setText(getText(R.string.dattatraya_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
//            case 3:
//                titletext.setText(getText(R.string.pottery_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("Khutruke are sukayo",R.drawable.potterysquare), "Khutruke");
////                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                 break;
            case 4:
            case 10:
//                titletext.setText(getText(R.string.durbar_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
                titletext.setText(getText(R.string.durbar_title));
                adapter.addFragment(new FamousHereFragment("Golden Gate",R.drawable.durbarsq1), "Golder Gate");
                adapter.addFragment(new MapFragment("Reconstructed Bastola Temple",R.drawable.durbarsq3), "Bustola Temple");
                adapter.addFragment(new DetailedFragment("55 Window Palace",R.drawable.durbarsq2), "55 Window Palace");
                break;
            case 11:
            case 22:
                titletext.setText(getText(R.string.changu_title));
                adapter.addFragment(new FamousHereFragment("Changu Narayan the oldest temple in the Nepal built in Lichhavi period.Listed in World Heritage site.",R.drawable.changu1), "Changu Fact");
                adapter.addFragment(new MapFragment("Here is a musium Changu Musium which has the excellent collection of ancient coins, tools, arts, and architectures. ",R.drawable.changu_mueseum), "Mueseum");
                adapter.addFragment(new DetailedFragment("Chanda Narayan (Garuda Narayan):- a 7th century stone sculpture of Vishnu riding on Garuda.Sridhar Vishnu:- 9th century stone sculpture of Vishnu, Laxmi, and Garuda which stands on the pedestals of various motifs.",R.drawable.changu2), "Detail Info");
                break;
//            case 12:
//                titletext.setText(getText(R.string.ghintangisi_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
//            case 13:
//                titletext.setText(getText(R.string.tahamacha_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
//            case 14:
//                titletext.setText(getText(R.string.yomaripunhi_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
            case 16:
                titletext.setText("Biska Jatra");
                adapter.addFragment(new FamousHereFragment("Folks from various parts of Madhyapur Thimi gather, carrying their own chariots in Layeku Thimi.",R.drawable.biska1jatra), "Sindur Jatra");
                adapter.addFragment(new MapFragment("An approximately 25 meter Yoh si Dyo is erected in the yosi khyo in new year eve aand is pulled down in its own way in evening of new year.",R.drawable.biska2jatra), "Lyo Si Dyo");
                adapter.addFragment(new DetailedFragment("Is stoodup at Morning of new year eve. After it is stood up different rituals and pujas are done.It is kept standing for five days. It is stood up at pottery square.",R.drawable.biska3jatra), "Lha Maru Lyo Si Dyo");
                break;
            case 17:
                titletext.setText(getText(R.string.pulukisi_title));
                adapter.addFragment(new FamousHereFragment("Folks from various parts of Madhyapur Thimi gather, carrying their own chariots in Layeku Thimi.",R.drawable.biska1jatra), "Sindur Jatra");
                adapter.addFragment(new MapFragment("An approximately 25 meter Yoh si Dyo is erected in the yosi khyo in new year eve aand is pulled down in its own way in evening of new year.",R.drawable.biska2jatra), "Lyo Si Dyo");
                adapter.addFragment(new DetailedFragment("Is stoodup at Morning of new year eve. After it is stood up different rituals and pujas are done.It is kept standing for five days. It is stood up at pottery square.",R.drawable.biska3jatra), "Lha Maru Lyo Si Dyo");
                break;
            default:
                titletext.setText(getText(R.string.service_text));
                adapter.addFragment(new FamousHereFragment("Folks from various parts of Madhyapur Thimi gather, carrying their own chariots in Layeku Thimi.",R.drawable.biska1jatra), "Sindur Jatra");
                adapter.addFragment(new MapFragment("An approximately 25 meter Yoh si Dyo is erected in the yosi khyo in new year eve aand is pulled down in its own way in evening of new year.",R.drawable.biska2jatra), "Lyo Si Dyo");
                adapter.addFragment(new DetailedFragment("Is stoodup at Morning of new year eve. After it is stood up different rituals and pujas are done.It is kept standing for five days. It is stood up at pottery square.",R.drawable.biska3jatra), "Lha Maru Lyo Si Dyo");
                break;
        }
        viewPager.setAdapter(adapter);
    }
}