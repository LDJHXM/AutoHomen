package com.l000phone.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.l000phone.autohomen.R;
import com.squareup.picasso.Picasso;

/**
 * Created by DJ on 2016/11/17.
 */

public class Five_big_Iv_Tv extends LinearLayout {

    private ImageView mImg;
    private TextView mText;
    private CustomLayout view;
    private TextView mTextBelow;
    private CustomLayout mCl;

    public Five_big_Iv_Tv(Context context) {
        super(context);
    }

    public Five_big_Iv_Tv(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.abc_big_print_writing, this);


        mCl = (CustomLayout) findViewById(R.id.custom);
        //mImg = (ImageView) inflate.findViewById(R.id.big_five_img);
        mText = (TextView) findViewById(R.id.big_five_text);
        mTextBelow = (TextView)findViewById(R.id.big_five_text_below);
    }

    /**
     * 设置文字
     * @param info
     */
    public void abc_SetText(String info){

        mText.setText(info);

    }

    public void abc_SetText_below(String info){

        mTextBelow.setText(info);

    }


    /**
     * 设置图片
     * @param
     */
  /*  public void abc_SetImg(String info){

      Picasso.with(getContext()).load(info).fit().placeholder(R.drawable.splish_logo)
              .into(mImg);

    }*/


    public void abc_setBackground(String info){

        Picasso.with(getContext()).load(info).into(mCl);
    }

    public void abc_setClick(OnClickListener listener){

        mCl.setOnClickListener(listener);

    }



}
