package com.muhamadarief.tongsik.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.muhamadarief.tongsik.Fragments.AngkringanFragment;
import com.muhamadarief.tongsik.Fragments.CafeFragment;
import com.muhamadarief.tongsik.Fragments.RumahMakanFragment;

/**
 * Created by Muhamad Arief on 30/08/2016.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[] {"RUMAH MAKAN", "KAFE", "ANGKRINGAN" };
    private Context context;

    public ViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RumahMakanFragment();
        } else if (position == 1){
            return new CafeFragment();
        }else {
            return new AngkringanFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];

    }
}
