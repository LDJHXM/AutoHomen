package com.l000phone.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.l000phone.adapter.StepListAdapter;
import com.l000phone.autohomen.R;
import com.l000phone.entity.Cate_Video;

import java.util.List;

/**
 * Created by DJ on 2016/11/16.
 */

public class Video_step extends Fragment {

    private Cate_Video.ResultBean.InfoBean info;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        Bundle bundle = getArguments();

        info = (Cate_Video.ResultBean.InfoBean) bundle.getSerializable("info");

        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.video_step, container, false);

        ListView mLv = (ListView) view.findViewById(R.id.step_listview);

        List<Cate_Video.ResultBean.InfoBean.StepsBean> steps = info.getSteps();


        StepListAdapter adapter = new StepListAdapter(steps, getActivity());

        mLv.setAdapter(adapter);

        mLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getActivity(), "稍后再说"+i, Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        
        super.onActivityCreated(savedInstanceState);
    }
}
