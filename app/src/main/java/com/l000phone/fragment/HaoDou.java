package com.l000phone.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.l000phone.autohomen.R;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Created by DJ on 2016/11/16.
 */

public class HaoDou extends Fragment {

    private ListView mLv;
    private List<Objects> ds;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_haodou, container, false);

        mLv = (ListView) view.findViewById(R.id.listView_id);

        //关于ListView的操作
        aboutListView();

        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        
        super.onActivityCreated(savedInstanceState);
    }

    /**
     *  关于ListView的操作
     */

    private void aboutListView() {

        //不获取焦点，否则默认不显示最顶层
        mLv.setFocusable(false);

        //数据源
        ds = new LinkedList<>();

        //填充数据源
        fillDs();

        //适配器
        ArrayAdapter adapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1, ds);


        //绑定适配器

        mLv.setAdapter(adapter);

    }

    /**
     * 使用retrofit从网上下载数据，解析并存入数据源中
     */
    private void fillDs() {


    }


}
