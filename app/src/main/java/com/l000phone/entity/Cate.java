package com.l000phone.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by DJ on 2016/11/17.
 */

public class Cate implements Serializable{


    /**
     * total : 892
     * limit : 10
     * count : 892
     * page : index
     * list : [{"imgs":["http://k.haodou.com/resource/582c0456ddd85e2564b65b6f.jpg?t=w640"],"desc":"美味挡不住","sort":1479386843,"userUrl":"haodourecipe://haodou.com/pgc/user/home/?id=5787175ce4b041668cf81367","state":1,"userAvatar":"http://k.haodou.com/resource//5799a21eddd85e25d2d30ec3.jpeg","cid":1542,"url":"haodourecipe://haodou.com/pgc/message/get/?id=582c0458e4b023eebfbe021c","ct":1479279819,"title":"来一盘拯救世界的排骨","ratio":0.56,"_logstat":{"_ls_did":"582c0458e4b023eebfbe021c","_ls_ds":1,"_ls_pos":1,"_ls_sid":1000008,"_ls_pid":1000002},"userName":"身边美食家","tid":4,"tips":[],"uiType":"pgcDetail"},{"imgs":["http://k.haodou.com/resource/5811bf3076fa48a6dfbb0c5d.jpg?t=w640"],"desc":"没胃口，那是你没看到这些增进食欲的超级下饭菜呢~~","sort":1479375527,"userUrl":"haodourecipe://haodou.com/pgc/user/home/?id=5767dd46e4b0d844a695a894","state":1,"userAvatar":"http://k.haodou.com/resource//5770ad99af0ac1a9a12b1caa.jpg","cid":1553,"url":"haodourecipe://haodou.com/pgc/message/get/?id=5811bf4ee4b023eebfbe01b5","ct":1479289127,"title":"18款超级下饭菜","ratio":0.56,"_logstat":{"_ls_did":"5811bf4ee4b023eebfbe01b5","_ls_ds":1,"_ls_pos":2,"_ls_sid":1000008,"_ls_pid":1000002},"userName":"国民当家菜","tid":4,"tips":[],"uiType":"pgcDetail"},{"imgs":["http://k.haodou.com/resource/582c280eddd85e255d51a6a5.jpg?t=w640"],"desc":"","sort":1479375286,"state":1,"cid":1552,"url":"haodourecipe://haodou.com/recipe/info/?id=1084856&video=1","ct":1479288886,"duration":"10'12","title":"快手营养早餐｜无糖抹茶燕麦粥","ratio":0.56,"_logstat":{"_ls_did":"1084856","_ls_ds":1,"_ls_pos":3,"_ls_sid":1000008,"_ls_pid":1000002},"tid":4,"tips":[],"uiType":"pgcVideo"},{"imgs":["http://k.haodou.com/resource/582c27e3ddd85e25a6f5fe4f.jpg?t=w640"],"title":"word天~粉粉的它居然是糍粑","sort":1479375224,"desc":"糍粑吃得多，但大多都是白白的，偶尔来个不一样的，心情都是美美哒。","ratio":0.56,"_logstat":{"_ls_did":"496871","_ls_ds":1,"_ls_pos":4,"_ls_sid":1000008,"_ls_pid":1000002},"state":1,"tips":[],"tid":4,"uiType":"pgcDefault","cid":1551,"ct":1479288824,"url":"haodourecipe://haodou.com/opentopic/?url=http%3A%2F%2Fgroup.haodou.com%2Ftopic-496871.html&id=496871"},{"imgs":["http://k.haodou.com/resource/582bffcbddd85e2503c124ab.jpg?t=w640"],"desc":"迷迭香与柠檬产生的化学反应真是让人欲罢不能","sort":1479375208,"userUrl":"haodourecipe://haodou.com/pgc/user/home/?id=5787175ce4b041668cf81367","state":1,"userAvatar":"http://k.haodou.com/resource//5799a21eddd85e25d2d30ec3.jpeg","cid":1554,"url":"haodourecipe://haodou.com/pgc/message/get/?id=582c001be4b023eebfbe021b","ct":1479289219,"title":"深秋一枚柠檬迷迭香小蛋糕！","ratio":0.56,"_logstat":{"_ls_did":"582c001be4b023eebfbe021b","_ls_ds":1,"_ls_pos":5,"_ls_sid":1000008,"_ls_pid":1000002},"userName":"身边美食家","tid":4,"tips":[],"uiType":"pgcDetail"},{"imgs":["http://k.haodou.com/resource/582c27cdddd85e25acffdb6a.jpg?t=w640"],"desc":"","sort":1479375193,"state":1,"cid":1550,"url":"haodourecipe://haodou.com/recipe/info/?id=1039554&video=1","ct":1479288793,"duration":"10'12","title":"萝卜丝鲫鱼汤，熬出奶白鱼汤就这么简单","ratio":0.56,"_logstat":{"_ls_did":"1039554","_ls_ds":1,"_ls_pos":6,"_ls_sid":1000008,"_ls_pid":1000002},"tid":4,"tips":[],"uiType":"pgcVideo"},{"imgs":["http://k.haodou.com/resource/582c2700ddd85e255dc1dcd0.jpg?t=w640"],"title":"剩馄饨皮别浪费，还能这么吃！","sort":1479374985,"desc":"","ratio":0.56,"_logstat":{"_ls_did":"497693","_ls_ds":1,"_ls_pos":7,"_ls_sid":1000008,"_ls_pid":1000002},"state":1,"tips":[],"tid":4,"uiType":"pgcDefault","cid":1549,"ct":1479288585,"url":"haodourecipe://haodou.com/opentopic/?url=http%3A%2F%2Fgroup.haodou.com%2Ftopic-497693.html&id=497693"},{"total":30,"imgs":["http://k.haodou.com/resource/582c22a4ddd85e25fc4de46a.jpg?t=w640","http://recipe1.hoto.cn/pic/recipe/l/8f/ff/982927_ebb7ce.thumb.jpg!s.recipe.cover.album","http://recipe1.hoto.cn/pic/recipe/l/67/15/333159_5a5483.thumb.jpg!s.recipe.cover.album","http://recipe0.hoto.cn/pic/recipe/l/4c/b9/440652_5dac07.thumb.jpg!s.recipe.cover.album","http://recipe0.hoto.cn/pic/recipe/l/16/99/301334_55d8ce.thumb.jpg!s.recipe.cover.album","http://recipe1.hoto.cn/pic/recipe/l/eb/c1/901611_410c05.thumb.jpg!s.recipe.cover.album"],"desc":"随便炒两道就是很棒的一顿饭哦！","sort":1479373882,"state":1,"cid":1548,"url":"haodourecipe://haodou.com/collect/info/?id=13730854","ct":1479287512,"title":"超人气家常菜，居家必会","ratio":0.56,"_logstat":{"_ls_did":"13730854","_ls_ds":1,"_ls_pos":8,"_ls_sid":1000008,"_ls_pid":1000002},"tid":4,"tips":[],"uiType":"pgcAlbum"},{"adsPos":2,"imgs":["http://k.haodou.com/resource/57b57fb8ddd85e25d30bebe4.jpg"],"title":"","ratio":0.3125,"tid":0,"uiType":"pgcAd","url":""},{"imgs":["http://k.haodou.com/resource/582c073bddd85e25aadfc11a.jpg?t=w640"],"title":"苹果一身宝 生熟两吃功效多","sort":1479311718,"desc":"冬季大家也要多吃点苹果，这样对身体还是非常有益的！","ratio":0.56,"_logstat":{"_ls_did":"582c0766e4b023eebfbe021d","_ls_ds":1,"_ls_pos":9,"_ls_sid":1000008,"_ls_pid":1000002},"state":1,"tips":[],"tid":4,"uiType":"pgcDefault","cid":1544,"ct":1479280597,"url":"haodourecipe://haodou.com/pgc/message/get/?id=582c0766e4b023eebfbe021d"},{"imgs":["http://k.haodou.com/resource/582c0560ddd85e2511e1eae5.jpg?t=w640"],"desc":"剩下的饺子皮，其实还能做出很多美味料理","sort":1479311437,"userUrl":"haodourecipe://haodou.com/pgc/user/home/?id=5787175ce4b041668cf81367","state":1,"userAvatar":"http://k.haodou.com/resource//5799a21eddd85e25d2d30ec3.jpeg","cid":1543,"url":"haodourecipe://haodou.com/pgc/message/get/?id=582c0595e4b05869c54a594e","ct":1479280078,"title":"饺子皮逆天新吃法","ratio":0.56,"_logstat":{"_ls_did":"582c0595e4b05869c54a594e","_ls_ds":1,"_ls_pos":10,"_ls_sid":1000008,"_ls_pid":1000002},"userName":"身边美食家","tid":4,"tips":[],"uiType":"pgcDetail"}]
     * offset : 0
     * header : [{"ratio":0.56,"list":[{"imgs":["http://img1.hoto.cn/haodou/recipe_mobile_ad/2016/11/1478861569.jpg"],"title":"香辣川湘菜，绝对下饭","ratio":0.56,"_logstat":{"_ls_did":0,"_ls_ds":0,"_ls_pos":1,"_ls_sid":1000006,"_ls_pid":1000002},"uiType":"topFlowDefault","url":"haodourecipe://haodou.com/collect/info/?id=13699773"},{"imgs":["http://img1.hoto.cn/haodou/recipe_mobile_ad/2016/11/1479279412.jpg"],"title":"就爱大排档美食","ratio":0.56,"_logstat":{"_ls_did":0,"_ls_ds":0,"_ls_pos":2,"_ls_sid":1000006,"_ls_pid":1000002},"uiType":"topFlowDefault","url":"haodourecipe://haodou.com/collect/info/?id=13733923"},{"imgs":["http://img1.hoto.cn/haodou/recipe_mobile_ad/2016/11/1478861591.jpg"],"title":"手撕的，怎能不入味","ratio":0.56,"_logstat":{"_ls_did":0,"_ls_ds":0,"_ls_pos":3,"_ls_sid":1000006,"_ls_pid":1000002},"uiType":"topFlowDefault","url":"haodourecipe://haodou.com/collect/info/?id=13689483"},{"imgs":["http://img1.hoto.cn/haodou/recipe_mobile_ad/2016/11/1479279363.jpg"],"title":"电饭煲版香菇咸猪肉炊饭","ratio":0.56,"_logstat":{"_ls_did":0,"_ls_ds":0,"_ls_pos":4,"_ls_sid":1000006,"_ls_pid":1000002},"uiType":"topFlowDefault","url":"haodourecipe://haodou.com/recipe/info/?id=1020968&video=1"},{"imgs":["http://img1.hoto.cn/haodou/recipe_mobile_ad/2016/11/1479291886.jpg"],"title":"红焖鸭","ratio":0.56,"_logstat":{"_ls_did":0,"_ls_ds":0,"_ls_pos":5,"_ls_sid":1000006,"_ls_pid":1000002},"uiType":"topFlowDefault","url":"haodourecipe://haodou.com/recipe/info/?id=1092522&video=0"},{"imgs":["http://img1.hoto.cn/haodou/recipe_mobile_ad/2016/11/1479292041.jpg"],"title":"腐乳炒包菜","ratio":0.56,"_logstat":{"_ls_did":0,"_ls_ds":0,"_ls_pos":6,"_ls_sid":1000006,"_ls_pid":1000002},"uiType":"topFlowDefault","url":"haodourecipe://haodou.com/recipe/info/?id=1118448&video=0"}],"uiType":"topFlow"},{"list":[{"imgs":["http://img.mp.hoto.cn/580b1fe9ddd85e2552c3ba0c.png"],"title":"流行食谱","_logstat":{"_ls_did":10301,"_ls_ds":1000001,"_ls_pos":1,"_ls_sid":1000004,"_ls_pid":1000002},"uiType":"toolsDefault","url":"haodourecipe://haodou.com/recommend/recipe/?keyword=%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1&title=%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1&tab=%E5%85%A8%E9%83%A8%3A%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1%7C%E7%A7%81%E4%BA%BA%3A%E7%A7%81%E4%BA%BA%E5%AE%9A%E5%88%B6%7C%E6%97%B6%E4%BB%A4%3A%E6%97%B6%E4%BB%A4%E4%BD%B3%E8%82%B4%7C%E8%BE%BE%E4%BA%BA%3A%E8%BE%BE%E4%BA%BA%E8%8F%9C%E8%B0%B1%7C%E6%9C%80%E6%96%B0%3A%E6%9C%80%E6%96%B0%E8%8F%9C%E8%B0%B1%7C%E7%83%98%E7%84%99%3A%E5%BF%AB%E4%B9%90%E7%9A%84%E7%83%98%E7%84%99"},{"imgs":["http://img.mp.hoto.cn/580b200addd85e255dbf2b5d.png"],"title":"看视频","_logstat":{"_ls_did":10302,"_ls_ds":1000001,"_ls_pos":2,"_ls_sid":1000004,"_ls_pid":1000002},"uiType":"toolsDefault","url":"haodourecipe://haodou.com/Video/index/"},{"imgs":["http://img.mp.hoto.cn/580b2107ddd85e25b05213af.png"],"title":"厨房宝典","_logstat":{"_ls_did":10303,"_ls_ds":1000001,"_ls_pos":3,"_ls_sid":1000004,"_ls_pid":1000002},"uiType":"toolsDefault","url":"haodourecipe://haodou.com/wiki/list/"},{"imgs":["http://img.mp.hoto.cn/580b20caddd85e25dcc62a4a.png"],"title":"热门活动","_logstat":{"_ls_did":10304,"_ls_ds":1000001,"_ls_pos":4,"_ls_sid":1000004,"_ls_pid":1000002},"uiType":"toolsDefault","url":"haodourecipe://haodou.com/latestactive/official/"},{"imgs":["http://img.mp.hoto.cn/580b2078ddd85e250de0d611.png"],"title":"菜谱分类","_logstat":{"_ls_did":10305,"_ls_ds":1000001,"_ls_pos":5,"_ls_sid":1000004,"_ls_pid":1000002},"uiType":"toolsDefault","url":"haodourecipe://haodou.com/category/"}],"uiType":"tools"},{"list":[{"imgs":["http://k.haodou.com/resource/582d1139ddd85e2532dcc466.jpg"],"title":"周四 · 午餐","desc":"周四中午这样吃！","_logstat":{"_ls_did":10403,"_ls_ds":1,"_ls_pos":1,"_ls_sid":1000005,"_ls_pid":1000002},"uiType":"channelsColumn","url":"haodourecipe://haodou.com/message/list/?title=%E5%91%A8%E5%9B%9B+%C2%B7+%E5%8D%88%E9%A4%90&name=page_guide_1&id=page_guide_1"},{"imgs":["http://k.haodou.com/resource/582bc3d9ddd85e2510ae1e25.jpg"],"title":"懒人料理","desc":"时间有限 速战速决","_logstat":{"_ls_did":10404,"_ls_ds":1,"_ls_pos":2,"_ls_sid":1000005,"_ls_pid":1000002},"uiType":"channelsColumn","url":"haodourecipe://haodou.com/message/list/?title=%E6%87%92%E4%BA%BA%E6%96%99%E7%90%86&name=page_guide_2&id=page_guide_2"},{"imgs":["http://k.haodou.com/resource/582d1754ddd85e253b623313.jpg"],"title":"我有一个大南瓜","desc":"百样南瓜花样吃","_logstat":{"_ls_did":10405,"_ls_ds":1,"_ls_pos":3,"_ls_sid":1000005,"_ls_pid":1000002},"uiType":"channelsColumn","url":"haodourecipe://haodou.com/message/list/?title=%E6%88%91%E6%9C%89%E4%B8%80%E4%B8%AA%E5%A4%A7%E5%8D%97%E7%93%9C&name=page_guide_3&id=page_guide_3"},{"imgs":["http://k.haodou.com/resource/5805e58cddd85e25ef3ff0ba.png"],"title":"咱爸\n咱妈","desc":"","_logstat":{"_ls_did":10406,"_ls_ds":1,"_ls_pos":4,"_ls_sid":1000005,"_ls_pid":1000002},"uiType":"channelsColumn","url":"haodourecipe://haodou.com/message/list/?title=%E5%92%B1%E7%88%B8%E5%92%B1%E5%A6%88&name=page_guide_4&id=page_guide_4"},{"imgs":["http://k.haodou.com/resource/5805e59addd85e25a61fa20e.png"],"title":"热门\n专辑","desc":"","_logstat":{"_ls_did":10407,"_ls_ds":1,"_ls_pos":5,"_ls_sid":1000005,"_ls_pid":1000002},"uiType":"channelsColumn","url":"haodourecipe://haodou.com/collect/list/?title=%E7%83%AD%E9%97%A8%E4%B8%93%E8%BE%91"}],"uiType":"channels2"}]
     * floater : []
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * imgs : ["http://k.haodou.com/resource/582c0456ddd85e2564b65b6f.jpg?t=w640"]
         * desc : 美味挡不住
         * sort : 1479386843
         * userUrl : haodourecipe://haodou.com/pgc/user/home/?id=5787175ce4b041668cf81367
         * state : 1
         * userAvatar : http://k.haodou.com/resource//5799a21eddd85e25d2d30ec3.jpeg
         * cid : 1542
         * url : haodourecipe://haodou.com/pgc/message/get/?id=582c0458e4b023eebfbe021c
         * ct : 1479279819
         * title : 来一盘拯救世界的排骨
         * ratio : 0.56
         * _logstat : {"_ls_did":"582c0458e4b023eebfbe021c","_ls_ds":1,"_ls_pos":1,"_ls_sid":1000008,"_ls_pid":1000002}
         * userName : 身边美食家
         * tid : 4
         * tips : []
         * uiType : pgcDetail
         */

        private List<ListBean> list;
        /**
         * ratio : 0.56
         * list : [{"imgs":["http://img1.hoto.cn/haodou/recipe_mobile_ad/2016/11/1478861569.jpg"],"title":"香辣川湘菜，绝对下饭","ratio":0.56,"_logstat":{"_ls_did":0,"_ls_ds":0,"_ls_pos":1,"_ls_sid":1000006,"_ls_pid":1000002},"uiType":"topFlowDefault","url":"haodourecipe://haodou.com/collect/info/?id=13699773"},{"imgs":["http://img1.hoto.cn/haodou/recipe_mobile_ad/2016/11/1479279412.jpg"],"title":"就爱大排档美食","ratio":0.56,"_logstat":{"_ls_did":0,"_ls_ds":0,"_ls_pos":2,"_ls_sid":1000006,"_ls_pid":1000002},"uiType":"topFlowDefault","url":"haodourecipe://haodou.com/collect/info/?id=13733923"},{"imgs":["http://img1.hoto.cn/haodou/recipe_mobile_ad/2016/11/1478861591.jpg"],"title":"手撕的，怎能不入味","ratio":0.56,"_logstat":{"_ls_did":0,"_ls_ds":0,"_ls_pos":3,"_ls_sid":1000006,"_ls_pid":1000002},"uiType":"topFlowDefault","url":"haodourecipe://haodou.com/collect/info/?id=13689483"},{"imgs":["http://img1.hoto.cn/haodou/recipe_mobile_ad/2016/11/1479279363.jpg"],"title":"电饭煲版香菇咸猪肉炊饭","ratio":0.56,"_logstat":{"_ls_did":0,"_ls_ds":0,"_ls_pos":4,"_ls_sid":1000006,"_ls_pid":1000002},"uiType":"topFlowDefault","url":"haodourecipe://haodou.com/recipe/info/?id=1020968&video=1"},{"imgs":["http://img1.hoto.cn/haodou/recipe_mobile_ad/2016/11/1479291886.jpg"],"title":"红焖鸭","ratio":0.56,"_logstat":{"_ls_did":0,"_ls_ds":0,"_ls_pos":5,"_ls_sid":1000006,"_ls_pid":1000002},"uiType":"topFlowDefault","url":"haodourecipe://haodou.com/recipe/info/?id=1092522&video=0"},{"imgs":["http://img1.hoto.cn/haodou/recipe_mobile_ad/2016/11/1479292041.jpg"],"title":"腐乳炒包菜","ratio":0.56,"_logstat":{"_ls_did":0,"_ls_ds":0,"_ls_pos":6,"_ls_sid":1000006,"_ls_pid":1000002},"uiType":"topFlowDefault","url":"haodourecipe://haodou.com/recipe/info/?id=1118448&video=0"}]
         * uiType : topFlow
         */

        private List<HeaderBean> header;

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public List<HeaderBean> getHeader() {
            return header;
        }

        public void setHeader(List<HeaderBean> header) {
            this.header = header;
        }

        public static class ListBean {
            private String desc;
            private String userUrl;
            private String userAvatar;
            private String url;
            private String title;
            private String userName;
            private String uiType;
            private List<String> imgs;
            private List<?> tips;

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getUserUrl() {
                return userUrl;
            }

            public void setUserUrl(String userUrl) {
                this.userUrl = userUrl;
            }

            public String getUserAvatar() {
                return userAvatar;
            }

            public void setUserAvatar(String userAvatar) {
                this.userAvatar = userAvatar;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public String getUiType() {
                return uiType;
            }

            public void setUiType(String uiType) {
                this.uiType = uiType;
            }

            public List<String> getImgs() {
                return imgs;
            }

            public void setImgs(List<String> imgs) {
                this.imgs = imgs;
            }

            public List<?> getTips() {
                return tips;
            }

            public void setTips(List<?> tips) {
                this.tips = tips;
            }
        }

        public static class HeaderBean {
            /**
             * imgs : ["http://img1.hoto.cn/haodou/recipe_mobile_ad/2016/11/1478861569.jpg"]
             * title : 香辣川湘菜，绝对下饭
             * ratio : 0.56
             * _logstat : {"_ls_did":0,"_ls_ds":0,"_ls_pos":1,"_ls_sid":1000006,"_ls_pid":1000002}
             * uiType : topFlowDefault
             * url : haodourecipe://haodou.com/collect/info/?id=13699773
             */

            private List<ListBean> list;

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public static class ListBean implements Serializable {
                private String desc;
                private String title;
                private String url;
                private List<String> imgs;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public List<String> getImgs() {
                    return imgs;
                }

                public void setImgs(List<String> imgs) {
                    this.imgs = imgs;
                }
            }
        }
    }
}
