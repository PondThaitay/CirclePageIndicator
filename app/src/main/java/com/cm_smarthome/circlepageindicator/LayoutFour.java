package com.cm_smarthome.circlepageindicator;

/**
 * Created by AdminPond on 21/6/2558.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LayoutFour extends Fragment {

    public static LayoutFour newInstance() {
        LayoutFour fragment = new LayoutFour();
        return fragment;
    }

    public LayoutFour() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.layout_four, null);
        return root;
    }
}