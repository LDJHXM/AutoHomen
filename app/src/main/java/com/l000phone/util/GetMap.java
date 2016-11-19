package com.l000phone.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DJ on 2016/11/18.
 */

public class GetMap {

    public static Map<String, String> getMap() {

        Map<String, String> ask = new HashMap<>();

        ask.put("_HOP_", "{\"sign\":\"ba4767a053ddfe6f66c3a265cc23251f\"," +
                "\"action\":\"front.get_index\",\"current_time\":1479269055," +
                "\"secret_id\":\"5722f877e4b0d4512e3fd872\",\"version\":\"1.0\"}");
        ask.put("appid", "2");
        ask.put("appkey", "9ef269eec4f7a9d07c73952d06b5413f");
        ask.put("channel", "anzhi_v6115");
        ask.put("deviceid", "haodou864394010208983");
        ask.put("from", "android");
        ask.put("ip", "172.16.152.15");
        ask.put("limit", "30");
        ask.put("loguid", "0");
        ask.put("network", "WIFI");
        ask.put("offset", "0");
        ask.put("sign", "");
        ask.put("uid", "0");
        ask.put("uuid", "9ea70fa9356586ff23fc31785f735cf1");
        ask.put("vc", "105");
        ask.put("virtual", "0");
        ask.put("vn", "6.1.15");

        return ask;
    }
}
