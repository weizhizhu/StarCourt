package com.hoinnet.startCourt;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

public class RelativeLayoutHoinnet extends RelativeLayout {


    public RelativeLayoutHoinnet(Context context) {
        this(context, null);
    }

    public RelativeLayoutHoinnet(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RelativeLayoutHoinnet(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.root_relative, this, true);;

    }

}
