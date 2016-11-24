package com.l000phone.autohomen;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

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

import io.vov.vitamio.MediaPlayer;
import io.vov.vitamio.Vitamio;
import io.vov.vitamio.widget.MediaController;
import io.vov.vitamio.widget.VideoView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class VideoActivity extends AppCompatActivity {


    private ImageView mImg;
    private Button mShare;
    private ImageView mStart;
    private TabLayout mTab;
    private TextView mTv;
    private ViewPager mVp;
    private Button mCollect;
    private VideoView mVv;
    private ImageView mZan;
    private int cnt;

    private Handler handler =new Handler(){


        @Override
        public void handleMessage(Message msg) {

            if( msg.what == 0 ){

                long currentPosition = mVv.getCurrentPosition();

                if(currentPosition / 36 <= 1040){

                    cnt = 1;

                }else if(currentPosition / 36 >=1000 && currentPosition / 55 <= 1000){

                    cnt = 2;

                }else if(currentPosition / 55 >=1000 && currentPosition / 70 <= 1000){

                    cnt = 3;

                }else if(currentPosition / 70 >=1000 && currentPosition / 106 <= 1000){

                    cnt = 4;

                }else if(currentPosition / 106 >=1000 && currentPosition / 118 <= 1000){

                    cnt = 5;

                }else if(currentPosition / 118 >=1000 && currentPosition / 142 <= 1000){

                    cnt = 6;

                }else if(currentPosition / 142 >=1000 && currentPosition / 153 <= 1000){

                    cnt = 7;

                }else if(currentPosition / 153 >=1000 && currentPosition / 176 <= 1000){

                    cnt = 8;

                }else {

                    cnt = 9;

                }

                Log.i("i",cnt+"");

                Log.i("video",currentPosition+"");

                //发送广播，实现视屏和文字互动
                Intent intent = new Intent();

                intent.setAction("pic");
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                intent.putExtra("cnt",cnt);

                instance.sendBroadcast(intent);

                handler.sendEmptyMessageDelayed(0,1000);

            }

            super.handleMessage(msg);
        }
    };
    private LocalBroadcastManager instance;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Vitamio.isInitialized(this);

        setContentView(R.layout.activity_video);

        instance = LocalBroadcastManager.getInstance(this);

        initViews();

        DowmloadData();

        mTab.setupWithViewPager(mVp);

        mStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                aboutVideo();

                int bufferPercentage = mVv.getBufferPercentage();

                Log.i("bufferPercentage",bufferPercentage+"");

                mZan.setVisibility(View.INVISIBLE);

                mTv.setVisibility(View.INVISIBLE);

                mImg.setVisibility(View.INVISIBLE);

                mVp.setCurrentItem(1);

                mStart.setVisibility(View.INVISIBLE);

            }
        });





    }

    /**
     * 初始化Vitamio
     */
    private void aboutVideo() {

        mVv.setVideoURI(Uri.parse("http://v.hoto.cn/28/5d/1006888.mp4"));

        MediaController mediaController = new MediaController(this);

        mediaController.setAnchorView(mVv);

        mediaController.setFileName("厉害了我的哥");

        //控制器显示五秒后自动隐藏
        //mediaController.show(4000);


        mVv.setMediaController(mediaController);

        mVv.setVideoQuality(MediaPlayer.VIDEOQUALITY_HIGH);

        mVv.start();

        mVv.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {

                handler.sendEmptyMessage(0);

                long duration = mVv.getDuration();

                Log.i("duration",duration+"");

            }
        });

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
        mShare = (Button) findViewById(R.id.video_share);
        mImg = (ImageView) findViewById(R.id.video_img);
        mStart = (ImageView) findViewById(R.id.video_start);
        mTab = (TabLayout) findViewById(R.id.video_tab);
        mVv = (VideoView) findViewById(R.id.video_video);
        mTv = (TextView) findViewById(R.id.video_tv_zan);
        mZan = (ImageView) findViewById(R.id.zan_id);
        mVp = (ViewPager) findViewById(R.id.video_vp);
        mCollect = (Button) findViewById(R.id.video_collect);

    }

    public  void back (View view){

        finish();
    }
}
