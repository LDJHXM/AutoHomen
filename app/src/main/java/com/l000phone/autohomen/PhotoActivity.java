package com.l000phone.autohomen;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.l000phone.adapter.ViewPagerAdapter5;
import com.l000phone.entity.Cate_Video;
import com.l000phone.face.HaoDouCate_Video;
import com.l000phone.fragment.PhotoView_Pic;
import com.l000phone.util.GetMap;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2016/11/17.
 */

public class PhotoActivity extends AppCompatActivity {

    private TextView hint;
    private int index;
    private TextView text_step;
    private TextView save;
    private ViewPager vp;
    private List<PhotoView_Pic> ds;
    private ImageView img_back;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = this.getWindow();
//取消设置透明状态栏,使 ContentView 内容不再覆盖状态栏
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

//需要设置这个 flag 才能调用 setStatusBarColor 来设置状态栏颜色
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//设置状态栏颜色


            window.setStatusBarColor(ContextCompat.getColor(this,R.color.black));


            ViewGroup mContentView = (ViewGroup) this.findViewById(Window.ID_ANDROID_CONTENT);
            View mChildView = mContentView.getChildAt(0);
            if (mChildView != null) {
                //注意不是设置 ContentView 的 FitsSystemWindows, 而是设置 ContentView 的第一个子 View . 预留出系统 View 的空间.
                ViewCompat.setFitsSystemWindows(mChildView, true);
            }
        }

        setContentView(R.layout.abc_viewpager);

        //获取data

       /* images = intent.getStringArrayListExtra("images");

        texts = intent.getStringArrayListExtra("texts");

        position = intent.getIntExtra("position",0);*/


        vp = (ViewPager) findViewById(R.id.viewPager);

        hint = (TextView) findViewById(R.id.hint);

        save = (TextView) findViewById(R.id.save);

        text_step = (TextView) findViewById(R.id.text_step);
        img_back = (ImageView) findViewById(R.id.img_back);

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        //vp.setCurrentItem(position);


        ds = new LinkedList<>();

        DowmloadData();

    }


    public  String  getImageType (String info){

        if(info.substring(info.lastIndexOf(".")).equals("jpg")){


            return "jpg";

        }else  if(info.substring(info.lastIndexOf(".")).equals("png")) {
            return "png";


        }else  if(info.substring(info.lastIndexOf(".")).equals("gif")) {
            return "gif";

        }else{

            return null;
        }




    }

    private void DowmloadData() {

        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("http://hop.haodou.com/").
                addConverterFactory(GsonConverterFactory.create()).build();

        HaoDouCate_Video hdc = retrofit.create(HaoDouCate_Video.class);

        Call<Cate_Video> call = hdc.getData(GetMap.getMap_Video());

        call.enqueue(new Callback<Cate_Video>() {
            @Override
            public void onResponse(Call<Cate_Video> call, Response<Cate_Video> response) {

                Cate_Video body = response.body();

                final Cate_Video.ResultBean.InfoBean info = body.getResult().getInfo();


                text_step.setText(info.getSteps().get(0).getIntro());


                hint.setText(0 + 1 + "/" + info.getSteps().size());
                for(int i=0;i<info.getSteps().size();i++){

                    PhotoView_Pic photoView_pic = new PhotoView_Pic();

                    Bundle arg = new Bundle();

                    arg.putString("url",info.getSteps().get(i).getStepPhoto());

                    photoView_pic.setArguments(arg);

                    ds.add(photoView_pic);

                }

                ViewPagerAdapter5 adapter = new ViewPagerAdapter5(getSupportFragmentManager(), ds);

                vp.setAdapter(adapter);

                vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {


                    }

                    @Override
                    public void onPageSelected(int position) {

                        index = position;

                        text_step.setText(info.getSteps().get(position).getIntro());


                        hint.setText(position + 1 + "/" + info.getSteps().size());

                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {

                    }
                });






                save.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Picasso.with(PhotoActivity.this).load(info.getSteps().get(index).getStepPhoto()).into(new Target() {
                            @Override
                            public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                                // 创建目录
                                File appDir = new File(Environment.getExternalStorageDirectory(), "JellyImage");
                                if (!appDir.exists()) {
                                    appDir.mkdir();
                                }

                                String imageType = getImageType(info.getSteps().get(index).getStepPhoto()); //获取图片类型

                                String fileName = System.currentTimeMillis() + "." + imageType;

                                File file = new File(appDir, fileName);
                                //保存图片
                                try {
                                    FileOutputStream fos = new FileOutputStream(file);
                                    if(TextUtils.equals(imageType,"jpg")) imageType = "jpeg";
                                    imageType = imageType.toUpperCase();
                                    bitmap.compress(Bitmap.CompressFormat.valueOf(imageType), 100, fos);
                                    fos.flush();
                                    fos.close();
                                    Toast.makeText(PhotoActivity.this,"保存成功",Toast.LENGTH_SHORT).show(); //Toast
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }

                                // 其次把文件插入到系统图库
                                try {
                                    MediaStore.Images.Media.insertImage(PhotoActivity.this.getContentResolver(), file.getAbsolutePath(), fileName, null);
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                // 最后通知图库更新
                                PhotoActivity.this.sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.parse("file://" + file.getPath())));
                            }

                            @Override
                            public void onBitmapFailed(Drawable errorDrawable) {

                            }

                            @Override
                            public void onPrepareLoad(Drawable placeHolderDrawable) {

                            }
                        });
                    }
                });
            }

            @Override
            public void onFailure(Call<Cate_Video> call, Throwable t) {

            }
        });


    }

}
