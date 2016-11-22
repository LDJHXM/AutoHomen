package com.l000phone.face;

import com.l000phone.entity.Cate_HotEvent;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 第一页的接口
 */

public interface HaoDouCate_HotEvent {

    @FormUrlEncoded
    @POST("http://api.haodou.com/index.php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid=1479796305354&vc=105&vn=6.1.15&loguid=10283273&deviceid=haodou864394010248476&uuid=bdf542fa8eb3bcbc457a5383dc48fc0c&channel=anzhi_v6115&method=Event.getOfficialList&virtual=&signmethod=md5&v=3&timestamp=1479796310&nonce=0.7569679797892744&appsign=927312bf452da7fbdd3e385ce5c489f8")
    Call<Cate_HotEvent> getData(@FieldMap Map<String, String> ask);

}
