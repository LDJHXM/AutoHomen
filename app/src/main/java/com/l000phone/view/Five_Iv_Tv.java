package com.l000phone.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.l000phone.autohomen.R;
import com.squareup.picasso.Picasso;

/**
 * Created by DJ on 2016/11/17.
 */

public class Five_Iv_Tv extends LinearLayout {

    private ImageView mImg;
    private TextView mText;
    private View view;

    public Five_Iv_Tv(Context context) {
        super(context);
    }

    public Five_Iv_Tv(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.abc_print_writing, this);

        view = findViewById(R.id.five_father);
        mImg = (ImageView) findViewById(R.id.five_img);
        mText = (TextView) findViewById(R.id.five_text);
    }

    /**
     * 设置文字
     * @param info
     */
    public void abc_SetText(String info){

        mText.setText(info);

    }

    /**
     * 设置图片
     * @param info
     */
    public void abc_SetImg(String info){

      Picasso.with(getContext()).load(info).fit().placeholder(R.mipmap.ic_launcher)
              .into(mImg);

    }

    public void abc_setClick(OnClickListener listener){


        view.setOnClickListener(listener);

    }



}
