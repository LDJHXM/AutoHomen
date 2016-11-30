package com.l000phone.entity;

import java.util.List;

/**
 * Created by DJ on 2016/11/17.
 */


public class Cate_Hot_Menu {


    /**
     * status : 200
     * result : {"count":100,"list":[{"LikeCount":13,"IsLike":0,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/d2/d3/1102802_7e750b.jpg","Title":"疯狂动物城翻糖杯蛋糕","UserName":"寻找桃花岛","RecipeId":1102802,"HasVideo":0,"Tags":[{"Id":5366,"Name":"卡通"},{"Id":159878,"Name":"朱迪"},{"Id":111089,"Name":"杯蛋糕"},{"Id":291,"Name":"烘焙"},{"Id":292,"Name":"甜品"},{"Id":159877,"Name":"疯狂动物城"},{"Id":60333,"Name":"翻糖"},{"Id":827,"Name":"蛋糕"},{"Id":21847,"Name":"兔子"},{"Id":971,"Name":"可爱"},{"Id":131896,"Name":"狐狸"},{"Id":37171,"Name":"电影"}],"UserId":8936896,"CreateTime":"2016-08-26 22:40:11"},{"LikeCount":19,"IsLike":0,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/9e/20/1122462_52768b.jpg","Title":"口水鸡手","UserName":"龙卷风中的小猫","RecipeId":1122462,"HasVideo":0,"Tags":[{"Id":23351,"Name":"鸡手"}],"UserId":4045,"CreateTime":"2016-11-10 10:04:18"},{"LikeCount":12,"IsLike":0,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/6c/25/1123692_342245.jpg","Title":"酥皮奶油蛋挞","UserName":"04413363月圆之夜","RecipeId":1123692,"HasVideo":0,"Tags":[{"Id":391,"Name":"儿童"},{"Id":829,"Name":"小吃"},{"Id":433,"Name":"甜"},{"Id":292,"Name":"甜品"},{"Id":903,"Name":"面食"}],"UserId":5010498,"CreateTime":"2016-11-15 15:10:48"},{"LikeCount":14,"IsLike":0,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/db/fd/1113563_f04922.jpg","Title":"山药莴笋炖猪骨","UserName":"珂猪儿的老妈","RecipeId":1113563,"HasVideo":0,"Tags":[{"Id":288,"Name":"家常菜"},{"Id":304,"Name":"汤"},{"Id":2200,"Name":"滋阴润燥"},{"Id":298,"Name":"热菜"},{"Id":49127,"Name":"增强免疫力"},{"Id":331,"Name":"延缓衰老"},{"Id":341,"Name":"补血"},{"Id":487,"Name":"炖"}],"UserId":8001451,"CreateTime":"2016-10-11 17:25:42"},{"LikeCount":12,"IsLike":0,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/12/0c/1117202_3d5f21.jpg","Title":"阳朔田螺酿","UserName":"厨奶","RecipeId":1117202,"HasVideo":0,"Tags":[{"Id":846,"Name":"冬季"},{"Id":298,"Name":"热菜"},{"Id":49127,"Name":"增强免疫力"},{"Id":34063,"Name":"广西菜"}],"UserId":6247665,"CreateTime":"2016-10-21 20:31:01"},{"LikeCount":8,"IsLike":0,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/b6/21/1122742_88ea80.jpg","Title":"韩式拌桔梗","UserName":"红豆厨坊","RecipeId":1122742,"HasVideo":0,"Tags":[{"Id":329,"Name":"健脾开胃"},{"Id":66279,"Name":"化痰止咳"},{"Id":49127,"Name":"增强免疫力"},{"Id":829,"Name":"小吃"},{"Id":1265,"Name":"降血压"},{"Id":253,"Name":"韩国料理"}],"UserId":132473,"CreateTime":"2016-11-11 17:40:08"},{"LikeCount":15,"IsLike":0,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/36/21/1122614_1e7b0b.jpg","Title":"蛋煎龙须面","UserName":"爱跳舞的老太","RecipeId":1122614,"HasVideo":0,"Tags":[{"Id":391,"Name":"儿童"},{"Id":829,"Name":"小吃"},{"Id":286,"Name":"早餐"},{"Id":1098,"Name":"点心"},{"Id":802,"Name":"老人"},{"Id":903,"Name":"面食"}],"UserId":3837,"CreateTime":"2016-11-10 20:58:13"},{"LikeCount":7,"IsLike":1,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/0f/24/1123343_6aea22.jpg","Title":"绿豆芽炒豆皮","UserName":"甜甜250","RecipeId":1123343,"HasVideo":0,"Tags":[{"Id":288,"Name":"家常菜"},{"Id":23898,"Name":"快手菜"},{"Id":90257,"Name":"懒人食谱"},{"Id":479,"Name":"炒"}],"UserId":9355463,"CreateTime":"2016-11-14 13:46:17"},{"LikeCount":5,"IsLike":0,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/c3/be/1097411_12a40f.jpg","Title":"爆浆芝士面包","UserName":"美美家的厨房","RecipeId":1097411,"HasVideo":0,"Tags":[{"Id":49127,"Name":"增强免疫力"},{"Id":829,"Name":"小吃"},{"Id":2200,"Name":"滋阴润燥"},{"Id":292,"Name":"甜品"},{"Id":731,"Name":"面包"},{"Id":903,"Name":"面食"}],"UserId":1410050,"CreateTime":"2016-08-08 20:56:50"},{"LikeCount":10,"IsLike":0,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/89/1c/1121417_c53d1f.jpg","Title":"木耳炒白菜","UserName":"大海微澜","RecipeId":1121417,"HasVideo":0,"Tags":[{"Id":288,"Name":"家常菜"}],"UserId":188972,"CreateTime":"2016-11-06 09:57:49"}]}
     * request_id : 9c6eab0fd6928b99d5bc5179dc333b8d
     */

    private ResultBean result;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * count : 100
         * list : [{"LikeCount":13,"IsLike":0,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/d2/d3/1102802_7e750b.jpg","Title":"疯狂动物城翻糖杯蛋糕","UserName":"寻找桃花岛","RecipeId":1102802,"HasVideo":0,"Tags":[{"Id":5366,"Name":"卡通"},{"Id":159878,"Name":"朱迪"},{"Id":111089,"Name":"杯蛋糕"},{"Id":291,"Name":"烘焙"},{"Id":292,"Name":"甜品"},{"Id":159877,"Name":"疯狂动物城"},{"Id":60333,"Name":"翻糖"},{"Id":827,"Name":"蛋糕"},{"Id":21847,"Name":"兔子"},{"Id":971,"Name":"可爱"},{"Id":131896,"Name":"狐狸"},{"Id":37171,"Name":"电影"}],"UserId":8936896,"CreateTime":"2016-08-26 22:40:11"},{"LikeCount":19,"IsLike":0,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/9e/20/1122462_52768b.jpg","Title":"口水鸡手","UserName":"龙卷风中的小猫","RecipeId":1122462,"HasVideo":0,"Tags":[{"Id":23351,"Name":"鸡手"}],"UserId":4045,"CreateTime":"2016-11-10 10:04:18"},{"LikeCount":12,"IsLike":0,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/6c/25/1123692_342245.jpg","Title":"酥皮奶油蛋挞","UserName":"04413363月圆之夜","RecipeId":1123692,"HasVideo":0,"Tags":[{"Id":391,"Name":"儿童"},{"Id":829,"Name":"小吃"},{"Id":433,"Name":"甜"},{"Id":292,"Name":"甜品"},{"Id":903,"Name":"面食"}],"UserId":5010498,"CreateTime":"2016-11-15 15:10:48"},{"LikeCount":14,"IsLike":0,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/db/fd/1113563_f04922.jpg","Title":"山药莴笋炖猪骨","UserName":"珂猪儿的老妈","RecipeId":1113563,"HasVideo":0,"Tags":[{"Id":288,"Name":"家常菜"},{"Id":304,"Name":"汤"},{"Id":2200,"Name":"滋阴润燥"},{"Id":298,"Name":"热菜"},{"Id":49127,"Name":"增强免疫力"},{"Id":331,"Name":"延缓衰老"},{"Id":341,"Name":"补血"},{"Id":487,"Name":"炖"}],"UserId":8001451,"CreateTime":"2016-10-11 17:25:42"},{"LikeCount":12,"IsLike":0,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/12/0c/1117202_3d5f21.jpg","Title":"阳朔田螺酿","UserName":"厨奶","RecipeId":1117202,"HasVideo":0,"Tags":[{"Id":846,"Name":"冬季"},{"Id":298,"Name":"热菜"},{"Id":49127,"Name":"增强免疫力"},{"Id":34063,"Name":"广西菜"}],"UserId":6247665,"CreateTime":"2016-10-21 20:31:01"},{"LikeCount":8,"IsLike":0,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/b6/21/1122742_88ea80.jpg","Title":"韩式拌桔梗","UserName":"红豆厨坊","RecipeId":1122742,"HasVideo":0,"Tags":[{"Id":329,"Name":"健脾开胃"},{"Id":66279,"Name":"化痰止咳"},{"Id":49127,"Name":"增强免疫力"},{"Id":829,"Name":"小吃"},{"Id":1265,"Name":"降血压"},{"Id":253,"Name":"韩国料理"}],"UserId":132473,"CreateTime":"2016-11-11 17:40:08"},{"LikeCount":15,"IsLike":0,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/36/21/1122614_1e7b0b.jpg","Title":"蛋煎龙须面","UserName":"爱跳舞的老太","RecipeId":1122614,"HasVideo":0,"Tags":[{"Id":391,"Name":"儿童"},{"Id":829,"Name":"小吃"},{"Id":286,"Name":"早餐"},{"Id":1098,"Name":"点心"},{"Id":802,"Name":"老人"},{"Id":903,"Name":"面食"}],"UserId":3837,"CreateTime":"2016-11-10 20:58:13"},{"LikeCount":7,"IsLike":1,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/0f/24/1123343_6aea22.jpg","Title":"绿豆芽炒豆皮","UserName":"甜甜250","RecipeId":1123343,"HasVideo":0,"Tags":[{"Id":288,"Name":"家常菜"},{"Id":23898,"Name":"快手菜"},{"Id":90257,"Name":"懒人食谱"},{"Id":479,"Name":"炒"}],"UserId":9355463,"CreateTime":"2016-11-14 13:46:17"},{"LikeCount":5,"IsLike":0,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/c3/be/1097411_12a40f.jpg","Title":"爆浆芝士面包","UserName":"美美家的厨房","RecipeId":1097411,"HasVideo":0,"Tags":[{"Id":49127,"Name":"增强免疫力"},{"Id":829,"Name":"小吃"},{"Id":2200,"Name":"滋阴润燥"},{"Id":292,"Name":"甜品"},{"Id":731,"Name":"面包"},{"Id":903,"Name":"面食"}],"UserId":1410050,"CreateTime":"2016-08-08 20:56:50"},{"LikeCount":10,"IsLike":0,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/89/1c/1121417_c53d1f.jpg","Title":"木耳炒白菜","UserName":"大海微澜","RecipeId":1121417,"HasVideo":0,"Tags":[{"Id":288,"Name":"家常菜"}],"UserId":188972,"CreateTime":"2016-11-06 09:57:49"}]
         */

        private List<ListBean> list;

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * LikeCount : 13
             * IsLike : 0
             * Cover : http://recipe0.hoto.cn/pic/recipe/l/d2/d3/1102802_7e750b.jpg
             * Title : 疯狂动物城翻糖杯蛋糕
             * UserName : 寻找桃花岛
             * RecipeId : 1102802
             * HasVideo : 0
             * Tags : [{"Id":5366,"Name":"卡通"},{"Id":159878,"Name":"朱迪"},{"Id":111089,"Name":"杯蛋糕"},{"Id":291,"Name":"烘焙"},{"Id":292,"Name":"甜品"},{"Id":159877,"Name":"疯狂动物城"},{"Id":60333,"Name":"翻糖"},{"Id":827,"Name":"蛋糕"},{"Id":21847,"Name":"兔子"},{"Id":971,"Name":"可爱"},{"Id":131896,"Name":"狐狸"},{"Id":37171,"Name":"电影"}]
             * UserId : 8936896
             * CreateTime : 2016-08-26 22:40:11
             */

            private String Cover;
            private String Title;
            private String UserName;
            private String LikeCount;
            private String CreateTime;
            private String RecipeId;
            private List<TagsBean> Tags;

            public String getRecipeId() {
                return RecipeId;
            }

            public void setRecipeId(String RecipeId) {
                this.RecipeId = RecipeId;
            }

            public String getCover() {
                return Cover;
            }

            public void setCover(String Cover) {
                this.Cover = Cover;
            }
            public String getLikeCount() {
                return LikeCount;
            }

            public void setLikeCount(String LikeCount) {
                this.LikeCount = LikeCount;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getUserName() {
                return UserName;
            }

            public void setUserName(String UserName) {
                this.UserName = UserName;
            }

            public String getCreateTime() {
                return CreateTime;
            }

            public void setCreateTime(String CreateTime) {
                this.CreateTime = CreateTime;
            }

            public List<TagsBean> getTags() {
                return Tags;
            }

            public void setTags(List<TagsBean> Tags) {
                this.Tags = Tags;
            }

            public static class TagsBean {
                /**
                 * Id : 5366
                 * Name : 卡通
                 */

                private int Id;
                private String Name;

                public int getId() {
                    return Id;
                }

                public void setId(int Id) {
                    this.Id = Id;
                }

                public String getName() {
                    return Name;
                }

                public void setName(String Name) {
                    this.Name = Name;
                }
            }
        }
    }
}
