package com.l000phone.daojia.jsonparsor;

import android.util.Log;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.l000phone.daojia.myentitis.Entity;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/18/018.
 */

public class JSONParsor {


    public static List<Object> parsorString(String string) {
        //1，用fastjson进行解析，得到一个实体类
        Entity entity = JSON.parseObject(string, Entity.class);
        Log.i("data", entity.toString());

        //2，从实体类中取得数据，构成一个属性为object的集合
        List<Object> data = new LinkedList<>();
        Entity.ResultBean result = entity.getResult();

        //定义一个集合用来存放三个条目的集合
        addThreeDataToList(result,data);
        //吃货最爱
        List<Entity.ResultBean.FoodieFavoriteGoodsBean> foodieFavoriteGoods = result
                .getFoodieFavoriteGoods();
        data.add(foodieFavoriteGoods);

        //向集合中添加两个对象的数据
        addObjectToData(result,data);

        //相集合中添加四个集合
        addListToData(result, data);

        return data;
    }

    private static void addListToData(Entity.ResultBean result, List<Object> data) {
        List<Entity.ResultBean.CateListBean> cateList = result.getCateList();//tag部分的标题

        List<Entity.ResultBean.TagsBean> tags = result.getTags();//viewpager部分的集合
        List<Entity.ResultBean.ListBean> list = result.getList();//list集合
        //将list集合拆开一个一个数据的放进去
        Collections.addAll(data, cateList, tags);
        data.addAll(list);


    }


    private static void addObjectToData(Entity.ResultBean result, List<Object> data) {
        Entity.ResultBean.BrandStoreBean brandStore = result.getBrandStore();//品牌故事
        Entity.ResultBean.NewsRecommendGoodBean newsRecommendGood = result
                .getNewsRecommendGood();//新品
        Collections.addAll(data,brandStore, newsRecommendGood);

    }


    /**
     * 定义一个集合用来存放三个条目的集合
     * @param result
     * @param data
     */
    private static void addThreeDataToList(Entity.ResultBean result,
                                                   List<Object> data) {
        List<Object> threeData = new LinkedList<>();
        Entity.ResultBean.DailyFirstGoodsBean dailyFirstGoods = result
                .getDailyFirstGoods();//美食研究所
        Entity.ResultBean.DailySpecialGoodsBean dailySpecialGoods = result
                .getDailySpecialGoods();//今日特价
        Entity.ResultBean.OneHourGoodsBean oneHourGoods = result.getOneHourGoods();//明星店铺
        Collections.addAll(threeData, dailyFirstGoods, dailySpecialGoods, oneHourGoods);
        data.add(threeData);
    }

}
