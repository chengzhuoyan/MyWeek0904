package com.bwie.test;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Desc
 * Author 程茁燕
 * Time 2017/9/4.
 */
public class MyView extends View {
    private Paint paint;
    private Context context;

    public MyView(Context context) {
        super(context, null);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        this.paint = new Paint();
        this.paint.setAntiAlias(true); //消除锯齿
        this.paint.setStyle(Paint.Style.STROKE); //绘制空心圆
    }

    @Override
    protected void onDraw(Canvas canvas) {

        int center = getWidth() / 2;
        int innerCircle = dip2px(context, 90); //设圆半置内径
        int ringWidth = dip2px(context, 4); //设置圆环宽度

        //绘制圆环
        this.paint.setARGB(255, 0x000000, 0x000000, 0x000000);
        this.paint.setStrokeWidth(ringWidth);
        canvas.drawCircle(center, center, innerCircle + 1 + ringWidth / 2, this.paint);

        super.onDraw(canvas);
    }

    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
