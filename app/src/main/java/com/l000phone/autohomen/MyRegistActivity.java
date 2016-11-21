package com.l000phone.autohomen;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.l000phone.db.UserDbHelper;
import com.l000phone.entity.User;

/**
 * Created by Administrator on 2016/11/17.
 */

public class MyRegistActivity extends AppCompatActivity {
    private TextView registReturn;

    private EditText myRegistName;
    private EditText myMyRegistPwd;
    private Button myRegist;


    private UserDbHelper dbHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myregist);

        //取消操作
        registReturn = (TextView) this.findViewById(R.id.btn_myregist_return);
        registReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //注册控件实例的初始化
        initWidge();
        //注册
        registAction();

    }

    /**
     * 注册
     */
    private void registAction() {
        dbHelper = new UserDbHelper(this);
        myRegist = (Button) findViewById(R.id.btn_myregist_login);
        myRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user = new User();
                String name = myRegistName.getText().toString();
                user.setName(name);
                String pwd = myMyRegistPwd.getText().toString();
                user.setPwd(pwd);

                SQLiteDatabase sdb = dbHelper.getReadableDatabase();
                String sql = "insert into user(username,password) values(?,?)";
                Object obj[] = {user.getName(), user.getPwd()};
                sdb.execSQL(sql, obj);

                Intent intent = new Intent();
                intent.setClass(MyRegistActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }

    /**
     * 注册控件实例的初始化
     */
    private void initWidge() {
        myRegistName = (EditText) findViewById(R.id.et_myregist_name);
        myMyRegistPwd = (EditText) findViewById(R.id.et_myregist_pwd);
        myRegist = (Button) findViewById(R.id.btn_myregist_login);
    }

}
