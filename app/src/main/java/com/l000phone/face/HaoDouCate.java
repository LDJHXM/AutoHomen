package com.l000phone.face;

import com.l000phone.entity.Cate;

import java.util.Map;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 第一页的接口
 */

public interface HaoDouCate {

    @FormUrlEncoded
    @POST("hop/router/rest.json?action=front.get_index")
    Call<Cate> getData(@FieldMap Map<String, String> ask);
}
