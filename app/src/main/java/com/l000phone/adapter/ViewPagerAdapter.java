package com.l000phone.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.l000phone.fragment.ViewPager_Fragment;

import java.util.List;

/**
 * Created by DJ on 2016/11/18.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private List<ViewPager_Fragment> ds;

    public ViewPagerAdapter(FragmentManager fm, List<ViewPager_Fragment> ds) {
        super(fm);
        this.ds = ds;
    }

    @Override
    public Fragment getItem(int position) {

        position = position % ds.size();


        return ds.get(position);
    }

    @Override
    public int getCount() {
        //设置成最大，使用户看不到边界
        return 100;
    }


}
