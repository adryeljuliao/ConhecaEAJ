package com.juliao.adryel.conhecaeaj;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ADRYEL on 16/10/2017.
 */

public class FixedTabsPageAdapter extends FragmentPagerAdapter {

    public FixedTabsPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();
            case 2:
                return new Fragment3();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Setor EAJ";
            case 1:
                return "Detalhes";
            case 2:
                return "Mapa";
            default:
                return null;
        }
    }
}
