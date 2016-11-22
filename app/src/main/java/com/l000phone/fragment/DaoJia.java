package com.l000phone.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.l000phone.autohomen.R;
import com.l000phone.daojia.adpter.MyListViewAdapter;
import com.l000phone.daojia.datatoview.TabToView;
import com.l000phone.daojia.jsonparsor.JSONParsor;
import com.l000phone.daojia.myentitis.Entity;
import com.l000phone.daojia.myurl.DaoJiaURL;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by DJ on 2016/11/16.
 */

public class DaoJia extends Fragment {

    private TextView mALL;
    private ListView mListView;
    private LinearLayout mContainTab;
    private TextView mLocation;
    private Context context;
    private List<Object> dataS;
    private List<Object> tempData;
    private List<Object> tabData;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        context = getActivity();

        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.daojia_fragment, null);
        mALL = (TextView) view.findViewById(R.id.all_id);
        mListView = (ListView) view.findViewById(R.id.listView_id);
        mContainTab = (LinearLayout) view.findViewById(R.id.tablayout_id);
        mLocation = (TextView) view.findViewById(R.id.location_id);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //1，关于spinner的操做
        aboutSpinner();
        //2,关于location的操做
        aboutLocetion();
        //3,得到listview数据源
        getTheData();


    }

    /**
     * 3,关于listview数据源
     */
    private void getTheData() {
        //数据源
        dataS = new LinkedList<>();
        tempData = new LinkedList<>();
        tabData = new LinkedList<>();

        //网络请求获得数据
        getTheDataFromInternet();

    }

    /**
     * 网络请求获得数据
     */
    private void getTheDataFromInternet() {
        //判断是否有网，没有网的话读取数据库，有网从网上读取数据

        RequestParams params = new RequestParams(DaoJiaURL.totalURL);
        Callback.Cancelable cancelable = x.http().get(params, new Callback
                .CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                List<Object> theData = JSONParsor.parsorString(result);
                tempData.addAll(theData);
                //数据库要自己搞一个实体类吗

                //关于listview的操做
                aboutListView();

            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Toast.makeText(context, "数据加载错误", Toast.LENGTH_LONG).show();

            }

            @Override
            public void onCancelled(CancelledException cex) {
                Toast.makeText(context, "取消加载", Toast.LENGTH_LONG).show();

            }

            @Override
            public void onFinished() {

            }
        });

    }

    /**
     * 关于listview的操做
     */
    private void aboutListView() {
        //1,操做数据源的到真正的数据源
        operateData();
        //2,关于标签的操做
        abouttab();

        //适配器
        MyListViewAdapter adapter = new MyListViewAdapter(dataS,context);
        //绑定适配器
        mListView.setAdapter(adapter);

    }

    /**
     * 操做数据源的到真正的数据源
     */
    private void operateData() {
        for (int i = 0; i < tempData.size(); i++) {
            //集合
            if (tempData.get(i) instanceof List) {   //标题部分的集合
                if (((List) tempData.get(i)).get(0) instanceof Entity.ResultBean
                        .CateListBean) {
                    tabData.addAll((List) tempData.get(i));
                    Log.i("data", tabData.toString());
                } else {
                    dataS.add(tempData.get(i));
                }

            //对象
            } else {
                dataS.add(tempData.get(i));
            }


        }
        Log.i("data1", dataS.toString());

    }

    /**
     * 3,关于标签的操做
     */
    private void abouttab() {
        //1,向容器中添加子标签,和给每一个子标签添加监视器
        TabToView tabToView = new TabToView();
        tabToView.aboutTabview(tabData, mContainTab, context);

    }

    /**
     * 2,关于location的操做
     */
    private void aboutLocetion() {
    }

    /**
     * 1,关于spinner的操做
     */
    private void aboutSpinner() {


    }
}
