package com.example.android.customviewbarchart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by charles on 3/2/18.
 */

public class CharlesView extends View {

    private Paint mPaintCharles = new Paint();
    private Paint mPaintAxis = new Paint();
    private Paint mPaintText = new Paint();
    String topValue = "";


    public CharlesView(Context context) {
        super(context);
        init();
    }

    private void init() {
        mPaintCharles.setColor(Color.LTGRAY);
        mPaintAxis.setColor(Color.BLACK);
        mPaintText.setTextSize(20 * getResources().getDisplayMetrics().density);
        mPaintText.setColor(Color.BLACK);
    }


    //override the onDraw method
    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawLine(50,getHeight()-50,getWidth()-50,getHeight()-50,mPaintAxis);
        canvas.drawLine(50,50,50,getHeight()-50,mPaintAxis);
        canvas.drawText("0",30,getHeight()-50,mPaintText);
        canvas.drawText(topValue, 20, 50,mPaintText);
        //canvas.drawRect(100,100,getWidth(),getHeight(),mPaintCharles);
    }



    public CharlesView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CharlesView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CharlesView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
