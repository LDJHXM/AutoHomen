package com.l000phone.autohomen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.l000phone.adapter.ViewPagerAdapter3;
import com.l000phone.entity.Cate_Hot_Video;
import com.l000phone.face.HaoDouCate_Hot_Video;
import com.l000phone.fragment.ViewPager_Fragment;
import com.l000phone.util.GetMap;
import com.squareup.picasso.Picasso;

import org.xutils.x;

import java.util.LinkedList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2016/11/17.
 */

public class HotVideoActivity extends AppCompatActivity {
 /*   @ViewInject(R.id.hotvideo_vp)
    ViewPager hotvideo_vp;*/
   /* @ViewInject(R.id.hot_img1)
    ImageView hot_img1;*/
    /*@ViewInject(R.id.hot_img1_tv)
    private TextView hot_img1_tv;
    @ViewInject(R.id.hot_namePic_1)
    ImageView hot_namePic_1;
    @ViewInject(R.id.hot_name_1)
    TextView hot_name_1;
    @ViewInject(R.id.title1)
    TextView title1;
    @ViewInject(R.id.context1)
    TextView context1;
    @ViewInject(R.id.zan1)
    TextView zan1;
    @ViewInject(R.id.comment1)
    TextView comment1;
    @ViewInject(R.id.hot_img2)
    ImageView hot_img2;
    @ViewInject(R.id.hot_img2_tv)
    TextView hot_img2_tv;
    @ViewInject(R.id.tv2)
    TextView tv2;
    @ViewInject(R.id.hot_img3)
    ImageView hot_img3;
    @ViewInject(R.id.hot_img3_tv)
    TextView hot_img3_tv;
    @ViewInject(R.id.tv3)
    TextView tv3;
    @ViewInject(R.id.biginner)
    ImageView biginner;
    @ViewInject(R.id.biginner_img_tv)
    TextView biginner_img_tv;
    @ViewInject(R.id.biginner_namePic)
    ImageView biginner_namePic;
    @ViewInject(R.id.biginner_name)
    TextView biginner_name;
    @ViewInject(R.id.biginner_zan)
    TextView biginner_zan;
    @ViewInject(R.id.biginner_comment)
    TextView biginner_comment;
    @ViewInject(R.id.videomenu)
    ImageView videomenu;
    @ViewInject(R.id.videomenu_img_tv)
    TextView videomenu_img_tv;
    @ViewInject(R.id.videomenu_namePic)
    ImageView videomenu_namePic;
    @ViewInject(R.id.videomenu_name)
    TextView videomenu_name;
    @ViewInject(R.id.videomenu_title)
    TextView videomenu_title;
    @ViewInject(R.id.videomenu_context)
    TextView videomenu_context;
    @ViewInject(R.id.videomenu_zan)
    TextView videomenu_zan;
    @ViewInject(R.id.videomenu_comment)
    TextView videomenu_comment;
    @ViewInject(R.id.spice)
    ImageView spice;
    @ViewInject(R.id.spice_img_tv)
    TextView spice_img_tv;
    @ViewInject(R.id.spice_namePic)
    ImageView spice_namePic;
    @ViewInject(R.id.spice_name)
    TextView spice_name;
    @ViewInject(R.id.spice_title)
    TextView spice_title;
    @ViewInject(R.id.spice_context)
    TextView spice_context;
    @ViewInject(R.id.spice_zan)
    TextView spice_zan;
    @ViewInject(R.id.spice_comment)
    TextView spice_comment;
    @ViewInject(R.id.time)
    TextView time;
    @ViewInject(R.id.biginner_time)
    TextView biginner_time;
    @ViewInject(R.id.spice_time)
    TextView spice_time;
    @ViewInject(R.id.videomenu_time)
    TextView videomenu_time;
    @ViewInject(R.id.biginner_title)
    TextView biginner_title;
    @ViewInject(R.id.biginner_context)
    TextView biginner_context;*/
    private ImageView hot_img1;
    private TextView hot_img1_tv;
    private ImageView hot_namePic_1;
    private TextView hot_name_1;
    private TextView title1;
    private TextView context1;
    private TextView zan1;
    private TextView comment1;
    private ImageView hot_img2;
    private TextView hot_img2_tv;
    private TextView tv2;
    private ImageView hot_img3;
    private TextView hot_img3_tv;
    private TextView tv3;
    private ImageView biginner;
    private TextView biginner_img_tv;
    private ImageView biginner_namePic;
    private TextView biginner_name;
    private TextView biginner_zan;
    private TextView biginner_comment;
    private ImageView videomenu;
    private TextView videomenu_img_tv;
    private ImageView videomenu_namePic;
    private TextView videomenu_name;
    private TextView videomenu_title;
    private TextView videomenu_context;
    private TextView videomenu_zan;
    private TextView videomenu_comment;
    private ImageView spice;
    private TextView spice_img_tv;
    private ImageView spice_namePic;
    private TextView spice_name;
    private TextView spice_title;
    private TextView spice_context;
    private TextView spice_zan;
    private TextView spice_comment;
    private TextView time;
    private TextView biginner_time;
    private TextView spice_time;
    private TextView videomenu_time;
    private TextView biginner_title;
    private TextView biginner_context;
    private ViewPager hotvideo_vp;
    private LinkedList<ViewPager_Fragment> pagers;
    private ViewPager mVp;
    private LinearLayout llContainer;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_hot_video);
        x.view().inject(this);

        initViews();

        getDate();



    }

    /**
     * 初始化实例
     */
    private void initViews() {

        hot_img1 = (ImageView) findViewById(R.id.hot_img1);
        llContainer = (LinearLayout) findViewById(R.id.ll_container_id);
        mVp = (ViewPager) findViewById(R.id.vp_id);
        hot_img1_tv = (TextView) findViewById(R.id.hot_img1_tv);
        hot_namePic_1 = (ImageView) findViewById(R.id.hot_namePic_1);
        hot_name_1 = (TextView) findViewById(R.id.hot_name_1);
        title1 = (TextView) findViewById(R.id.title1);
        context1 = (TextView) findViewById(R.id.context1);
        zan1 = (TextView) findViewById(R.id.zan1);
        comment1 = (TextView) findViewById(R.id.comment1);
        hot_img2 = (ImageView) findViewById(R.id.hot_img2);
        hot_img2_tv = (TextView) findViewById(R.id.hot_img2_tv);
        tv2 = (TextView) findViewById(R.id.tv2);
        hot_img3 = (ImageView) findViewById(R.id.hot_img3);
        hot_img3_tv = (TextView) findViewById(R.id.hot_img3_tv);
        tv3 = (TextView) findViewById(R.id.tv3);
        biginner = (ImageView) findViewById(R.id.biginner);
        biginner_img_tv = (TextView) findViewById(R.id.biginner_img_tv);
        biginner_namePic = (ImageView) findViewById(R.id.biginner_namePic);
        biginner_name = (TextView) findViewById(R.id.biginner_name);
        biginner_zan = (TextView) findViewById(R.id.biginner_zan);
        biginner_comment = (TextView) findViewById(R.id.biginner_comment);
        videomenu = (ImageView) findViewById(R.id.videomenu);
        videomenu_img_tv = (TextView) findViewById(R.id.videomenu_img_tv);
        videomenu_namePic = (ImageView) findViewById(R.id.videomenu_namePic);
        videomenu_name = (TextView) findViewById(R.id.videomenu_name);
        videomenu_title = (TextView) findViewById(R.id.videomenu_title);
        videomenu_context = (TextView) findViewById(R.id.videomenu_context);
        videomenu_zan = (TextView) findViewById(R.id.videomenu_zan);
        videomenu_comment = (TextView) findViewById(R.id.videomenu_comment);
        spice = (ImageView) findViewById(R.id.spice);
        spice_img_tv = (TextView) findViewById(R.id.spice_img_tv);
        spice_namePic = (ImageView) findViewById(R.id.spice_namePic);
        spice_name = (TextView) findViewById(R.id.spice_name);
        spice_title = (TextView) findViewById(R.id.spice_title);
        spice_context = (TextView) findViewById(R.id.spice_context);
        spice_zan = (TextView) findViewById(R.id.spice_zan);
        spice_comment = (TextView) findViewById(R.id.spice_comment);
        time = (TextView) findViewById(R.id.time);
        biginner_time = (TextView) findViewById(R.id.biginner_time);
        spice_time = (TextView) findViewById(R.id.spice_time);
        videomenu_time = (TextView) findViewById(R.id.videomenu_time);
        biginner_title = (TextView) findViewById(R.id.biginner_title);
        biginner_context = (TextView) findViewById(R.id.biginner_context);

    }

    public void back(View view) {

        finish();
    }


    public void findVideo(View view) {


        startActivity(new Intent(this,HotIfiActivity.class));

    }

    /**
     * 下载数据
     *
     * @return
     */
    public void getDate() {

        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("http://hop.haodou.com/").
                addConverterFactory(GsonConverterFactory.create()).build();


        HaoDouCate_Hot_Video hdchv =retrofit.create(HaoDouCate_Hot_Video.class);

        Call<Cate_Hot_Video> call =
                hdchv.getData(GetMap.getMap_Hot_Video());

        call.enqueue(new Callback<Cate_Hot_Video>() {
            @Override
            public void onResponse(Call<Cate_Hot_Video> call, Response<Cate_Hot_Video> response) {

                Cate_Hot_Video.ResultBean result = response.body().getResult();
                Cate_Hot_Video.ResultBean.HotrankBean.InfoBean info = result.getHotrank().get(0).getInfo();

                Log.i("info",info.getTitle());
                Cate_Hot_Video.ResultBean.HotrankBean.InfoBean info1 = result.getHotrank().get(1).getInfo();
                Cate_Hot_Video.ResultBean.HotrankBean.InfoBean info2 = result.getHotrank().get(2).getInfo();
                Cate_Hot_Video.ResultBean.NoviceBean.InfoBeanX novice = result.getNovice().get(0).getInfo();
                Cate_Hot_Video.ResultBean.RecipeBean.InfoBeanXX recipe = result.getRecipe().get(0).getInfo();
                Cate_Hot_Video.ResultBean.FunlifeBean.InfoBeanXXX funlife = result.getFunlife().get(0).getInfo();
                List<Cate_Hot_Video.ResultBean.AdBean> ad = result.getAd();

                aboutViewPager(ad);
                aboutLittleDots();
                Picasso.with(HotVideoActivity.this).load(info.getCover()).
                        placeholder(R.drawable.default_daily_first_goods).into(hot_img1);
                hot_img1_tv.setText(info.getPlayCount()+"");

                Picasso.with(HotVideoActivity.this).load(info.getUserInfo().getAvatar()).
                        placeholder(R.drawable.default_daily_first_goods).into(hot_namePic_1);

                hot_name_1.setText(info.getUserInfo().getUserName());

                title1.setText(info.getTitle());

                context1.setText(info.getIntro());

                time.setText(info.getCreateTime());

                zan1.setText(info.getDiggCount()+"");

                comment1.setText(info.getCommentCount()+"");

                Picasso.with(HotVideoActivity.this).load(info1.getCover()).
                        placeholder(R.drawable.default_daily_first_goods).into(hot_img2);
                hot_img2_tv.setText(info1.getPlayCount()+"");
                tv2.setText(info1.getTitle());


                Picasso.with(HotVideoActivity.this).load(info2.getCover()).
                        placeholder(R.drawable.default_daily_first_goods).into(hot_img3);
                hot_img3_tv.setText(info2.getPlayCount()+"");
                tv3.setText(info2.getTitle());



                Picasso.with(HotVideoActivity.this).load(novice.getCover()).
                        placeholder(R.drawable.default_daily_first_goods).into(biginner);
                biginner_img_tv.setText(novice.getPlayCount()+"");

                Picasso.with(HotVideoActivity.this).load(novice.getUserInfo().getAvatar()).
                        placeholder(R.drawable.default_daily_first_goods).into(biginner_namePic);

                biginner_name.setText(novice.getUserInfo().getUserName());

                biginner_title.setText(novice.getTitle());

                biginner_context.setText(novice.getIntro());

                biginner_time.setText(novice.getCreateTime());

                biginner_zan.setText(novice.getDiggCount()+"");

                biginner_comment.setText(novice.getCommentCount()+"");





                Picasso.with(HotVideoActivity.this).load(recipe.getCover()).
                        placeholder(R.drawable.default_daily_first_goods).into(videomenu);
                videomenu_img_tv.setText(recipe.getPlayCount()+"");

                Picasso.with(HotVideoActivity.this).load(recipe.getUserInfo().getAvatar()).
                        placeholder(R.drawable.default_daily_first_goods).into(videomenu_namePic);

                videomenu_name.setText(recipe.getUserInfo().getUserName());

                videomenu_title.setText(recipe.getTitle());

                videomenu_context.setText(recipe.getIntro());

                videomenu_time.setText(recipe.getCreateTime());

                videomenu_zan.setText(recipe.getDiggCount()+"");

                videomenu_comment.setText(recipe.getCommentCount()+"");




                Picasso.with(HotVideoActivity.this).load(funlife.getCover()).
                        placeholder(R.drawable.default_daily_first_goods).into(spice);
                spice_img_tv.setText(funlife.getPlayCount()+"");

                Picasso.with(HotVideoActivity.this).load(funlife.getUserInfo().getAvatar()).
                        placeholder(R.drawable.default_daily_first_goods).into(spice_namePic);

                spice_name.setText(funlife.getUserInfo().getUserName());

                spice_title.setText(funlife.getTitle());

                spice_context.setText(funlife.getIntro());

                spice_time.setText(funlife.getCreateTime());

                spice_zan.setText(funlife.getDiggCount()+"");

                spice_comment.setText(funlife.getCommentCount()+"");


            }

            @Override
            public void onFailure(Call<Cate_Hot_Video> call, Throwable t) {

                Toast.makeText(HotVideoActivity.this, "网络异常，请重试", Toast.LENGTH_SHORT).show();

            }
        });


    }

    private void aboutViewPager(List<Cate_Hot_Video.ResultBean.AdBean> ad) {

        //数据源

        pagers = new LinkedList<>();

        for (int i = 0; i < ad.size(); i++) {

            ViewPager_Fragment vf = new ViewPager_Fragment();

            Bundle arg = new Bundle();

            arg.putString("title", ad.get(i).getTitle());

            Log.i("title", ad.get(i).getTitle());

            arg.putString("imgs", ad.get(i).getImgUrl());

            arg.putString("url", ad.get(i).getUrl());

            vf.setArguments(arg);

            pagers.add(vf);

        }

        //适配器

        ViewPagerAdapter3 adapter =
                new ViewPagerAdapter3(getSupportFragmentManager(),pagers);

        //绑定适配器
        mVp.setAdapter(adapter);


        // 给ViewPger添加监听器，决定小圆点的状态
        mVp.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {


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

                super.onPageScrollStateChanged(state);
            }
        });

    }

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

            ImageView iv = new ImageView(this);

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




}
