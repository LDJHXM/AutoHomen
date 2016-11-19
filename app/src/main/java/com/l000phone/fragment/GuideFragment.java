package com.l000phone.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.l000phone.autohomen.MainActivity;
import com.l000phone.autohomen.R;


/**
 * Created by DJ on 2016/10/15.
 */

public class GuideFragment extends Fragment {

    private int picId;
    private RelativeLayout rl;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        Bundle bundle = getArguments();
        picId = bundle.getInt("picId");


        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rl = (RelativeLayout) inflater.inflate(R.layout.guide_fragment, null);
        return rl;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        //将宿主传过来的图片ID，设置到ImageView当中

        //如果是前面三张图片的话
        if (picId != 0) {
            ImageView imageView = (ImageView) rl.findViewById(R.id.tl_iv_id);

            imageView.setImageResource(picId);

        } else {

            View view = View.inflate(getActivity(), R.layout.four_pic, null);

            ImageView mIb = (ImageView) view.findViewById(R.id.ib_id);

            mIb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //点击之后，将使用情况使用SharedPreferences保存起来
                    SharedPreferences preferences = getActivity().getSharedPreferences("info", Context.MODE_PRIVATE);

                    SharedPreferences.Editor edit = preferences.edit();

                    edit.putBoolean("isUse", true);

                    edit.commit();

                    //跳转到主界面

                    startActivity(new Intent(getActivity(), MainActivity.class));

                    //销毁引导界面
                    getActivity().finish();

                }
            });

            rl.addView(view);
        }
        super.onActivityCreated(savedInstanceState);
    }


}
