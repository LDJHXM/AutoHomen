package com.l000phone.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.l000phone.adapter.Commentdapter;
import com.l000phone.autohomen.R;
import com.l000phone.entity.Cate_Comment;
import com.l000phone.face.HaoDouCate_Comment;
import com.l000phone.util.GetMap;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by DJ on 2016/11/16.
 */

public class Video_comment extends Fragment {
    private List<Cate_Comment.ResultBean.ListBean> list;
    private ListView mLv;
    private EditText mEt;
    private TextView mSend;
    private int cnt = -1;
    private Commentdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("http://hop.haodou.com/").
                addConverterFactory(GsonConverterFactory.create()).build();

        HaoDouCate_Comment hdc = retrofit.create(HaoDouCate_Comment.class);


        Call<Cate_Comment> call = hdc.getData(GetMap.getMap_Comment());

        call.enqueue(new Callback<Cate_Comment>() {


            @Override
            public void onResponse(Call<Cate_Comment> call, Response<Cate_Comment> response) {

                Cate_Comment body = response.body();

                list = body.getResult().getList();

                aboutListView(list);

                aboutTextView(list);

            }

            @Override
            public void onFailure(Call<Cate_Comment> call, Throwable t) {

            }
        });

        super.onCreate(savedInstanceState);
    }


    private void aboutTextView(final List<Cate_Comment.ResultBean.ListBean> list) {

        mSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cnt==-1){

                    String info = mEt.getText().toString();

                    Cate_Comment.ResultBean.ListBean listBean = new Cate_Comment.ResultBean.ListBean();

                    listBean.setAvatar("http://avatar0.hoto.cn/82/49/9128322_185.jpg");
                    listBean.setContent(info);
                    listBean.setCreateTime("刚刚");
                    listBean.setUserName("善良的滴鸡");

                    list.add(0,listBean);

                    mEt.setText("");


                    adapter.notifyDataSetChanged();


                    Toast.makeText(getActivity(), "评论成功", Toast.LENGTH_SHORT).show();


                }else {


                    String info = mEt.getText().toString();


                    Cate_Comment.ResultBean.ListBean listBean = new Cate_Comment.ResultBean.ListBean();

                    listBean.setAvatar("http://avatar0.hoto.cn/82/49/9128322_185.jpg");
                    listBean.setContent(info);
                    listBean.setAtContent(list.get(cnt).getContent());
                    listBean.setAtUserName(list.get(cnt).getUserName());
                    listBean.setCreateTime("刚刚");
                    listBean.setUserName("善良的滴鸡");

                    list.add(0,listBean);

                    mEt.setText("");

                    adapter.notifyDataSetChanged();

                    Toast.makeText(getActivity(), "回复成功", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {




        View view = inflater.inflate(R.layout.video_comment, container, false);

        mLv = (ListView) view.findViewById(R.id.comment_lv);

        mEt = (EditText) view.findViewById(R.id.comment_et);

        mSend = (TextView) view.findViewById(R.id.comment_send);

        mEt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mEt.getText()!=null){

                    mSend.setTextColor(ContextCompat.getColor(getActivity(),R.color.orange));

                }else{

                    mSend.setTextColor(ContextCompat.getColor(getActivity(),R.color.gray));
                }

            }
        });

        return view;
    }


    private void aboutListView(final List<Cate_Comment.ResultBean.ListBean> list) {

        adapter = new Commentdapter(list, getActivity());

        mLv.setAdapter(adapter);

        mLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                mEt.setHint("回复 : "+list.get(i).getUserName());

                cnt = i;

            }
        });


    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        
        super.onActivityCreated(savedInstanceState);
    }
}
