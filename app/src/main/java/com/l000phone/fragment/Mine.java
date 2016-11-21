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

import com.l000phone.autohomen.MainActivity;
import com.l000phone.autohomen.MyActionActivity;
import com.l000phone.autohomen.MyCollectionActivity;
import com.l000phone.autohomen.MyDownLoadActivity;
import com.l000phone.autohomen.MyDraftActivity;
import com.l000phone.autohomen.MyLoginActivity;
import com.l000phone.autohomen.MyMessageActivity;
import com.l000phone.autohomen.MyOrderActivity;
import com.l000phone.autohomen.MyPutRecipeActivity;
import com.l000phone.autohomen.MyRecipeActivity;
import com.l000phone.autohomen.MyRegistActivity;
import com.l000phone.autohomen.MySettingActivity;
import com.l000phone.autohomen.MyTopicActivity;
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
    private TextView myPutRecipe;
    private TextView myAction;
    private TextView myMessage;
    private TextView myDownload;
    private TextView myCollection;
    private TextView myOrder;
    private TextView myName;
    private ImageView mySetting;

    private Button quit;
    private boolean flags;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        if (!MyLoginActivity.flags) {
          views = inflater.inflate(R.layout.fragment_my, null);
           //界面控件实例初始化
           intiWidge();
           return views;

       }else{
          views = inflater.inflate(R.layout.fragment_myright,null);
           //界面控件实例的初始化
           initRightWdger();

           return views;
       }



    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

       super.onActivityCreated(savedInstanceState);
    }

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

        myPutRecipe = (TextView) views.findViewById(R.id.tv_myright_recipe);
        myPutRecipe.setOnClickListener(this);

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

        //退出登录
        quit = (Button) views.findViewById(R.id.btn_myright_quit);
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyLoginActivity.flags = false;
                Intent intent = new Intent();
                intent.setClass(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });
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

        myPutRecipe = (TextView) views.findViewById(R.id.tv_my_recipe);
        myPutRecipe.setOnClickListener(this);

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
        switch (view.getId()) {
            case R.id.img_my_setting:
                intent.setClass(getActivity(), MySettingActivity.class);
                break;
            case R.id.btn_my_regist:
                intent.setClass(getActivity(), MyRegistActivity.class);
                break;
            case R.id.tv_myright_user:
                //intent.setClass(getActivity(), MySettingActivity.class);
                break;
            case R.id.img_myright_setting:
                intent.setClass(getActivity(), MySettingActivity.class);
                break;
            case R.id.tv_myright_menu:
                intent.setClass(getActivity(), MyRecipeActivity.class);
                break;
            case R.id.tv_myright_draft:
                intent.setClass(getActivity(), MyDraftActivity.class);
                break;
            case R.id.tv_myright_topic:
                intent.setClass(getActivity(), MyTopicActivity.class);
                break;
            case R.id.tv_myright_recipe:
                intent.setClass(getActivity(), MyPutRecipeActivity.class);
                break;
            case R.id.tv_myright_action:
                intent.setClass(getActivity(), MyActionActivity.class);
                break;
            case R.id.tv_myright_message:
                intent.setClass(getActivity(), MyMessageActivity.class);
                break;
            case R.id.tv_myright_download:
                intent.setClass(getActivity(), MyDownLoadActivity.class);
                break;
            case R.id.tv_myright_collection:
                intent.setClass(getActivity(), MyCollectionActivity.class);
                break;
            case R.id.tv_myright_order:
                intent.setClass(getActivity(), MyOrderActivity.class);
                break;
            default:
                intent.setClass(getActivity(), MyLoginActivity.class);
                break;
        }

        startActivity(intent);
    }
}
