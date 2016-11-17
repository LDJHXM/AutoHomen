package com.l000phone.retrofit;

import com.l000phone.entity.Cate;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by DJ on 2016/11/17.
 */

public class AppHaoDou {

    public String post;


    public interface HaoDouCate{

        @FormUrlEncoded
        @POST()
        Call<Cate> getData(@FieldMap Map<String,String> ask);
    }

    static  Retrofit retrofit = new Retrofit.Builder().
            baseUrl("http://hop.haodou.com/").
            addConverterFactory(GsonConverterFactory.create()).build();



}
