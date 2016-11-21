package com.l000phone.daojia.adpter;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.l000phone.autohomen.R;
import com.l000phone.daojia.myentitis.Entity;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/17/017.
 */

public class MyListViewAdapter extends BaseAdapter {
    private final int TOTAL_TYPE = 7;
    private final int TYPE_SPECIALPRICE = 0;
    private final int TYPE_FAVORITE = 1;
    private final int TYPE_STORY = 2;
    private final int TYPE_NEWPRODUCT = 3;
    private final int TYPE_TAGS = 4;
    private final int TYPE_GUAGNGUANG = 5;
    private final int TYPE_PERITEM = 6;

    private List<Object> data;
    private Context context;
    private List<ImageView> imageData;
    private List<String> tabNames;

    public MyListViewAdapter(List<Object> data, Context context) {
        this.data = data;
        this.context = context;
    }

    /**
     * 多布局的种类
     *
     * @return
     */
    @Override
    public int getViewTypeCount() {
        return TOTAL_TYPE;
    }

    /**
     * 得到各个子条目的类型，根据集合名称确定其所属的类型
     *
     * @param position
     * @return
     */
    @Override
    public int getItemViewType(int position) {
        //通过判断确定每个数据源的类型
        if (data.get(position) instanceof List) {
            //吃货最爱
            if (((List) data.get(position)).get(0) instanceof Entity.ResultBean
                    .FoodieFavoriteGoodsBean) {
                return TYPE_FAVORITE;
                //猪肉等推荐
            } else if (((List) data.get(position)).get(0) instanceof Entity.ResultBean
                    .TagsBean) {
                return TYPE_TAGS;

            } else {
                return TYPE_SPECIALPRICE;
            }

            //对象
        } else {
            //品牌故事
            if (data.get(position) instanceof Entity.ResultBean.BrandStoreBean) {
                return TYPE_STORY;
                //新品
            } else if (data.get(position) instanceof Entity.ResultBean
                    .NewsRecommendGoodBean) {
                return TYPE_NEWPRODUCT;
                //逛逛以及其他的
            } else if (data.get(position) instanceof Entity.ResultBean.ListBean) {
                return TYPE_PERITEM;

            }

        }
        return 0;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     * listview中有一个条目是viewpager，用布局填充器得到viewpager的实例
     *
     * @param position
     * @param view
     * @param viewGroup
     * @return
     */
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder1 vh1 = null;
        ViewHolder2 vh2 = null;
        ViewHolder3 vh3 = null;
        ViewHolder4 vh4 = null;
        ViewHolder5 vh5 = null;
        ViewHolder7 vh7 = null;
        int type = getItemViewType(position);
        //view位null的时候
        if (view == null) {
            //特价
            if (type == TYPE_SPECIALPRICE) {
                vh1 = new ViewHolder1();
                view = View.inflate(context, R.layout.daojia_item1, null);
                vh1.item1_down_stat = (TextView) view.findViewById(R.id.item1_down_stat);
                vh1.item1_down_store = (TextView) view.findViewById(R.id
                        .item1_down_store);
                vh1.item1_left_price = (TextView) view.findViewById(R.id
                        .item1_left_price);
                vh1.item1_left_title = (TextView) view.findViewById(R.id
                        .item1_left_title);
                vh1.item1_up_store = (TextView) view.findViewById(R.id.item1_up_store);
                vh1.item1_up_tuijian = (TextView) view.findViewById(R.id
                        .item1_up_tuijian);
                vh1.item1_image_right_up = (ImageView) view.findViewById(R.id
                        .item1_image_right_up);
                vh1.item1_image_star = (ImageView) view.findViewById(R.id
                        .item1_image_star);
                vh1.item1_left_image = (ImageView) view.findViewById(R.id
                        .item1_left_image);
                view.setTag(vh1);
                //吃货最爱
            } else if (type == TYPE_FAVORITE) {

                vh2 = new ViewHolder2();
                view = View.inflate(context, R.layout.daojia_item2, null);
                vh2.item2_image_arrows = (ImageView) view.findViewById(R.id.item2_image_arrows);
                vh2.item2_contain_down = (LinearLayout) view.findViewById(R.id
                        .item2_contain_down);
                vh2.item2_contain_up = (LinearLayout) view.findViewById(R.id
                        .item2_contain_up);
                vh2.item2_image1 = (ImageView) view.findViewById(R.id.item2_image1);
                vh2.item2_text_info = (TextView) view.findViewById(R.id
                        .item2_text_info);
                vh2.item2_text_price = (TextView) view.findViewById(R.id
                        .item2_text_price);


                view.setTag(vh2);
                //品牌故事
            } else if (type == TYPE_STORY) {
                vh4 = new ViewHolder4();
                view = View.inflate(context, R.layout.daojia_item4_story, null);
                vh4.item4_image1 = (ImageView) view.findViewById(R.id.item4_image1);
                vh4.item4_image1_info = (TextView) view.findViewById(R.id
                        .item4_image1_info);
                vh4.item4_image_inke = (ImageView) view.findViewById(R.id
                        .item4_image_inke);
                view.setTag(vh4);
                //新品
            } else if (type == TYPE_NEWPRODUCT) {
                vh3 = new ViewHolder3();
                view = View.inflate(context, R.layout.daojia_item3_newproduct, null);
                vh3.item3_food_image = (ImageView) view.findViewById(R.id
                        .item3_food_image);
                vh3.item3_image_photo = (ImageView) view.findViewById(R.id
                        .item3_image_photo);
                vh3.item3_content_id = (TextView) view.findViewById(R.id
                        .item3_content_id);
                vh3.item3_food_advantage = (TextView) view.findViewById(R.id
                        .item3_food_advantage);
                vh3.item3_image_icon = (ImageView) view.findViewById(R.id.item3_image_icon);
                vh3.item3_person_id = (TextView) view.findViewById(R.id.item3_person_id);
                vh3.item3_price_id = (TextView) view.findViewById(R.id.item3_price_id);
                vh3.item3_store_name = (TextView) view.findViewById(R.id
                        .item3_store_name);
                vh3.item3_tags = (TextView) view.findViewById(R.id.item3_tags);
                view.setTag(vh3);
                //viewpager
            } else if (type == TYPE_TAGS) {
                vh5 = new ViewHolder5();
                view = View.inflate(context, R.layout.daojia_item5_viewpager, null);
                vh5.item5_tablayout = (TabLayout) view.findViewById(R.id.item5_tablayout);
                vh5.item5_viewpager = (ViewPager) view.findViewById(R.id.item5_viewpager);
                view.setTag(vh5);
                //拆开的list集合
            } else if (type == TYPE_PERITEM) {
                vh7 = new ViewHolder7();
                view = View.inflate(context, R.layout.daojia_item7_per, null);
                vh7.item7_food_image = (ImageView) view.findViewById(R.id
                        .item7_food_image);
                vh7.item7_per_image = (ImageView) view.findViewById(R.id.item7_per_image);
                vh7.item7_buy_id = (TextView) view.findViewById(R.id.item7_buy_id);
                vh7.item7_price = (TextView) view.findViewById(R.id.item7_price);
                vh7.item7_Stock = (TextView) view.findViewById(R.id.item7_Stock);
                vh7.item7_StoreTitle = (TextView) view.findViewById(R.id
                        .item7_StoreTitle);
                vh7.item7_subTitle = (TextView) view.findViewById(R.id.item7_subTitle);
                vh7.item7_UserName = (TextView) view.findViewById(R.id.item7_UserName);
                vh7.item7_Title = (TextView) view.findViewById(R.id.item7_Title);
                vh7.item7_dearprice = (TextView) view.findViewById(R.id.item7_dearprice);
                view.setTag(vh7);

            }


        } else {
            if (type == TYPE_SPECIALPRICE) {
                vh1 = (ViewHolder1) view.getTag();

            } else if (type == TYPE_FAVORITE) {
                vh2 = (ViewHolder2) view.getTag();

            } else if (type == TYPE_STORY) {
                vh4 = (ViewHolder4) view.getTag();

            } else if (type == TYPE_NEWPRODUCT) {
                vh3 = (ViewHolder3) view.getTag();

            } else if (type == TYPE_TAGS) {
                vh5 = (ViewHolder5) view.getTag();
            } else if (type == TYPE_PERITEM) {
                vh7 = (ViewHolder7) view.getTag();

            }

        }
        Object perdata = data.get(position);
        //三个条目的数据
        if (type == TYPE_SPECIALPRICE) {
            //将数据中的三个对象的集合中的数据添加到数据适配器中展示出来
            addDatoToView1(perdata, vh1);
            //吃货最爱
        } else if (type == TYPE_FAVORITE) {
            addDatoToView2(perdata, vh2);
            //品牌故事
        } else if (type == TYPE_STORY) {
            addDatoToView4(perdata, vh4);
            //新品
        } else if (type == TYPE_NEWPRODUCT) {
            addDatoToView3(perdata, vh3);
            //viewpager
        } else if (type == TYPE_TAGS) {
            addDatoToView5(perdata, vh5);

        } else if (type == TYPE_PERITEM) {
            addDatoToView7(perdata, vh7);

        }
        return view;
    }

    /**
     * 各个条目
     *
     * @param perdata
     * @param vh7
     */
    private void addDatoToView7(Object perdata, ViewHolder7 vh7) {
        Entity.ResultBean.ListBean listbeam = (Entity.ResultBean.ListBean) perdata;
        vh7.item7_StoreTitle.setText(listbeam.getStoreTitle());
        vh7.item7_UserName.setText(listbeam.getUserName());
        vh7.item7_Stock.setText("剩余"+listbeam.getStock()+"份");
        vh7.item7_subTitle.setText(listbeam.getSubTitle());
        vh7.item7_Title.setText(listbeam.getTitle());
        vh7.item7_price.setText(listbeam.getPrice());
        vh7.item7_dearprice.setText(listbeam.getDealPrice());


        // TODO: 2016/11/19/019 图片和监视器
        Picasso.with(context).load(listbeam.getCoverUrl()).into(vh7.item7_food_image);
        Picasso.with(context).load(listbeam.getStoreLogoUrl()).into(vh7.item7_per_image);
        vh7.item7_buy_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "点击跳转了哦", Toast.LENGTH_LONG).show();

            }
        });

    }

    /**
     * viewpager
     *
     * @param perdata
     * @param vh5
     */
    private void addDatoToView5(Object perdata, ViewHolder5 vh5) {
        List<Entity.ResultBean.TagsBean> list = (List<Entity.ResultBean.TagsBean>)
                perdata;
        //数据源
        imageData = new LinkedList<>();
        tabNames = new LinkedList<>();
        for (int j = 0; j < list.size(); j++) {
            // TODO: 2016/11/19/019 图片
            String url = list.get(j).getGoods().getCoverUrl();
            View inflate = View.inflate(context, R.layout.daojia_myimage, null);
            ImageView image= (ImageView) inflate.findViewById(R.id.item5_image_item);
            Picasso.with(context).load(url).error(R.drawable.brand_story_default).into(image);
            imageData.add(image);
            RequestCreator load = Picasso.with(context).load(url);
            tabNames.add(list.get(j).getTitle());
        }
        MyViewPager adapter = new MyViewPager();
        Log.i("data3", tabNames.toString());
        vh5.item5_tablayout.setupWithViewPager(vh5.item5_viewpager);

        vh5.item5_viewpager.setAdapter(adapter);



    }

    /**
     * 自定义viewpager的适配器
     */
    public class MyViewPager extends PagerAdapter {

        @Override
        public int getCount() {
            return imageData.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view.equals(object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ImageView imageView = imageData.get(position);
            container.addView(imageView);
            return imageView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(imageData.get(position));
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabNames.get(position);
        }
    }


    /**
     * 新品
     *
     * @param perdata
     * @param vh3
     */
    private void addDatoToView3(Object perdata, ViewHolder3 vh3) {
        Entity.ResultBean.NewsRecommendGoodBean news = (Entity.ResultBean
                .NewsRecommendGoodBean) perdata;
        vh3.item3_tags.setText(news.getTags().get(0));
        vh3.item3_store_name.setText(news.getContent());
        vh3.item3_price_id.setText(news.getGoods().getDealPrice());
        vh3.item3_content_id.setText(news.getInfo());
        vh3.item3_food_advantage.setText(news.getGoods().getTitle());
        vh3.item3_person_id.setText(news.getUserName());
        // TODO: 2016/11/19/019   图片和监视器
        Picasso.with(context).load(news.getImgUrl()).into(vh3.item3_image_photo);
        Picasso.with(context).load(news.getGoods().getCoverUrl()).into(vh3.item3_food_image);
        vh3.item3_image_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "点击跳转了哦", Toast.LENGTH_LONG).show();

            }
        });

    }

    /**
     * 品牌故事
     *
     * @param perdata
     * @param vh4
     */
    private void addDatoToView4(Object perdata, ViewHolder4 vh4) {
        Entity.ResultBean.BrandStoreBean stoty = (Entity.ResultBean.BrandStoreBean)
                perdata;
        //TODO 图片
        vh4.item4_image1_info.setText(stoty.getTitle());
        Picasso.with(context).load(stoty.getImgUrl()).into(vh4.item4_image1);
        //TODO: 2016/11/19/019  监视器
         vh4.item4_image_inke.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast.makeText(context, "进入目的界面", Toast.LENGTH_LONG).show();
             }
         });

    }

    /**
     * 吃货最爱
     * @param perdata
     * @param vh2
     */
    private void addDatoToView2(Object perdata, ViewHolder2 vh2) {
        List<Object> list2 = (List<Object>) perdata;
        Log.i("data", " list2.size()" + list2.size());
        LinearLayout item2_contain_up = vh2.item2_contain_up;
        LinearLayout item2_contain_down = vh2.item2_contain_down;

        for (int j = 0; j < list2.size(); j++) {
            Entity.ResultBean.FoodieFavoriteGoodsBean favarite = (Entity.ResultBean
                    .FoodieFavoriteGoodsBean) list2.get(j);
            if (j == 0) {
                String coverUrl = favarite.getCoverUrl();//图片
                String price = favarite.getPrice();//价格
                String title = favarite.getTitle();//日式汤料
                vh2.item2_text_price.setText(price);
                vh2.item2_text_info.setText(title);
                //TODO 加载图片
                vh2.item2_image_arrows.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "点击跳转", Toast.LENGTH_LONG).show();
                    }
                });
                Picasso.with(context).load(coverUrl).error(R.drawable.brand_story_default).into(vh2.item2_image1);

            } else if (0 < j && j < 5) {

                View contain1 = View.inflate(context, R.layout.daojia_itme2_image, null);
                LinearLayout contain = (LinearLayout) contain1.findViewById(R.id.contain_id);

                TextView title = (TextView) contain.findViewById(R.id.product_name);//阿胶糕
                TextView price = (TextView) contain.findViewById(R.id.product_price);
                ImageView image = (ImageView) contain.findViewById(R.id.image);
                title.setText(favarite.getTitle());
                price.setText(favarite.getPrice());
                Picasso.with(context).load(favarite.getCoverUrl()).error(R.drawable.brand_story_default).into(image);

                vh2.item2_contain_up.addView(contain1);

            } else {
                View contain1 = View.inflate(context, R.layout.daojia_itme2_image, null);
                LinearLayout contain = (LinearLayout) contain1.findViewById(R.id.contain_id);
                TextView title = (TextView) contain.findViewById(R.id.product_name);//阿胶糕
                TextView price = (TextView) contain.findViewById(R.id.product_price);
                ImageView image = (ImageView) contain.findViewById(R.id.image);
                title.setText(favarite.getTitle());
                price.setText(favarite.getPrice());
                //TODO 图片
                Picasso.with(context).load(favarite.getCoverUrl()).error(R.drawable.brand_story_default).into(image);
                item2_contain_down.addView(contain1);

            }


        }

    }

    /**
     * 将数据中的三个对象的集合中的数据添加到数据适配器中展示出来
     *
     * @param vh1
     * @param perdata
     */
    private void addDatoToView1(Object perdata, ViewHolder1 vh1) {
        List<Object> list1 = (List<Object>) perdata;
        for (int j = 0; j < list1.size(); j++) {
            Object per = list1.get(j);
            //美食研究所
            if (per instanceof Entity.ResultBean.DailyFirstGoodsBean) {
                String title = ((Entity.ResultBean.DailyFirstGoodsBean) per)
                        .getTitle();
                //图片的url
                String coverUrl = ((Entity.ResultBean.DailyFirstGoodsBean) per)
                        .getCoverUrl();
                //美食研究所
                String label = ((Entity.ResultBean.DailyFirstGoodsBean) per)
                        .getLabel();
                //新品推荐
                String title1 = ((Entity.ResultBean.DailyFirstGoodsBean) per)
                        .getTitle();
                Log.i("data2", "coverUrl" + coverUrl);
                vh1.item1_up_store.setText(label);
                vh1.item1_up_tuijian.setText(title);
                //TODO 图片
                Picasso.with(context).load(coverUrl).into(vh1.item1_image_right_up);


            } else if (per instanceof Entity.ResultBean.DailySpecialGoodsBean) {
                //今日特价
                String title = ((Entity.ResultBean.DailySpecialGoodsBean) per).getTitle();
                //图片url
                String coverUrl = ((Entity.ResultBean.DailySpecialGoodsBean) per)
                        .getCoverUrl();
                //价格
                String price = ((Entity.ResultBean.DailySpecialGoodsBean) per).getPrice();
                vh1.item1_left_price.setText(price);
                vh1.item1_left_title.setText(title);
                Picasso.with(context).load(coverUrl).into(vh1.item1_left_image);

            } else if (per instanceof Entity.ResultBean.OneHourGoodsBean) {
                //小店儿
                String title = ((Entity.ResultBean.OneHourGoodsBean) per).getTitle();
                String coverUrl = ((Entity.ResultBean.OneHourGoodsBean) per)
                        .getCoverUrl();
                //明星店铺
                String label = ((Entity.ResultBean.OneHourGoodsBean) per).getLabel();
                vh1.item1_down_stat.setText(label);
                vh1.item1_down_store.setText(title);
                //TODO 图片
                Picasso.with(context).load(coverUrl).into(vh1.item1_image_star);

            }
        }

    }

    //今日特价
    private final class ViewHolder1 {
        private ImageView item1_left_image;
        private ImageView item1_image_right_up;
        private ImageView item1_image_star;
        private TextView item1_left_title;
        private TextView item1_left_price;
        private TextView item1_up_store;
        private TextView item1_up_tuijian;
        private TextView item1_down_stat;
        private TextView item1_down_store;

    }

    //吃货最爱
    private final class ViewHolder2 {
        private ImageView item2_image1;
        private ImageView item2_image_arrows;

        private TextView item2_text_info;
        private TextView item2_text_price;
        private LinearLayout item2_contain_up;
        private LinearLayout item2_contain_down;

    }

    //新品
    private final class ViewHolder3 {
        private ImageView item3_image_photo;
        private ImageView item3_food_image;
        private TextView item3_person_id;
        private TextView item3_content_id;
        private TextView item3_store_name;
        private TextView item3_tags;
        private TextView item3_food_advantage;
        private TextView item3_price_id;
        private ImageView item3_image_icon;

    }

    //品牌故事
    private final class ViewHolder4 {
        private ImageView item4_image1;
        private TextView item4_image1_info;
        private ImageView item4_image_inke;

    }

    //viewpager
    private final class ViewHolder5 {
        private ViewPager item5_viewpager;
        private TabLayout item5_tablayout;

    }

    //多个对象
    private final class ViewHolder7 {
        private ImageView item7_per_image;
        private ImageView item7_food_image;
        private TextView item7_StoreTitle;
        private TextView item7_UserName;
        private TextView item7_Stock;
        private TextView item7_price;
        private TextView item7_dearprice;
        private TextView item7_buy_id;
        private TextView item7_subTitle;
        private TextView item7_Title;

    }

}
