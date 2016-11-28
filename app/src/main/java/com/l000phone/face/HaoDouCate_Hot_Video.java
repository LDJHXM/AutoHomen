package com.l000phone.face;

import com.l000phone.entity.Cate_Hot_Video;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 第一页的接口
 */

public interface HaoDouCate_Hot_Video {

    @FormUrlEncoded
    @POST("http://api.haodou.com/index.php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid=1480299323112&vc=105&vn=6.1.15&loguid=0&deviceid=haodou864394010208983&uuid=e0ab40ac1ee9466a0ef6ab2f545284e8&channel=anzhi_v6115&method=Video.index&virtual=&signmethod=md5&v=3&timestamp=1480299590&nonce=0.11685979488121301&appsign=eca81ebf556b889e0fc88cea651a5cd2")
    Call<Cate_Hot_Video> getData(@FieldMap Map<String, String> ask);
}
