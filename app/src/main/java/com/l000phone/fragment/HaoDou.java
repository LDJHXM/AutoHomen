package com.l000phone.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.l000phone.autohomen.R;
import com.l000phone.entity.Cate;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by DJ on 2016/11/16.
 */

public class HaoDou extends Fragment  {

    private ListView mLv;
    private List<Objects> ds;
    private TextView mPopular;
    private TextView mSee;
    private TextView mKitchen;
    private TextView mHot;
    private TextView mMenu;
    private Cate body;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        //new DownloadFirstData(this).execute();
        getCateDate();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_haodou, container, false);

        mLv = (ListView) view.findViewById(R.id.listView_id);
        mPopular = (TextView) view.findViewById(R.id.popular_menu_id);
        mSee = (TextView) view.findViewById(R.id.see_video_id);
        mKitchen = (TextView) view.findViewById(R.id.kitchen_cheats_id);
        mHot = (TextView) view.findViewById(R.id.hot_activity_id);
        mMenu = (TextView) view.findViewById(R.id.menu_classify_id);

        //关于ListView的操作
        //aboutListView();

        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        //ViewPager

        //五个小ImageView
    /*    String title0 = cate.getData().getHeader().get(1).getList().get(0).getTitle();
        String title1 = cate.getData().getHeader().get(1).getList().get(1).getTitle();
        String title2 = cate.getData().getHeader().get(1).getList().get(2).getTitle();
        String title3 = cate.getData().getHeader().get(1).getList().get(3).getTitle();
        String title4 = cate.getData().getHeader().get(1).getList().get(4).getTitle();

        mPopular.setText(title0);
        mSee.setText(title1);
        mKitchen.setText(title2);
        mHot.setText(title3);
        mMenu.setText(title4);*/

       // mKitchen.setText(body==null?"kong":body.toString());

        //五个大ImageView

        super.onActivityCreated(savedInstanceState);
    }

    /**
     * 关于ListView的操作
     */

    private void aboutListView() {

        //不获取焦点，否则默认不显示最顶层
        mLv.setFocusable(false);

        //数据源
        ds = new LinkedList<>();

        //填充数据源

        //fillEgg();


        //适配器
        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, ds);

        //绑定适配器

        mLv.setAdapter(adapter);

    }


    private void fillEgg() {

        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("http://api.haodou.com/").
                addConverterFactory(GsonConverterFactory.create()).build();


        Mate_Egg me = retrofit.create(Mate_Egg.class);

        Map<String, String> agg = new HashMap<>();
        agg.put("limit", "10");
        agg.put("sign", "");
        agg.put("uid", "0");
        agg.put("uuid", "b3b08f17bca548949af2ddc9c88e65f5");
        agg.put("offset", "0");
        agg.put("appqs", "haodourecipe://haodou" +
                ".com/recommend/recipe/?keyword=%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1&title=%E7%83" +
                "%AD%E9%97%A8%E8%8F%9C%E8%B0%B1&tab=%E5%85%A8%E9%83%A8%3A%E7%83%AD%E9%97%A8%E8%8F" +
                "%9C%E8%B0%B1%7C%E7%A7%81%E4%BA%BA%3A%E7%A7%81%E4%BA%BA%E5%AE%9A%E5%88%B6%7C%E6" +
                "%97%B6%E4%BB%A4%3A%E6%97%B6%E4%BB%A4%E4%BD%B3%E8%82%B4%7C%E8%BE%BE%E4%BA%BA%3A" +
                "%E8%BE%BE%E4%BA%BA%E8%8F%9C%E8%B0%B1%7C%E6%9C%80%E6%96%B0%3A%E6%9C%80%E6%96%B0" +
                "%E8%8F%9C%E8%B0%B1%7C%E7%83%98%E7%84%99%3A%E5%BF%AB%E4%B9%90%E7%9A%84%E7%83%98" +
                "%E7%84%99");
        agg.put("type", "热门菜谱");


        Call<Cate> call = me.getEgg(agg);

        call.enqueue(new Callback<Cate>() {
            @Override
            public void onResponse(Call<Cate> call, Response<Cate> response) {

                //Log.d("abc",response.toString());
                Cate cate = response.body();

                String title2 = cate.getData().getHeader().get(1).getList().get(2).getTitle();

                mMenu.setText(title2);


                //Log.i("data",cate.getData().getList().get(0).getTitle());
                Toast.makeText(getActivity(), title2, Toast.LENGTH_LONG).show();

            }

            @Override
            public void onFailure(Call<Cate> call, Throwable t) {
                Toast.makeText(getActivity(), "下载失败", Toast.LENGTH_LONG).show();
            }
        });

    }

   /* @Override
    public void setJSONData(Cate result) {

        mKitchen.setText(result==null?"kong":result.toString());

       *//* pager = result.getData().getHeader().get(0).getList().get(0);

        five = result.getData().getHeader().get(0).getList().get(1);

        bigFive = result.getData().getHeader().get(0).getList().get(2);*//*




    }*/


    public interface Mate_Egg {
        @FormUrlEncoded
        @POST("index.php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid=1479371493849&vc=105&vn=6.1.15&loguid=0&deviceid=haodou864394010208983&uuid=31ba575462df2682b6b0886eb2cd63ce&channel=anzhi_v6115&method=Recipe.getCollectRecomment&virtual=&signmethod=md5&v=3&timestamp=1479371511&nonce=0.775792008688394&appsign=6f6bd7fa37ea9e2a7b3b7c775f45aed1")
        Call<Cate> getEgg(@FieldMap Map<String, String> egg);
    }


    private void getCateDate() {



        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("http://hop.haodou.com/").
                addConverterFactory(GsonConverterFactory.create()).build();

        HaoDouCate hdc = retrofit.create(HaoDouCate.class);

        Map<String, String> ask = new HashMap<>();

        ask.put("_HOP_", "{\"sign\":\"ba4767a053ddfe6f66c3a265cc23251f\"," +
                "\"action\":\"front.get_index\",\"current_time\":1479269055," +
                "\"secret_id\":\"5722f877e4b0d4512e3fd872\",\"version\":\"1.0\"}");
        ask.put("appid", "2");
        ask.put("appkey", "9ef269eec4f7a9d07c73952d06b5413f");
        ask.put("channel", "anzhi_v6115");
        ask.put("deviceid", "haodou864394010208983");
        ask.put("from", "android");
        ask.put("ip", "172.16.152.15");
        ask.put("limit", "30");
        ask.put("loguid", "0");
        ask.put("network", "WIFI");
        ask.put("offset", "0");
        ask.put("sign", "");
        ask.put("uid", "0");
        ask.put("uuid", "9ea70fa9356586ff23fc31785f735cf1");
        ask.put("vc", "105");
        ask.put("virtual", "0");
        ask.put("vn", "6.1.15");

        Call<Cate> call = hdc.getData(ask);

        call.enqueue(new Callback<Cate>() {
            @Override
            public void onResponse(Call<Cate> call, Response<Cate> response) {


                Cate cate = response.body();

                String title2 = cate.getData().getHeader().get(1).getList().get(2).getTitle();

                mMenu.setText(title2);
                Toast.makeText(getActivity(), title2, Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onFailure(Call<Cate> call, Throwable t) {

            }
        });




    }

    public interface HaoDouCate {

        @FormUrlEncoded
        @POST("hop/router/rest.json?action=front.get_index")
        Call<Cate> getData(@FieldMap Map<String, String> ask);

    }


}
