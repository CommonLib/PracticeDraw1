package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs,
                                   int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //        综合练习
        //        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(3);
        Point zeroPoint = new Point(100, 500);

        //draw x
        canvas.drawLine(zeroPoint.x, zeroPoint.y, zeroPoint.x, 100, paint);
        //draw y
        canvas.drawLine(zeroPoint.x, zeroPoint.y, 900, zeroPoint.y, paint);

        int distance = 30;
        int totalSize = 6;
        int unitWidth = 90;


        for (int i = 0; i < totalSize; i++) {
            int currentX = zeroPoint.x + unitWidth * i + distance * (i + 1);
            paint.setColor(Color.GREEN);
            paint.setTextSize(36);
            canvas.drawRect(currentX, 100 + 30 * i, currentX + unitWidth, zeroPoint.y, paint);
            paint.setColor(Color.WHITE);
            String des = "test " + i;
            canvas.drawText(des, currentX, zeroPoint.y + 36, paint);
        }

    }
}
