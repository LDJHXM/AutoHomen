package com.l000phone.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.l000phone.autohomen.R;
import com.squareup.picasso.Picasso;

/**
 * Created by DJ on 2016/11/19.
 */

public class Cir_Botton  extends LinearLayout{

    private CircleImageView mImg;
    private View view;
    private TextView mText;

    public Cir_Botton(Context context) {
        super(context);

    }

    public Cir_Botton(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.abc_button_round, this);

        view = findViewById(R.id.abc_botton);
        mImg = (CircleImageView) findViewById(R.id.abc_cir);
        mText = (TextView) findViewById(R.id.abc_botton_text);

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

        Picasso.with(getContext()).load(info).fit().placeholder(R.drawable.splish_logo)
                .into(mImg);

    }

    public void abc_setClick(OnClickListener listener){

        view.setOnClickListener(listener);

    }
}
