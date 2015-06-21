package com.cm_smarthome.circlepageindicator;

/**
 * Created by AdminPond on 21/6/2558.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LayoutTwo extends Fragment {

    public static LayoutTwo newInstance() {
        LayoutTwo fragment = new LayoutTwo();
        return fragment;
    }

    public LayoutTwo() {
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.layout_two, null);
        return root;
    }
}