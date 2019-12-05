package com.example.bta.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.bta.R;


public class FamousHereFragment extends Fragment {
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;

    String str1,str2,str3,str4,str5;
    public FamousHereFragment(String text1,String text2,String text3,String text4,String text5) {
        // Required empty public constructor
        str1 = text1;
        str2 = text2;
        str3 = text3;
        str4 = text4;
        str5 = text5;
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
        textView1 = view.findViewById(R.id.famous_fact1);
        textView1.setText(str1);
        textView2 = view.findViewById(R.id.famous_fact2);
        textView2.setText(str2);
        textView3 = view.findViewById(R.id.famous_fact3);
        textView3.setText(str3);
        textView4 = view.findViewById(R.id.famous_fact4);
        textView4.setText(str4);
        textView5 = view.findViewById(R.id.famous_fact5);
        textView5.setText(str5);
    }
}
