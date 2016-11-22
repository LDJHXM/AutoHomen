package com.l000phone.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.l000phone.autohomen.R;
import com.l000phone.entity.Cate;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by DJ on 2016/11/20.
 */

public class RvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Cate.DataBean.ListBean> list ;
    private Context context;
    private MyItemClickListener listenr;


    public RvAdapter(List<Cate.DataBean.ListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {



        return new VH(LayoutInflater.from(context).inflate(R.layout.qwe_week,parent,false));
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {

        //判断是否设置了监听器

        if(listenr!=null) {
            // holder.itemView.setBackgroundResource(R.drawable.item_color);

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int postion = holder.getLayoutPosition();

                    listenr.onItemClick(holder.itemView, postion);
                }
            });
        }

        VH vh = (VH) holder;

        Picasso.with(context).load(list.get(position).getImgs().get(0))
               .placeholder(R.drawable.splish_logo).into(vh.mImg);

        vh.mText.setText(list.get(position).getTitle());

        vh.mText2.setText(list.get(position).getDesc());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class VH extends RecyclerView.ViewHolder{


        private final ImageView mImg;
        private final TextView mText;
        private final TextView mText2;

        public VH(View itemView) {
            super(itemView);


            mImg = (ImageView) itemView.findViewById(R.id.qwe_week_img);
            mText = (TextView) itemView.findViewById(R.id.qwe_week_text);
            mText2 = (TextView) itemView.findViewById(R.id.qwe_week_text2);

        }
    }

    /**
     * 自定义回调接口
     */
    public interface MyItemClickListener{

        void onItemClick(View view,int postion);
    }
}
