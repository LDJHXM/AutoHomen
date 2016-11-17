package com.l000phone.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.l000phone.autohomen.R;

/**
 * Created by DJ on 2016/11/16.
 */

public class Mine extends Fragment implements View.OnClickListener {
    private View views;
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
    private TextView myName;
    private ImageView mySetting;

    //判断是否登录的标记值
    private boolean flag = true;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       if(flag) {
          views = inflater.inflate(R.layout.fragment_my, null);
           //界面控件实例初始化
           intiWidge();
           return views;

       }else{
          views = inflater.inflate(R.layout.fragment_myright,null);
           //界面控件实例的初始化
           initRightWdger();
           //界面空间实例对应的相关跳转
//            jumpRightWidge();
           return views;
       }



    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

       super.onActivityCreated(savedInstanceState);
    }

//    private void jumpRightWidge() {
//    }


    /**
     * 登录，界面实例初始化
     */
    private void initRightWdger() {
        myName =(TextView)views.findViewById(R.id.tv_myright_user) ;
        myName.setOnClickListener(this);

        mySetting = (ImageView)views.findViewById(R.id.img_myright_setting) ;
        mySetting.setOnClickListener(this);

        myRecipe = (TextView) views.findViewById(R.id.tv_myright_menu);
        myRecipe.setOnClickListener(this);

        myDraft  =  (TextView) views.findViewById(R.id.tv_myright_draft);
        myDraft.setOnClickListener(this);

        myTopic  =  (TextView) views.findViewById(R.id.tv_myright_topic);
        myTopic.setOnClickListener(this);

        myPutRegist = (TextView) views.findViewById(R.id.tv_myright_recipe);
        myPutRegist.setOnClickListener(this);

        myAction = (TextView) views.findViewById(R.id.tv_myright_action);
        myAction.setOnClickListener(this);

        myMessage = (TextView) views.findViewById(R.id.tv_myright_message);
        myMessage.setOnClickListener(this);

        myDownload = (TextView) views.findViewById(R.id.tv_myright_download);
        myDownload.setOnClickListener(this);

        myCollection = (TextView) views.findViewById(R.id.tv_myright_collection);
        myCollection.setOnClickListener(this);

        myOrder = (TextView) views.findViewById(R.id.tv_myright_order);
        myOrder.setOnClickListener(this);
    }

    /**
     * 未登录，界面实例的初始化
     */
    private void intiWidge() {
        mySetting = (ImageView) views.findViewById(R.id.img_my_setting);
        mySetting.setOnClickListener(this);

        myLogin = (Button) views.findViewById(R.id.btn_my_login);
        myLogin.setOnClickListener(this);

        myRegist = (Button) views.findViewById(R.id.btn_my_regist);
        myRegist.setOnClickListener(this);

        myRecipe = (TextView) views.findViewById(R.id.tv_my_menu);
        myRecipe.setOnClickListener(this);

        myDraft  =  (TextView) views.findViewById(R.id.tv_my_draft);
        myDraft.setOnClickListener(this);

        myTopic  =  (TextView) views.findViewById(R.id.tv_my_topic);
        myTopic.setOnClickListener(this);

        myPutRegist = (TextView) views.findViewById(R.id.tv_my_recipe);
        myPutRegist.setOnClickListener(this);

        myAction = (TextView) views.findViewById(R.id.tv_my_action);
        myAction.setOnClickListener(this);

        myMessage = (TextView) views.findViewById(R.id.tv_my_message);
        myMessage.setOnClickListener(this);

        myDownload = (TextView) views.findViewById(R.id.tv_my_download);
        myDownload.setOnClickListener(this);

        myCollection = (TextView) views.findViewById(R.id.tv_my_collection);
        myCollection.setOnClickListener(this);

        myOrder = (TextView) views.findViewById(R.id.tv_my_order);
        myOrder.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
    }
}
