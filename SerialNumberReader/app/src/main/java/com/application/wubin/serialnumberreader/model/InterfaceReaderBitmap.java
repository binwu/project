package com.application.wubin.serialnumberreader.model;

import android.content.Context;
import android.graphics.Bitmap;

/**
 * Created by wubin on 2018/4/9.
 */

public interface InterfaceReaderBitmap {
    Bitmap getBitmap(String s);
    void setContext(Context mContext);
}
