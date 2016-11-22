package com.l000phone.autohomen;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.l000phone.db.UserDbHelper;

/**
 * Created by Administrator on 2016/11/17.
 */

public class MyLoginActivity extends AppCompatActivity {
    public static boolean flags;
    private TextView myLoginReturn;
    private Button myLoginRegist;
    private EditText myLoginName;
    private EditText myLoginPwd;
    private Button myLogin;
    private UserDbHelper dbHelper;

    public boolean isFlags() {
        return flags;
    }

    public void setFlags(boolean flags) {
        MyLoginActivity.flags = flags;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mylogin);

        //取消操作
        myLoginReturn = (TextView) this.findViewById(R.id.btn_mylogin_return);
        myLoginReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //登录控件实例的初始化
        initWidge();

        //登录
        loginAction();

        //跳转注册页面
        myLoginRegist = (Button) this.findViewById(R.id.btn_mylogin_regist);
        myLoginRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MyLoginActivity.this, MyRegistActivity.class);
                startActivity(intent);
            }
        });


    }

    /**
     * 登录
     */
    private void loginAction() {
        dbHelper = new UserDbHelper(this);
        myLogin = (Button) findViewById(R.id.btn_mylogin_login);
        myLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = myLoginName.getText().toString();
                String pwd = myLoginPwd.getText().toString();
                SQLiteDatabase sdb = dbHelper.getReadableDatabase();
                String sql = "select * from user where username=? and password=?";
                Cursor cursor = sdb.rawQuery(sql, new String[]{name, pwd});
                if (cursor.moveToFirst() == true) {
                    cursor.close();
                    setFlags(true);
                    Toast.makeText(MyLoginActivity.this, "登陆成功", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent();

                    intent.setClass(MyLoginActivity.this, MainActivity.class);


                    startActivity(intent);
                } else {
                    setFlags(false);
                    Toast.makeText(MyLoginActivity.this, "登陆失败", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    /**
     * 登录控件实例的初始化
     */
    private void initWidge() {
        myLoginName = (EditText) findViewById(R.id.et_mylogin_name);
        myLoginPwd = (EditText) findViewById(R.id.et_mylogin_pwd);
        myLogin = (Button) findViewById(R.id.btn_mylogin_login);

    }


}
