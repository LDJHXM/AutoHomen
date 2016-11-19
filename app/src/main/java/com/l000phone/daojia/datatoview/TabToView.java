package com.l000phone.daojia.datatoview;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.l000phone.autohomen.R;
import com.l000phone.daojia.myentitis.Entity;

import java.util.List;

/**
 * Created by Administrator on 2016/11/19/019.
 */

public class TabToView {

    public void  aboutTabview(List data, LinearLayout mContainTab, Context context) {
        Log.i("data", "tabview"+data.toString());

        TabLinstener listener = new TabLinstener(context);
        for (int i = 0; i < data.size(); i++) {
            TextView mPerTab = (TextView) View.inflate(context, R.layout.daojia_tab,
                    null);
            Entity.ResultBean.CateListBean perTab = (Entity.ResultBean.CateListBean)
                    data.get(i);
            String cateName = perTab.getCateName();
            mPerTab.setText(cateName);
            //监视器
            mPerTab.setOnClickListener(listener);
            mContainTab.addView(mPerTab);

        }

    }


    /**
     * 各个标签的监视器
     */
    private class TabLinstener implements View.OnClickListener{

        private Context context;

        public TabLinstener(Context context) {
            this.context = context;
        }

        @Override
        public void onClick(View view) {
            //TODO 界面的跳转
            Toast.makeText(context,"点击了",Toast.LENGTH_LONG).show();

        }
    }
}
