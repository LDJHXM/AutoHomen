package com.l000phone.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by DJ on 2016/11/18.
 */

public class ViewPagerAdapter2 extends FragmentStatePagerAdapter {

    private List<Fragment> ds;
    private String[] array;

    public ViewPagerAdapter2(FragmentManager fm, List<Fragment> ds,String[] array) {
        super(fm);
        this.ds = ds;
        this.array=array;
    }

    @Override
    public Fragment getItem(int position) {

        return ds.get(position);

    }


    @Override
    public int getCount() {
        //设置成最大，使用户看不到边界
        return ds.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return array[position];

    }
}
