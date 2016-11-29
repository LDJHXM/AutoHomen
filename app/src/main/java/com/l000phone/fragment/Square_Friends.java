package com.l000phone.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.l000phone.autohomen.R;

/**
 * Created by Administrator on 2016/11/21.
 */

public class Square_Friends extends Fragment {
    private View mFriends;
    private ListView mListView;
    private ImageView mNoData;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mFriends = inflater.inflate(R.layout.square_friends_fragment, null);

        //界面控件实例的获取
        initViews();

        return mFriends;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //关于ListView
        aboutListView();

    }

    /**
     * 关于ListView
     */
    private void aboutListView() {
        mListView.setEmptyView(mNoData); //绑定替换的图片

        //数据源

        //适配器

        //绑定适配器


    }

    /**
     * 界面控件实例的获取
     */
    private void initViews() {
        mListView = (ListView) mFriends.findViewById(R.id.lv_square_friends_id);
        mNoData = (ImageView) mFriends.findViewById(R.id.iv_no_data_id);

    }


}
