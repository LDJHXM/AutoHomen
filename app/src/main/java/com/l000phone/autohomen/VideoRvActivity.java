package com.l000phone.autohomen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.l000phone.adapter.VideoRvAdapter;
import com.l000phone.entity.Cate_Video_Info;
import com.l000phone.face.HaoDouCate_VideoInfo;
import com.l000phone.util.GetMap;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2016/11/17.
 */

public class VideoRvActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_hotvideo_rv);

        Intent intent = getIntent();

        String title = intent.getStringExtra("title");
        String id = intent.getStringExtra("id");

        final RecyclerView mRv = (RecyclerView) findViewById(R.id.video_rv);

        TextView mTv = (TextView) findViewById(R.id.video_title);

        mTv.setText(title);



        mRv.setLayoutManager(new GridLayoutManager(this,2));

        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("http://hop.haodou.com/").
                addConverterFactory(GsonConverterFactory.create()).build();


        HaoDouCate_VideoInfo hdc = retrofit.create(HaoDouCate_VideoInfo.class);

        Call<Cate_Video_Info> call =
                hdc.getData(GetMap.getMap_VideoInfo(id));

        call.enqueue(new Callback<Cate_Video_Info>() {
            @Override
            public void onResponse(Call<Cate_Video_Info> call, Response<Cate_Video_Info> response) {

                List<Cate_Video_Info.ResultBean.ListBean> list = response.body().getResult().getList();


                VideoRvAdapter adapter = new VideoRvAdapter(list, VideoRvActivity.this);

                mRv.setAdapter(adapter);

                adapter.setOnItemClickListener(new VideoRvAdapter.MyItemClickListener() {
                    @Override
                    public void onItemClick(View view, String url3) {

                        Log.i("url3",url3);

                        Intent intent = new Intent(VideoRvActivity.this, Web1Activity.class);

                        intent.putExtra("url",url3);

                        startActivity(intent);
                    }
                });


            }

            @Override
            public void onFailure(Call<Cate_Video_Info> call, Throwable t) {

                Toast.makeText(VideoRvActivity.this, "网络繁忙，请重试", Toast.LENGTH_SHORT).show();
            }
        });



    }



}
