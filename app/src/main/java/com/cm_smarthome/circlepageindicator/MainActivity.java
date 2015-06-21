package com.cm_smarthome.circlepageindicator;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import android.os.Bundle;

import me.relex.circleindicator.CircleIndicator;


public class MainActivity extends FragmentActivity {
    MyPageAdapter adapter;
    ViewPager pager;
    Context context = this;
    Sqlite sqlite = new Sqlite(context);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sqlite.getWritableDatabase();
        sqlite.InsertData();

        String[] arrData = sqlite.SelectData("1");
        if (arrData[0].length() > 0) {
            String Flag = arrData[1];
            if (Flag.equals("1")) {
                Intent intent = new Intent(context, App.class);
                startActivity(intent);
            }
        }

        adapter = new MyPageAdapter(getSupportFragmentManager());

        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(pager);
    }
}