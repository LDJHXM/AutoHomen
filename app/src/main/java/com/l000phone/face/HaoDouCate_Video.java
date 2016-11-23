package com.l000phone.face;

import com.l000phone.entity.Cate_Video;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 分类中的分类接口
 */

public interface HaoDouCate_Video {

    @FormUrlEncoded
    @POST("http://api.haodou.com/index.php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid=1479865185000&vc=105&vn=6.1.15&loguid=10283273&deviceid=haodou864394010248476&uuid=bdf542fa8eb3bcbc457a5383dc48fc0c&channel=anzhi_v6115&method=Info.getInfo&virtual=&signmethod=md5&v=3&timestamp=1479868575&nonce=0.21184382202500307&appsign=9291b3b7969ce7f9efb5c269d46fe883")
    Call<Cate_Video> getData(@FieldMap Map<String, String> ask);

}
