package com.example.bta.activities;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.bta.R;
import com.example.bta.adapters.FullImageAdapter;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class GalleryActivity extends AppCompatActivity {

    Boolean isOpen = false;
    RecyclerView.LayoutManager layoutManager;
    int[] list ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        Toast.makeText(this, "in gallery", Toast.LENGTH_SHORT).show();


        Bundle bundle= getIntent().getExtras();
        final int key = bundle.getInt("photo");
        FullImageAdapter imageAdapter = new FullImageAdapter(this);
        ViewPager mViewPager = findViewById(R.id.viewPage1);

        switch(key){
            case 1:
                list = new int[]{
                    R.drawable.nyatapola,R.drawable.nyatapole1,R.drawable.nyatapole2,R.drawable.nyatapole3,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 2:
                list = new int[]{
                        R.drawable.dattatraya,R.drawable.dattatraya2,R.drawable.dattatraya3,R.drawable.dattatraya4,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                 break;
            case 3:

                list = new int[]{
                        R.drawable.potterysquare,R.drawable.ps1,R.drawable.ps2,R.drawable.ps3,R.drawable.ps4,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 4:
            case 10:
                list = new int[]{
                        R.drawable.durbar_square_bhaktapur,R.drawable.bds1,R.drawable.bds2,R.drawable.bds3,R.drawable.bds4,R.drawable.bds5,R.drawable.bds6,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;

            case 11:
                list = new int[]{
                        R.drawable.changunarayan,R.drawable.cn1,R.drawable.cn2,R.drawable.cn3,R.drawable.cn5,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 12:
            case 13:
                list = new int[]{
                        R.drawable.gaijatra,R.drawable.gj1,R.drawable.gj2,R.drawable.gj3,R.drawable.gj4,R.drawable.gj5,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 14:
                list = new int[]{
                        R.drawable.yomaripunhi,R.drawable.yomaris,R.drawable.yomari_futako,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 15:
                list = new int[]{
                        R.drawable.ghantagarna,R.drawable.gathamunga1,R.drawable.gathamunga2,R.drawable.gathamunga3,R.drawable.gathamunga4,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 16:
                list = new int[]{
                        R.drawable.bisketjatra,R.drawable.biska1,R.drawable.biska2,R.drawable.biska3,R.drawable.biska4,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 17:
                list = new int[]{
                        R.drawable.pulu_kisi,R.drawable.pulukishi2,R.drawable.pulukishi3,R.drawable.pulukishi4,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 18:
                list = new int[]{
                        R.drawable.nagarkot,R.drawable.nagarkot1,R.drawable.nagarkot3,R.drawable.nagarkot4,R.drawable.nagarkot6,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 19:
                list = new int[]{
                        R.drawable.pilot_baba,R.drawable.pilotbaba1,R.drawable.pilotbaba2,R.drawable.pilotbaba3,R.drawable.pilotbaba4,R.drawable.pilotbaba5,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 20:
                list = new int[]{
                        R.drawable.ranikot,R.drawable.ranikot1,R.drawable.ranikot2,R.drawable.ranikot3,R.drawable.ranikot4,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 21:
                list = new int[]{
                        R.drawable.mahamanjushree,R.drawable.mahamanjushree2,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 22:
                list = new int[]{
                        R.drawable.changu,R.drawable.cn7,R.drawable.cn8,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 23:
                list = new int[]{
                        R.drawable.ghyampedada,R.drawable.ranikot4,R.drawable.ranikot3,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 24:
                list = new int[]{
                        R.drawable.muhan,R.drawable.muhanpokhari1,R.drawable.muhanpokhari2,R.drawable.muhanpokhari3,R.drawable.muhanpokhari4,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 40:
                list = new int[]{
                        R.drawable.juju_dhau,R.drawable.yomari_futako,R.drawable.yomaripunhi,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 41:
                list = new int[]{
                        R.drawable.yomaris,R.drawable.yomari_futako,R.drawable.yomaripunhi,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 42:
                list = new int[]{
                        R.drawable.newari_khaja_set,R.drawable.yomari_futako,R.drawable.yomaripunhi,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 43:
                list = new int[]{
                        R.drawable.swoo_puka,R.drawable.yomari_futako,R.drawable.yomaripunhi,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 44:
                list = new int[]{
                        R.drawable.choila,R.drawable.yomari_futako,R.drawable.yomaripunhi,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 45:
                list = new int[]{
                        R.drawable.kachila,R.drawable.yomari_futako,R.drawable.yomaripunhi,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 46:
                list = new int[]{
                        R.drawable.sanyakhuna,R.drawable.yomari_futako,R.drawable.yomaripunhi,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 47:
                list = new int[]{
                        R.drawable.takhwa,R.drawable.yomari_futako,R.drawable.yomaripunhi,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 48:
                list = new int[]{
                        R.drawable.bara,R.drawable.yomari_futako,R.drawable.yomaripunhi,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 49:
                list = new int[]{
                        R.drawable.chatamari,R.drawable.yomari_futako,R.drawable.yomaripunhi,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            default:
                list = new int[]{
                        R.drawable.nyatapola,R.drawable.dattatraya,R.drawable.dattatraya2,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
        }
    }

}
