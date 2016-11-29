package com.l000phone.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.l000phone.autohomen.R;
import com.squareup.picasso.Picasso;

import uk.co.senab.photoview.PhotoView;

/**
 * Created by Administrator on 2016/11/21.
 */

public class PhotoView_Pic extends Fragment {


    private String url;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        Bundle bundle = getArguments();

        url = bundle.getString("url");

        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_photo_pic, container, false);

        PhotoView viewById = (PhotoView) view.findViewById(R.id.photoview_id);

        Picasso.with(getActivity()).load(url).
                placeholder(R.drawable.default_daily_first_goods).into(viewById);

        return view;

    }



}
