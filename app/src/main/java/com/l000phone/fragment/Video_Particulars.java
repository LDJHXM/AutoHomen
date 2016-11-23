package com.l000phone.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.l000phone.adapter.PriAdapter;
import com.l000phone.autohomen.R;
import com.l000phone.entity.Cate_Video;
import com.l000phone.view.CircleImageView;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by DJ on 2016/11/16.
 */

public class Video_Particulars extends Fragment {

    private Cate_Video.ResultBean.InfoBean info;
    private TextView mTitle;
    private CircleImageView mAvatar;
    private TextView mCom;
    private TextView mTime;
    private TextView mConunt;
    private Button mBtn1;
    private Button mBtn2;
    private Button mBtn3;
    private TextView mInfo;
    private TextView mIntro;
    private TextView mShang;
    private LinearLayout mTab;
    private LinearLayout mZan;
    private ListView mLv;
    private TextView mXts;
    private TextView mCook;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        Bundle bundle = getArguments();

        info = (Cate_Video.ResultBean.InfoBean) bundle.getSerializable("info");

        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_particulars, container, false);

        initView(view);
        Log.i("hxm",info.getTitle());

        mTitle.setText(info.getTitle());
        Picasso.with(getActivity()).load(info.getUserInfo().getAvatar()).into(mAvatar);
        mTime.setText(info.getCreateTime());
        mConunt.setText("浏览: "+info.getViewCount());
        mCom.setText("评论 :"+info.getCommentCount());
        mBtn1.setText(info.getUserInfo().getFavoriteList().get(0).getName());
        mBtn2.setText(info.getUserInfo().getFavoriteList().get(1).getName());
        mBtn3.setText(info.getUserInfo().getFavoriteList().get(2).getName());
        mInfo.setText(info.getUserInfo().getIntro());
        mIntro.setText(info.getIntro());
        mShang.setText(info.getReward().getUserListDesc()+info.getReward().getRewardCount()+"人");
        mCook.setText("制作时长 :"+info.getCookTime());

        for(int i=0;i<info.getTags().size();i++){

            TextView textView = new TextView(getActivity());

            textView.setText(info.getTags().get(i).getName());

            //textView.setLeft(20);

            textView.setPadding(100,0,0,0);

            mTab.addView(textView);
        }

        for(int i=0;i<info.getLastDiggUsers().size();i++){

            CircleImageView circleImageView = new CircleImageView(getActivity());

            circleImageView.setMaxHeight(30);
            circleImageView.setMaxWidth(30);
            Picasso.with(getActivity()).load(info.getLastDiggUsers()
                    .get(i).getAvatar()).into(circleImageView);

            mZan.addView(circleImageView);

        }

        mXts.setText(info.getTips());


        List<Cate_Video.ResultBean.InfoBean.StuffBean> stuff =
                info.getStuff();

        PriAdapter adapter = new PriAdapter(stuff, getActivity());

        mLv.setAdapter(adapter);


        return view;
    }

    /**
     * 界面实例初始化
     *
     * @param view
     */
    private void initView(View view) {

        mTitle = (TextView) view.findViewById(R.id.par_title);
        mConunt = (TextView) view.findViewById(R.id.par_ViewCount);
        mAvatar = (CircleImageView) view.findViewById(R.id.par_Avatar);
        mCom = (TextView) view.findViewById(R.id.par_CommentCount);
        mTime = (TextView) view.findViewById(R.id.par_CreateTime);
        mBtn1 = (Button) view.findViewById(R.id.par_FavoriteList_name1);
        mBtn2 = (Button) view.findViewById(R.id.par_FavoriteList_name2);
        mBtn3 = (Button) view.findViewById(R.id.par_FavoriteList_name3);
        mInfo = (TextView) view.findViewById(R.id.par_info_Intro);
        mIntro = (TextView) view.findViewById(R.id.par_Intro);
        mShang = (TextView) view.findViewById(R.id.par_shang_num);
        mTab = (LinearLayout) view.findViewById(R.id.par_ll_tab);
        mZan = (LinearLayout) view.findViewById(R.id.par_ll_zan);
        mLv = (ListView) view.findViewById(R.id.par_lv);
        mXts = (TextView) view.findViewById(R.id.par_xiaotieshi);
        mCook = (TextView) view.findViewById(R.id.par_CookTime);

    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
    }
}
