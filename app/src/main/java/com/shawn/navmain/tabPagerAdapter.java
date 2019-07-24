package com.shawn.navmain;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class tabPagerAdapter extends FragmentStatePagerAdapter {


    String[] tabarray = new String[]{"Main", "Side", "Drinks"};
    Integer tabnumber = 3;

    public tabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabarray[position];
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                MainFragment mainFragment = new MainFragment();
                return mainFragment;
            case 1:
                SideFragment sideFragment = new SideFragment();
                return sideFragment;
            case 2:
                DrinkFragment drinkFragment = new DrinkFragment();
                return drinkFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
