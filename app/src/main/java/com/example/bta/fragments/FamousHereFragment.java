package com.example.bta.fragments;

import android.media.Image;
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


public class FamousHereFragment extends Fragment {
    TextView textView1;
    ImageView imageView;

    String str1;
    int image;
    public FamousHereFragment(String text1,int im) {
        // Required empty public constructor
        str1 = text1;
        image = im;

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_tabbed_detail, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView1 = view.findViewById(R.id.tabContet);
        textView1.setText(str1);

        imageView = view.findViewById(R.id.tabImage);
        imageView.setImageResource(image);

    }
}
