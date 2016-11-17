package com.l000phone.asynctask;

import android.os.AsyncTask;
import android.util.Log;

import com.l000phone.entity.Cate;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by DJ on 2016/11/17.
 */

public class DownloadFirstData extends AsyncTask <Void,Void,Cate> {

    private JsonCallBack callBack;
    private Cate body;


    public DownloadFirstData(JsonCallBack callBack) {
        this.callBack = callBack;
    }

    @Override
    protected Cate doInBackground(Void... hehe) {

       getCateDate();

        Log.i("niubi",body==null?"没有数据":body.toString());

        return body;

    }

    @Override
    protected void onPostExecute(Cate resykt) {

        Log.e("hehda",resykt==null?"没有数据":resykt.toString());


            callBack.setJSONData(resykt);

    }

    private void getCateDate(){


        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("http://hop.haodou.com/").
                addConverterFactory(GsonConverterFactory.create()).build();

        HaoDouCate hdc =  retrofit.create(HaoDouCate.class);

        Map<String,String> ask = new HashMap<>();

        ask.put("_HOP_", "{\"sign\":\"ba4767a053ddfe6f66c3a265cc23251f\"," +
                "\"action\":\"front.get_index\",\"current_time\":1479269055," +
                "\"secret_id\":\"5722f877e4b0d4512e3fd872\",\"version\":\"1.0\"}");
        ask.put("appid", "2");
        ask.put("appkey", "9ef269eec4f7a9d07c73952d06b5413f");
        ask.put("channel", "anzhi_v6115");
        ask.put("deviceid", "haodou864394010208983");
        ask.put("from", "android");
        ask.put("ip", "172.16.152.15");
        ask.put("limit", "30");
        ask.put("loguid", "0");
        ask.put("network", "WIFI");
        ask.put("offset", "0");
        ask.put("sign", "");
        ask.put("uid", "0");
        ask.put("uuid", "9ea70fa9356586ff23fc31785f735cf1");
        ask.put("vc", "105");
        ask.put("virtual", "0");
        ask.put("vn", "6.1.15");

        Call<Cate> call = hdc.getData(ask);


        call.enqueue(new Callback<Cate>() {


            @Override
            public void onResponse(Call<Cate> call, Response<Cate> response) {

             body = response.body();


                Log.d("abcd", body.getData().getList().get(0).getTitle());


            }

            @Override
            public void onFailure(Call<Cate> call, Throwable t) {



            }
        });





    }

    // 设置JSON格式的数据回调接口
    public interface JsonCallBack {

        void setJSONData(Cate result);

    }

    public interface HaoDouCate{

        @FormUrlEncoded
        @POST("hop/router/rest.json?action=front.get_index")
        Call<Cate> getData(@FieldMap Map<String,String> ask);

    }
}
