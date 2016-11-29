package com.l000phone.autohomen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import com.l000phone.adapter.IfiListAdapter;
import com.l000phone.adapter.IfigridAdapter;
import com.l000phone.entity.Cate_Ifi;
import com.l000phone.face.HaoDouCate_Ifi;
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

public class MenuClassification extends AppCompatActivity {


    private ListView mLv;
    private GridView mGv;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.classification);

        mLv = (ListView) findViewById(R.id.ifi_lv);
        mGv = (GridView) findViewById(R.id.ifi_gv);

       Retrofit retrofit = new Retrofit.Builder().
                baseUrl("http://hop.haodou.com/").
                addConverterFactory(GsonConverterFactory.create()).build();


        HaoDouCate_Ifi hdc = retrofit.create(HaoDouCate_Ifi.class);

        Call<Cate_Ifi> call = hdc.getData(GetMap.getMap_Ifi());

        call.enqueue(new Callback<Cate_Ifi>() {
            @Override
            public void onResponse(Call<Cate_Ifi> call, Response<Cate_Ifi> response) {

                Cate_Ifi body = response.body();

                List<Cate_Ifi.ResultBean.ListBean> list = body.getResult().getList();

                //关于ListView的操作

                aboutList(list);

                aboutGridView(list.get(0).getTags());

            }

            @Override
            public void onFailure(Call<Cate_Ifi> call, Throwable t) {

                Toast.makeText(MenuClassification.this, "网络错误请重试", Toast.LENGTH_SHORT).show();

            }
        });



    }

    /**
     *
     */
    private void aboutList(final List<Cate_Ifi.ResultBean.ListBean> list) {

        IfiListAdapter lapdater = new IfiListAdapter(list, this);

        mLv.setAdapter(lapdater);

        mLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                List<Cate_Ifi.ResultBean.ListBean.TagsBean> tags = list.get(i).getTags();

                aboutGridView(tags);

            }
        });


    }

    /**
     * 关于GridView的操作
     * @param tags
     */
    private void aboutGridView(final List<Cate_Ifi.ResultBean.ListBean.TagsBean> tags) {


        IfigridAdapter ifigridAdapter = new IfigridAdapter(tags, this);

        mGv.setAdapter(ifigridAdapter);

        mGv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                Intent intent = new Intent(MenuClassification.this, IfiFoodActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("title",tags.get(i).getName());
                bundle.putString("id",tags.get(i).getId());

                intent.putExtras(bundle);

                startActivity(intent);


            }
        });

    }


}
