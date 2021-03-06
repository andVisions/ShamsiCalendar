package com.mohammadreza.salari.shcalandar.Views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.mohammadreza.salari.shcalandar.Application.MyApplication;



public class MyTextViewBold extends TextView {
    public MyTextViewBold(Context context) {
        super(context);
        init();
    }

    public MyTextViewBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextViewBold(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init() {

        if (!isInEditMode()) {

            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), MyApplication.FONT_BOLD);
            setTypeface(tf);
        }
    }


}
