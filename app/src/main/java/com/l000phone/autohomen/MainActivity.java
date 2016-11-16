package com.l000phone.autohomen;

import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.l000phone.fragment.FindCar;
import com.l000phone.fragment.Forum;
import com.l000phone.fragment.HomePage;
import com.l000phone.fragment.Mine;
import com.l000phone.fragment.Sale;

import java.util.Collections;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private RadioGroup mRadioGroup;
    private FragmentManager manager;
    private LinkedList<Fragment> list;
    private Fragment currentFragment;// 目前的Fragment
    private static boolean isExit = false;//true表示退出，false表示不退出
    private Handler handler = new Handler() {

        @Override
        public void handleMessage(Message msg) {

            super.handleMessage(msg);

            isExit = false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //界面控件实例的获取
        initViews();

        //获得FragmentManager的实例
        manager = getSupportFragmentManager();

        //准备Fragment的实例
        prepareFragment();

        //关于RadioGroup的操作（点击下角图标，跳转到相应的Fragment）
        aboutRadioGroup();

        //默认先展示首页
        currentFragment = list.get(0);
        startFragment(0);
    }


    /**
     * 关于RadioGroup的操作（点击下角图标，跳转到相应的Fragment）
     */
    private void aboutRadioGroup() {
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                //遍历RadioGroup，找到被点击的RadioButton，跳转到相应的Fragment
                for (int j = 0; j < radioGroup.getChildCount(); j++) {
                    if (radioGroup.getChildAt(j).getId() == i) {

                        startFragment(j);
                    }

                }
            }
        });
    }

    /**
     * Fragment替换的逻辑
     * @param j
     */
    private void startFragment(int j) {

        // 思路：
        FragmentTransaction beginTransaction = manager.beginTransaction();

        // 1、隐藏当前的
        beginTransaction.hide(currentFragment);

        // 2、判断选中的RadioButton对应的Fragment是否曾经附着在容器控件上
        Fragment nowFrament = list.get(j);

        // ①附着上了，就显示
        // ②没有附着，先附着，再显示
        if (!nowFrament.isAdded()) {

            beginTransaction.add(R.id.replace_id, nowFrament);

        }

        beginTransaction.show(nowFrament);

        // 3、将目前选中Fragment赋值给当前currentFragment
        currentFragment = nowFrament;

        // 4、commit
        beginTransaction.commit();
    }


    /**
     * 按俩次返回退出
     * @param keyCode
     * @param event
     * @return
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exit();
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void exit() {
        if (!isExit) {
            isExit = true;
            Toast.makeText(getApplicationContext(), "再按一次退出程序",
                    Toast.LENGTH_SHORT).show();
            // 利用handler延迟发送更改状态信息
            handler.sendEmptyMessageDelayed(0, 2000);
        } else {
            finish();
            System.exit(0);
        }
    }



    /**
     * 界面控件实例的获取
     */
    private void initViews() {

        mRadioGroup = (RadioGroup) findViewById(R.id.radiogroup_id);

    }



    /**
     * 准备Fragment的实例
     */
    private void prepareFragment() {

        FindCar findCar = new FindCar();
        Forum forum = new Forum();
        HomePage homePage = new HomePage();
        Mine mine = new Mine();
        Sale sale = new Sale();
        list = new LinkedList<>();
        Collections.addAll(list, homePage, forum, findCar, sale,mine);

    }


}
