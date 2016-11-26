package com.l000phone.autohomen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;

import com.l000phone.adapter.KitchenAdapter;
import com.l000phone.entity.Cate_Kitchen;
import com.l000phone.face.HaoDouCate_Kitchen;
import com.l000phone.util.GetMap;

import java.util.Collections;
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

public class KitchenActivity extends AppCompatActivity {


    private Spinner mSp;
    private ImageView mImg;
    private ListView mLv;

    private Retrofit retrofit;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_kitchen);

        initViews();



        retrofit = new Retrofit.Builder().
                baseUrl("http://hop.haodou.com/").
                addConverterFactory(GsonConverterFactory.create()).build();


        //关于Spinner的操作

        aboutSpinner();



    }

    /**
     * 关于Spinner的操作
     */
    private void aboutSpinner() {

        //数据源
        List<String> ds = new LinkedList<>();

        Collections.addAll(ds,"全部","食材处理","烹饪技巧","厨房清洁","自制类","烘培类","白案类","其他");

        //适配器

        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.spinner_style,ds);

        //绑定适配器
        mSp.setAdapter(adapter);

        mSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, final int i, long l) {
                HaoDouCate_Kitchen hdc = retrofit.create(HaoDouCate_Kitchen.class);
                Call<Cate_Kitchen> call =null;

                if(i==7){

                 call = hdc.getData(GetMap.getMap_Kitchen("9999"));
                }else {

                  call = hdc.getData(GetMap.getMap_Kitchen(i + ""));
                }

                call.enqueue(new Callback<Cate_Kitchen>() {
                    @Override
                    public void onResponse(Call<Cate_Kitchen> call, Response<Cate_Kitchen> response) {


                        Cate_Kitchen body = response.body();

                        List<Cate_Kitchen.ResultBean.ListBean> list = body.getResult().getList();

                        //关于ListView的操作
                        aboutListView(list,i);


                    }

                    @Override
                    public void onFailure(Call<Cate_Kitchen> call, Throwable t) {

                    }
                });

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    /**
     * 关于ListView的操作
     * @param i
     */
    private void aboutListView(final List<Cate_Kitchen.ResultBean.ListBean> list, int i) {

        //适配器

        KitchenAdapter adapter = new KitchenAdapter(list, this);

        //绑定适配器
        mLv.setAdapter(adapter);

        //监听器
        mLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String url = list.get(i).getUrl();

                Log.i("url",url);

                Intent intent = new Intent(KitchenActivity.this, Web1Activity.class);

                intent.putExtra("url",url);

                startActivity(intent);

            }
        });

    }

    /**
     * 初始化界面控件实例
     */
    private void initViews() {

        mSp  = (Spinner) findViewById(R.id.spinner_id);
        mImg = (ImageView) findViewById(R.id.kit_img);
        mLv  = (ListView) findViewById(R.id.kit_lv);

    }

    public void back (View view){

        finish();

    }




}
