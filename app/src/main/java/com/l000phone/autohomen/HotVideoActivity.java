package com.l000phone.autohomen;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.l000phone.entity.Cate_Hot_Video;
import com.l000phone.face.HaoDouCate_Hot_Video;
import com.l000phone.util.GetMap;
import com.squareup.picasso.Picasso;

import org.xutils.view.annotation.ViewInject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2016/11/17.
 */

public class HotVideoActivity extends AppCompatActivity {
    @ViewInject(R.id.hotvideo_vp)
    ViewPager hotvideo_vp;
    @ViewInject(R.id.hot_img1)
    ImageView hot_img1;
    @ViewInject(R.id.hot_img1_tv)
    TextView hot_img1_tv;
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
    TextView biginner_context;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_hot_video);

        getDate();


    }

    public void back(View view) {

        finish();
    }


    public void findVideo(View view) {

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
                Cate_Hot_Video.ResultBean.HotrankBean.InfoBean info1 = result.getHotrank().get(1).getInfo();
                Cate_Hot_Video.ResultBean.HotrankBean.InfoBean info2 = result.getHotrank().get(2).getInfo();
                Cate_Hot_Video.ResultBean.NoviceBean.InfoBeanX novice = result.getNovice().get(0).getInfo();
                Cate_Hot_Video.ResultBean.RecipeBean.InfoBeanXX recipe = result.getRecipe().get(0).getInfo();
                Cate_Hot_Video.ResultBean.FunlifeBean.InfoBeanXXX funlife = result.getFunlife().get(0).getInfo();


                Picasso.with(HotVideoActivity.this).load(info.getCover()).
                        placeholder(R.drawable.default_daily_first_goods).into(hot_img1);
                hot_img1_tv.setText(info.getPlayCount());

                Picasso.with(HotVideoActivity.this).load(info.getUserInfo().getAvatar()).
                        placeholder(R.drawable.default_daily_first_goods).into(hot_namePic_1);

                hot_name_1.setText(info.getUserInfo().getUserName());

                title1.setText(info.getTitle());

                context1.setText(info.getIntro());

                time.setText(info.getCreateTime());

                zan1.setText(info.getDiggCount());

                comment1.setText(info.getCommentCount());

                Picasso.with(HotVideoActivity.this).load(info1.getCover()).
                        placeholder(R.drawable.default_daily_first_goods).into(hot_img2);
                hot_img2_tv.setText(info1.getPlayCount());
                tv2.setText(info1.getTitle());


                Picasso.with(HotVideoActivity.this).load(info2.getCover()).
                        placeholder(R.drawable.default_daily_first_goods).into(hot_img3);
                hot_img3_tv.setText(info2.getPlayCount());
                tv3.setText(info2.getTitle());



                Picasso.with(HotVideoActivity.this).load(novice.getCover()).
                        placeholder(R.drawable.default_daily_first_goods).into(biginner);
                biginner_img_tv.setText(novice.getPlayCount());

                Picasso.with(HotVideoActivity.this).load(novice.getUserInfo().getAvatar()).
                        placeholder(R.drawable.default_daily_first_goods).into(biginner_namePic);

                biginner_name.setText(novice.getUserInfo().getUserName());

                biginner_title.setText(novice.getTitle());

                biginner_context.setText(novice.getIntro());

                biginner_time.setText(novice.getCreateTime());

                biginner_zan.setText(novice.getDiggCount());

                biginner_comment.setText(novice.getCommentCount());





                Picasso.with(HotVideoActivity.this).load(recipe.getCover()).
                        placeholder(R.drawable.default_daily_first_goods).into(videomenu);
                videomenu_img_tv.setText(recipe.getPlayCount());

                Picasso.with(HotVideoActivity.this).load(recipe.getUserInfo().getAvatar()).
                        placeholder(R.drawable.default_daily_first_goods).into(videomenu_namePic);

                videomenu_name.setText(recipe.getUserInfo().getUserName());

                videomenu_title.setText(recipe.getTitle());

                videomenu_context.setText(recipe.getIntro());

                videomenu_time.setText(recipe.getCreateTime());

                videomenu_zan.setText(recipe.getDiggCount());

                videomenu_comment.setText(recipe.getCommentCount());




                Picasso.with(HotVideoActivity.this).load(funlife.getCover()).
                        placeholder(R.drawable.default_daily_first_goods).into(spice);
                spice_img_tv.setText(funlife.getPlayCount());

                Picasso.with(HotVideoActivity.this).load(funlife.getUserInfo().getAvatar()).
                        placeholder(R.drawable.default_daily_first_goods).into(spice_namePic);

                spice_name.setText(funlife.getUserInfo().getUserName());

                spice_title.setText(funlife.getTitle());

                spice_context.setText(funlife.getIntro());

                spice_time.setText(funlife.getCreateTime());

                spice_zan.setText(funlife.getDiggCount());

                spice_comment.setText(funlife.getCommentCount());


            }

            @Override
            public void onFailure(Call<Cate_Hot_Video> call, Throwable t) {

                Toast.makeText(HotVideoActivity.this, "网络异常，请重试", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
