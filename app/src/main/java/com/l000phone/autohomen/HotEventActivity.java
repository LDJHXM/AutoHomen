package com.l000phone.autohomen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.l000phone.adapter.HotEventAdapter;
import com.l000phone.entity.Cate_HotEvent;
import com.l000phone.face.HaoDouCate_HotEvent;
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

public class HotEventActivity extends AppCompatActivity {


    private ListView mLv;
    private Retrofit retrofit;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_hotevent);

        mLv = (ListView) findViewById(R.id.event_lv);


        retrofit = new Retrofit.Builder().
                baseUrl("http://hop.haodou.com/").
                addConverterFactory(GsonConverterFactory.create()).build();


        HaoDouCate_HotEvent hdc = retrofit.create(HaoDouCate_HotEvent.class);

        Call<Cate_HotEvent> call =
                hdc.getData(GetMap.getMap_HotEvent());


        call.enqueue(new Callback<Cate_HotEvent>() {
            @Override
            public void onResponse(Call<Cate_HotEvent> call, Response<Cate_HotEvent> response) {

                Cate_HotEvent body = response.body();

                List<Cate_HotEvent.ResultBean.ListBean> list = body.getResult().getList();

                aboutListView(list);


            }

            @Override
            public void onFailure(Call<Cate_HotEvent> call, Throwable t) {

            }
        });


    }


    /**
     * 关于ListView的操作
     *
     * @param list
     */
    private void aboutListView(List<Cate_HotEvent.ResultBean.ListBean> list) {

        //适配器

        HotEventAdapter adapter = new HotEventAdapter(list, this);

        //绑定适配器
        mLv.setAdapter(adapter);

        //监听器
        mLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                Toast.makeText(HotEventActivity.this, "你点击了" + i, Toast.LENGTH_SHORT).show();

            }
        });

    }


    public void back(View view) {

        finish();

    }


}
