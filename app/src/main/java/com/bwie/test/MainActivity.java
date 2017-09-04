package com.bwie.test;

import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * 自定义view完成上图效果，并上传至自己的github账户中；上传成功后拉下来并添加新功能
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.changeColor:
                MyView my = new MyView(MainActivity.this);
                Canvas canvas = new Canvas();
                canvas.drawARGB(255, 255, 0x000000, 0x000000);
                my.draw(canvas);
                //变色
                break;
            case R.id.addSpeed:
                //加速
                break;
            case R.id.cutSpeed:
                //减速
                break;
        }
    }
}
