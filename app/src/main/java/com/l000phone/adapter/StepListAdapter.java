package com.l000phone.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.l000phone.autohomen.R;
import com.l000phone.entity.Cate_Video;

import java.util.List;

/**
 * Created by DJ on 2016/11/21.
 */

public class StepListAdapter extends BaseAdapter {

    private  final  int FOUCS = 0;
    private  final  int NO_FOUCS = 1;
    private  final  int NUM=2;


    List<Cate_Video.ResultBean.InfoBean.StepsBean> list;
    private Context context;

    public StepListAdapter(List<Cate_Video.ResultBean.InfoBean.StepsBean> list, Context context) {
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
    public int getViewTypeCount() {
        return NUM;
    }

    @Override
    public int getItemViewType(int position) {

        if(list.get(position).getFlg()==true){

            return FOUCS;

        }else {
            return NO_FOUCS;

        }


    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        VH vh = null;

        int type = getItemViewType(i);

        if(view==null){

            switch (type) {

                case FOUCS:

                    view = View.inflate(context, R.layout.item_step, null);

                    vh = new VH();

                    vh.tv1 = (TextView) view.findViewById(R.id.step_tv1);
                    vh.tv2 = (TextView) view.findViewById(R.id.step_tv2);

                    view.setBackgroundColor(Color.RED);

                    view.setTag(vh);

                    break;

                case NO_FOUCS:

                    view = View.inflate(context, R.layout.item_step, null);

                    vh = new VH();

                    vh.tv1 = (TextView) view.findViewById(R.id.step_tv1);
                    vh.tv2 = (TextView) view.findViewById(R.id.step_tv2);

                    view.setTag(vh);

                    break;


            }

        }else{

         vh = (VH) view.getTag();

        }

        Cate_Video.ResultBean.InfoBean.StepsBean listBean = list.get(i);


        vh.tv1.setText((i+1)+"");

        vh.tv2.setText(listBean.getIntro());

        return view;
    }

    private final class VH{

        private TextView  tv1;
        private TextView   tv2;

    }
}
