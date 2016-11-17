package com.l000phone.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by DJ on 2016/11/17.
 */

public class HaoDouListView extends ListView {
    public HaoDouListView(Context context) {
        super(context);
    }

    public HaoDouListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HaoDouListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);

        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
