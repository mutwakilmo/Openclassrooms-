package com.mutwakilmoapp.android.myamazingviewpager.Controllers.Fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.openclassrooms.myamazingviewpager.R;



public class ParamPageFragment extends Fragment {

    public static ParamPageFragment newInstance() {
        return (new ParamPageFragment());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_page_param, container, false);
    }
}
