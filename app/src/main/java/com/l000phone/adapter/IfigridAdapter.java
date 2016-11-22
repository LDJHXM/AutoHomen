package com.l000phone.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import com.l000phone.autohomen.R;
import com.l000phone.entity.Cate_Ifi;

import java.util.List;

/**
 * Created by DJ on 2016/11/21.
 */

public class IfigridAdapter extends BaseAdapter {

    List<Cate_Ifi.ResultBean.ListBean.TagsBean> list;
    private Context context;

    public IfigridAdapter(List<Cate_Ifi.ResultBean.ListBean.TagsBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        VH vh = null;

        if(view==null){
            view = View.inflate(context, R.layout.item_ifi, null);

            vh  =new VH();

            vh.btn = (Button) view.findViewById(R.id.ifi_btn);

            view.setTag(vh);

        }else{

         vh = (VH) view.getTag();

        }


        vh.btn.setText(list.get(i).getName());


        return view;
    }

    private final class VH{

        private Button btn;

    }
}
