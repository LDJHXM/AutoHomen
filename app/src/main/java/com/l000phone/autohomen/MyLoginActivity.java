package com.l000phone.autohomen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/11/17.
 */

public class MyLoginActivity extends AppCompatActivity {
    private TextView myLoginReturn;
    private Button myLoginRegist;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mylogin);

        //取消操作
        myLoginReturn = (TextView) this.findViewById(R.id.btn_mylogin_return);
        myLoginReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //跳转注册页面
        myLoginRegist = (Button) this.findViewById(R.id.btn_mylogin_regist);
        myLoginRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MyLoginActivity.this, MyRegistActivity.class);
                startActivity(intent);
            }
        });


    }


}
