package com.l000phone.adapter;

import android.content.Context;
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

public class PriAdapter extends BaseAdapter {
    private final int VIDEO = 0; //有图
    private final int NO_VIDEO = 1;//没图
    private final int NUM = 2;//布局数量


    List<Cate_Video.ResultBean.InfoBean.StuffBean> list;
    private Context context;

    public PriAdapter(List<Cate_Video.ResultBean.InfoBean.StuffBean> list, Context context) {
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

        if(list.get(position).getType()==2){

            return NO_VIDEO;

        }else{

            return VIDEO;

        }

    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        VIDEO_Holder vh = null;
        NO_VIDEO_Holder nrh = null;

        int type = getItemViewType(i);

        if (view == null) {

            switch (type) {

                case VIDEO:

                    view = View.inflate(context, R.layout.item_pri1, null);

                    vh = new VIDEO_Holder();

                    vh.tv1 = (TextView) view.findViewById(R.id.tv1_tv1);
                    vh.tv2 = (TextView) view.findViewById(R.id.tv1_tv2);

                    view.setTag(vh);

                    break;

                case NO_VIDEO:

                    view = View.inflate(context, R.layout.item_pri2, null);

                    nrh = new NO_VIDEO_Holder();

                    nrh.tv1 = (TextView) view.findViewById(R.id.tv2_tv1);
                    nrh.tv2 = (TextView) view.findViewById(R.id.tv2_tv2);

                    view.setTag(nrh);

                    break;

                default:
                    break;
            }

        } else {

            switch (type) {

                case VIDEO:

                    vh = (VIDEO_Holder) view.getTag();

                    break;

                case NO_VIDEO:

                    nrh = (NO_VIDEO_Holder) view.getTag();

                    break;

                default:
                    break;
            }
        }


        Cate_Video.ResultBean.InfoBean.StuffBean listBean = list.get(i);

        switch (type) {

            case VIDEO:

                vh.tv1.setText(listBean.getName());
                vh.tv2.setText(listBean.getWeight());

                break;

            case NO_VIDEO:

                nrh.tv1.setText(listBean.getName());
                nrh.tv2.setText(listBean.getWeight());

                break;
        }


        return view;
    }


    private final class VIDEO_Holder {

        private TextView   tv1;
        private TextView   tv2;

    }

    private final class NO_VIDEO_Holder {

        private TextView   tv1;
        private TextView   tv2;

    }

}
