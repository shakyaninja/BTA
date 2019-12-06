package com.example.bta.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.bta.R;
import com.google.android.gms.maps.model.LatLng;


public class MapFragment extends Fragment {
    TextView textView;
    ImageView imageView;
    String str;
    protected int imageId;
    public MapFragment(String text,int imageId) {
        // Required empty public constructor
        str = text;
        this.imageId = imageId;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_tabbed_detail_fragment2, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView = view.findViewById(R.id.mapContent);
        textView.setText(str);

        imageView = view.findViewById(R.id.mapImage);
        imageView.setImageResource(imageId);
    }
}
