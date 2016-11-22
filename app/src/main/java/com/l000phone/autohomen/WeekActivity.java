package com.l000phone.autohomen;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.l000phone.adapter.RvAdapter;
import com.l000phone.entity.Cate;
import com.l000phone.face.HaoDouCate_Week;
import com.l000phone.util.GetMap;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeekActivity extends AppCompatActivity {


    private Button mBtn;
    private TextView mText;
    private RecyclerView mRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week);


        //界面实例的获取
        mBtn = (Button) findViewById(R.id.week_btn_id);
        mText = (TextView) findViewById(R.id.week_text_id);
        mRv = (RecyclerView) findViewById(R.id.week_rv_id);

        //获得传过来的标题

        Bundle bundle = this.getIntent().getExtras();

        String title = bundle.getString("title");

        mText.setText(title);

        //下载数据,并展现出来
        getData();


    }


    public void getData() {

        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("http://hop.haodou.com/").
                addConverterFactory(GsonConverterFactory.create()).build();

        HaoDouCate_Week hdc_w = retrofit.create(HaoDouCate_Week.class);

        Call<Cate> call = hdc_w.getData(GetMap.getMap2());

        call.enqueue(new Callback<Cate>() {
            @Override
            public void onResponse(Call<Cate> call, Response<Cate> response) {

                Cate cate = response.body();

                //关于RecyclerView的操作

                List<Cate.DataBean.ListBean> list =
                        cate.getData().getList();

                aboutRecyclerView(list);

            }

            @Override
            public void onFailure(Call<Cate> call, Throwable t) {

            }
        });


    }

    /**
     * 关于RecyclerView的操作
     *
     * @param list
     */
    private void aboutRecyclerView(List<Cate.DataBean.ListBean> list) {

        // 设置固定大小
        mRv.setHasFixedSize(true);

        //初始化布局
        mRv.setLayoutManager(new StaggeredGridLayoutManager
                (3,StaggeredGridLayoutManager.VERTICAL));

        //初始化适配器
        RvAdapter adapter = new RvAdapter(list,this);

        mRv.setAdapter(adapter);

        SpacesItemDecoration decoration=new SpacesItemDecoration(16);

        mRv.addItemDecoration(decoration);


    }

    public class SpacesItemDecoration extends RecyclerView.ItemDecoration{

        private int space;

        public SpacesItemDecoration(int space) {
            this.space = space;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {

            outRect.left=space;
            outRect.right=space;
            outRect.bottom=space;
            if(parent.getChildAdapterPosition(view)==0){
                outRect.top=space;
            }
        }
    }
}
