package com.l000phone.autohomen;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import com.l000phone.adapter.ViewPagerAdapter2;
import com.l000phone.entity.Cate_Video;
import com.l000phone.face.HaoDouCate_Video;
import com.l000phone.fragment.Video_Particulars;
import com.l000phone.fragment.Video_comment;
import com.l000phone.fragment.Video_step;
import com.l000phone.util.GetMap;
import com.squareup.picasso.Picasso;

import java.util.LinkedList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class VideoActivity extends AppCompatActivity {

    private Button mBack;
    private ImageView mImg;
    private Button mShare;
    private ImageView mStart;
    private TabLayout mTab;
    private VideoView mVideo;
    private TextView mTv;
    private ViewPager mVp;
    private Button mCollect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_video);

        initViews();

        DowmloadData();

        mTab.setupWithViewPager(mVp);

    }

    /**
     * 下载数据
     */
    private void DowmloadData() {

        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("http://hop.haodou.com/").
                addConverterFactory(GsonConverterFactory.create()).build();

        HaoDouCate_Video hdc = retrofit.create(HaoDouCate_Video.class);

        Call<Cate_Video> call = hdc.getData(GetMap.getMap_Video());

        call.enqueue(new Callback<Cate_Video>() {
            @Override
            public void onResponse(Call<Cate_Video> call, Response<Cate_Video> response) {

                Cate_Video body = response.body();

                Cate_Video.ResultBean.InfoBean info = body.getResult().getInfo();

                Picasso.with(VideoActivity.this).load(info.getCover()).
                        placeholder(R.drawable.splish_logo).into(mImg);

                aboutViewPager(info);


            }

            @Override
            public void onFailure(Call<Cate_Video> call, Throwable t) {

            }
        });


    }

    /**
     * 初始化ViewPager
     *
     * @param info
     */
    private void aboutViewPager(Cate_Video.ResultBean.InfoBean info) {


        List<Fragment> ds = new LinkedList<>();

        Video_Particulars vp = new Video_Particulars();

        Bundle arg = new Bundle();

        arg.putSerializable("info", info);

        vp.setArguments(arg);

        Video_step vs = new Video_step();

        vs.setArguments(arg);

        ds.add(vp);

        ds.add(vs);

        ds.add(new Video_comment());

        String[] array = getResources().getStringArray(R.array.tabName2);

        //适配器

    ViewPagerAdapter2 adapter =
            new ViewPagerAdapter2(getSupportFragmentManager(), ds,array);

    //绑定适配器
    mVp.setAdapter(adapter);

}


    /**
     * 初始化实例
     */
    private void initViews() {
        mImg = (ImageView) findViewById(R.id.video_img);
        mShare = (Button) findViewById(R.id.video_share);
        mStart = (ImageView) findViewById(R.id.video_start);
        mTab = (TabLayout) findViewById(R.id.video_tab);
        mVideo = (VideoView) findViewById(R.id.video_video);
        mTv = (TextView) findViewById(R.id.video_tv_zan);
        mVp = (ViewPager) findViewById(R.id.video_vp);
        mCollect = (Button) findViewById(R.id.video_collect);

    }

    public  void back (View view){

        finish();
    }
}
