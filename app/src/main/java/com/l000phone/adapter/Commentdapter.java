package com.l000phone.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.l000phone.autohomen.R;
import com.l000phone.entity.Cate_Comment;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by DJ on 2016/11/21.
 */

public class Commentdapter extends BaseAdapter {
    private final int VIDEO = 0; //有回复
    private final int NO_VIDEO = 1;//没回复
    private final int NUM = 2;//布局数量


    List<Cate_Comment.ResultBean.ListBean> list;
    private Context context;

    public Commentdapter(List<Cate_Comment.ResultBean.ListBean> list, Context context) {
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

        if(list.get(position).getAtContent()==null){

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

                    view = View.inflate(context, R.layout.item_comment_2, null);

                    vh = new VIDEO_Holder();

                    vh.tv1 = (TextView) view.findViewById(R.id.comment2_tv1);
                    vh.tv2 = (TextView) view.findViewById(R.id.comment2_tv2);
                    vh.tv3 = (TextView) view.findViewById(R.id.comment2_tv3);
                    vh.name = (TextView) view.findViewById(R.id.comment_huifu_name);
                    vh.content = (TextView) view.findViewById(R.id.comment_huifu_content);
                    vh.img = (ImageView) view.findViewById(R.id.comment2_img);


                    view.setTag(vh);

                    break;

                case NO_VIDEO:

                    view = View.inflate(context, R.layout.item_comment_1, null);

                    nrh = new NO_VIDEO_Holder();

                    nrh.tv1 = (TextView) view.findViewById(R.id.comment1_tv1);
                    nrh.tv2 = (TextView) view.findViewById(R.id.comment1_tv2);
                    nrh.tv3 = (TextView) view.findViewById(R.id.comment1_tv3);
                    nrh.img = (ImageView) view.findViewById(R.id.comment1_img);

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


        Cate_Comment.ResultBean.ListBean listBean = list.get(i);

        switch (type) {

            case VIDEO:


                vh.tv1.setText(listBean.getUserName());
                vh.tv2.setText(listBean.getCreateTime());
                vh.tv3.setText(listBean.getContent());
                vh.name.setText("回复: "+listBean.getAtUserName());
                vh.content.setText(listBean.getAtContent());
                Picasso.with(context).load(listBean.getAvatar()).into(vh.img);

                break;

            case NO_VIDEO:

                nrh.tv1.setText(listBean.getUserName());
                nrh.tv2.setText(listBean.getCreateTime());
                nrh.tv3.setText(listBean.getContent());
                Picasso.with(context).load(listBean.getAvatar()).into(nrh.img);

                break;
        }


        return view;
    }


    private final class VIDEO_Holder {

        private ImageView img;
        private TextView   tv1;
        private TextView   tv2;
        private TextView   tv3;
        private TextView   name;
        private TextView   content;

    }

    private final class NO_VIDEO_Holder {
        private ImageView img;
        private TextView   tv1;
        private TextView   tv2;
        private TextView   tv3;

    }

}
