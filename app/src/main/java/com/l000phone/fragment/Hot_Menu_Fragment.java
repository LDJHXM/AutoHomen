package com.l000phone.fragment;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.handmark.pulltorefresh.library.ILoadingLayout;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.l000phone.adapter.HotMenuAdapter;
import com.l000phone.autohomen.R;
import com.l000phone.autohomen.Web1Activity;
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
    private PullToRefreshListView mLv;
    private List<Cate_Hot_Menu.ResultBean.ListBean> list;
    private Retrofit retrofit;
    private HotMenuAdapter adapter;
    private ProgressDialog dialog;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        Bundle bundle = getArguments();

        url = bundle.getString("tab");

        dialog = new ProgressDialog(getActivity());

        dialog.show();


        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_hot_menu, container, false);

        mLv = (PullToRefreshListView) view.findViewById(R.id.hot_menu_lv);

        //下载数据，并设置

        getDate();


        return view;

    }

    /**
     * 下载数据，并设置
     */

    public void getDate() {

        retrofit = new Retrofit.Builder().
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

                call = hhm3.getData(GetMap.getMap_HoutMeun("时令佳肴"));

                break;
            case "达人":
                HaoDouCate_Hot_Menu4 hhm4 = retrofit.create(HaoDouCate_Hot_Menu4.class);

                call = hhm4.getData(GetMap.getMap_HoutMeun("达人菜谱"));

                break;
            case "最新":
                HaoDouCate_Hot_Menu5 hhm5 = retrofit.create(HaoDouCate_Hot_Menu5.class);

                call = hhm5.getData(GetMap.getMap_HoutMeun("最新菜谱"));

                break;
            case "烘焙":
                HaoDouCate_Hot_Menu6 hhm6 = retrofit.create(HaoDouCate_Hot_Menu6.class);

                call = hhm6.getData(GetMap.getMap_HoutMeun("快乐的烘焙"));

                break;

            default:
                break;


        }

        call.enqueue(new Callback<Cate_Hot_Menu>() {
            @Override
            public void onResponse(Call<Cate_Hot_Menu> call, Response<Cate_Hot_Menu> response) {


                list = response.body().getResult().getList();

                aboutListView(list);

                dialog.dismiss();


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
    private void aboutListView(final List<Cate_Hot_Menu.ResultBean.ListBean> list) {

        //适配器
        adapter = new HotMenuAdapter(list, getActivity());

        //绑定适配器
        mLv.setAdapter(adapter);

        //下拉加载
        mLv.setMode(PullToRefreshBase.Mode.BOTH);

        init();

        mLv.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {




                HaoDouCate_Hot_Menu hhm = retrofit.create(HaoDouCate_Hot_Menu.class);

                Call<Cate_Hot_Menu> call = hhm.getData(GetMap.getMap_HoutMeun("热门菜谱"));


                call.enqueue(new Callback<Cate_Hot_Menu>() {
                    @Override
                    public void onResponse(Call<Cate_Hot_Menu> call, Response<Cate_Hot_Menu> response) {


                        Cate_Hot_Menu body = response.body();

                        List<Cate_Hot_Menu.ResultBean.ListBean> list1 = body.getResult().getList();

                        list.addAll(0,list1);

                        adapter.notifyDataSetChanged();

                        mLv.onRefreshComplete();

                    }

                    @Override
                    public void onFailure(Call<Cate_Hot_Menu> call, Throwable t) {
                        HaoDouCate_Hot_Menu hhm = retrofit.create(HaoDouCate_Hot_Menu.class);

                        Call<Cate_Hot_Menu> call1 = hhm.getData(GetMap.getMap_HoutMeun("热门菜谱"));


                        call1.enqueue(new Callback<Cate_Hot_Menu>() {
                            @Override
                            public void onResponse(Call<Cate_Hot_Menu> call, Response<Cate_Hot_Menu> response) {


                                Cate_Hot_Menu body = response.body();

                                List<Cate_Hot_Menu.ResultBean.ListBean> list1 = body.getResult().getList();

                                list.addAll(list1);

                                adapter.notifyDataSetChanged();

                                mLv.onRefreshComplete();

                            }

                            @Override
                            public void onFailure(Call<Cate_Hot_Menu> call, Throwable t) {

                            }
                        });

                    }
                });


            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {





            }
        });

        //监听器
        mLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String url = "http://www.haodou.com/recipe/"+list.get(i).getRecipeId()+"/";

                Log.i("url",url);

                Intent intent = new Intent(getActivity(), Web1Activity.class);

                intent.putExtra("url",url);

                startActivity(intent);

            }
        });

    }

    /**
     * 初始化
     */
    private void init() {

        ILoadingLayout startLabels = mLv
                .getLoadingLayoutProxy(true, false);
        startLabels.setPullLabel("下拉刷新...");// 刚下拉时，显示的提示
        startLabels.setRefreshingLabel("正在载入...");// 刷新时
        startLabels.setReleaseLabel("放开刷新...");// 下来达到一定距离时，显示的提示

        ILoadingLayout endLabels = mLv.getLoadingLayoutProxy(
                false, true);
        endLabels.setPullLabel("上拉刷新...");// 刚下拉时，显示的提示
        endLabels.setRefreshingLabel("正在载入...");// 刷新时
        endLabels.setReleaseLabel("放开刷新...");// 下来达到一定距离时，显示的提示


    }
}
