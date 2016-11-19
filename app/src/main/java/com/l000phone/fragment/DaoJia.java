package com.l000phone.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.l000phone.autohomen.R;
import com.l000phone.daojia.adpter.MyListViewAdapter;
import com.l000phone.daojia.jsonparsor.JSONParsor;
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

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        context = getActivity();

        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


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
        //3,关于标签的操做
        abouttab();
        //4,得到listview数据源
        getTheData();

    }

    /**
     * 4,关于listview的操做
     */
    private void getTheData() {
        //数据源
        dataS = new LinkedList<>();

        //网络请求获得数据
        getTheDataFromInternet();

    }

    /**
     * 网络请求获得数据
     */
    private void getTheDataFromInternet() {
        RequestParams params = new RequestParams(DaoJiaURL.totalURL);
        Callback.Cancelable cancelable = x.http().get(params, new Callback
                .CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                List<Object> theData = JSONParsor.parsorString(result);
                dataS.addAll(theData);
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
        //适配器
        MyListViewAdapter adapter = new MyListViewAdapter(dataS);
        //绑定适配器
        mListView.setAdapter(adapter);

    }

    /**
     * 3,关于标签的操做
     */
    private void abouttab() {
        //1,向容器中添加子标签,和给每一个子标签添加监视器

        for(int i=0;i<6;i++){
            TextView mText= (TextView) View.inflate(context, R.layout.daojia_tab, null);
            mText.setText("This is "+i);
            mContainTab.addView(mText);
        }

    }

    /**
     * 各个标签的监视器
     */
    private class TabLinstener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            int tag = (int) view.getTag();
            Toast.makeText(context,"点击了"+tag,Toast.LENGTH_LONG).show();

        }
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
