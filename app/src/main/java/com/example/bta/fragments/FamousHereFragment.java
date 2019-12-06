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


public class FamousHereFragment extends Fragment {
    TextView textView1;
    ImageView image1;
    int imgkey;

    String str1,str2,str3,str4,str5;
    public FamousHereFragment(int key1,String text1) {
        // Required empty public constructor
        str1 = text1;
        imgkey = key1;

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
        image1= view.findViewById(R.id.famous_img1);
        image1.setImageResource(imgkey);
        textView1 = view.findViewById(R.id.famous_fact1);
        textView1.setText(str1);
    }
}
