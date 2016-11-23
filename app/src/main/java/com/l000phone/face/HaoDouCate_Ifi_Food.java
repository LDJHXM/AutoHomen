package com.l000phone.face;

import com.l000phone.entity.Cate_Ifi_Food;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 分类中的分类接口
 */

public interface HaoDouCate_Ifi_Food {

    @FormUrlEncoded
    @POST("http://api.haodou.com/index.php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid=1479817744418&vc=105&vn=6.1.15&loguid=10283273&deviceid=haodou864394010248476&uuid=bdf542fa8eb3bcbc457a5383dc48fc0c&channel=anzhi_v6115&method=Search.getList&virtual=&signmethod=md5&v=3&timestamp=1479817795&nonce=0.35321510456727623&appsign=4e2771e9bff78607c983bef6ba960fc9")
    Call<Cate_Ifi_Food> getData(@FieldMap Map<String, String> ask);

}
