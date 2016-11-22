package com.l000phone.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.l000phone.adapter.ListViewAdapter;
import com.l000phone.adapter.ViewPagerAdapter;
import com.l000phone.autohomen.HotMenuActivity;
import com.l000phone.autohomen.KitchenActivity;
import com.l000phone.autohomen.R;
import com.l000phone.autohomen.WeekActivity;
import com.l000phone.entity.Cate;
import com.l000phone.face.HaoDouCate;
import com.l000phone.util.GetMap;
import com.l000phone.view.Five_Iv_Tv;
import com.l000phone.view.Five_big_Iv_Tv;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by DJ on 2016/11/16.
 */

public class HaoDou extends Fragment {

    private ListView mLv;
    private View view;
    private ViewPager mVp;
    private LinearLayout llContainer;
    private List<ViewPager_Fragment> pagers;
    private int index = 1;
    //轮播
 /*   private Handler mHandler = new Handler() {

        @Override
        public void handleMessage(Message msg) {

            if (msg.what == 0) {

                mVp.setCurrentItem(index++);

            }
            super.handleMessage(msg);
        }
    };*/
    private boolean isTaskRun;
    private Timer mTimer;
    private TimerTask mTask;
    private Five_Iv_Tv mPopular;
    private Five_Iv_Tv mSee;
    private Five_Iv_Tv mKitchen;
    private Five_Iv_Tv mHot;
    private Five_Iv_Tv mMenu;
    private Five_big_Iv_Tv mF1;
    private Five_big_Iv_Tv mF2;
    private Five_big_Iv_Tv mF3;
    private Five_big_Iv_Tv mF4;
    private Five_big_Iv_Tv mF5;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        getCateDate();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_haodou, container, false);

        getViewCase();

        return view;
    }


    /**
     * 关于ViewPager的操作
     *
     * @param list_pager
     */
    private void aboutViewPager(List<Cate.DataBean.HeaderBean.ListBean> list_pager) {

        //数据源

        pagers = new LinkedList<>();

        for (int i = 0; i < list_pager.size(); i++) {

            ViewPager_Fragment vf = new ViewPager_Fragment();

            Bundle arg = new Bundle();

            arg.putString("title", list_pager.get(i).getTitle());

            Log.i("title", list_pager.get(i).getTitle());

            arg.putString("imgs", list_pager.get(i).getImgs().get(0));

            arg.putString("url", list_pager.get(i).getUrl());

            vf.setArguments(arg);

            pagers.add(vf);

        }

        //适配器

        ViewPagerAdapter adapter =
                new ViewPagerAdapter(getFragmentManager(), pagers);

        //绑定适配器
        mVp.setAdapter(adapter);

        // 给ViewPger添加监听器，决定小圆点的状态
        mVp.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {

                index = position;

                position = position % pagers.size();


                // ViewPager决定小圆点的状态
                for (int i = 0; i < pagers.size(); i++) {// 状态复原
                    llContainer.getChildAt(i).setEnabled(true);

                }

                // 将position位置处的小圆点enable属性值设置为false
                llContainer.getChildAt(position).setEnabled(false);

                super.onPageSelected(position);
            }


            @Override
            public void onPageScrollStateChanged(int state) {
                /* state: 0空闲，1是滑行中，2加载完毕 */

                if (state == 0 && !isTaskRun) {

                    Log.i("---", "000");

                   // startTask();

                } else if (state == 1 && isTaskRun) {

                    Log.i("---", "111");

                    //stopTask();

                } else if (state == 2) {
                    Log.i("---", "222");

                }

                super.onPageScrollStateChanged(state);
            }
        });

        //得先执行一次才会走，state==0的逻辑
        //mHandler.sendEmptyMessageDelayed(0,2000);


    }

    /**
     * 关于小圆点的操作
     */
    private void aboutLittleDots() {
        // 分析：
        // 1）小圆点的个数与ViewPager中数据源中Fragment的个数是一样的
        // 2）在占位的容器控件中，动态添加ImageView。
        // 3）联动效果的添加：
        // a)小圆点决定ViewPager当前页面的状态
        // b)ViewPager决定小圆点的状态

        MyOnClickListener listener = new MyOnClickListener();

        for (int i = 0; i < pagers.size(); i++) {
            // 每循环一次，构建一个ImageView的实例，添加到占位的容器控件中

            ImageView iv = new ImageView(getActivity());

            iv.setImageResource(R.drawable.dot_selector);

            // 给ImageView添加标签
            iv.setTag(i);
            // 给小圆点添加监听器
            iv.setOnClickListener(listener);

            // ImageView控件上显示的图片，动态由Enabled属性值，根据选择器，来动态加载图片
            iv.setEnabled(true);

            llContainer.addView(iv);
        }

        // 默认第一个小圆点是选中的状态
        llContainer.getChildAt(0).setEnabled(false);

    }

    // OnClickListener点击事件监听器
    private final class MyOnClickListener implements View.OnClickListener {

        /*
         * (non-Javadoc)
         *
         * @see android.view.View.OnClickListener#onClick(android.view.View)
         */
        @Override
        public void onClick(View v) {

            // 小圆点决定ViewPager当前页面的状态
            mVp.setCurrentItem((Integer) v.getTag());

        }

    }


    /**
     * 界面控件实例的获取
     *
     * @return
     */
    public void getViewCase() {

        //// TODO: 2016/11/18

        mLv = (ListView) view.findViewById(R.id.listView_id);
        mPopular = (Five_Iv_Tv) view.findViewById(R.id.popular_menu_id);
        mSee = (Five_Iv_Tv) view.findViewById(R.id.see_video_id);
        mKitchen = (Five_Iv_Tv) view.findViewById(R.id.kitchen_cheats_id);
        mHot = (Five_Iv_Tv) view.findViewById(R.id.hot_activity_id);
        mMenu = (Five_Iv_Tv) view.findViewById(R.id.menu_classify_id);
        mVp = (ViewPager) view.findViewById(R.id.vp_id);
        llContainer = (LinearLayout) view.findViewById(R.id.ll_container_id);
        mF1 = (Five_big_Iv_Tv) view.findViewById(R.id.Five_big_Iv_Tv_1);
        mF2 = (Five_big_Iv_Tv) view.findViewById(R.id.Five_big_Iv_Tv_2);
        mF3 = (Five_big_Iv_Tv) view.findViewById(R.id.Five_big_Iv_Tv_3);
        mF4 = (Five_big_Iv_Tv) view.findViewById(R.id.Five_big_Iv_Tv_4);
        mF5 = (Five_big_Iv_Tv) view.findViewById(R.id.Five_big_Iv_Tv_5);


    }

   /* @Override
    public void setJSONData(Cate result) {

        mKitchen.setText(result==null?"kong":result.toString());

       *//* pager = result.getData().getHeader().get(0).getList().get(0);

        five = result.getData().getHeader().get(0).getList().get(1);

        bigFive = result.getData().getHeader().get(0).getList().get(2);*//*




    }*/


    public interface Mate_Egg {
        @FormUrlEncoded
        @POST("index.php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid=1479371493849&vc=105&vn=6.1.15&loguid=0&deviceid=haodou864394010208983&uuid=31ba575462df2682b6b0886eb2cd63ce&channel=anzhi_v6115&method=Recipe.getCollectRecomment&virtual=&signmethod=md5&v=3&timestamp=1479371511&nonce=0.775792008688394&appsign=6f6bd7fa37ea9e2a7b3b7c775f45aed1")
        Call<Cate> getEgg(@FieldMap Map<String, String> egg);
    }


    private void getCateDate() {


               Retrofit retrofit = new Retrofit.Builder().
                baseUrl("http://hop.haodou.com/").
                addConverterFactory(GsonConverterFactory.create()).build();

        HaoDouCate hdc = retrofit.create(HaoDouCate.class);


        Call<Cate> call = hdc.getData(GetMap.getMap());

        call.enqueue(new Callback<Cate>() {
            @Override
            public void onResponse(Call<Cate> call, Response<Cate> response) {

                Cate cate = response.body();

                //关于ViewPager的操作

                List<Cate.DataBean.HeaderBean.ListBean> list_pager
                        = cate.getData().getHeader().get(0).getList();

                aboutViewPager(list_pager);

                //关于小圆点的操作
                aboutLittleDots();


                //关于五个自定义Five_iv_Tv的操作

                List<Cate.DataBean.HeaderBean.ListBean> list_five
                        = cate.getData().getHeader().get(1).getList();

                aboutFive_iv_Tv(list_five);


                //关于五个自定义Five_big_Iv_Tv的操作
                List<Cate.DataBean.HeaderBean.ListBean> big_list_five
                        = cate.getData().getHeader().get(2).getList();
                aboutFive_big_iv_Tv(big_list_five);


                //关于HaoDouListView的操作
                List<Cate.DataBean.ListBean> list = cate.getData().getList();


                aboutHaoDouListView(list);


            }

            @Override
            public void onFailure(Call<Cate> call, Throwable t) {

            }


        });


    }

    /**
     * 关于HaoDouListView的操作
     * @param list
     */
    private void aboutHaoDouListView(List<Cate.DataBean.ListBean> list) {

        //默认失去焦点，不然会不显示顶层的ScrollView
        mLv.setFocusable(false);

        //适配器

        ListViewAdapter adapter = new ListViewAdapter(list, getActivity());

        //绑定适配器

        mLv.setAdapter(adapter);


    }

    /**
     * 关于五个自定义Five_big_iv_Tv的操作
     * @param big_list_five
     */
    private void aboutFive_big_iv_Tv(final List<Cate.DataBean.HeaderBean.ListBean> big_list_five) {


        mF1.abc_SetText(big_list_five.get(0).getTitle());
        mF1.abc_SetImg(big_list_five.get(0).getImgs().get(0));
        mF1.abc_SetText_below(big_list_five.get(0).getDesc());

        ClickToWeek(big_list_five,mF1,0);

        mF2.abc_SetText(big_list_five.get(1).getTitle());
        mF2.abc_SetImg(big_list_five.get(1).getImgs().get(0));
        mF2.abc_SetText_below(big_list_five.get(1).getDesc());

        ClickToWeek(big_list_five,mF2,1);

        mF3.abc_SetText(big_list_five.get(2).getTitle());
        mF3.abc_SetImg(big_list_five.get(2).getImgs().get(0));
        mF3.abc_SetText_below(big_list_five.get(2).getDesc());

        ClickToWeek(big_list_five,mF3,2);

        mF4.abc_SetText(big_list_five.get(3).getTitle());
        mF4.abc_SetImg(big_list_five.get(3).getImgs().get(0));
        mF4.abc_SetText_below(big_list_five.get(3).getDesc());

        ClickToWeek(big_list_five,mF4,3);

        mF5.abc_SetText(big_list_five.get(4).getTitle());
        mF5.abc_SetImg(big_list_five.get(4).getImgs().get(0));
        mF5.abc_SetText_below(big_list_five.get(4).getDesc());

        ClickToWeek(big_list_five,mF5,4);

    }

    private void ClickToWeek(final List<Cate.DataBean.HeaderBean.ListBean> big_list_five,Five_big_Iv_Tv mF, final int i) {
        mF.abc_setClick(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), WeekActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("title",big_list_five.get(i).getTitle());

                intent.putExtras(bundle);

                startActivity(intent);

            }
        });
    }

    /**
     * 关于五个自定义Five_iv_Tv的操作
     *
     * @param list_five
     */
    private void aboutFive_iv_Tv(final List<Cate.DataBean.HeaderBean.ListBean> list_five) {

        mPopular.abc_SetText(list_five.get(0).getTitle());
        mPopular.abc_SetImg(list_five.get(0).getImgs().get(0));

        mPopular.abc_setClick(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), HotMenuActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("title",list_five.get(0).getTitle());

                intent.putExtras(bundle);

                startActivity(intent);

            }
        });

        mSee.abc_SetText(list_five.get(1).getTitle());
        mSee.abc_SetImg(list_five.get(1).getImgs().get(0));

        mKitchen.abc_SetText(list_five.get(2).getTitle());
        mKitchen.abc_SetImg(list_five.get(2).getImgs().get(0));
        mKitchen.abc_setClick(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getActivity(),KitchenActivity.class));

            }
        });

        mHot.abc_SetText(list_five.get(3).getTitle());
        mHot.abc_SetImg(list_five.get(3).getImgs().get(0));

        mMenu.abc_SetText(list_five.get(4).getTitle());
        mMenu.abc_SetImg(list_five.get(4).getImgs().get(0));

    }






   /* private void startTask() {
        isTaskRun = true;
        mTimer = new Timer();
        mTask = new TimerTask() {
            @Override
            public void run() {

                mHandler.sendEmptyMessage(0);
            }
        };
        mTimer.schedule(mTask, 5 * 1000, 2 * 1000);// 这里设置自动切换的时间，单位是毫秒，2*1000表示2秒，
    }

    *//**
     * 停止定时任务
     *//*
    private void stopTask() {
        isTaskRun = false;
        mTimer.cancel();
    }


    *//**
     * 重新获得焦点
     *//*
    public void onResume() {
        super.onResume();
        //startTask();
    }

    *//**
     * 失去焦点
     *//*
    @Override
    public void onPause() {
        super.onPause();
       // stopTask();
    }*/


}
