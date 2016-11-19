package com.l000phone.autohomen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

public class Welcome extends AppCompatActivity {

    private Handler handler = new Handler(){

        @Override
        public void handleMessage(Message msg) {

            startActivity(new Intent(Welcome.this,MainActivity.class));
            finish();
            super.handleMessage(msg);
        }
    };






    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_welcome);

      handler.sendEmptyMessageDelayed(0,2000);




    }
}
