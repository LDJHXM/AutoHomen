package com.l000phone.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.l000phone.autohomen.R;
import com.l000phone.autohomen.Web1Activity;
import com.squareup.picasso.Picasso;

/**
 * Created by DJ on 2016/11/16.
 */

public class ViewPager_Fragment extends Fragment {

    private ImageView mVp_pic;
    private TextView mVp_text;
    private String title;
    private String imgs;
    private String url;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        Bundle arguments = getArguments();

        title = arguments.getString("title");

        Log.i("arg",title);
        imgs = arguments.getString("imgs");
        url = arguments.getString("url");

        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_viewpager, container, false);

        mVp_pic = (ImageView) view.findViewById(R.id.vp_pic_id);
        mVp_text = (TextView) view.findViewById(R.id.vp_text_id);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url2 = null;

                String url3 =null;

                if(url.contains("collect")){

                    url2 = url.substring(url.lastIndexOf("id=")+3);

                    url3 = "http://www.haodou.com/recipe/album/"+url2+"/";


                }else if(url.contains("opentopic")){

                    url2 = url.substring(url.lastIndexOf("topic"),url.lastIndexOf("&"));


                    url3 = "http://group.haodou.com/"+url2;

                }else{
                    url2 = url.substring(url.lastIndexOf("id=")+3,url.lastIndexOf("&"));

                    url3 = "http://www.haodou.com/recipe/"+url2+"/";
                }

                Intent intent = new Intent(getActivity(), Web1Activity.class);

                intent.putExtra("url", url3);

                startActivity(intent);


            }
        });

        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        mVp_text.setText(title);

        Picasso.with(getActivity()).load(imgs).fit().placeholder(R.drawable.splish_logo)
                .error(R.drawable.splish_logo).into(mVp_pic);

        super.onActivityCreated(savedInstanceState);
    }
}
