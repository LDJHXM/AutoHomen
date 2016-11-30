package com.l000phone.autohomen;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.l000phone.adapter.ViewPagerAdapter2;
import com.l000phone.entity.Cate_Video;
import com.l000phone.face.HaoDouCate_Video;
import com.l000phone.fragment.AnimationVp2;
import com.l000phone.fragment.Video_Particulars;
import com.l000phone.fragment.Video_comment;
import com.l000phone.fragment.Video_step;
import com.l000phone.util.GetMap;
import com.l000phone.util.NetWorkUtils;
import com.squareup.picasso.Picasso;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
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
    private UMShareListener umShareListener1 = new UMShareListener() {
        @Override
        public void onResult(SHARE_MEDIA share_media) {

            Toast.makeText(VideoActivity.this, "分享成功", Toast.LENGTH_LONG).show();

        }

        @Override
        public void onError(SHARE_MEDIA share_media, Throwable throwable) {
            Toast.makeText(VideoActivity.this, "分享失败", Toast.LENGTH_LONG).show();
        }

        @Override
        public void onCancel(SHARE_MEDIA share_media) {

            Toast.makeText(VideoActivity.this, "分享取消", Toast.LENGTH_LONG).show();


        }
    };

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
    private TextView picMode;
    private FrameLayout vido_rl;


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

                boolean b = NetWorkUtils.isWifiConnected(VideoActivity.this);

                if(b==true) {

                    AlertDialog.Builder builder = new AlertDialog.Builder(VideoActivity.this);

                    builder.setIcon(R.drawable.icon).setTitle("当前不是WIFI网络，确定要观看视频么?").setNegativeButton("取消", null).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            aboutVideo();

                            int bufferPercentage = mVv.getBufferPercentage();

                            Log.i("bufferPercentage", bufferPercentage + "");

                            mZan.setVisibility(View.INVISIBLE);

                            mTv.setVisibility(View.INVISIBLE);

                            mImg.setVisibility(View.INVISIBLE);

                            mVp.setCurrentItem(1);

                            mStart.setVisibility(View.INVISIBLE);

                        }
                    }).show();
                }else{
                    aboutVideo();

                    mZan.setVisibility(View.INVISIBLE);

                    mTv.setVisibility(View.INVISIBLE);

                    mImg.setVisibility(View.INVISIBLE);

                    mVp.setCurrentItem(1);

                    mStart.setVisibility(View.INVISIBLE);


                }



            }
        });





    }

    /**
     * 初始化Vitamio
     */
    private void aboutVideo() {

        mVv.setVideoURI(Uri.parse("http://v.hoto.cn/28/5d/1006888.mp4"));

        MediaController mediaController = new MediaController(this,true,vido_rl);

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

                final Cate_Video.ResultBean.InfoBean info = body.getResult().getInfo();

                Picasso.with(VideoActivity.this).load(info.getCover()).
                        placeholder(R.drawable.splish_logo).into(mImg);

                aboutViewPager(info);

                picMode.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent  = new Intent(VideoActivity.this,PhotoActivity.class);


                      /*  Bundle bundle = new Bundle();

                        bundle.putParcelable("info",info);

                        intent.putExtras(bundle);*/

                        startActivity(intent);
                    }
                });


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

        mVp.setPageTransformer(true,new AnimationVp2());


    }


    /**
     * 初始化实例
     */
    private void initViews() {
        mImg = (ImageView) findViewById(R.id.video_img);
        mStart = (ImageView) findViewById(R.id.video_start);
        mTab = (TabLayout) findViewById(R.id.video_tab);
        mVv = (VideoView) findViewById(R.id.video_video);
        mTv = (TextView) findViewById(R.id.video_tv_zan);
        mZan = (ImageView) findViewById(R.id.zan_id);
        mVp = (ViewPager) findViewById(R.id.video_vp);
        picMode = (TextView) findViewById(R.id.picMode);
        vido_rl = (FrameLayout) findViewById(R.id.vido_rl);

    }

    public  void back (View view){

        finish();
    }



    public void share (View view){


        final ShareAction actionsina = new ShareAction(this);
        actionsina.withTitle("给你看一条菜谱视频");
        actionsina.withText("牛肉焖锅");
        actionsina.withTargetUrl("http://v.hoto.cn/28/5d/1006888.mp4");

        View view1 = LayoutInflater.from(this).inflate(R.layout.dialog_share, null);


        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setView(view1);

        TextView weixin_circle = (TextView) view1.findViewById(R.id.weixin_circle);
        TextView weixin_friend = (TextView) view1.findViewById(R.id.weixin_friend);
        TextView sina = (TextView) view1.findViewById(R.id.sina);
        TextView qq = (TextView) view1.findViewById(R.id.qq);
        TextView qzone = (TextView) view1.findViewById(R.id.qzone);

        weixin_circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionsina.setPlatform(SHARE_MEDIA.WEIXIN_CIRCLE).setCallback(umShareListener1).share();

            }
        });
        weixin_friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionsina.setPlatform(SHARE_MEDIA.WEIXIN).setCallback(umShareListener1).share();

            }
        });
        sina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionsina.setPlatform(SHARE_MEDIA.SINA).setCallback(umShareListener1).share();

            }
        });
        qq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionsina.setPlatform(SHARE_MEDIA.QQ).setCallback(umShareListener1).share();

            }
        });
        qzone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionsina.setPlatform(SHARE_MEDIA.QZONE).setCallback(umShareListener1).share();

            }
        });

        builder.show();
    }


}
