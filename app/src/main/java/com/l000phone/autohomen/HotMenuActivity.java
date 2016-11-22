package com.l000phone.autohomen;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.l000phone.fragment.Hot_Menu_Fragment;

import java.util.LinkedList;
import java.util.List;

public class HotMenuActivity extends AppCompatActivity {

    private List<Hot_Menu_Fragment> ds;
    private ViewPager mVP;
    private String[] stringArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_hout_menu);

        //界面实例的获取
        mVP = (ViewPager) findViewById(R.id.hot_vp_id);
        TabLayout mTb = (TabLayout) findViewById(R.id.hop_tabLayout_id);
        TextView mTv = (TextView) findViewById(R.id.hop_week_text_id);

        Bundle bundle = getIntent().getExtras();

        String title = bundle.getString("title");

        mTv.setText(title);


        //关于ViewPager的操作

        aboutViewpager();

        mTb.setupWithViewPager(mVP);



    }

    public void back(View view){


        finish();


    }



    /**
     * 关于ViewPager的操作
     */

    private void aboutViewpager() {

        ds = new LinkedList<>();

        stringArray = getResources().getStringArray(R.array.tabName);

        //数据源

        for(int i = 0; i< stringArray.length; i++){

            Hot_Menu_Fragment hot = new Hot_Menu_Fragment();

            Bundle arg = new Bundle();

            arg.putString("tab", stringArray[i]);

            hot.setArguments(arg);

            ds.add(hot);

        }

        //适配器
        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager());


        //绑定适配器
        mVP.setAdapter(myAdapter);

    }

    private class MyAdapter extends FragmentStatePagerAdapter{


        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return ds.get(position);
        }

        @Override
        public int getCount() {
            return ds.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {


            return stringArray[position];

        }
    }
}
