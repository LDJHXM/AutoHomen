/*
package com.l000phone.biz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import com.l000phone.autohomen.R;
import com.l000phone.umeng.Constants;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.bean.StatusCode;
import com.umeng.socialize.controller.UMServiceFactory;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.controller.listener.SocializeListeners.SocializeClientListener;
import com.umeng.socialize.controller.listener.SocializeListeners.UMAuthListener;
import com.umeng.socialize.controller.listener.SocializeListeners.UMDataListener;
import com.umeng.socialize.exception.SocializeException;
import com.umeng.socialize.sso.UMSsoHandler;

import java.util.Map;

//
//import com.umeng.socialize.sso.SinaSsoHandler;
//import com.umeng.socialize.sso.UMQQSsoHandler;

*/
/**
 * @description 实现友盟第三方登录注销、获取用户信息、多平台分享
 *//*

public class UmengLoginActivity extends AppCompatActivity implements OnClickListener {
	// 整个平台的Controller,负责管理整个SDK的配置、操作等处理
	private UMSocialService mController = UMServiceFactory
			.getUMSocialService(Constants.DESCRIPTOR);

	private TextView qqLogin;
	private TextView sinaLogin;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mylogin);

		
		qqLogin.setOnClickListener(this);
		sinaLogin.setOnClickListener(this);

	}


	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.tv_mylogin_sina: // 新浪微博登录
			login(SHARE_MEDIA.SINA);
			break;
		case R.id.tv_mylogin_qq: // qq登录
			login(SHARE_MEDIA.QQ);
			break;
//		case R.id.btn_sina_logout: // 注销新浪账号
//			logout(SHARE_MEDIA.SINA);
//			break;
//		case R.id.btn_qq_logout: // 注销qq账号
//			logout(SHARE_MEDIA.QQ);
//			break;

		default:
			break;
		}
	}

	*/
/**
	 * 授权。如果授权成功，则获取用户信息
	 * 
	 * @param platform
	 *//*

	private void login(final SHARE_MEDIA platform) {

		mController.doOauthVerify(UmengLoginActivity.this, platform,
				new UMAuthListener() {

					@Override
					public void onStart(SHARE_MEDIA platform) {
						Toast.makeText(UmengLoginActivity.this, "授权开始",
								Toast.LENGTH_SHORT).show();
					}

					@Override
					public void onError(SocializeException e,
							SHARE_MEDIA platform) {
						Toast.makeText(UmengLoginActivity.this, "授权失败",
								Toast.LENGTH_SHORT).show();
					}

					@Override
					public void onComplete(Bundle value, SHARE_MEDIA platform) {
						// 获取uid
						String uid = value.getString("uid");
						if (!TextUtils.isEmpty(uid)) {
							// uid不为空，获取用户信息
							getUserInfo(platform);
						} else {
							Toast.makeText(UmengLoginActivity.this, "授权失败...",
									Toast.LENGTH_LONG).show();
						}
					}

					@Override
					public void onCancel(SHARE_MEDIA platform) {
						Toast.makeText(UmengLoginActivity.this, "授权取消",
								Toast.LENGTH_SHORT).show();
					}
				});
	}

	*/
/**
	 * 获取用户信息
	 * 
	 * @param platform
	 *//*

	private void getUserInfo(SHARE_MEDIA platform) {
		mController.getPlatformInfo(UmengLoginActivity.this, platform,
				new UMDataListener() {

					@Override
					public void onStart() {

					}

					@Override
					public void onComplete(int status, Map<String, Object> info) {//{name=;xxxx}
						// String showText = "";
						// if (status == StatusCode.ST_CODE_SUCCESSED) {
						// showText = "用户名：" +
						// info.get("screen_name").toString();
						// Log.d("#########", "##########" + info.toString());
						// } else {
						// showText = "获取用户信息失败";
						// }

						if (info != null) {
							Toast.makeText(UmengLoginActivity.this, info.toString(),
									Toast.LENGTH_SHORT).show();
						}
					}
				});
	}
	
	*/
/**
	 * 注销本次登陆
	 * @param platform
	 *//*

	private void logout(final SHARE_MEDIA platform) {
		mController.deleteOauth(UmengLoginActivity.this, platform, new SocializeClientListener() {
			
			@Override
			public void onStart() {
				
			}
			
			@Override
			public void onComplete(int status, SocializeEntity entity) {
				String showText = "解除" + platform.toString() + "平台授权成功";
				if (status != StatusCode.ST_CODE_SUCCESSED) {
					showText = "解除" + platform.toString() + "平台授权失败[" + status + "]";
				}
				Toast.makeText(UmengLoginActivity.this, showText, Toast.LENGTH_SHORT).show();
			}
		});
	}
	

	// 如果有使用任一平台的SSO授权, 则必须在对应的activity中实现onActivityResult方法, 并添加如下代码
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		// 根据requestCode获取对应的SsoHandler
		UMSsoHandler ssoHandler = mController.getConfig().getSsoHandler(
				resultCode);
		if (ssoHandler != null) {
			ssoHandler.authorizeCallBack(requestCode, resultCode, data);
		}
	}
}
*/
