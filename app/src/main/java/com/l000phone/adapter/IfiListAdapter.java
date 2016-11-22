package com.l000phone.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.l000phone.autohomen.R;
import com.l000phone.entity.Cate_Ifi;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by DJ on 2016/11/21.
 */

public class IfiListAdapter extends BaseAdapter {

    List<Cate_Ifi.ResultBean.ListBean> list;
    private Context context;

    public IfiListAdapter(List<Cate_Ifi.ResultBean.ListBean> list, Context context) {
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
            view = View.inflate(context, R.layout.item_ifi_list, null);

            vh  =new VH();

            vh.img = (ImageView) view.findViewById(R.id.ifi_img_list);
            vh.tv = (TextView) view.findViewById(R.id.ifi_text_list);

            view.setTag(vh);

        }else{

         vh = (VH) view.getTag();

        }

        Cate_Ifi.ResultBean.ListBean listBean = list.get(i);

        Picasso.with(context).load(listBean.getImgUrl()).fit().placeholder(R.drawable.splish_logo).into(vh.img);

        vh.tv.setText(listBean.getCate());

        return view;
    }

    private final class VH{
        private ImageView  img;
        private TextView   tv;

    }
}
