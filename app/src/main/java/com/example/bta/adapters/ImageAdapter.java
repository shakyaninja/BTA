package com.example.bta.adapters;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.example.bta.R;

public class ImageAdapter extends PagerAdapter {
    Context mContext;

    public int[] getSliderImageId() {
        return sliderImageId;
    }

    public void setSliderImageId(int[] sliderImageId) {
        this.sliderImageId = sliderImageId;
    }

    public ImageAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((ImageView) object);
    }

    private int[] sliderImageId = new int[]{
            R.drawable.carvingsedit, R.drawable.potterysquare, R.drawable.street,R.drawable.dattatraya, R.drawable.akhijhyal,
    };

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//        imageView.setImageResource(sliderImageId[position]);
        Glide.
                with(mContext)
                .load(sliderImageId[position])
                .into(imageView);
        ((ViewPager) container).addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ImageView) object);
    }

    @Override
    public int getCount() {
        return sliderImageId.length;
    }
}