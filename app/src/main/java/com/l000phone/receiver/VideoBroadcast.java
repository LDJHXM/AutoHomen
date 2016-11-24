package com.l000phone.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.l000phone.adapter.StepListAdapter;
import com.l000phone.entity.Cate_Video;

import java.util.List;

/**
 * Created by DJ on 2016/11/24.
 */

public class VideoBroadcast extends BroadcastReceiver {


    private StepListAdapter adapter;
    List<Cate_Video.ResultBean.InfoBean.StepsBean> steps;

    public VideoBroadcast(StepListAdapter adapter, List<Cate_Video.ResultBean.InfoBean.StepsBean> steps) {
        this.adapter = adapter;
        this.steps = steps;
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        int cnt = intent.getIntExtra("cnt", 0);


        for(Cate_Video.ResultBean.InfoBean.StepsBean step : steps){

            step.setFlg(false);

        }

        cnt = cnt-1;

        steps.get(cnt).setFlg(true);

        adapter.notifyDataSetChanged();



    }
}
