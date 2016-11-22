package com.l000phone.face;

import com.l000phone.entity.Cate_Ifi;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * 第一页的接口
 */

public interface HaoDouCate_Ifi {


    @GET("http://api.haodou.com/index.php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid=1479796305354&vc=105&vn=6.1.15&loguid=10283273&deviceid=haodou864394010248476&uuid=bdf542fa8eb3bcbc457a5383dc48fc0c&channel=anzhi_v6115&method=Search.getCateList&virtual=&signmethod=md5&v=3&timestamp=1479803073&nonce=0.6111853757349738&appsign=014b7207c26dacbef333771f8c27c838")
    Call<Cate_Ifi> getData(@QueryMap Map<String, String> ask);

}
