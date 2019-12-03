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
                    R.drawable.nyatapola,R.drawable.akhijhyal,R.drawable.dattatraya2,
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
                        R.drawable.potterysquare,R.drawable.dattatraya,R.drawable.dattatraya2,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 4:
            case 10:
                list = new int[]{
                        R.drawable.durbar_square_bhaktapur,R.drawable.dattatraya,R.drawable.dattatraya2,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;

            case 11:
                list = new int[]{
                        R.drawable.changunarayan,R.drawable.dattatraya,R.drawable.dattatraya2,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 12:
                list = new int[]{
                        R.drawable.gaijatra,R.drawable.dattatraya,R.drawable.dattatraya2,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 13:
                list = new int[]{
                        R.drawable.tahamacha,R.drawable.dattatraya,R.drawable.dattatraya2,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 14:
                list = new int[]{
                        R.drawable.yomaripunhi,R.drawable.dattatraya,R.drawable.dattatraya2,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 15:
                list = new int[]{
                        R.drawable.ghantagarna,R.drawable.dattatraya,R.drawable.dattatraya2,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 16:
                list = new int[]{
                        R.drawable.bisketjatra,R.drawable.dattatraya,R.drawable.dattatraya2,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 17:
                list = new int[]{
                        R.drawable.pulu_kisi,R.drawable.dattatraya,R.drawable.dattatraya2,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 18:
                list = new int[]{
                        R.drawable.nagarkot,R.drawable.dattatraya,R.drawable.dattatraya2,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 19:
                list = new int[]{
                        R.drawable.pilot_baba,R.drawable.dattatraya,R.drawable.dattatraya2,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 20:
                list = new int[]{
                        R.drawable.ranikot,R.drawable.dattatraya,R.drawable.dattatraya2,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 21:
                list = new int[]{
                        R.drawable.mahamanjushree,R.drawable.dattatraya,R.drawable.dattatraya2,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 22:
                list = new int[]{
                        R.drawable.changu,R.drawable.dattatraya,R.drawable.dattatraya2,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 23:
                list = new int[]{
                        R.drawable.ghyampedada,R.drawable.dattatraya,R.drawable.dattatraya2,
                };
                imageAdapter.setSliderImageId(list);
                mViewPager.setAdapter(imageAdapter);
                break;
            case 24:
                list = new int[]{
                        R.drawable.muhan,R.drawable.dattatraya,R.drawable.dattatraya2,
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
        //for the top horizontal scrolling images
    }

}
