package com.l000phone.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.l000phone.adapter.HotMenuAdapter;
import com.l000phone.autohomen.R;
import com.l000phone.entity.Cate_Hot_Menu;
import com.l000phone.face.HaoDouCate_Hot_Menu;
import com.l000phone.face.HaoDouCate_Hot_Menu2;
import com.l000phone.face.HaoDouCate_Hot_Menu3;
import com.l000phone.face.HaoDouCate_Hot_Menu4;
import com.l000phone.face.HaoDouCate_Hot_Menu5;
import com.l000phone.face.HaoDouCate_Hot_Menu6;
import com.l000phone.util.GetMap;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by DJ on 2016/11/16.
 */

public class Hot_Menu_Fragment extends Fragment {


    private String url;
    private ListView mLv;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        Bundle bundle = getArguments();

        url = bundle.getString("tab");

        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_hot_menu, container, false);

        mLv = (ListView) view.findViewById(R.id.hot_menu_lv);

        //下载数据，并设置
        getDate();


        return view;

    }

    /**
     * 下载数据，并设置
     */

    public void getDate() {

        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("http://api.haodou.com/").
                addConverterFactory(GsonConverterFactory.create()).build();

        Call<Cate_Hot_Menu> call = null;


        switch (url) {

            case "全部":

                HaoDouCate_Hot_Menu hhm = retrofit.create(HaoDouCate_Hot_Menu.class);

                call = hhm.getData(GetMap.getMap_HoutMeun("热门菜谱"));

                break;

            case "私人":

                HaoDouCate_Hot_Menu2 hhm2 = retrofit.create(HaoDouCate_Hot_Menu2.class);

                call = hhm2.getData(GetMap.getMap_HoutMeun("私人定制"));

                break;
            case "时令":
                HaoDouCate_Hot_Menu3 hhm3 = retrofit.create(HaoDouCate_Hot_Menu3.class);

                call = hhm3.getData(GetMap.getMap_HoutMeun("私人定制"));

                break;
            case "达人":
                HaoDouCate_Hot_Menu4 hhm4 = retrofit.create(HaoDouCate_Hot_Menu4.class);

                call = hhm4.getData(GetMap.getMap_HoutMeun("私人定制"));

                break;
            case "最新":
                HaoDouCate_Hot_Menu5 hhm5 = retrofit.create(HaoDouCate_Hot_Menu5.class);

                call = hhm5.getData(GetMap.getMap_HoutMeun("私人定制"));

                break;
            case "烘焙":
                HaoDouCate_Hot_Menu6 hhm6 = retrofit.create(HaoDouCate_Hot_Menu6.class);

                call = hhm6.getData(GetMap.getMap_HoutMeun("私人定制"));

                break;

            default:
                break;


        }

        call.enqueue(new Callback<Cate_Hot_Menu>() {
            @Override
            public void onResponse(Call<Cate_Hot_Menu> call, Response<Cate_Hot_Menu> response) {


                List<Cate_Hot_Menu.ResultBean.ListBean> list = response.body().getResult().getList();

                aboutListView(list);


            }

            @Override
            public void onFailure(Call<Cate_Hot_Menu> call, Throwable t) {


            }
        });

    }

    /**
     * 关于ListView的操作
     * @param list
     */
    private void aboutListView(List<Cate_Hot_Menu.ResultBean.ListBean> list) {

        //适配器
        HotMenuAdapter adapter = new HotMenuAdapter(list, getActivity());

        //绑定适配器
        mLv.setAdapter(adapter);

        //监听器
        mLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getActivity(), "你点击了"+i, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
