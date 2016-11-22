package com.l000phone.face;

import com.l000phone.entity.Cate;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * week美食的接口
 */


public interface HaoDouCate_Week {

    @FormUrlEncoded
    @POST("http://hop.haodou.com/hop/router/rest.json?action=cms.feed.page")
    Call<Cate> getData(@FieldMap Map<String, String> ask);
}
