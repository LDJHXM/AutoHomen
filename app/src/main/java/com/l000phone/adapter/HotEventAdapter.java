package com.l000phone.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.l000phone.autohomen.R;
import com.l000phone.entity.Cate_HotEvent;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by DJ on 2016/11/21.
 */

public class HotEventAdapter extends BaseAdapter {

    List<Cate_HotEvent.ResultBean.ListBean> list;
    private Context context;

    public HotEventAdapter(List<Cate_HotEvent.ResultBean.ListBean> list, Context context) {
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
            view = View.inflate(context, R.layout.item_kitchen, null);

            vh  =new VH();

            vh.img = (ImageView) view.findViewById(R.id.kit_img);
            vh.tv1 = (TextView) view.findViewById(R.id.kit_tv1);
            vh.tv2 = (TextView) view.findViewById(R.id.kit_tv2);

            view.setTag(vh);

        }else{

         vh = (VH) view.getTag();

        }

        Cate_HotEvent.ResultBean.ListBean listBean = list.get(i);

        vh.tv1.setText(listBean.getTitle());


        Picasso.with(context).load(listBean.getImg()).fit().placeholder(R.drawable.splish_logo).into(vh.img);

        vh.tv2.setText(listBean.getIntro());

        return view;
    }

    private final class VH{
        private ImageView  img;
        private TextView   tv1;
        private TextView   tv2;

    }
}
