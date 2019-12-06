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
            case 2:
                titletext.setText(getText(R.string.dattatraya_title));
                adapter.addFragment(new FamousHereFragment("At the east end of Tachupal Tole, the eye-catching Dattatreya Temple was originally built in 1427, supposedly using the timber only from two trees. \n" +
                        "The temple is dedicated to Dattatreya, a curious hybrid deity, blending elements of Brahma, Vishnu and Shiva. Judging from the Garuda statue and the conch and " +
                        "chakra disc mounted on pillars supported by stone turtles in front of the temple, Vishnu seems to have come out on top.\n",R.drawable.dattatarya), "Datttraya");
                adapter.addFragment(new MapFragment("There is wood carving musieum in peacock windowed palace.\n" +
                        "In front of peaceck windowed palace, there is another musium of old utensils of brass and bronze.",R.drawable.dattatraya2), "Meusem");
                adapter.addFragment(new DetailedFragment("There is unique Peacock Window in Bhaktapur Nepal built in 15th century.\n" +
                        "The Peacock Window is a 15th century window built in Bhaktapur Nepal. \n" +
                        "Commonly referred to as the \"Mona Lisa\" of Nepal is it one of the countries most precious art works. \n" +
                        "It consists several small bird carvings with a large intricately " +
                        "decorated peacock carving in the center with tail feathers that form a lattice window.",R.drawable.akhijhyal), "Peacock Window");
                adapter.addFragment(new DetailedFragment("Desay Madu Jhyā is a traditional wooden window in Bhaktapur which is celebrated for its uniqueness. The name means \"window without equal in the country\" in Nepal Bhasa.\n" +
                        "Desay Madu Jhya is a latticed window with multiple frames. Its design looks like the bellows in an old folding camera.\n" +
                        "Desay Madu Jhyā is a specimen of the woodcarving heritage of the Newar" +
                        " people of Nepal which goes back more than a thousand years.",R.drawable.desamaru), "Desay Madu Jhya");

                break;
            case 3:
                titletext.setText(getText(R.string.pottery_title));
                adapter.addFragment(new FamousHereFragment("The world famous Juju dhau, curd made only in " +
                        "Bhaktapur, is served in mud bowls,Kala are  made here. ",R.drawable.potterysquare), "Kala");
                adapter.addFragment(new MapFragment("Lha Maru Lyasindyo:\n" +
                        "Lha Maru Lasyindya is upstanded here in new year.\n" +
                        "Is stoodup at Morning of new year eve. After it is stood up different rituals and pujas are done." +
                        "It is kept standing for five days. It is stood up at pottery square.",R.drawable.biska3jatra), "Lha Maru lyasindyo");
                 break;
            case 4:
            case 10:
                titletext.setText(getText(R.string.durbar_title));
                adapter.addFragment(new FamousHereFragment("Golden Gate",R.drawable.durbarsq1), "Golder Gate");
                adapter.addFragment(new MapFragment("Reconstructed Bastola Temple",R.drawable.durbarsq3), "Bustola Temple");
                adapter.addFragment(new DetailedFragment("55 Window Palace",R.drawable.durbarsq2), "55 Window Palace");
                break;
            case 11:
            case 22:
                titletext.setText(getText(R.string.changu_title));
                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.",R.drawable.changu1), "Changu Front View");
                adapter.addFragment(new MapFragment("Changu Narayan",R.drawable.changu2), "Changu Blue Sky");
                adapter.addFragment(new DetailedFragment("Hello everyone",R.drawable.changu3), "Gate");
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
//            case 15:
//                titletext.setText(getText(R.string.gathamuga_title));
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
//            case 17:
//                titletext.setText(getText(R.string.pulukisi_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
//            case 18:
//                titletext.setText(getText(R.string.nagarkot_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
//            case 19:
//                titletext.setText(getText(R.string.pilotbaba_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
//            case 20:
//                titletext.setText(getText(R.string.ranikot_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
//            case 21:
//                titletext.setText(getText(R.string.manjushree_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
//            case 23:
//                titletext.setText(getText(R.string.ghyampe_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
//            case 24:
//                titletext.setText(getText(R.string.muhan_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
//            case 40:
//                titletext.setText(getText(R.string.dhau_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
//            case 41:
//                titletext.setText(getText(R.string.yomari_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
//            case 42:
//                titletext.setText(getText(R.string.samebaji_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
//            case 43:
//                titletext.setText(getText(R.string.swo_puka_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
//            case 44:
//                titletext.setText(getText(R.string.choila_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
//            case 45:
//                titletext.setText(getText(R.string.kachila_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
//            case 46:
//                titletext.setText(getText(R.string.nyakhwa_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
//            case 47:
//                titletext.setText(getText(R.string.takha_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
//            case 48:
//                titletext.setText(getText(R.string.bara_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
//            case 49:
//                titletext.setText(getText(R.string.chatamari_title));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
//            default:
//                titletext.setText(getText(R.string.service_text));
//                adapter.addFragment(new FamousHereFragment("Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail.","Made without using single iron nail."), "tab 1");
//                adapter.addFragment(new MapFragment("hi you !!"), "tab 2");
//                adapter.addFragment(new DetailedFragment("Hello everyone"), "tab 3");
//                break;
        }
        viewPager.setAdapter(adapter);
    }
}