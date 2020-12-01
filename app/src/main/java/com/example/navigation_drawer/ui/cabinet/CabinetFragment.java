package com.example.navigation_drawer.ui.cabinet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.navigation_drawer.R;
import com.example.navigation_drawer.ui.home.HomeViewModel;

public class CabinetFragment extends Fragment {

    View root;
    TextView tv_home;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_cabinet, container, false);

        tv_home = root.findViewById(R.id.tv_home);
        tv_home.setText("Text Changed");

        return root;
    }
}