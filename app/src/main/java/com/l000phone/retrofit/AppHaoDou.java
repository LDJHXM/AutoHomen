package com.l000phone.retrofit;

import com.l000phone.entity.Cate;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by DJ on 2016/11/17.
 */

public class AppHaoDou {

    public interface HaoDouCate{

        @FormUrlEncoded
        @POST("rest.json")
        Call<Cate> getData(@Body Ask ask);

    }

    static Retrofit retrofit = new Retrofit.Builder().
            baseUrl("http://hop.haodou.com/hop/router/").build();

    public class Ask{
        public String appid ;
        public String appkey;
        public String channel;
        public String deviceid;
        public String from;
        public String ip;
        public String limit;
        public String loguid;
        public String network;
        public String offset;
        public String sign;
        public String uid;
        public String uuid;
        public String vc;
        public String virtual;
        public String vn;

    }




}
