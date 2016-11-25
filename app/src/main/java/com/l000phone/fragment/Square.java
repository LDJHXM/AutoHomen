package com.l000phone.fragment;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.l000phone.autohomen.MainActivity;
import com.l000phone.autohomen.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by DJ on 2016/11/16.
 */
public class Square extends Fragment implements RadioGroup.OnCheckedChangeListener, ViewPager.OnPageChangeListener {
    private String TAG = getClass().getSimpleName();
    private View mSquare;
    private LinearLayout mSearchTalk;
    private LinearLayout mSearchFriends;
    private ImageView mShareTalk;
    private ImageView mAddFriends;
    private ImageView mNanageFri;
    private ImageView mShareWorks;
    private RadioGroup mRadio;
    private RadioButton mTalk;
    private RadioButton mFriends;
    private RadioButton mDynamic;
    private ViewPager mViewPager;
    private MyPagerAdapter mAdapter;
    private List<Fragment> mFragments = new ArrayList<Fragment>();
    private List<RadioButton> buttons;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mSquare = inflater.inflate(R.layout.square_main_fragment, null);
        buttons = new ArrayList<>();

        return mSquare;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //实例
        getViewCase();
        //监听器
        addListener();
        //数据
        initData();
        //搜索框动画效果
//        aboutAnimation(mSquare);
    }

    private void addListener() {
        mRadio.setOnCheckedChangeListener(this);
        mViewPager.addOnPageChangeListener(this);

    }

    /**
     * 获取数据
     */
    private void initData() {
        for (int i = 0; i < mRadio.getChildCount(); i++) {
            buttons.add((RadioButton) mRadio.getChildAt(i));
        }
        Log.d(TAG, "initData:button.size " + buttons.size());
        for (int i = 0; i < buttons.size(); i++) {
            if (i == 0) {
                Square_Talk talk = new Square_Talk();
                mFragments.add(talk);

            } else if (i == 1) {
                Square_Friends friends = new Square_Friends();
                mFragments.add(friends);

            } else if (i == 2) {
                Square_Dynamic dynamic = new Square_Dynamic();
                mFragments.add(dynamic);

            }
        }
        Log.d(TAG, "mFragments: ++++++++++++++++++" + mFragments.size());

        mAdapter = new MyPagerAdapter(getChildFragmentManager());
        mViewPager.setAdapter(mAdapter);
        Log.d(TAG, "initData: viewpager+" + mViewPager.getChildCount());
    }

    /**
     * 实例
     */
    private void getViewCase() {
        mSearchTalk = (LinearLayout) mSquare.findViewById(R.id.ll_header_search_id);
        mShareTalk = (ImageView) mSquare.findViewById(R.id.iv_share_talk_id);
        mSearchFriends = (LinearLayout) mSquare.findViewById(R.id.ll_header_search2_id);
        mAddFriends = (ImageView) mSquare.findViewById(R.id.iv_add_friends_id);
        mNanageFri = (ImageView) mSquare.findViewById(R.id.iv_manage_friends_id);
        mShareWorks = (ImageView) mSquare.findViewById(R.id.iv_share_works_id);

        mViewPager = (ViewPager) mSquare.findViewById(R.id.vp_square_id);
        mRadio = (RadioGroup) mSquare.findViewById(R.id.rg_square_id);
        mTalk = (RadioButton) mSquare.findViewById(R.id.rb_talk_id);
        mFriends = (RadioButton) mSquare.findViewById(R.id.rb_friends_id);
        mDynamic = (RadioButton) mSquare.findViewById(R.id.rb_dynamic_id);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        //搜索框动画效果
        if (i == mTalk.getId()) {
                mSearchTalk.setVisibility(View.VISIBLE);
                mShareTalk.setVisibility(View.VISIBLE);
                mSearchFriends.setVisibility(View.GONE);
                mAddFriends.setVisibility(View.GONE);
                mNanageFri.setVisibility(View.GONE);
                mShareWorks.setVisibility(View.GONE);
        } else if (i == mFriends.getId()) {
                mSearchTalk.setVisibility(View.GONE);
                mShareTalk.setVisibility(View.INVISIBLE);
                mSearchFriends.setVisibility(View.VISIBLE);
                mAddFriends.setVisibility(View.VISIBLE);
                mNanageFri.setVisibility(View.VISIBLE);
                mShareWorks.setVisibility(View.GONE);

        } else if (i == mDynamic.getId()) {
                mShareTalk.setVisibility(View.INVISIBLE);
                mShareWorks.setVisibility(View.VISIBLE);
                mSearchTalk.setVisibility(View.VISIBLE);
                mSearchFriends.setVisibility(View.GONE);
                mAddFriends.setVisibility(View.GONE);
                mNanageFri.setVisibility(View.GONE);
        }
        //ViewPager绑定当前页
        for (int j = 0; j < mRadio.getChildCount(); j++) {
            if (mRadio.getChildAt(j).getId() == i) {
                mViewPager.setCurrentItem(j);
            }
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        RadioButton button = (RadioButton) mRadio.getChildAt(position);
        button.setChecked(true);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    /**
     * ViewPager适配器
     */
    public class MyPagerAdapter extends FragmentPagerAdapter {
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return mFragments == null ? 0 : mFragments.size();
        }
    }
}
