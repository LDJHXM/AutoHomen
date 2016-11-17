package com.l000phone.autohomen;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/11/17.
 */

public class MyPutRecipeActivity extends AppCompatActivity {
    private TextView putRecipeReturn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_putrecipe);

        //取消操作
        putRecipeReturn = (TextView) this.findViewById(R.id.btn_putrecipe_return);
        putRecipeReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);
    }


}
