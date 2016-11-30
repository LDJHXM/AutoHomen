package com.l000phone.autohomen;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.utils.Log;


/**
 * Created by DJ on 2016/11/26.
 */

public class Web1Activity extends AppCompatActivity {


    private ProgressDialog dialog;
    private Bitmap bmp;

    private UMShareListener umShareListener1 = new UMShareListener() {
        @Override
        public void onResult(SHARE_MEDIA share_media) {

            Toast.makeText(Web1Activity.this, "分享成功", Toast.LENGTH_LONG).show();

        }

        @Override
        public void onError(SHARE_MEDIA share_media, Throwable throwable) {
            Toast.makeText(Web1Activity.this, "分享失败", Toast.LENGTH_LONG).show();
        }

        @Override
        public void onCancel(SHARE_MEDIA share_media) {

            Toast.makeText(Web1Activity.this, "分享取消", Toast.LENGTH_LONG).show();


        }
    };
    private String url;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_web1);

        Intent intent = getIntent();

        url = intent.getStringExtra("url");

        Resources res = getResources();
        bmp = BitmapFactory.decodeResource(res, R.mipmap.ic_launcher);


        WebView webView = (WebView) findViewById(R.id.web1);

        WebSettings webSettings = webView.getSettings();
        webSettings.setUseWideViewPort(true);// 设置此属性，可任意比例缩放
        webSettings.setLoadWithOverviewMode(true); // 充满全屏幕
        webSettings.setBuiltInZoomControls(false);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAppCacheEnabled(true);
        // 设置缓存模式
        webSettings.setCacheMode(WebSettings.LOAD_DEFAULT);

        // 开启 DOM storage API 功能
        webSettings.setDomStorageEnabled(true);
        webView.setHorizontalScrollBarEnabled(false); // 水平不显示滚动条
        webView.setOverScrollMode(View.OVER_SCROLL_NEVER); // 禁止即在网页顶出现一个空白，又自动回去。
        webView.setWebChromeClient(new webChromClient());
        webView.setWebViewClient(new webClient());

        // Intent intent = getIntent();//得到上一个Activity传递的值
        // String str=intent.getStringExtra("url");

        dialog = ProgressDialog.show(this, null, "正在加载中，请稍后···");
        webView.loadUrl(url);

    }

    private class webChromClient extends WebChromeClient {

        @Override
        public void onProgressChanged(WebView view, int newProgress) {
            // TODO Auto-generated method stub
            super.onProgressChanged(view, newProgress);
        }
    }

    private class webClient extends WebViewClient {

        @Override
        public void onPageStarted(final WebView view, String url, Bitmap favicon) {
            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);

        }

        @Override
        public void onPageFinished(WebView view, String url) {
            // TODO Auto-generated method stub
            // super.onPageFinished(view, url);
            dialog.dismiss();

        }


        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // TODO Auto-generated method stub
            view.loadUrl(url);
            return true;
        }
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
    }

    // 网络状态判断
    public boolean isNetworkConnected(Context context) {
        if (context != null) {
            ConnectivityManager mConnectivityManager = (ConnectivityManager) context
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
            if (mNetworkInfo != null) {
                return mNetworkInfo.isAvailable();
            }
        }
        return false;

    }

    public void back(View view) {

        finish();
    }

    public void share(View view) {

       /* final ShareAction actionsina = new ShareAction(this);
        actionsina.withTitle("给你看一条美食相关");
        actionsina.withText("吃屎去吧你");
        actionsina.withTargetUrl(url);

        View view1 = LayoutInflater.from(this).inflate(R.layout.dialog_share, null);


        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setView(view1);

        TextView weixin_circle = (TextView) view1.findViewById(R.id.weixin_circle);
        TextView weixin_friend = (TextView) view1.findViewById(R.id.weixin_friend);
        TextView sina = (TextView) view1.findViewById(R.id.sina);
        TextView qq = (TextView) view1.findViewById(R.id.qq);
        TextView qzone = (TextView) view1.findViewById(R.id.qzone);

        weixin_circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionsina.setPlatform(SHARE_MEDIA.WEIXIN_CIRCLE).setCallback(umShareListener1).share();

            }
        });
        weixin_friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionsina.setPlatform(SHARE_MEDIA.WEIXIN).setCallback(umShareListener1).share();

            }
        });
        sina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionsina.setPlatform(SHARE_MEDIA.SINA).setCallback(umShareListener1).share();

            }
        });
        qq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionsina.setPlatform(SHARE_MEDIA.QQ).setCallback(umShareListener1).share();

            }
        });
        qzone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionsina.setPlatform(SHARE_MEDIA.QZONE).setCallback(umShareListener1).share();

            }
        });

        builder.show();*/

        new ShareAction(this).setDisplayList(SHARE_MEDIA.SINA, SHARE_MEDIA.QQ, SHARE_MEDIA.QZONE, SHARE_MEDIA.MORE)
                .withTitle("给你看一条美食相关")
                .withText("快去吃屎")
                .withTargetUrl(url)
                .setCallback(umShareListener1)
                .open();

    }

    private UMShareListener umShareListener = new UMShareListener() {
        @Override
        public void onResult(SHARE_MEDIA platform) {
            Log.d("plat", "platform" + platform);
            if (platform.name().equals("WEIXIN_FAVORITE")) {
                Toast.makeText(Web1Activity.this, platform + " 收藏成功啦", Toast.LENGTH_SHORT).show();
            }
        }

        @Override
        public void onError(SHARE_MEDIA platform, Throwable t) {
            Toast.makeText(Web1Activity.this, platform + " 分享失败啦", Toast.LENGTH_SHORT).show();
            if (t != null) {
                Log.d("throw", "throw:" + t.getMessage());
            }
        }

        @Override
        public void onCancel(SHARE_MEDIA platform) {
            Toast.makeText(Web1Activity.this, platform + " 分享取消了", Toast.LENGTH_SHORT).show();
        }
    };


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        /** attention to this below ,must add this**/
        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);
        Log.d("result", "onActivityResult");
    }


}

