package com.l000phone.daojia.myentitis;

import java.util.List;

/**
 * Created by Administrator on 2016/11/18/018.
 */

public class Entity {


    /**
     * status : 200
     * result : {"tags":[{"Id":"38","Title":"猪肉","Url":"haodourecipe://haodou
     * .com/goods/searchResult/?tagName=猪肉&TagId=38","Goods":{"GoodsId":"6278",
     * "Title":"【温州特产】猪油渣","DealPrice":"69.00","CoverUrl":"http://pimg3.hoto
     * .cn/goods/2016/11/09/6278_582303b7c4313_336_336.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=6278"}},{"Id":"42",
     * "Title":"饼干","Url":"haodourecipe://haodou
     * .com/goods/searchResult/?tagName=饼干&TagId=42","Goods":{"GoodsId":"6281",
     * "Title":"【Emily的美好时光】蛋黄酥 低糖白莲蓉味（六个礼盒装）","DealPrice":"79.00",
     * "CoverUrl":"http://pimg3.hoto.cn/goods/2016/11/08/6281_5821a8fdc0ed1_336_336
     * .jpg","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=6281"}},{"Id":"37",
     * "Title":"牛羊肉","Url":"haodourecipe://haodou
     * .com/goods/searchResult/?tagName=牛羊肉&TagId=37","Goods":{"GoodsId":"1285",
     * "Title":"【2份包邮】限时促销精品罐装飘香秘制风味牙签牛肉","DealPrice":"65.00","CoverUrl":"http://pimg2
     * .hoto.cn/goods/2016/11/17/1285_582d6d880edee_336_336.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1285"}},{"Id":"34",
     * "Title":"辣椒酱","Url":"haodourecipe://haodou
     * .com/goods/searchResult/?tagName=辣椒酱&TagId=34","Goods":{"GoodsId":"6255",
     * "Title":"正宗重庆香辣红油","DealPrice":"25.80","CoverUrl":"http://pimg1.hoto
     * .cn/goods/2016/10/12/6255_57fdd8d5ba1d3_336_336.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=6255"}},{"Id":"57",
     * "Title":"腌制品","Url":"haodourecipe://haodou
     * .com/goods/searchResult/?tagName=腌制品&TagId=57","Goods":{"GoodsId":"2122",
     * "Title":"醉血蛤","DealPrice":"45.00","CoverUrl":"http://pimg2.hoto
     * .cn/goods/2016/10/30/2122_581581a266f86_336_336.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=2122"}},{"Id":"33",
     * "Title":"螃蟹","Url":"haodourecipe://haodou
     * .com/goods/searchResult/?tagName=螃蟹&TagId=33","Goods":{"GoodsId":"6259",
     * "Title":"麻辣醉蟹钳","DealPrice":"35.00","CoverUrl":"http://pimg2.hoto
     * .cn/goods/2016/10/13/6259_57ffa260a1659_336_336.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=6259"}},{"Id":"64",
     * "Title":"养颜","Url":"haodourecipe://haodou
     * .com/goods/searchResult/?tagName=养颜&TagId=64","Goods":{"GoodsId":"1859",
     * "Title":"川贝柠檬膏","DealPrice":"45.00","CoverUrl":"http://pimg3.hoto
     * .cn/goods/2016/11/18/1859_582ea2601acb4_336_336.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1859"}},{"Id":"43",
     * "Title":"鸡鸭鱼肉","Url":"haodourecipe://haodou
     * .com/goods/searchResult/?tagName=鸡鸭鱼肉&TagId=43","Goods":{"GoodsId":"6145",
     * "Title":"厨鲜生 | 固城湖咸鸭蛋65g×20颗礼盒装","DealPrice":"39.90","CoverUrl":"http://pimg2
     * .hoto.cn/goods/2016/07/07/6145_577e060a41c3f_336_336.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=6145"}}],
     * "CateList":[{"CateId":"58","CateName":"家传秘制","ImgUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2015/08/1438411987.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/searchResult/?CateId=58&CateName=家传秘制"},{"CateId":"59",
     * "CateName":"肉禽蛋类","ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2015/08/1438412006
     * .jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/searchResult/?CateId=59&CateName=肉禽蛋类"},{"CateId":"60",
     * "CateName":"烘焙面点","ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2015/08/1438412017
     * .jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/searchResult/?CateId=60&CateName=烘焙面点"},{"CateId":"61",
     * "CateName":"水产海鲜","ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2015/08/1438412028
     * .jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/searchResult/?CateId=61&CateName=水产海鲜"},{"CateId":"62",
     * "CateName":"腌腊制品","ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2015/08/1438412038
     * .jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/searchResult/?CateId=62&CateName=腌腊制品"},{"CateId":"63",
     * "CateName":"调味酱料","ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2015/08/1438412074
     * .jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/searchResult/?CateId=63&CateName=调味酱料"},{"CateId":"64",
     * "CateName":"养生养颜","ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2015/08/1438412060
     * .jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/searchResult/?CateId=64&CateName=养生养颜"},{"CateId":"65",
     * "CateName":"小吃零嘴","ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2015/08/1438412048
     * .jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/searchResult/?CateId=65&CateName=小吃零嘴"},{"CateId":"66",
     * "CateName":"冲调饮品","ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2015/11/1447986571
     * .jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/searchResult/?CateId=66&CateName=冲调饮品"},{"CateId":"67",
     * "CateName":"生鲜果蔬","ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2015/11/1448422666
     * .jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/searchResult/?CateId=67&CateName=生鲜果蔬"}],
     * "DailySpecialGoods":{"Label":"","Title":"今日特价","CoverUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2016/04/1460520351.jpg","Price":"￥9.90","IsAuto":0,
     * "OpenUrl":"haodourecipe://haodou.com/goods/subjectlist/?id=173"},
     * "DailyFirstGoods":{"Label":"美食研究所","Title":"新品推荐","CoverUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2016/03/1457419342.jpg","Price":"￥0.00","IsAuto":0,
     * "OpenUrl":"haodourecipe://haodou.com/goods/dailyfirst?type=new"},
     * "OneHourGoods":{"Label":"明星店铺","Title":"俊哥的小店儿","CoverUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2016/04/1460099180.jpg","Price":"￥0.00","IsAuto":2,
     * "OpenUrl":"haodourecipe://haodou.com/store/?id=610"},
     * "FoodieFavoriteGoods":[{"Title":"日式汤料","CoverUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2016/04/1460599417.jpg","Price":"￥9.90","HomePosition":1,
     * "GoodsId":5549},{"Title":"阿胶糕","CoverUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2016/04/1460342044.jpg","Price":"￥89.90","HomePosition":2,
     * "GoodsId":2786},{"Title":"核桃曲奇","CoverUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2016/04/1460342069.jpg","Price":"￥29.90","HomePosition":3,
     * "GoodsId":556},{"Title":"红肠","CoverUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2016/04/1460599176.jpg","Price":"￥31.90","HomePosition":4,
     * "GoodsId":1910},{"Title":"糖蒜","CoverUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2016/04/1460342883.jpg","Price":"￥16.90","HomePosition":5,
     * "GoodsId":5268},{"Title":"山楂果酱","CoverUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2016/04/1460342151.jpg","Price":"￥32.00","HomePosition":6,
     * "GoodsId":4364},{"Title":"酸角糕","CoverUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2016/04/1460342322.jpg","Price":"￥16.80","HomePosition":7,
     * "GoodsId":1155},{"Title":"香蕉酥","CoverUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2016/04/1460342343.jpg","Price":"￥35.00","HomePosition":8,
     * "GoodsId":5172},{"Title":"香辣腊肉干","CoverUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2016/04/1460342371.jpg","Price":"￥48.00","HomePosition":9,
     * "GoodsId":985}],"BrandStore":{"InsertionUrl":"http://m.haodou.com/mall/index
     * .php?r=wap/brand/home-page-recommend","OpenURL":"haodourecipe://haodou
     * .com/opentopic/?id=471515&store_id=167","Title":"【夏日美食】一骑红尘荔枝蜜~",
     * "ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2016/06/1466748684.jpg"},
     * "NewsRecommendGood":{"Goods":{"GoodsId":4786,"Title":"买5冷面赠2凉皮한국냉면 매우맛있다",
     * "DealPrice":"￥14.90","CoverUrl":"http://pimg2.hoto
     * .cn/goods/2016/02/24/4786_56cda5464f937_336_336.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=4786"},
     * "UserName":"好豆到家品鉴员","ImgUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2016/04/1460341662.jpg","Tags":["好吃不贵"],"Content":"好豆到家",
     * "Info":"冷面，面条劲道且富有弹性，是看得见的Q
     * ，看得见的弹！！酸溜溜的，甜滋滋的汤汁，浓郁到让你的舌头欲罢不能，火红的油辣子带来了不仅是满满的诚意而且更多幸福感。真空包装，卫生和干净都看得见。"},
     * "count":200,"list":[{"StoreId":149,"StoreTitle":"靓家货",
     * "StoreLogoUrl":"http://pimg2.hoto.cn/store/2015/07/31/55bb6ac68d05a.jpg",
     * "UserId":"8190340","UserName":"Leslie靓靓","GoodsId":271,"Title":"【肘爷】酱肘子",
     * "SubTitle":"【肘爷】酱肘子，肉质细腻","DealPrice":"￥150.00","ShippingInfo":"配送上门/全国快递",
     * "CoverUrl":"http://pimg2.hoto.cn/goods/2015/07/31/271_55bb72af0a680_680_450
     * .jpg","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=271",
     * "LikeCount":2485,"Stock":100,"IsShippingFree":1,"IsLike":0,"CartNum":0,
     * "Labels":[],"Weight":"1000克","Price":"￥168.00"},{"StoreId":4174,
     * "StoreTitle":"小钱包的美好生活","StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/11/19/564db750f35db.jpg","UserId":"8927449","UserName":"钱包妈",
     * "GoodsId":1917,"Title":"哈尔滨农大风干肠300克","SubTitle":"黑猪肉灌制而成 佐餐及零食佳品",
     * "DealPrice":"￥32.80","ShippingInfo":"全国快递","CoverUrl":"http://pimg1.hoto
     * .cn/goods/2015/11/25/1917_56551cf4d9142_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1917","LikeCount":202,
     * "Stock":128,"IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["新人价","包邮"],
     * "Weight":"300克","Price":"￥48.00"},{"StoreId":7161,"StoreTitle":"荤爷的店",
     * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2016/03/21/56efbcd89b255.jpg",
     * "UserId":"9049464","UserName":"斯坦福桥的破车","GoodsId":5676,
     * "Title":"好豆金牌卖家热卖关东煮汤料200ml","SubTitle":"200ml.日本风味.安全放心无添加","DealPrice":"￥33
     * .90","ShippingInfo":"全国快递","CoverUrl":"http://pimg1.hoto
     * .cn/goods/2016/04/07/5676_5705dcd7d69a5_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=5676","LikeCount":184,
     * "Stock":31,"IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":[],
     * "Weight":"500克","Price":"￥49.99"},{"StoreId":166,"StoreTitle":"然妈烘焙",
     * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/08/09/55c6ba6389638.jpg",
     * "UserId":"20500","UserName":"尚志李波","GoodsId":312,"Title":"蔓越莓饼干（40片）",
     * "SubTitle":"纯手工制作健康无添加饼干","DealPrice":"￥35.00","ShippingInfo":"配送上门/全国快递",
     * "CoverUrl":"http://pimg1.hoto.cn/goods/2015/10/16/312_5620372fe06ed_680_450
     * .jpg","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=312",
     * "LikeCount":1541,"Stock":25,"IsShippingFree":2,"IsLike":0,"CartNum":0,
     * "Labels":["包邮"],"Weight":"230克","Price":"￥38.00"},{"StoreId":176,
     * "StoreTitle":"双双爱烘焙","StoreLogoUrl":"http://pimg1.hoto
     * .cn/store/2015/08/02/55bcff516fbf5.jpg","UserId":"8749","UserName":"love双双",
     * "GoodsId":337,"Title":"（当家菜）台湾风味脆皮肠  纯手工自制（100克装）","SubTitle":"双双自制零添加美食",
     * "DealPrice":"￥12.80","ShippingInfo":"全国快递","CoverUrl":"http://pimg2.hoto
     * .cn/goods/2015/08/04/337_55bf9cbf5384b_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=337","LikeCount":3497,
     * "Stock":100,"IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":[],
     * "Weight":"100克","Price":"￥13.80"},{"StoreId":3976,"StoreTitle":"淼冉妈七彩面点手工坊",
     * "StoreLogoUrl":"http://pimg2.hoto.cn/store/2015/11/05/563afb18a8936.jpg",
     * "UserId":"8111886","UserName":"淼冉妈","GoodsId":1309,"Title":"纯手工空心面手工挂面500克",
     * "SubTitle":"百年工艺纯手工制作空心面","DealPrice":"￥20.00","ShippingInfo":"配送上门/全国快递",
     * "CoverUrl":"http://pimg2.hoto.cn/goods/2016/01/19/1309_569ded18ecc46_680_450
     * .jpg","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1309",
     * "LikeCount":387,"Stock":4242,"IsShippingFree":2,"IsLike":0,"CartNum":0,
     * "Labels":["包邮"],"Weight":"500克","Price":"￥40.00"},{"StoreId":166,
     * "StoreTitle":"然妈烘焙","StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/08/09/55c6ba6389638.jpg","UserId":"20500","UserName":"尚志李波",
     * "GoodsId":465,"Title":"杂粮煎饼15张（500克）","SubTitle":"东北纯手工杂粮煎饼","DealPrice":"￥35
     * .00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1.hoto
     * .cn/goods/2015/09/07/465_55ed2423e0056_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=465","LikeCount":1514,
     * "Stock":46,"IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["包邮"],
     * "Weight":"500克","Price":"￥40.00"},{"StoreId":3595,"StoreTitle":"婷婷美食",
     * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/10/28/56304265088d2.jpg",
     * "UserId":"8835271","UserName":"婷婷手工美食","GoodsId":1501,
     * "Title":"江米条寸枣500g炸糖婷婷美食年货过年料","SubTitle":"食味⑨久","DealPrice":"￥29.90",
     * "ShippingInfo":"配送上门/同城快递","CoverUrl":"http://pimg2.hoto
     * .cn/goods/2015/11/12/1501_5643dcd8200e3_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1501","LikeCount":284,
     * "Stock":4909,"IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["新人价","包邮"],
     * "Weight":"500克","Price":"￥68.00"},{"StoreId":3976,"StoreTitle":"淼冉妈七彩面点手工坊",
     * "StoreLogoUrl":"http://pimg2.hoto.cn/store/2015/11/05/563afb18a8936.jpg",
     * "UserId":"8111886","UserName":"淼冉妈","GoodsId":1348,"Title":"新疆大个核桃薄皮核桃1000克",
     * "SubTitle":"手可以直接剥开食用哦！个大，皮薄，肉鲜！","DealPrice":"￥49.00",
     * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2.hoto
     * .cn/goods/2015/11/09/1348_564002d330acf_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1348","LikeCount":200,
     * "Stock":3307,"IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["包邮"],
     * "Weight":"1000克","Price":"￥78.00"},{"StoreId":610,"StoreTitle":"俊哥的小店儿",
     * "StoreLogoUrl":"http://pimg1.hoto.cn/store/2016/03/25/56f54ab590ccb.jpg",
     * "UserId":"8307326","UserName":"俊哥黄瓜","GoodsId":360,
     * "Title":"【爆款】俊哥牌俊少脆皮黄瓜（荐）（400克）","SubTitle":"吃了俊哥瓜、忘了那个他（她）！","DealPrice":"￥25
     * .00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1.hoto
     * .cn/goods/2016/01/05/360_568aa7f3db62c_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=360","LikeCount":1879,
     * "Stock":28,"IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":[],
     * "Weight":"400克","Price":"￥35.00"},{"StoreId":1645,"StoreTitle":"麻辣小面",
     * "StoreLogoUrl":"http://pimg1.hoto.cn/store/2016/01/08/568f2605e81bd.jpg",
     * "UserId":"8466351","UserName":"华曜餐饮","GoodsId":705,"Title":"【窝窝侠】麻辣面2份/盒",
     * "SubTitle":"凑合？滚粗！","DealPrice":"￥25.80","ShippingInfo":"全国快递",
     * "CoverUrl":"http://pimg1.hoto.cn/goods/2016/06/17/705_57635906f3689_680_450
     * .jpg","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=705",
     * "LikeCount":1411,"Stock":299,"IsShippingFree":2,"IsLike":0,"CartNum":0,
     * "Labels":["包邮"],"Weight":"470克","Price":"￥39.00"},{"StoreId":176,
     * "StoreTitle":"双双爱烘焙","StoreLogoUrl":"http://pimg1.hoto
     * .cn/store/2015/08/02/55bcff516fbf5.jpg","UserId":"8749","UserName":"love双双",
     * "GoodsId":338,"Title":"黑胡椒脆皮（100克装）纯手工自制","SubTitle":"双双自制零添加美食 健康美味 早餐首选",
     * "DealPrice":"￥12.80","ShippingInfo":"全国快递","CoverUrl":"http://pimg3.hoto
     * .cn/goods/2015/08/04/338_55c02b80b8a91_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=338","LikeCount":2462,
     * "Stock":100,"IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":[],
     * "Weight":"100克"},{"StoreId":3475,"StoreTitle":"红蛋蛋","StoreLogoUrl":"http://pimg3
     * .hoto.cn/store/2015/12/04/5661243a1b012.jpg","UserId":"3729569",
     * "UserName":"红蛋蛋来也","GoodsId":886,"Title":"开胃红油蟹黄咸鸭蛋20只",
     * "SubTitle":"天热不想吃饭？来一只鸭蛋，开胃消食，蟹黄味哦！","DealPrice":"￥39.80",
     * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2.hoto
     * .cn/goods/2015/11/06/886_563c0b0e0e280_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=886","LikeCount":399,
     * "Stock":103,"IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["活动价","包邮"],
     * "Weight":"1400克","Price":"￥80.00"},{"StoreId":3712,"StoreTitle":"飘香美食铺",
     * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/10/30/56338e99214c7.jpg",
     * "UserId":"8843844","UserName":"爱美食滴加菲猫","GoodsId":2402,
     * "Title":"【限时促销】精品罐装秘制酒鬼花生","SubTitle":"好豆爆款，买5份赠送1份。","DealPrice":"￥12.50",
     * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg3.hoto
     * .cn/goods/2015/12/02/2402_565f0efb074d6_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=2402","LikeCount":218,
     * "Stock":50,"IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":["活动价"],
     * "Weight":"250克","Price":"￥25.00"},{"StoreId":2920,"StoreTitle":"海阔凭鱼跃",
     * "StoreLogoUrl":"http://pimg2.hoto.cn/store/2015/11/17/564ae6c5c982b.jpg",
     * "UserId":"8288073","UserName":"辰妈私房美食","GoodsId":1354,"Title":"野生红娘鱼即食鱼干原味",
     * "SubTitle":"原生态天然滋补海鲜","DealPrice":"￥18.00","ShippingInfo":"全国快递",
     * "CoverUrl":"http://pimg2.hoto.cn/goods/2016/04/09/1354_57086a8225173_680_450
     * .jpg","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1354",
     * "LikeCount":204,"Stock":88,"IsShippingFree":2,"IsLike":0,"CartNum":0,
     * "Labels":["包邮"],"Weight":"100克","Price":"￥38.00"},{"StoreId":3976,
     * "StoreTitle":"淼冉妈七彩面点手工坊","StoreLogoUrl":"http://pimg2.hoto
     * .cn/store/2015/11/05/563afb18a8936.jpg","UserId":"8111886","UserName":"淼冉妈",
     * "GoodsId":1346,"Title":"淼冉妈手工蔬菜面条7种口味混合装","SubTitle":"七种口味混合装，七彩面宝宝面条宝宝副食",
     * "DealPrice":"￥19.90","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg3.hoto
     * .cn/goods/2015/11/09/1346_563ffd64c8c91_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1346","LikeCount":385,
     * "Stock":178,"IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["包邮"],
     * "Weight":"250克","Price":"￥41.00"},{"StoreId":3872,"StoreTitle":"颜大叔",
     * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/11/03/5638a32b7ea6c.jpg",
     * "UserId":"8879952","UserName":"颜大叔","GoodsId":1139,"Title":"颜大叔|宁波水磨年糕 1斤",
     * "SubTitle":"百搭食材，口感柔嫩Q弹","DealPrice":"￥7.90","ShippingInfo":"配送上门/全国快递",
     * "CoverUrl":"http://pimg3.hoto.cn/goods/2015/11/04/1139_56396b3c5b251_680_450
     * .jpg","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1139",
     * "LikeCount":624,"Stock":308,"IsShippingFree":1,"IsLike":0,"CartNum":0,
     * "Labels":[],"Weight":"500克","Price":"￥15.90"},{"StoreId":3051,
     * "StoreTitle":"香聚源食品店","StoreLogoUrl":"http://pimg1.hoto
     * .cn/store/2015/10/16/5620fa05630a3.jpg","UserId":"8754144","UserName":"香聚源食品店",
     * "GoodsId":683,"Title":"山东特产手撕风琴鱿鱼片","SubTitle":"吃出苗条身材","DealPrice":"￥13.90",
     * "ShippingInfo":"全国快递","CoverUrl":"http://pimg3.hoto
     * .cn/goods/2015/10/20/683_562597c64f2f6_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=683","LikeCount":481,
     * "Stock":300,"IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["新人价","包邮"],
     * "Weight":"200克","Price":"￥25.00"},{"StoreId":3712,"StoreTitle":"飘香美食铺",
     * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/10/30/56338e99214c7.jpg",
     * "UserId":"8843844","UserName":"爱美食滴加菲猫","GoodsId":1136,
     * "Title":"【限时促销】湖南特色猪血丸子包邮（640g左右）","SubTitle":"香糯爽口 腊味十足（满49包邮）",
     * "DealPrice":"￥26.00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg3.hoto
     * .cn/goods/2015/11/03/1136_5638d2788a847_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1136","LikeCount":243,
     * "Stock":30,"IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["活动价","包邮"],
     * "Weight":"640克","Price":"￥50.00"},{"StoreId":4269,"StoreTitle":"乡下家源",
     * "StoreLogoUrl":"http://pimg1.hoto.cn/store/2016/07/21/57902a0260183.jpg",
     * "UserId":"8931711","UserName":"乡下家源","GoodsId":1643,"Title":"自制腐竹段原价38元",
     * "SubTitle":"非转基因黄豆自制腐竹段全国包邮（新疆、海南、西藏除外）","DealPrice":"￥31.00",
     * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg3.hoto
     * .cn/goods/2015/11/14/1643_5646c85a9318e_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1643","LikeCount":132,
     * "Stock":300,"IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["包邮"],
     * "Weight":"370克","Price":"￥38.00"}],"CartTotalNum":0}
     */

    private int id;
    private int status;
    private ResultBean result;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public static class ResultBean {
        /**
         * tags : [{"Id":"38","Title":"猪肉","Url":"haodourecipe://haodou
         * .com/goods/searchResult/?tagName=猪肉&TagId=38","Goods":{"GoodsId":"6278",
         * "Title":"【温州特产】猪油渣","DealPrice":"69.00","CoverUrl":"http://pimg3.hoto
         * .cn/goods/2016/11/09/6278_582303b7c4313_336_336.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=6278"}},{"Id":"42",
         * "Title":"饼干","Url":"haodourecipe://haodou
         * .com/goods/searchResult/?tagName=饼干&TagId=42","Goods":{"GoodsId":"6281",
         * "Title":"【Emily的美好时光】蛋黄酥 低糖白莲蓉味（六个礼盒装）","DealPrice":"79.00",
         * "CoverUrl":"http://pimg3.hoto.cn/goods/2016/11/08/6281_5821a8fdc0ed1_336_336
         * .jpg","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=6281"}},
         * {"Id":"37","Title":"牛羊肉","Url":"haodourecipe://haodou
         * .com/goods/searchResult/?tagName=牛羊肉&TagId=37","Goods":{"GoodsId":"1285",
         * "Title":"【2份包邮】限时促销精品罐装飘香秘制风味牙签牛肉","DealPrice":"65.00",
         * "CoverUrl":"http://pimg2.hoto.cn/goods/2016/11/17/1285_582d6d880edee_336_336
         * .jpg","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1285"}},
         * {"Id":"34","Title":"辣椒酱","Url":"haodourecipe://haodou
         * .com/goods/searchResult/?tagName=辣椒酱&TagId=34","Goods":{"GoodsId":"6255",
         * "Title":"正宗重庆香辣红油","DealPrice":"25.80","CoverUrl":"http://pimg1.hoto
         * .cn/goods/2016/10/12/6255_57fdd8d5ba1d3_336_336.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=6255"}},{"Id":"57",
         * "Title":"腌制品","Url":"haodourecipe://haodou
         * .com/goods/searchResult/?tagName=腌制品&TagId=57","Goods":{"GoodsId":"2122",
         * "Title":"醉血蛤","DealPrice":"45.00","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2016/10/30/2122_581581a266f86_336_336.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=2122"}},{"Id":"33",
         * "Title":"螃蟹","Url":"haodourecipe://haodou
         * .com/goods/searchResult/?tagName=螃蟹&TagId=33","Goods":{"GoodsId":"6259",
         * "Title":"麻辣醉蟹钳","DealPrice":"35.00","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2016/10/13/6259_57ffa260a1659_336_336.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=6259"}},{"Id":"64",
         * "Title":"养颜","Url":"haodourecipe://haodou
         * .com/goods/searchResult/?tagName=养颜&TagId=64","Goods":{"GoodsId":"1859",
         * "Title":"川贝柠檬膏","DealPrice":"45.00","CoverUrl":"http://pimg3.hoto
         * .cn/goods/2016/11/18/1859_582ea2601acb4_336_336.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1859"}},{"Id":"43",
         * "Title":"鸡鸭鱼肉","Url":"haodourecipe://haodou
         * .com/goods/searchResult/?tagName=鸡鸭鱼肉&TagId=43","Goods":{"GoodsId":"6145",
         * "Title":"厨鲜生 | 固城湖咸鸭蛋65g×20颗礼盒装","DealPrice":"39.90",
         * "CoverUrl":"http://pimg2.hoto.cn/goods/2016/07/07/6145_577e060a41c3f_336_336
         * .jpg","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=6145"}}]
         * CateList : [{"CateId":"58","CateName":"家传秘制","ImgUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2015/08/1438411987.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/searchResult/?CateId=58&CateName=家传秘制"},{"CateId":"59",
         * "CateName":"肉禽蛋类","ImgUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2015/08/1438412006.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/searchResult/?CateId=59&CateName=肉禽蛋类"},{"CateId":"60",
         * "CateName":"烘焙面点","ImgUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2015/08/1438412017.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/searchResult/?CateId=60&CateName=烘焙面点"},{"CateId":"61",
         * "CateName":"水产海鲜","ImgUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2015/08/1438412028.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/searchResult/?CateId=61&CateName=水产海鲜"},{"CateId":"62",
         * "CateName":"腌腊制品","ImgUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2015/08/1438412038.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/searchResult/?CateId=62&CateName=腌腊制品"},{"CateId":"63",
         * "CateName":"调味酱料","ImgUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2015/08/1438412074.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/searchResult/?CateId=63&CateName=调味酱料"},{"CateId":"64",
         * "CateName":"养生养颜","ImgUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2015/08/1438412060.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/searchResult/?CateId=64&CateName=养生养颜"},{"CateId":"65",
         * "CateName":"小吃零嘴","ImgUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2015/08/1438412048.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/searchResult/?CateId=65&CateName=小吃零嘴"},{"CateId":"66",
         * "CateName":"冲调饮品","ImgUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2015/11/1447986571.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/searchResult/?CateId=66&CateName=冲调饮品"},{"CateId":"67",
         * "CateName":"生鲜果蔬","ImgUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2015/11/1448422666.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/searchResult/?CateId=67&CateName=生鲜果蔬"}]
         * DailySpecialGoods : {"Label":"","Title":"今日特价","CoverUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2016/04/1460520351.jpg","Price":"￥9.90","IsAuto":0,
         * "OpenUrl":"haodourecipe://haodou.com/goods/subjectlist/?id=173"}
         * DailyFirstGoods : {"Label":"美食研究所","Title":"新品推荐","CoverUrl":"http://img1
         * .hoto.cn/mall/mall_ad/2016/03/1457419342.jpg","Price":"￥0.00","IsAuto":0,
         * "OpenUrl":"haodourecipe://haodou.com/goods/dailyfirst?type=new"}
         * OneHourGoods : {"Label":"明星店铺","Title":"俊哥的小店儿","CoverUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2016/04/1460099180.jpg","Price":"￥0.00","IsAuto":2,
         * "OpenUrl":"haodourecipe://haodou.com/store/?id=610"}
         * FoodieFavoriteGoods : [{"Title":"日式汤料","CoverUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2016/04/1460599417.jpg","Price":"￥9.90","HomePosition":1,
         * "GoodsId":5549},{"Title":"阿胶糕","CoverUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2016/04/1460342044.jpg","Price":"￥89.90","HomePosition":2,
         * "GoodsId":2786},{"Title":"核桃曲奇","CoverUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2016/04/1460342069.jpg","Price":"￥29.90","HomePosition":3,
         * "GoodsId":556},{"Title":"红肠","CoverUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2016/04/1460599176.jpg","Price":"￥31.90","HomePosition":4,
         * "GoodsId":1910},{"Title":"糖蒜","CoverUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2016/04/1460342883.jpg","Price":"￥16.90","HomePosition":5,
         * "GoodsId":5268},{"Title":"山楂果酱","CoverUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2016/04/1460342151.jpg","Price":"￥32.00","HomePosition":6,
         * "GoodsId":4364},{"Title":"酸角糕","CoverUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2016/04/1460342322.jpg","Price":"￥16.80","HomePosition":7,
         * "GoodsId":1155},{"Title":"香蕉酥","CoverUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2016/04/1460342343.jpg","Price":"￥35.00","HomePosition":8,
         * "GoodsId":5172},{"Title":"香辣腊肉干","CoverUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2016/04/1460342371.jpg","Price":"￥48.00","HomePosition":9,
         * "GoodsId":985}]
         * BrandStore : {"InsertionUrl":"http://m.haodou.com/mall/index
         * .php?r=wap/brand/home-page-recommend","OpenURL":"haodourecipe://haodou
         * .com/opentopic/?id=471515&store_id=167","Title":"【夏日美食】一骑红尘荔枝蜜~",
         * "ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2016/06/1466748684.jpg"}
         * NewsRecommendGood : {"Goods":{"GoodsId":4786,"Title":"买5冷面赠2凉皮한국냉면 매우맛있다",
         * "DealPrice":"￥14.90","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2016/02/24/4786_56cda5464f937_336_336.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=4786"},
         * "UserName":"好豆到家品鉴员","ImgUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2016/04/1460341662.jpg","Tags":["好吃不贵"],"Content":"好豆到家",
         * "Info":"冷面，面条劲道且富有弹性，是看得见的Q
         * ，看得见的弹！！酸溜溜的，甜滋滋的汤汁，浓郁到让你的舌头欲罢不能，火红的油辣子带来了不仅是满满的诚意而且更多幸福感。真空包装，卫生和干净都看得见。"}
         * count : 200
         * list : [{"StoreId":149,"StoreTitle":"靓家货","StoreLogoUrl":"http://pimg2.hoto
         * .cn/store/2015/07/31/55bb6ac68d05a.jpg","UserId":"8190340",
         * "UserName":"Leslie靓靓","GoodsId":271,"Title":"【肘爷】酱肘子",
         * "SubTitle":"【肘爷】酱肘子，肉质细腻","DealPrice":"￥150.00","ShippingInfo":"配送上门/全国快递",
         * "CoverUrl":"http://pimg2.hoto.cn/goods/2015/07/31/271_55bb72af0a680_680_450
         * .jpg","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=271",
         * "LikeCount":2485,"Stock":100,"IsShippingFree":1,"IsLike":0,"CartNum":0,
         * "Labels":[],"Weight":"1000克","Price":"￥168.00"},{"StoreId":4174,
         * "StoreTitle":"小钱包的美好生活","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/11/19/564db750f35db.jpg","UserId":"8927449","UserName":"钱包妈",
         * "GoodsId":1917,"Title":"哈尔滨农大风干肠300克","SubTitle":"黑猪肉灌制而成 佐餐及零食佳品",
         * "DealPrice":"￥32.80","ShippingInfo":"全国快递","CoverUrl":"http://pimg1.hoto
         * .cn/goods/2015/11/25/1917_56551cf4d9142_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1917","LikeCount":202,
         * "Stock":128,"IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["新人价","包邮"],
         * "Weight":"300克","Price":"￥48.00"},{"StoreId":7161,"StoreTitle":"荤爷的店",
         * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2016/03/21/56efbcd89b255.jpg",
         * "UserId":"9049464","UserName":"斯坦福桥的破车","GoodsId":5676,
         * "Title":"好豆金牌卖家热卖关东煮汤料200ml","SubTitle":"200ml.日本风味.安全放心无添加",
         * "DealPrice":"￥33.90","ShippingInfo":"全国快递","CoverUrl":"http://pimg1.hoto
         * .cn/goods/2016/04/07/5676_5705dcd7d69a5_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=5676","LikeCount":184,
         * "Stock":31,"IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":[],
         * "Weight":"500克","Price":"￥49.99"},{"StoreId":166,"StoreTitle":"然妈烘焙",
         * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/08/09/55c6ba6389638.jpg",
         * "UserId":"20500","UserName":"尚志李波","GoodsId":312,"Title":"蔓越莓饼干（40片）",
         * "SubTitle":"纯手工制作健康无添加饼干","DealPrice":"￥35.00","ShippingInfo":"配送上门/全国快递",
         * "CoverUrl":"http://pimg1.hoto.cn/goods/2015/10/16/312_5620372fe06ed_680_450
         * .jpg","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=312",
         * "LikeCount":1541,"Stock":25,"IsShippingFree":2,"IsLike":0,"CartNum":0,
         * "Labels":["包邮"],"Weight":"230克","Price":"￥38.00"},{"StoreId":176,
         * "StoreTitle":"双双爱烘焙","StoreLogoUrl":"http://pimg1.hoto
         * .cn/store/2015/08/02/55bcff516fbf5.jpg","UserId":"8749","UserName":"love双双",
         * "GoodsId":337,"Title":"（当家菜）台湾风味脆皮肠  纯手工自制（100克装）","SubTitle":"双双自制零添加美食",
         * "DealPrice":"￥12.80","ShippingInfo":"全国快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2015/08/04/337_55bf9cbf5384b_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=337","LikeCount":3497,
         * "Stock":100,"IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":[],
         * "Weight":"100克","Price":"￥13.80"},{"StoreId":3976,"StoreTitle":"淼冉妈七彩面点手工坊",
         * "StoreLogoUrl":"http://pimg2.hoto.cn/store/2015/11/05/563afb18a8936.jpg",
         * "UserId":"8111886","UserName":"淼冉妈","GoodsId":1309,"Title":"纯手工空心面手工挂面500克",
         * "SubTitle":"百年工艺纯手工制作空心面","DealPrice":"￥20.00","ShippingInfo":"配送上门/全国快递",
         * "CoverUrl":"http://pimg2.hoto.cn/goods/2016/01/19/1309_569ded18ecc46_680_450
         * .jpg","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1309",
         * "LikeCount":387,"Stock":4242,"IsShippingFree":2,"IsLike":0,"CartNum":0,
         * "Labels":["包邮"],"Weight":"500克","Price":"￥40.00"},{"StoreId":166,
         * "StoreTitle":"然妈烘焙","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/08/09/55c6ba6389638.jpg","UserId":"20500","UserName":"尚志李波",
         * "GoodsId":465,"Title":"杂粮煎饼15张（500克）","SubTitle":"东北纯手工杂粮煎饼",
         * "DealPrice":"￥35.00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1
         * .hoto.cn/goods/2015/09/07/465_55ed2423e0056_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=465","LikeCount":1514,
         * "Stock":46,"IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["包邮"],
         * "Weight":"500克","Price":"￥40.00"},{"StoreId":3595,"StoreTitle":"婷婷美食",
         * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/10/28/56304265088d2.jpg",
         * "UserId":"8835271","UserName":"婷婷手工美食","GoodsId":1501,
         * "Title":"江米条寸枣500g炸糖婷婷美食年货过年料","SubTitle":"食味⑨久","DealPrice":"￥29.90",
         * "ShippingInfo":"配送上门/同城快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2015/11/12/1501_5643dcd8200e3_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1501","LikeCount":284,
         * "Stock":4909,"IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["新人价",
         * "包邮"],"Weight":"500克","Price":"￥68.00"},{"StoreId":3976,
         * "StoreTitle":"淼冉妈七彩面点手工坊","StoreLogoUrl":"http://pimg2.hoto
         * .cn/store/2015/11/05/563afb18a8936.jpg","UserId":"8111886","UserName":"淼冉妈",
         * "GoodsId":1348,"Title":"新疆大个核桃薄皮核桃1000克","SubTitle":"手可以直接剥开食用哦！个大，皮薄，肉鲜！",
         * "DealPrice":"￥49.00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2
         * .hoto.cn/goods/2015/11/09/1348_564002d330acf_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1348","LikeCount":200,
         * "Stock":3307,"IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["包邮"],
         * "Weight":"1000克","Price":"￥78.00"},{"StoreId":610,"StoreTitle":"俊哥的小店儿",
         * "StoreLogoUrl":"http://pimg1.hoto.cn/store/2016/03/25/56f54ab590ccb.jpg",
         * "UserId":"8307326","UserName":"俊哥黄瓜","GoodsId":360,
         * "Title":"【爆款】俊哥牌俊少脆皮黄瓜（荐）（400克）","SubTitle":"吃了俊哥瓜、忘了那个他（她）！",
         * "DealPrice":"￥25.00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1
         * .hoto.cn/goods/2016/01/05/360_568aa7f3db62c_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=360","LikeCount":1879,
         * "Stock":28,"IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":[],
         * "Weight":"400克","Price":"￥35.00"},{"StoreId":1645,"StoreTitle":"麻辣小面",
         * "StoreLogoUrl":"http://pimg1.hoto.cn/store/2016/01/08/568f2605e81bd.jpg",
         * "UserId":"8466351","UserName":"华曜餐饮","GoodsId":705,"Title":"【窝窝侠】麻辣面2份/盒",
         * "SubTitle":"凑合？滚粗！","DealPrice":"￥25.80","ShippingInfo":"全国快递",
         * "CoverUrl":"http://pimg1.hoto.cn/goods/2016/06/17/705_57635906f3689_680_450
         * .jpg","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=705",
         * "LikeCount":1411,"Stock":299,"IsShippingFree":2,"IsLike":0,"CartNum":0,
         * "Labels":["包邮"],"Weight":"470克","Price":"￥39.00"},{"StoreId":176,
         * "StoreTitle":"双双爱烘焙","StoreLogoUrl":"http://pimg1.hoto
         * .cn/store/2015/08/02/55bcff516fbf5.jpg","UserId":"8749","UserName":"love双双",
         * "GoodsId":338,"Title":"黑胡椒脆皮（100克装）纯手工自制","SubTitle":"双双自制零添加美食 健康美味 早餐首选",
         * "DealPrice":"￥12.80","ShippingInfo":"全国快递","CoverUrl":"http://pimg3.hoto
         * .cn/goods/2015/08/04/338_55c02b80b8a91_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=338","LikeCount":2462,
         * "Stock":100,"IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":[],
         * "Weight":"100克"},{"StoreId":3475,"StoreTitle":"红蛋蛋",
         * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/12/04/5661243a1b012.jpg",
         * "UserId":"3729569","UserName":"红蛋蛋来也","GoodsId":886,"Title":"开胃红油蟹黄咸鸭蛋20只",
         * "SubTitle":"天热不想吃饭？来一只鸭蛋，开胃消食，蟹黄味哦！","DealPrice":"￥39.80",
         * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2015/11/06/886_563c0b0e0e280_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=886","LikeCount":399,
         * "Stock":103,"IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["活动价","包邮"],
         * "Weight":"1400克","Price":"￥80.00"},{"StoreId":3712,"StoreTitle":"飘香美食铺",
         * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/10/30/56338e99214c7.jpg",
         * "UserId":"8843844","UserName":"爱美食滴加菲猫","GoodsId":2402,
         * "Title":"【限时促销】精品罐装秘制酒鬼花生","SubTitle":"好豆爆款，买5份赠送1份。","DealPrice":"￥12.50",
         * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg3.hoto
         * .cn/goods/2015/12/02/2402_565f0efb074d6_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=2402","LikeCount":218,
         * "Stock":50,"IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":["活动价"],
         * "Weight":"250克","Price":"￥25.00"},{"StoreId":2920,"StoreTitle":"海阔凭鱼跃",
         * "StoreLogoUrl":"http://pimg2.hoto.cn/store/2015/11/17/564ae6c5c982b.jpg",
         * "UserId":"8288073","UserName":"辰妈私房美食","GoodsId":1354,"Title":"野生红娘鱼即食鱼干原味",
         * "SubTitle":"原生态天然滋补海鲜","DealPrice":"￥18.00","ShippingInfo":"全国快递",
         * "CoverUrl":"http://pimg2.hoto.cn/goods/2016/04/09/1354_57086a8225173_680_450
         * .jpg","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1354",
         * "LikeCount":204,"Stock":88,"IsShippingFree":2,"IsLike":0,"CartNum":0,
         * "Labels":["包邮"],"Weight":"100克","Price":"￥38.00"},{"StoreId":3976,
         * "StoreTitle":"淼冉妈七彩面点手工坊","StoreLogoUrl":"http://pimg2.hoto
         * .cn/store/2015/11/05/563afb18a8936.jpg","UserId":"8111886","UserName":"淼冉妈",
         * "GoodsId":1346,"Title":"淼冉妈手工蔬菜面条7种口味混合装","SubTitle":"七种口味混合装，七彩面宝宝面条宝宝副食",
         * "DealPrice":"￥19.90","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg3
         * .hoto.cn/goods/2015/11/09/1346_563ffd64c8c91_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1346","LikeCount":385,
         * "Stock":178,"IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["包邮"],
         * "Weight":"250克","Price":"￥41.00"},{"StoreId":3872,"StoreTitle":"颜大叔",
         * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/11/03/5638a32b7ea6c.jpg",
         * "UserId":"8879952","UserName":"颜大叔","GoodsId":1139,"Title":"颜大叔|宁波水磨年糕 1斤",
         * "SubTitle":"百搭食材，口感柔嫩Q弹","DealPrice":"￥7.90","ShippingInfo":"配送上门/全国快递",
         * "CoverUrl":"http://pimg3.hoto.cn/goods/2015/11/04/1139_56396b3c5b251_680_450
         * .jpg","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1139",
         * "LikeCount":624,"Stock":308,"IsShippingFree":1,"IsLike":0,"CartNum":0,
         * "Labels":[],"Weight":"500克","Price":"￥15.90"},{"StoreId":3051,
         * "StoreTitle":"香聚源食品店","StoreLogoUrl":"http://pimg1.hoto
         * .cn/store/2015/10/16/5620fa05630a3.jpg","UserId":"8754144",
         * "UserName":"香聚源食品店","GoodsId":683,"Title":"山东特产手撕风琴鱿鱼片","SubTitle":"吃出苗条身材",
         * "DealPrice":"￥13.90","ShippingInfo":"全国快递","CoverUrl":"http://pimg3.hoto
         * .cn/goods/2015/10/20/683_562597c64f2f6_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=683","LikeCount":481,
         * "Stock":300,"IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["新人价","包邮"],
         * "Weight":"200克","Price":"￥25.00"},{"StoreId":3712,"StoreTitle":"飘香美食铺",
         * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/10/30/56338e99214c7.jpg",
         * "UserId":"8843844","UserName":"爱美食滴加菲猫","GoodsId":1136,
         * "Title":"【限时促销】湖南特色猪血丸子包邮（640g左右）","SubTitle":"香糯爽口 腊味十足（满49包邮）",
         * "DealPrice":"￥26.00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg3
         * .hoto.cn/goods/2015/11/03/1136_5638d2788a847_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1136","LikeCount":243,
         * "Stock":30,"IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["活动价","包邮"],
         * "Weight":"640克","Price":"￥50.00"},{"StoreId":4269,"StoreTitle":"乡下家源",
         * "StoreLogoUrl":"http://pimg1.hoto.cn/store/2016/07/21/57902a0260183.jpg",
         * "UserId":"8931711","UserName":"乡下家源","GoodsId":1643,"Title":"自制腐竹段原价38元",
         * "SubTitle":"非转基因黄豆自制腐竹段全国包邮（新疆、海南、西藏除外）","DealPrice":"￥31.00",
         * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg3.hoto
         * .cn/goods/2015/11/14/1643_5646c85a9318e_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1643","LikeCount":132,
         * "Stock":300,"IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["包邮"],
         * "Weight":"370克","Price":"￥38.00"}]
         * CartTotalNum : 0
         */

        private DailySpecialGoodsBean DailySpecialGoods;
        private DailyFirstGoodsBean DailyFirstGoods;
        private OneHourGoodsBean OneHourGoods;
        private BrandStoreBean BrandStore;
        private NewsRecommendGoodBean NewsRecommendGood;
        private int count;
        private int CartTotalNum;
        private List<TagsBean> tags;
        private List<CateListBean> CateList;
        private List<FoodieFavoriteGoodsBean> FoodieFavoriteGoods;
        private List<ListBean> list;

        public DailySpecialGoodsBean getDailySpecialGoods() {
            return DailySpecialGoods;
        }

        public void setDailySpecialGoods(DailySpecialGoodsBean DailySpecialGoods) {
            this.DailySpecialGoods = DailySpecialGoods;
        }

        public DailyFirstGoodsBean getDailyFirstGoods() {
            return DailyFirstGoods;
        }

        public void setDailyFirstGoods(DailyFirstGoodsBean DailyFirstGoods) {
            this.DailyFirstGoods = DailyFirstGoods;
        }

        public OneHourGoodsBean getOneHourGoods() {
            return OneHourGoods;
        }

        public void setOneHourGoods(OneHourGoodsBean OneHourGoods) {
            this.OneHourGoods = OneHourGoods;
        }

        public BrandStoreBean getBrandStore() {
            return BrandStore;
        }

        public void setBrandStore(BrandStoreBean BrandStore) {
            this.BrandStore = BrandStore;
        }

        public NewsRecommendGoodBean getNewsRecommendGood() {
            return NewsRecommendGood;
        }

        public void setNewsRecommendGood(NewsRecommendGoodBean NewsRecommendGood) {
            this.NewsRecommendGood = NewsRecommendGood;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getCartTotalNum() {
            return CartTotalNum;
        }

        public void setCartTotalNum(int CartTotalNum) {
            this.CartTotalNum = CartTotalNum;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public List<CateListBean> getCateList() {
            return CateList;
        }

        public void setCateList(List<CateListBean> CateList) {
            this.CateList = CateList;
        }

        public List<FoodieFavoriteGoodsBean> getFoodieFavoriteGoods() {
            return FoodieFavoriteGoods;
        }

        public void setFoodieFavoriteGoods(List<FoodieFavoriteGoodsBean>
                                                   FoodieFavoriteGoods) {
            this.FoodieFavoriteGoods = FoodieFavoriteGoods;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class DailySpecialGoodsBean {
            /**
             * Label :
             * Title : 今日特价
             * CoverUrl : http://img1.hoto.cn/mall/mall_ad/2016/04/1460520351.jpg
             * Price : ￥9.90
             * IsAuto : 0
             * OpenUrl : haodourecipe://haodou.com/goods/subjectlist/?id=173
             */

            private String Label;
            private String Title;
            private String CoverUrl;
            private String Price;
            private int IsAuto;
            private String OpenUrl;

            public String getLabel() {
                return Label;
            }

            public void setLabel(String Label) {
                this.Label = Label;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getCoverUrl() {
                return CoverUrl;
            }

            public void setCoverUrl(String CoverUrl) {
                this.CoverUrl = CoverUrl;
            }

            public String getPrice() {
                return Price;
            }

            public void setPrice(String Price) {
                this.Price = Price;
            }

            public int getIsAuto() {
                return IsAuto;
            }

            public void setIsAuto(int IsAuto) {
                this.IsAuto = IsAuto;
            }

            public String getOpenUrl() {
                return OpenUrl;
            }

            public void setOpenUrl(String OpenUrl) {
                this.OpenUrl = OpenUrl;
            }
        }

        public static class DailyFirstGoodsBean {
            /**
             * Label : 美食研究所
             * Title : 新品推荐
             * CoverUrl : http://img1.hoto.cn/mall/mall_ad/2016/03/1457419342.jpg
             * Price : ￥0.00
             * IsAuto : 0
             * OpenUrl : haodourecipe://haodou.com/goods/dailyfirst?type=new
             */

            private String Label;
            private String Title;
            private String CoverUrl;
            private String Price;
            private int IsAuto;
            private String OpenUrl;

            public String getLabel() {
                return Label;
            }

            public void setLabel(String Label) {
                this.Label = Label;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getCoverUrl() {
                return CoverUrl;
            }

            public void setCoverUrl(String CoverUrl) {
                this.CoverUrl = CoverUrl;
            }

            public String getPrice() {
                return Price;
            }

            public void setPrice(String Price) {
                this.Price = Price;
            }

            public int getIsAuto() {
                return IsAuto;
            }

            public void setIsAuto(int IsAuto) {
                this.IsAuto = IsAuto;
            }

            public String getOpenUrl() {
                return OpenUrl;
            }

            public void setOpenUrl(String OpenUrl) {
                this.OpenUrl = OpenUrl;
            }
        }

        public static class OneHourGoodsBean {
            /**
             * Label : 明星店铺
             * Title : 俊哥的小店儿
             * CoverUrl : http://img1.hoto.cn/mall/mall_ad/2016/04/1460099180.jpg
             * Price : ￥0.00
             * IsAuto : 2
             * OpenUrl : haodourecipe://haodou.com/store/?id=610
             */

            private String Label;
            private String Title;
            private String CoverUrl;
            private String Price;
            private int IsAuto;
            private String OpenUrl;

            public String getLabel() {
                return Label;
            }

            public void setLabel(String Label) {
                this.Label = Label;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getCoverUrl() {
                return CoverUrl;
            }

            public void setCoverUrl(String CoverUrl) {
                this.CoverUrl = CoverUrl;
            }

            public String getPrice() {
                return Price;
            }

            public void setPrice(String Price) {
                this.Price = Price;
            }

            public int getIsAuto() {
                return IsAuto;
            }

            public void setIsAuto(int IsAuto) {
                this.IsAuto = IsAuto;
            }

            public String getOpenUrl() {
                return OpenUrl;
            }

            public void setOpenUrl(String OpenUrl) {
                this.OpenUrl = OpenUrl;
            }
        }

        public static class BrandStoreBean {
            /**
             * InsertionUrl : http://m.haodou.com/mall/index
             * .php?r=wap/brand/home-page-recommend
             * OpenURL : haodourecipe://haodou.com/opentopic/?id=471515&store_id=167
             * Title : 【夏日美食】一骑红尘荔枝蜜~
             * ImgUrl : http://img1.hoto.cn/mall/mall_ad/2016/06/1466748684.jpg
             */

            private String InsertionUrl;
            private String OpenURL;
            private String Title;
            private String ImgUrl;

            public String getInsertionUrl() {
                return InsertionUrl;
            }

            public void setInsertionUrl(String InsertionUrl) {
                this.InsertionUrl = InsertionUrl;
            }

            public String getOpenURL() {
                return OpenURL;
            }

            public void setOpenURL(String OpenURL) {
                this.OpenURL = OpenURL;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getImgUrl() {
                return ImgUrl;
            }

            public void setImgUrl(String ImgUrl) {
                this.ImgUrl = ImgUrl;
            }
        }

        public static class NewsRecommendGoodBean {
            /**
             * Goods : {"GoodsId":4786,"Title":"买5冷面赠2凉皮한국냉면 매우맛있다","DealPrice":"￥14
             * .90","CoverUrl":"http://pimg2.hoto
             * .cn/goods/2016/02/24/4786_56cda5464f937_336_336.jpg",
             * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=4786"}
             * UserName : 好豆到家品鉴员
             * ImgUrl : http://img1.hoto.cn/mall/mall_ad/2016/04/1460341662.jpg
             * Tags : ["好吃不贵"]
             * Content : 好豆到家
             * Info :
             * 冷面，面条劲道且富有弹性，是看得见的Q，看得见的弹！！酸溜溜的，甜滋滋的汤汁，浓郁到让你的舌头欲罢不能，火红的油辣子带来了不仅是满满的诚意而且更多幸福感。真空包装，卫生和干净都看得见。
             */

            private GoodsBean Goods;
            private String UserName;
            private String ImgUrl;
            private String Content;
            private String Info;
            private List<String> Tags;

            public GoodsBean getGoods() {
                return Goods;
            }

            public void setGoods(GoodsBean Goods) {
                this.Goods = Goods;
            }

            public String getUserName() {
                return UserName;
            }

            public void setUserName(String UserName) {
                this.UserName = UserName;
            }

            public String getImgUrl() {
                return ImgUrl;
            }

            public void setImgUrl(String ImgUrl) {
                this.ImgUrl = ImgUrl;
            }

            public String getContent() {
                return Content;
            }

            public void setContent(String Content) {
                this.Content = Content;
            }

            public String getInfo() {
                return Info;
            }

            public void setInfo(String Info) {
                this.Info = Info;
            }

            public List<String> getTags() {
                return Tags;
            }

            public void setTags(List<String> Tags) {
                this.Tags = Tags;
            }

            public static class GoodsBean {
                /**
                 * GoodsId : 4786
                 * Title : 买5冷面赠2凉皮한국냉면 매우맛있다
                 * DealPrice : ￥14.90
                 * CoverUrl : http://pimg2.hoto
                 * .cn/goods/2016/02/24/4786_56cda5464f937_336_336.jpg
                 * OpenUrl : haodourecipe://haodou.com/goods/detail?id=4786
                 */

                private int GoodsId;
                private String Title;
                private String DealPrice;
                private String CoverUrl;
                private String OpenUrl;

                public int getGoodsId() {
                    return GoodsId;
                }

                public void setGoodsId(int GoodsId) {
                    this.GoodsId = GoodsId;
                }

                public String getTitle() {
                    return Title;
                }

                public void setTitle(String Title) {
                    this.Title = Title;
                }

                public String getDealPrice() {
                    return DealPrice;
                }

                public void setDealPrice(String DealPrice) {
                    this.DealPrice = DealPrice;
                }

                public String getCoverUrl() {
                    return CoverUrl;
                }

                public void setCoverUrl(String CoverUrl) {
                    this.CoverUrl = CoverUrl;
                }

                public String getOpenUrl() {
                    return OpenUrl;
                }

                public void setOpenUrl(String OpenUrl) {
                    this.OpenUrl = OpenUrl;
                }
            }
        }

        public static class TagsBean {
            /**
             * Id : 38
             * Title : 猪肉
             * Url : haodourecipe://haodou.com/goods/searchResult/?tagName=猪肉&TagId=38
             * Goods : {"GoodsId":"6278","Title":"【温州特产】猪油渣","DealPrice":"69.00",
             * "CoverUrl":"http://pimg3.hoto.cn/goods/2016/11/09/6278_582303b7c4313_336_336.jpg","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=6278"}
             */

            private String Id;
            private String Title;
            private String Url;
            private GoodsBeanX Goods;

            public String getId() {
                return Id;
            }

            public void setId(String Id) {
                this.Id = Id;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getUrl() {
                return Url;
            }

            public void setUrl(String Url) {
                this.Url = Url;
            }

            public GoodsBeanX getGoods() {
                return Goods;
            }

            public void setGoods(GoodsBeanX Goods) {
                this.Goods = Goods;
            }

            public static class GoodsBeanX {
                /**
                 * GoodsId : 6278
                 * Title : 【温州特产】猪油渣
                 * DealPrice : 69.00
                 * CoverUrl : http://pimg3.hoto.cn/goods/2016/11/09/6278_582303b7c4313_336_336.jpg
                 * OpenUrl : haodourecipe://haodou.com/goods/detail?id=6278
                 */

                private String GoodsId;
                private String Title;
                private String DealPrice;
                private String CoverUrl;
                private String OpenUrl;

                public String getGoodsId() {
                    return GoodsId;
                }

                public void setGoodsId(String GoodsId) {
                    this.GoodsId = GoodsId;
                }

                public String getTitle() {
                    return Title;
                }

                public void setTitle(String Title) {
                    this.Title = Title;
                }

                public String getDealPrice() {
                    return DealPrice;
                }

                public void setDealPrice(String DealPrice) {
                    this.DealPrice = DealPrice;
                }

                public String getCoverUrl() {
                    return CoverUrl;
                }

                public void setCoverUrl(String CoverUrl) {
                    this.CoverUrl = CoverUrl;
                }

                public String getOpenUrl() {
                    return OpenUrl;
                }

                public void setOpenUrl(String OpenUrl) {
                    this.OpenUrl = OpenUrl;
                }
            }

            @Override
            public String toString() {
                return "TagsBean{" +
                        "Id='" + Id + '\'' +
                        ", Title='" + Title + '\'' +
                        ", Url='" + Url + '\'' +
                        ", Goods=" + Goods +
                        '}';
            }
        }

        public static class CateListBean {
            /**
             * CateId : 58
             * CateName : 家传秘制
             * ImgUrl : http://img1.hoto.cn/mall/mall_ad/2015/08/1438411987.jpg
             * OpenUrl : haodourecipe://haodou.com/goods/searchResult/?CateId=58&CateName=家传秘制
             */

            private String CateId;
            private String CateName;
            private String ImgUrl;
            private String OpenUrl;

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

            public String getImgUrl() {
                return ImgUrl;
            }

            public void setImgUrl(String ImgUrl) {
                this.ImgUrl = ImgUrl;
            }

            public String getOpenUrl() {
                return OpenUrl;
            }

            public void setOpenUrl(String OpenUrl) {
                this.OpenUrl = OpenUrl;
            }

            @Override
            public String toString() {
                return "CateListBean{" +
                        "CateId='" + CateId + '\'' +
                        ", CateName='" + CateName + '\'' +
                        ", ImgUrl='" + ImgUrl + '\'' +
                        ", OpenUrl='" + OpenUrl + '\'' +
                        '}';
            }
        }

        public static class FoodieFavoriteGoodsBean {
            /**
             * Title : 日式汤料
             * CoverUrl : http://img1.hoto.cn/mall/mall_ad/2016/04/1460599417.jpg
             * Price : ￥9.90
             * HomePosition : 1
             * GoodsId : 5549
             */

            private String Title;
            private String CoverUrl;
            private String Price;
            private int HomePosition;
            private int GoodsId;

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getCoverUrl() {
                return CoverUrl;
            }

            public void setCoverUrl(String CoverUrl) {
                this.CoverUrl = CoverUrl;
            }

            public String getPrice() {
                return Price;
            }

            public void setPrice(String Price) {
                this.Price = Price;
            }

            public int getHomePosition() {
                return HomePosition;
            }

            public void setHomePosition(int HomePosition) {
                this.HomePosition = HomePosition;
            }

            public int getGoodsId() {
                return GoodsId;
            }

            public void setGoodsId(int GoodsId) {
                this.GoodsId = GoodsId;
            }
        }

        public static class ListBean {
            /**
             * StoreId : 149
             * StoreTitle : 靓家货
             * StoreLogoUrl : http://pimg2.hoto.cn/store/2015/07/31/55bb6ac68d05a.jpg
             * UserId : 8190340
             * UserName : Leslie靓靓
             * GoodsId : 271
             * Title : 【肘爷】酱肘子
             * SubTitle : 【肘爷】酱肘子，肉质细腻
             * DealPrice : ￥150.00
             * ShippingInfo : 配送上门/全国快递
             * CoverUrl : http://pimg2.hoto.cn/goods/2015/07/31/271_55bb72af0a680_680_450.jpg
             * OpenUrl : haodourecipe://haodou.com/goods/detail?id=271
             * LikeCount : 2485
             * Stock : 100
             * IsShippingFree : 1
             * IsLike : 0
             * CartNum : 0
             * Labels : []
             * Weight : 1000克
             * Price : ￥168.00
             */

            private int StoreId;
            private String StoreTitle;
            private String StoreLogoUrl;
            private String UserId;
            private String UserName;
            private int GoodsId;
            private String Title;
            private String SubTitle;
            private String DealPrice;
            private String ShippingInfo;
            private String CoverUrl;
            private String OpenUrl;
            private int LikeCount;
            private int Stock;
            private int IsShippingFree;
            private int IsLike;
            private int CartNum;
            private String Weight;
            private String Price;
            private List<?> Labels;

            public int getStoreId() {
                return StoreId;
            }

            public void setStoreId(int StoreId) {
                this.StoreId = StoreId;
            }

            public String getStoreTitle() {
                return StoreTitle;
            }

            public void setStoreTitle(String StoreTitle) {
                this.StoreTitle = StoreTitle;
            }

            public String getStoreLogoUrl() {
                return StoreLogoUrl;
            }

            public void setStoreLogoUrl(String StoreLogoUrl) {
                this.StoreLogoUrl = StoreLogoUrl;
            }

            public String getUserId() {
                return UserId;
            }

            public void setUserId(String UserId) {
                this.UserId = UserId;
            }

            public String getUserName() {
                return UserName;
            }

            public void setUserName(String UserName) {
                this.UserName = UserName;
            }

            public int getGoodsId() {
                return GoodsId;
            }

            public void setGoodsId(int GoodsId) {
                this.GoodsId = GoodsId;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getSubTitle() {
                return SubTitle;
            }

            public void setSubTitle(String SubTitle) {
                this.SubTitle = SubTitle;
            }

            public String getDealPrice() {
                return DealPrice;
            }

            public void setDealPrice(String DealPrice) {
                this.DealPrice = DealPrice;
            }

            public String getShippingInfo() {
                return ShippingInfo;
            }

            public void setShippingInfo(String ShippingInfo) {
                this.ShippingInfo = ShippingInfo;
            }

            public String getCoverUrl() {
                return CoverUrl;
            }

            public void setCoverUrl(String CoverUrl) {
                this.CoverUrl = CoverUrl;
            }

            public String getOpenUrl() {
                return OpenUrl;
            }

            public void setOpenUrl(String OpenUrl) {
                this.OpenUrl = OpenUrl;
            }

            public int getLikeCount() {
                return LikeCount;
            }

            public void setLikeCount(int LikeCount) {
                this.LikeCount = LikeCount;
            }

            public int getStock() {
                return Stock;
            }

            public void setStock(int Stock) {
                this.Stock = Stock;
            }

            public int getIsShippingFree() {
                return IsShippingFree;
            }

            public void setIsShippingFree(int IsShippingFree) {
                this.IsShippingFree = IsShippingFree;
            }

            public int getIsLike() {
                return IsLike;
            }

            public void setIsLike(int IsLike) {
                this.IsLike = IsLike;
            }

            public int getCartNum() {
                return CartNum;
            }

            public void setCartNum(int CartNum) {
                this.CartNum = CartNum;
            }

            public String getWeight() {
                return Weight;
            }

            public void setWeight(String Weight) {
                this.Weight = Weight;
            }

            public String getPrice() {
                return Price;
            }

            public void setPrice(String Price) {
                this.Price = Price;
            }

            public List<?> getLabels() {
                return Labels;
            }

            public void setLabels(List<?> Labels) {
                this.Labels = Labels;
            }
        }

        @Override
        public String toString() {
            return "ResultBean{" +
                    "DailySpecialGoods=" + DailySpecialGoods +
                    ", DailyFirstGoods=" + DailyFirstGoods +
                    ", OneHourGoods=" + OneHourGoods +
                    ", BrandStore=" + BrandStore +
                    ", NewsRecommendGood=" + NewsRecommendGood +
                    ", count=" + count +
                    ", CartTotalNum=" + CartTotalNum +
                    ", tags=" + tags +
                    ", CateList=" + CateList +
                    ", FoodieFavoriteGoods=" + FoodieFavoriteGoods +
                    ", list=" + list +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Entity{" +
                "status=" + status +
                ", result=" + result +
                '}';
    }
}
