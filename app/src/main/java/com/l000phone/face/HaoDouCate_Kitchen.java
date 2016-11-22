package com.l000phone.face;

import com.l000phone.entity.Cate_Kitchen;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 烘焙
 */

public interface HaoDouCate_Kitchen {

    @FormUrlEncoded
    @POST("http://api.haodou.com/index.php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid=1479778483771&vc=105&vn=6.1.15&loguid=10283273&deviceid=haodou864394010248476&uuid=bdf542fa8eb3bcbc457a5383dc48fc0c&channel=anzhi_v6115&method=Wiki.getListByType&virtual=&signmethod=md5&v=3&timestamp=1479778694&nonce=0.7092684479767616&appsign=9b1bd49c5905355eb788e3da7a3b2c1c")
    Call<Cate_Kitchen> getData(@FieldMap Map<String, String> ask);


}
