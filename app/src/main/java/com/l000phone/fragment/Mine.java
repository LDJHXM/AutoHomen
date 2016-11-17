package com.l000phone.fragment;

import android.content.Context;
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
import android.widget.Toast;

import com.l000phone.autohomen.MainActivity;
import com.l000phone.autohomen.MyLoginActivity;
import com.l000phone.autohomen.MySettingActivity;
import com.l000phone.autohomen.R;

/**
 * Created by DJ on 2016/11/16.
 */

public class Mine extends Fragment {
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
        mySetting = (ImageView)views.findViewById(R.id.img_myright_setting) ;
        myRecipe = (TextView) views.findViewById(R.id.tv_myright_user);
        myRecipe = (TextView) views.findViewById(R.id.tv_myright_menu);
        myDraft  =  (TextView) views.findViewById(R.id.tv_myright_draft);
        myTopic  =  (TextView) views.findViewById(R.id.tv_myright_topic);
        myPutRegist = (TextView) views.findViewById(R.id.tv_myright_recipe);
        myAction = (TextView) views.findViewById(R.id.tv_myright_action);
        myMessage = (TextView) views.findViewById(R.id.tv_myright_message);
        myDownload = (TextView) views.findViewById(R.id.tv_myright_download);
        myCollection = (TextView) views.findViewById(R.id.tv_myright_collection);
        myOrder = (TextView) views.findViewById(R.id.tv_myright_order);
    }

    /**
     * 未登录，界面实例的初始化
     */
    private void intiWidge() {
        mySetting = (ImageView)views.findViewById(R.id.img_my_setting) ;
        myLogin = (Button) views.findViewById(R.id.btn_my_login);
        myRegist = (Button) views.findViewById(R.id.btn_my_regist);
        myRecipe = (TextView) views.findViewById(R.id.tv_my_menu);
        myDraft  =  (TextView) views.findViewById(R.id.tv_my_draft);
        myTopic  =  (TextView) views.findViewById(R.id.tv_my_topic);
        myPutRegist = (TextView) views.findViewById(R.id.tv_my_recipe);
        myAction = (TextView) views.findViewById(R.id.tv_my_action);
        myMessage = (TextView) views.findViewById(R.id.tv_my_message);
        myDownload = (TextView) views.findViewById(R.id.tv_my_download);
        myCollection = (TextView) views.findViewById(R.id.tv_my_collection);
        myOrder = (TextView) views.findViewById(R.id.tv_my_order);
    }


}
