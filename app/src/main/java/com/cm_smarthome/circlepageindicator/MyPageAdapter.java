package com.cm_smarthome.circlepageindicator;

/**
 * Created by AdminPond on 21/6/2558.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter extends FragmentPagerAdapter {
    private final int NUM_ITEMS = 5;

    public MyPageAdapter(FragmentManager fm) {
        super(fm);
    }

    public int getCount() {
        return NUM_ITEMS;
    }

    public Fragment getItem(int position) {
        if (position == 0)
            return LayoutOne.newInstance();
        else if (position == 1)
            return LayoutTwo.newInstance();
        else if (position == 2)
            return LayoutThree.newInstance();
        else if (position == 3)
            return LayoutFour.newInstance();
        else if (position == 4)
            return LayoutFive.newInstance();
        return null;
    }
}
