package com.l000phone.face;

import com.l000phone.entity.Cate_Hot_Menu;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 私人
 */

public interface HaoDouCate_Hot_Menu2 {

    @FormUrlEncoded
    @POST("http://api.haodou.com/index.php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid=1479711964067&vc=105&vn=6.1.15&loguid=10283273&deviceid=haodou864394010248476&uuid=bdf542fa8eb3bcbc457a5383dc48fc0c&channel=anzhi_v6115&method=Recipe.getCollectRecomment&virtual=&signmethod=md5&v=3&timestamp=1479714919&nonce=0.9667640930633545&appsign=b332852f8d58728f8500b193ba6e344b")
    Call<Cate_Hot_Menu> getData(@FieldMap Map<String, String> ask);
}
