package com.l000phone.autohomen;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
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
    private SwipeRefreshLayout mSr;
    private RvAdapter adapter;
    private StaggeredGridLayoutManager manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week);


        //界面实例的获取
        //mBtn = (Button) findViewById(R.id.week_btn_id);
        mText = (TextView) findViewById(R.id.week_text_id);
        mRv = (RecyclerView) findViewById(R.id.week_rv_id);
        mSr = (SwipeRefreshLayout) findViewById(R.id.swipe_id);


        mSr.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                getData();

            mSr.setRefreshing(false);

            }
        });

       /* mSr.setProgressViewOffset(false, 0, (int) TypedValue
                .applyDimension(TypedValue.COMPLEX_UNIT_DIP, 24, getResources()
                        .getDisplayMetrics()));*/

      /*  mRv.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {

                super.onScrollStateChanged(recyclerView, newState);

                if(newState == RecyclerView.SCROLL_STATE_IDLE && lastVisibleItem.length + 1 == adapter.getItemCount()){


                    getData();

                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);


                int[] arg = {dx,dy};

                lastVisibleItem = manager.findLastVisibleItemPositions(arg);

            }
        });*/

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


        manager = new StaggeredGridLayoutManager
                (2, StaggeredGridLayoutManager.VERTICAL);

        //初始化布局
        mRv.setLayoutManager(manager);

        //初始化适配器
        adapter = new RvAdapter(list, this);

        mRv.setAdapter(adapter);

        SpacesItemDecoration decoration = new SpacesItemDecoration(16);

        mRv.addItemDecoration(decoration);

        adapter.setOnItemClickListener(new RvAdapter.MyItemClickListener() {
            @Override
            public void onItemClick(View view, String url3) {


                Log.i("lianjie", url3);

                Intent intent = new Intent(WeekActivity.this, Web1Activity.class);

                intent.putExtra("url", url3);

                startActivity(intent);

            }
        });


    }


    public class SpacesItemDecoration extends RecyclerView.ItemDecoration {

        private int space;

        public SpacesItemDecoration(int space) {
            this.space = space;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {

            outRect.left = space;
            outRect.right = space;
            outRect.bottom = space;
            if (parent.getChildAdapterPosition(view) == 0) {
                outRect.top = space;
            }
        }
    }

    public void back (View view){

        finish();
    }
}
