package com.l000phone.adapter;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.l000phone.autohomen.R;
import com.l000phone.entity.Cate_Hot_Menu;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by DJ on 2016/11/21.
 */

public class HotMenuAdapter extends BaseAdapter {

    List<Cate_Hot_Menu.ResultBean.ListBean> list;
    private Context context;

    public HotMenuAdapter( List<Cate_Hot_Menu.ResultBean.ListBean> list, Context context) {
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
            view = View.inflate(context, R.layout.item_hot_menu, null);

            vh  =new VH();

            vh.img = (ImageView) view.findViewById(R.id.item_hot_img);
            vh.zan_num = (TextView) view.findViewById(R.id.zan_num_id);
            vh.big_name = (TextView) view.findViewById(R.id.big_name);
            vh.name = (TextView) view.findViewById(R.id.name);
            vh.zan = (ImageView) view.findViewById(R.id.zan_id);
            vh.ll_text = (LinearLayout) view.findViewById(R.id.ll_container_id);

            view.setTag(vh);

        }else{

         vh = (VH) view.getTag();

        }

        Cate_Hot_Menu.ResultBean.ListBean listBean = list.get(i);

        for(int j=0;j<listBean.getTags().size();j++){

            if(j<=4){

                TextView textView = new TextView(context);

                textView.setText(listBean.getTags().get(j).getName());

                textView.setTextSize(16);

                textView.setLeft(20);

                textView.setGravity(Gravity.CENTER_VERTICAL);

                textView.setPadding(30,0,0,0);

                vh.ll_text.addView(textView);

            }else {

                break;
            }


        }

        vh.big_name.setText(listBean.getTitle());

        vh.name.setText(listBean.getUserName());

        Picasso.with(context).load(listBean.getCover()).fit().placeholder(R.drawable.splish_logo).into(vh.img);

        vh.zan_num.setText(listBean.getLikeCount());

        return view;
    }

    private final class VH{
        private ImageView  img;
        private ImageView  zan;
        private TextView   zan_num;
        private TextView   big_name;
        private TextView   name;

        private LinearLayout ll_text;


    }
}
