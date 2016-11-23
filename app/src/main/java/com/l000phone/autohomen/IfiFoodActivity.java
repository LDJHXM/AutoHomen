package com.l000phone.autohomen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.l000phone.adapter.IfiFoodAdapter;
import com.l000phone.entity.Cate_Ifi_Food;
import com.l000phone.face.HaoDouCate_Ifi_Food;
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

public class IfiFoodActivity extends AppCompatActivity {


    private ListView mLv;
    private Retrofit retrofit;




    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ifi_food);

        mLv = (ListView) findViewById(R.id.event_lv);

        TextView mTv = (TextView) findViewById(R.id.ifi_food_tv);

        Bundle bundle = getIntent().getExtras();

        String title = bundle.getString("title");

        mTv.setText(title);


        retrofit = new Retrofit.Builder().
                baseUrl("http://hop.haodou.com/").
                addConverterFactory(GsonConverterFactory.create()).build();


        HaoDouCate_Ifi_Food hdc = retrofit.create(HaoDouCate_Ifi_Food.class);

        Call<Cate_Ifi_Food> call =
                hdc.getData(GetMap.getMap_Ifi_Food());


        call.enqueue(new Callback<Cate_Ifi_Food>() {
            @Override
            public void onResponse(Call<Cate_Ifi_Food> call, Response<Cate_Ifi_Food> response) {

                Cate_Ifi_Food body = response.body();


                List<Cate_Ifi_Food.ResultBean.ListBean> list = body.getResult().getList();


                aboutListView(list);


            }

            @Override
            public void onFailure(Call<Cate_Ifi_Food> call, Throwable t) {

            }
        });


    }


    /**
     * 关于ListView的操作
     *
     * @param list
     */
    private void aboutListView(List<Cate_Ifi_Food.ResultBean.ListBean> list) {

        //适配器
        IfiFoodAdapter adapter = new IfiFoodAdapter(list, this);

        //绑定适配器
        mLv.setAdapter(adapter);

        //监听器
        mLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(IfiFoodActivity.this, "你点击了" + i, Toast.LENGTH_SHORT).show();

            }
        });

    }


    public void back(View view) {

        finish();

    }


}
