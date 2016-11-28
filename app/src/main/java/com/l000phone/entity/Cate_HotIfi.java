package com.l000phone.entity;

import java.util.List;

/**
 * Created by DJ on 2016/11/28.
 */

public class Cate_HotIfi {


    /**
     * status : 200
     * result : {"count":24,"list":[{"CateId":"47","CateName":"饮品","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=47&name=%E9%A5%AE%E5%93%81&type=1"},{"CateId":"39","CateName":"畜肉","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=39&name=%E7%95%9C%E8%82%89&type=1"},{"CateId":"15","CateName":"点心","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=15&name=%E7%82%B9%E5%BF%83&type=1"},{"CateId":"54","CateName":"蔬菜","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=54&name=%E8%94%AC%E8%8F%9C&type=1"},{"CateId":"36","CateName":"烘焙","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=36&name=%E7%83%98%E7%84%99&type=1"},{"CateId":"38","CateName":"酱料","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=38&name=%E9%85%B1%E6%96%99&type=1"},{"CateId":"57","CateName":"禽肉","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=57&name=%E7%A6%BD%E8%82%89&type=1"},{"CateId":"50","CateName":"蛋类","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=50&name=%E8%9B%8B%E7%B1%BB&type=1"},{"CateId":"55","CateName":"豆制品","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=55&name=%E8%B1%86%E5%88%B6%E5%93%81&type=1"},{"CateId":"43","CateName":"儿童餐","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=43&name=%E5%84%BF%E7%AB%A5%E9%A4%90&type=1"},{"CateId":"48","CateName":"甜品","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=48&name=%E7%94%9C%E5%93%81&type=1"},{"CateId":"40","CateName":"凉菜","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=40&name=%E5%87%89%E8%8F%9C&type=1"},{"CateId":"11","CateName":"粥","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=11&name=%E7%B2%A5&type=1"},{"CateId":"33","CateName":"米饭","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=33&name=%E7%B1%B3%E9%A5%AD&type=1"},{"CateId":"2","CateName":"汤","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=2&name=%E6%B1%A4&type=1"},{"CateId":"49","CateName":"面食","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=49&name=%E9%9D%A2%E9%A3%9F&type=1"},{"CateId":"52","CateName":"鱼","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=52&name=%E9%B1%BC&type=1"},{"CateId":"35","CateName":"煎炸","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=35&name=%E7%85%8E%E7%82%B8&type=1"},{"CateId":"45","CateName":"雕花","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=45&name=%E9%9B%95%E8%8A%B1&type=1"},{"CateId":"30","CateName":"刀功","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=30&name=%E5%88%80%E5%8A%9F&type=1"},{"CateId":"13","CateName":"炖品","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=13&name=%E7%82%96%E5%93%81&type=1"},{"CateId":"56","CateName":"菌菇","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=56&name=%E8%8F%8C%E8%8F%87&type=1"},{"CateId":"23","CateName":"拍晚餐","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=23&name=%E6%8B%8D%E6%99%9A%E9%A4%90&type=1"},{"CateId":"53","CateName":"海鲜","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=53&name=%E6%B5%B7%E9%B2%9C&type=1"}]}
     * request_id : 1bcd1b5ffa338196c0028d1e0aac53c2
     */

    private int status;
    private ResultBean result;
    private String request_id;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public static class ResultBean {
        /**
         * count : 24
         * list : [{"CateId":"47","CateName":"饮品","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=47&name=%E9%A5%AE%E5%93%81&type=1"},{"CateId":"39","CateName":"畜肉","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=39&name=%E7%95%9C%E8%82%89&type=1"},{"CateId":"15","CateName":"点心","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=15&name=%E7%82%B9%E5%BF%83&type=1"},{"CateId":"54","CateName":"蔬菜","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=54&name=%E8%94%AC%E8%8F%9C&type=1"},{"CateId":"36","CateName":"烘焙","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=36&name=%E7%83%98%E7%84%99&type=1"},{"CateId":"38","CateName":"酱料","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=38&name=%E9%85%B1%E6%96%99&type=1"},{"CateId":"57","CateName":"禽肉","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=57&name=%E7%A6%BD%E8%82%89&type=1"},{"CateId":"50","CateName":"蛋类","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=50&name=%E8%9B%8B%E7%B1%BB&type=1"},{"CateId":"55","CateName":"豆制品","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=55&name=%E8%B1%86%E5%88%B6%E5%93%81&type=1"},{"CateId":"43","CateName":"儿童餐","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=43&name=%E5%84%BF%E7%AB%A5%E9%A4%90&type=1"},{"CateId":"48","CateName":"甜品","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=48&name=%E7%94%9C%E5%93%81&type=1"},{"CateId":"40","CateName":"凉菜","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=40&name=%E5%87%89%E8%8F%9C&type=1"},{"CateId":"11","CateName":"粥","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=11&name=%E7%B2%A5&type=1"},{"CateId":"33","CateName":"米饭","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=33&name=%E7%B1%B3%E9%A5%AD&type=1"},{"CateId":"2","CateName":"汤","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=2&name=%E6%B1%A4&type=1"},{"CateId":"49","CateName":"面食","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=49&name=%E9%9D%A2%E9%A3%9F&type=1"},{"CateId":"52","CateName":"鱼","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=52&name=%E9%B1%BC&type=1"},{"CateId":"35","CateName":"煎炸","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=35&name=%E7%85%8E%E7%82%B8&type=1"},{"CateId":"45","CateName":"雕花","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=45&name=%E9%9B%95%E8%8A%B1&type=1"},{"CateId":"30","CateName":"刀功","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=30&name=%E5%88%80%E5%8A%9F&type=1"},{"CateId":"13","CateName":"炖品","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=13&name=%E7%82%96%E5%93%81&type=1"},{"CateId":"56","CateName":"菌菇","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=56&name=%E8%8F%8C%E8%8F%87&type=1"},{"CateId":"23","CateName":"拍晚餐","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=23&name=%E6%8B%8D%E6%99%9A%E9%A4%90&type=1"},{"CateId":"53","CateName":"海鲜","Url":"haodourecipe://haodou.com/Video/getVideoListByCate/?id=53&name=%E6%B5%B7%E9%B2%9C&type=1"}]
         */

        private int count;
        private List<ListBean> list;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * CateId : 47
             * CateName : 饮品
             * Url : haodourecipe://haodou.com/Video/getVideoListByCate/?id=47&name=%E9%A5%AE%E5%93%81&type=1
             */

            private String CateId;
            private String CateName;
            private String Url;

            public String getCateId() {
                return CateId;
            }

            public void setCateId(String CateId) {
                this.CateId = CateId;
            }

            public String getCateName() {
                return CateName;
            }

            public void setCateName(String CateName) {
                this.CateName = CateName;
            }

            public String getUrl() {
                return Url;
            }

            public void setUrl(String Url) {
                this.Url = Url;
            }
        }
    }
}
