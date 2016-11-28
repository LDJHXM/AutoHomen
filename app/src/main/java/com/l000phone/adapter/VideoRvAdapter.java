package com.l000phone.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.l000phone.autohomen.R;
import com.l000phone.entity.Cate_Video_Info;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by DJ on 2016/11/20.
 */

public class VideoRvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Cate_Video_Info.ResultBean.ListBean> list;
    private Context context;
    private MyItemClickListener listenr;


    public void setOnItemClickListener(MyItemClickListener listenr){

        this.listenr = listenr;
    }

    public VideoRvAdapter(List<Cate_Video_Info.ResultBean.ListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {



        return new VH(LayoutInflater.from(context).inflate(R.layout.item_hotvideo_rv,parent,false));
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {

        //判断是否设置了监听器

        if(listenr!=null) {
            // holder.itemView.setBackgroundResource(R.drawable.item_color);

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   // int postion2 = holder.getLayoutPosition();

                    String url = list.get(position).getVideoUrl();

                    String  url2 = url.substring(url.lastIndexOf("id=")+3);

                    String  url3 = "http://www.haodou.com/recipe/"+url2+"/";


                    listenr.onItemClick(holder.itemView, url3);
                }
            });
        }

        VH vh = (VH) holder;

        Cate_Video_Info.ResultBean.ListBean listBean = list.get(position);

        Picasso.with(context).load(listBean.getCover()).
                placeholder(R.drawable.default_daily_first_goods).into(vh.video_img);

        vh.video_tv1.setText(listBean.getPlayCount()+"");

        vh.tv1.setText(listBean.getTitle());

        vh.comment1.setText(listBean.getCommentCount()+"");

        vh.zan1.setText(listBean.getDiggCount()+"");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class VH extends RecyclerView.ViewHolder{


        private final ImageView video_img;
        private final TextView video_tv1;
        private final TextView tv1;
        private final TextView zan1;
        private final TextView comment1;


        public VH(View itemView) {
            super(itemView);


            video_img = (ImageView) itemView.findViewById(R.id.video_img);
            video_tv1 = (TextView) itemView.findViewById(R.id.video_tv1);
            tv1 = (TextView) itemView.findViewById(R.id.tv1);
            zan1 = (TextView) itemView.findViewById(R.id.zan1);
            comment1 = (TextView) itemView.findViewById(R.id.comment1);


        }
    }

    /**
     * 自定义回调接口
     */
    public interface MyItemClickListener{

        void onItemClick(View view, String url3);
    }
}
