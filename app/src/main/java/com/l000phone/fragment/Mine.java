package com.l000phone.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.l000phone.autohomen.R;

/**
 * Created by DJ on 2016/11/16.
 */

public class Mine extends Fragment {

    private Button myLogin;
    private Button myRegist;
    private TextView myRecipe;
    private TextView myDraft;
    private TextView myTopic;
    private TextView myPutRegist;
    private TextView myAction;
    private TextView myMessage;
    private TextView myDownload;
    private TextView myCollection;
    private TextView myOrder;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_fragment,null);

        //界面控件实例初始化
        intiWidge();
        return view;
    }




    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        
       super.onActivityCreated(savedInstanceState);
    }

    /**
     * 界面实例初始化
     */
    private void intiWidge() {

    }
}
