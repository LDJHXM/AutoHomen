package com.l000phone.biz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.l000phone.autohomen.R;
import com.l000phone.myview.SlideSwitch;

public class SettingActivity extends AppCompatActivity {
    private SlideSwitch sPic;
    private SlideSwitch sNight;
    private SlideSwitch sMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //滑动开关实例
        sPic = (SlideSwitch) this.findViewById(R.id.ss_setting_pic);
        sNight = (SlideSwitch) this.findViewById(R.id.ss_setting_night);
        sMessage = (SlideSwitch) this.findViewById(R.id.ss_setting_mesage);


        //相关操作
        ImageAction();
        NightAction();
        MessageAction();

    }

    //推送消息
    private void MessageAction() {
                sMessage.setOnStateChangedListener(new SlideSwitch.OnStateChangedListener(){

            @Override
            public void onStateChanged(boolean state) {
                // TODO Auto-generated method stub
                if(true == state)
                {
                    Toast.makeText(SettingActivity.this, "开关已打开", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(SettingActivity.this, "开关已关闭", Toast.LENGTH_LONG).show();
                }
            }

        });

    }

    //2G/3G下展示图片
    private void ImageAction() {
        sPic.setOnStateChangedListener(new SlideSwitch.OnStateChangedListener(){

            @Override
            public void onStateChanged(boolean state) {
                // TODO Auto-generated method stub
                if(true == state)
                {
                    Toast.makeText(SettingActivity.this, "开关已打开", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(SettingActivity.this, "开关已关闭", Toast.LENGTH_LONG).show();
                }
            }

        });
    }

    //夜间模式
    private void NightAction() {
        sNight.setOnStateChangedListener(new SlideSwitch.OnStateChangedListener(){

            @Override
            public void onStateChanged(boolean state) {
                // TODO Auto-generated method stub
                if(true == state)
                {
                    Toast.makeText(SettingActivity.this, "开关已打开", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(SettingActivity.this, "开关已关闭", Toast.LENGTH_LONG).show();
                }
            }

        });
    }
}


