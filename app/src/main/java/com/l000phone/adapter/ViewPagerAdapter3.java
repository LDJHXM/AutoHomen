package com.l000phone.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.l000phone.fragment.ViewPager_Fragment;

import java.util.List;

/**
 * Created by DJ on 2016/11/18.
 */

public class ViewPagerAdapter3 extends FragmentStatePagerAdapter {

    private List<ViewPager_Fragment> ds;

    public ViewPagerAdapter3(FragmentManager fm, List<ViewPager_Fragment> ds) {
        super(fm);
        this.ds = ds;
    }

    @Override
    public Fragment getItem(int position) {


        return ds.get(position);
    }

    @Override
    public int getCount() {
        return ds.size();
    }


}
