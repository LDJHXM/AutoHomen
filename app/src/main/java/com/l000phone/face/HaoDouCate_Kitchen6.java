package com.l000phone.face;

import com.l000phone.entity.Cate_Kitchen;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 烘焙类
 */

public interface HaoDouCate_Kitchen6 {

    @FormUrlEncoded
    @POST("http://api.haodou.com/index.php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid=1479780746042&vc=105&vn=6.1.15&loguid=10283273&deviceid=haodou864394010248476&uuid=bdf542fa8eb3bcbc457a5383dc48fc0c&channel=anzhi_v6115&method=Wiki.getListByType&virtual=&signmethod=md5&v=3&timestamp=1479783349&nonce=0.27402604647477324&appsign=d69aa3241590310643790cd37802eb48")
    Call<Cate_Kitchen> getData(@FieldMap Map<String, String> ask);


}
