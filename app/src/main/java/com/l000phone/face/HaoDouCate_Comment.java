package com.l000phone.face;

import com.l000phone.entity.Cate_Comment;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 热门活动接口
 */

public interface HaoDouCate_Comment {

    @FormUrlEncoded
    @POST("http://api.haodou.com/index.php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid=1479900230754&vc=105&vn=6.1.15&loguid=10283273&deviceid=haodou864394010248476&uuid=bdf542fa8eb3bcbc457a5383dc48fc0c&channel=anzhi_v6115&method=Comment.getList&virtual=&signmethod=md5&v=3&timestamp=1479900312&nonce=0.6811619875881647&appsign=c3f74ad123234ca93a3ce3e19b8cd37d")
    Call<Cate_Comment> getData(@FieldMap Map<String, String> ask);

}
