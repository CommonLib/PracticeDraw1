package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //        综合练习
        //        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);

        int totalSize = 7;
        int[] percent = new int[]{25, 15, 5, 10, 5, 15, 25};
        int[] colors = new int[]{
                Color.RED, Color.BLUE, Color.BLUE, Color.GREEN, Color.GRAY, Color.CYAN, Color.BLACK
        };

        float lastAngle = 0;
        for (int i = 0; i < totalSize; i++) {
            float sweepAngle = (percent[i] * 1.0f) / 100 * 360;
            Point point = new Point();




            paint.setColor(colors[i]);
            if(i == totalSize - 1){
                canvas.drawArc(new RectF(115, 85, 615, 585), lastAngle, sweepAngle, true, paint);
            }else{
                canvas.drawArc(new RectF(100, 100, 600, 600), lastAngle, sweepAngle, true, paint);
            }
            lastAngle += sweepAngle;
        }

    }
}
