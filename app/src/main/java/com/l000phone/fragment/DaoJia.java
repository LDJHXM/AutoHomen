package com.l000phone.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.l000phone.autohomen.R;

import org.xutils.db.annotation.Table;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by DJ on 2016/11/16.
 */

public class DaoJia extends Fragment {

    private Spinner mSpinner;
    private ListView mListView;
    private LinearLayout mContainTab;
    private TextView mLocation;
    private FragmentActivity context;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        context = getActivity();

        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.daojia_fragment, null);
        mSpinner = (Spinner) view.findViewById(R.id.spinner_id);
        mListView = (ListView) view.findViewById(R.id.listView_id);
        mContainTab = (LinearLayout) view.findViewById(R.id.tablayout_id);
        mLocation = (TextView) view.findViewById(R.id.location_id);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //1，关于spinner的操做
        aboutSpinner();
        //2,关于location的操做
        aboutLocetion();
        //3,关于标签的操做
        abouttab();
        //4,关于listview的操做
        aboutListView();

    }

    /**
     * 4,关于listview的操做
     */
    private void aboutListView() {
        List<String> listData = new LinkedList<>();
        for(int i=0;i<6;i++) {
            String tabText = i+ "";
            listData.add(tabText);
            listData.add(tabText);
        }
        ArrayAdapter<String> spAdapter = new ArrayAdapter<String>(context,
                android.R.layout.simple_list_item_1, listData);
        mListView.setAdapter(spAdapter);


    }

    /**
     * 3,关于标签的操做
     */
    private void abouttab() {
        //1,向容器中添加子标签,和给每一个子标签添加监视器

        for(int i=0;i<6;i++){
            TextView mText= (TextView) View.inflate(context, R.layout.daojia_tab, null);
            mText.setText("This is "+i);
            mContainTab.addView(mText);
        }

    }

    /**
     * 各个标签的监视器
     */
    private class TabLinstener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            int tag = (int) view.getTag();
            Toast.makeText(context,"点击了"+tag,Toast.LENGTH_LONG).show();

        }
    }

    /**
     * 2,关于location的操做
     */
    private void aboutLocetion() {
    }

    /**
     * 1,关于spinner的操做
     */
    private void aboutSpinner() {
        String []spData=new String[]{"全部","附近","全国"};
        ArrayAdapter<String> spAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, spData);
        mSpinner.setAdapter(spAdapter);
        mSpinner.getChildAt(0);

    }
}
