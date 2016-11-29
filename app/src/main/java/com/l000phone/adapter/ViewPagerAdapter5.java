package com.l000phone.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.l000phone.fragment.PhotoView_Pic;

import java.util.List;

/**
 * Created by DJ on 2016/11/18.
 */

public class ViewPagerAdapter5 extends FragmentStatePagerAdapter {

    private List<PhotoView_Pic> ds;

    public ViewPagerAdapter5(FragmentManager fm, List<PhotoView_Pic> ds) {

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
