package com.l000phone.autohomen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.l000phone.entity.Cate_HotIfi;
import com.l000phone.face.HaoDouCate_HotIfi;
import com.l000phone.util.GetMap;

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

public class HotIfiActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_hot_ifi);

        final GridView mGv = (GridView) findViewById(R.id.hotifi_gv);

        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("http://hop.haodou.com/").
                addConverterFactory(GsonConverterFactory.create()).build();


        HaoDouCate_HotIfi hdc = retrofit.create(HaoDouCate_HotIfi.class);

        Call<Cate_HotIfi> call =
                hdc.getData(GetMap.getMap_HotIfi());

        call.enqueue(new Callback<Cate_HotIfi>() {
            @Override
            public void onResponse(Call<Cate_HotIfi> call, Response<Cate_HotIfi> response) {

                final List<Cate_HotIfi.ResultBean.ListBean> list =
                        response.body().getResult().getList();

                final List<String> ds = new LinkedList<>();

                for(int i=0;i<list.size();i++){

                    ds.add(list.get(i).getCateName());

                }

                ArrayAdapter<String> adapter =new ArrayAdapter<>
                        (HotIfiActivity.this,android.R.layout.simple_list_item_1,ds);

                mGv.setAdapter(adapter);

                mGv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                        Intent inten = new Intent(HotIfiActivity.this,VideoRvActivity.class);

                        inten.putExtra("title",ds.get(i));
                        inten.putExtra("id",list.get(i).getCateId());

                        startActivity(inten);

                    }
                });






            }

            @Override
            public void onFailure(Call<Cate_HotIfi> call, Throwable t) {

            }
        });


    }



}
