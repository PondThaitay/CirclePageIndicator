package com.cm_smarthome.circlepageindicator;

/**
 * Created by AdminPond on 21/6/2558.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class LayoutFive extends Fragment {
    Sqlite sqlite;
    private Button btnStart;

    public static LayoutFive newInstance() {
        LayoutFive fragment = new LayoutFive();
        return fragment;
    }

    public LayoutFive() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.layout_five, null);

        sqlite = new Sqlite(getActivity());

        btnStart = (Button) root.findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqlite.UpdateDataFlag("1", "1");
                String[] arrData = sqlite.SelectData("1");
                Log.e("Flag", arrData[1]);
                Intent intent = new Intent(getActivity(), App.class);
                startActivity(intent);
                Toast.makeText(getActivity(), "OK...", Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }
}