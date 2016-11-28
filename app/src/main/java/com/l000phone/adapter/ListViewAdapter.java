package com.l000phone.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.l000phone.autohomen.R;
import com.l000phone.entity.Cate;
import com.l000phone.view.Cir_Botton;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by DJ on 2016/11/19.
 */

public class ListViewAdapter extends BaseAdapter {

    private List<Cate.DataBean.ListBean> list;
    private Context context;
    private final int ROUND = 0; //有圆形
    private final int NO_ROUND = 1;//无圆形
    private final int TEXT = 2;//有菜数
    private final int NUM = 3;//布局数量


    public ListViewAdapter(List<Cate.DataBean.ListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @Override
    public int getViewTypeCount() {

        return NUM;
    }

    @Override
    public int getItemViewType(int position) {

        if (list.get(position).getTotal() != null) {

            return TEXT;

        } else if (list.get(position).getUserAvatar() != null) {

            return ROUND;
        } else {

            return NO_ROUND;
        }


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

        ROUND_Holder rh = null;
        NO_ROUND_Holder nrh = null;
        TXET_Holder th = null;

        int type = getItemViewType(i);

        if (view == null) {

            switch (type) {

                case ROUND:

                    view = View.inflate(context, R.layout.round, null);

                    rh = new ROUND_Holder();

                    rh.round_circle = (Cir_Botton) view.findViewById(R.id.round_circle);
                    rh.round_img = (ImageView) view.findViewById(R.id.round_img);
                    rh.round_text = (TextView) view.findViewById(R.id.round_text);
                    rh.round_text2 = (TextView) view.findViewById(R.id.round_text_2);

                    view.setTag(rh);

                    break;

                case NO_ROUND:

                    view = View.inflate(context, R.layout.no_round, null);

                    nrh = new NO_ROUND_Holder();

                    nrh.no_round_img = (ImageView) view.findViewById(R.id.no_round_img);
                    nrh.no_round_text = (TextView) view.findViewById(R.id.no_round_text);
                    nrh.no_round_text2 = (TextView) view.findViewById(R.id.no_round_text2);

                    view.setTag(nrh);

                    break;
                case TEXT:

                    view = View.inflate(context, R.layout.text, null);

                    th = new TXET_Holder();

                    th.text_img = (ImageView) view.findViewById(R.id.text_img);
                    th.text_text = (TextView) view.findViewById(R.id.text_text);
                    th.text_text2 = (TextView) view.findViewById(R.id.text_text_2);
                    th.text_dish_num = (TextView) view.findViewById(R.id.text_dish_num);

                    view.setTag(th);
                    break;

                default:
                    break;
            }

        } else {


            switch (type) {

                case ROUND:

                    rh = (ROUND_Holder) view.getTag();

                    break;

                case NO_ROUND:

                    nrh = (NO_ROUND_Holder) view.getTag();

                    break;

                case TEXT:

                    th = (TXET_Holder) view.getTag();

                    break;

                default:
                    break;

            }
        }


        Cate.DataBean.ListBean bean = list.get(i);

        switch (type) {

            case ROUND:
                rh.round_text.setText(bean.getTitle());
                rh.round_text2.setText(bean.getDesc());
                Picasso.with(context).load(bean.getImgs().get(0)).
                        fit().placeholder(R.drawable.splish_logo).into(rh.round_img);

                rh.round_circle.abc_SetText(bean.getUserName());

                rh.round_circle.abc_SetImg(bean.getUserAvatar());
                break;

            case NO_ROUND:

                nrh.no_round_text.setText(bean.getTitle());
                nrh.no_round_text2.setText(bean.getDesc());

                Picasso.with(context).load(bean.getImgs().get(0)).
                        fit().placeholder(R.drawable.splish_logo).into(nrh.no_round_img);

                break;

            case TEXT:

                th.text_text.setText(bean.getTitle());
                th.text_text2.setText(bean.getDesc());
                th.text_dish_num.setText("————  " + bean.getTotal() + "道菜  ————");
                Picasso.with(context).load(bean.getImgs().get(0)).
                        fit().placeholder(R.drawable.splish_logo).into(th.text_img);

                break;
        }


        return view;
    }


    private final class ROUND_Holder {

        private Cir_Botton round_circle;
        private ImageView round_img;
        private TextView round_text;
        private TextView round_text2;

    }

    private final class NO_ROUND_Holder {

        private ImageView no_round_img;
        private TextView no_round_text;
        private TextView no_round_text2;

    }

    private final class TXET_Holder {

        private ImageView text_img;
        private TextView text_text;
        private TextView text_text2;
        private TextView text_dish_num;

    }

}
