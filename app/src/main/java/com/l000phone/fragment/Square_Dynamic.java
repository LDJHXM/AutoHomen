package com.l000phone.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.l000phone.autohomen.R;

import static com.umeng.socialize.utils.Log.TAG;

/**
 * Created by Administrator on 2016/11/21.
 */

public class Square_Dynamic extends Fragment {
    private View mDynamic;
    private ListView mListView;
    private ImageView mNoData;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mDynamic = inflater.inflate(R.layout.square_dynamic_fragment, null);

        //界面控件实例的获取
        initViews();


        return mDynamic;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //关于ListView
        aboutListView();
    }

    private void aboutListView() {
        mListView.setEmptyView(mNoData); //绑定替换的图片

        //数据源

        //适配器

        //绑定适配器


    }

    private void initViews() {
        mListView = (ListView) mDynamic.findViewById(R.id.lv_square_dynamic_id);
        mNoData = (ImageView) mDynamic.findViewById(R.id.iv_no_data3_id);
    }

}
