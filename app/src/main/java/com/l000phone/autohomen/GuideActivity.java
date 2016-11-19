package com.l000phone.autohomen;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.l000phone.fragment.GuideFragment;

import java.util.LinkedList;
import java.util.List;


/**
 * 引导界面
 * Created by DJ on 2016/10/27.
 */

public class GuideActivity extends AppCompatActivity {


    private ViewPager guideVp;
    private List<GuideFragment> ds;
    private LinearLayout guideLl;
    private int before;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        //偏好参数实例的获取
        SharedPreferences sharedPreferences = getSharedPreferences("info", MODE_PRIVATE);
        //第一次默认是false，true代表使用过，false代表第一次使用
        boolean isUse = sharedPreferences.getBoolean("isUse", false);

        if(isUse){
            //跳转到主界面


            startActivity(new Intent(this,Welcome.class));
            //然后销毁界面
            finish();
        }else{
            //若没有使用加载引导界面
            setContentView(R.layout.activity_guide);
            Log.i("dj","走了么");


            //获得界面控件的实例
            guideVp = (ViewPager) findViewById(R.id.guide_vp_id);
            guideLl = (LinearLayout) findViewById(R.id.guide_ll_id);
            //关于小圆点的操作
            aboutYuanDian();
            //关于ViewPager的操作
            aboutViewPager();

        }

    }

    /**
     * 关于ViewPager的操作
     */
    private void aboutViewPager() {
        //数据源
        ds = new LinkedList<>();
        //填充数据源
        fillDs();
        //适配器
        MyAdapter adapter = new MyAdapter(getSupportFragmentManager());

        //绑定适配器
        guideVp.setAdapter(adapter);

        //添加监听器
        guideVp.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener(){

            @Override
            public void onPageSelected(int position) {

                guideLl.getChildAt(position).setEnabled(false);
                guideLl.getChildAt(before).setEnabled(true);
                before=position;
                super.onPageSelected(position);
            }
        });


    }

    /**
     * ViewPager自定义适配器
     */

    private final class MyAdapter extends FragmentStatePagerAdapter {


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
    }
    /**
     * 填充数据源
     */
    private void fillDs() {
        //获得图片对应的名字数组
        String[] pics = getResources().getStringArray(R.array.picName);

        //将图片转换成ImageView的实例，传递到GuideFragment
        for(String pic:pics){

            int picId = getResources().getIdentifier(pic, "drawable", getPackageName());

            addGuideFragment(picId);

        }

        addGuideFragment(0);
    }

    private void addGuideFragment(int picId) {
        GuideFragment guideF = new GuideFragment();

        Bundle args = new Bundle();

        args.putInt("picId",picId);

        guideF.setArguments(args);

        ds.add(guideF);
    }

    /**
     * 关于小圆点的操作
     */
    private void aboutYuanDian() {

        MyListener listener = new MyListener();
        //小圆点初始化

        for(int i=0;i<guideLl.getChildCount();i++){
            ImageView mIv = (ImageView) guideLl.getChildAt(i);
            //设置小圆点的属性，可点击
            mIv.setEnabled(true);

            //给小圆点添加别名
            mIv.setTag(i);

            //给每个小圆点添加监听器
            mIv.setOnClickListener(listener);
        }

        //默认第一个是选中
        guideLl.getChildAt(0).setEnabled(false);



    }
    /**
     * 监听器实现类（小圆点）
     */
    private final class MyListener implements View.OnClickListener{


        @Override
        public void onClick(View view) {
            //小圆点的别名和在数据源的编号是一致的
            guideVp.setCurrentItem((Integer) view.getTag());
        }
    }
}
