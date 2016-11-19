package com.l000phone.daojia.adpter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/11/17/017.
 */

public class MyListViewAdapter extends BaseAdapter {

    private List<Object> data;

    public MyListViewAdapter(List<Object> data) {
        this.data = data;
    }

    /**
     * 多布局的种类
     * @return
     */
    @Override
    public int getViewTypeCount() {
        return super.getViewTypeCount();
    }

    /**
     * 得到各个子条目的类型，根据集合名称确定其所属的类型
     * @param position
     * @return
     */
    @Override
    public int getItemViewType(int position) {

        return super.getItemViewType(position);
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    /**
     * listview中有一个条目是viewpager，用布局填充器得到viewpager的实例
     * @param i
     * @param view
     * @param viewGroup
     * @return
     */
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
