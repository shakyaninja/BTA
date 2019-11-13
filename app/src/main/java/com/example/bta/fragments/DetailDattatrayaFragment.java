package com.example.bta.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.bta.R;

public class DetailDattatrayaFragment extends Fragment {
    public DetailDattatrayaFragment() {
        // Required empty public constructor

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_detail_dattatraya, container, false);
        return rootView;
    }

    public DetailDattatrayaFragment(int contentLayoutId) {
        super(contentLayoutId);

    }
}
