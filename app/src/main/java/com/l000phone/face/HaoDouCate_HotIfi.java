package com.l000phone.face;

import com.l000phone.entity.Cate_HotIfi;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 第一页的接口
 */

public interface HaoDouCate_HotIfi {

    @FormUrlEncoded
    @POST("http://api.haodou.com/index.php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid=1480332662923&vc=105&vn=6.1.15&loguid=0&deviceid=haodou864394010208983&uuid=e0ab40ac1ee9466a0ef6ab2f545284e8&channel=anzhi_v6115&method=Video.getRecipeVideoCateList&virtual=&signmethod=md5&v=3&timestamp=1480333039&nonce=0.11492465287192644&appsign=e9a9a77f68983f1a10c1ce887b428a77")
    Call<Cate_HotIfi> getData(@FieldMap Map<String, String> ask);
}
