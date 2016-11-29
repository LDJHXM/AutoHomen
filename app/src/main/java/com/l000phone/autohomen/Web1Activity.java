package com.l000phone.autohomen;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
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


/**
 * Created by DJ on 2016/11/26.
 */

public class Web1Activity extends AppCompatActivity {


    private ProgressDialog dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_web1);

        Intent intent = getIntent();

        String url = intent.getStringExtra("url");


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

    public void back (View view){

        finish();
    }

}

