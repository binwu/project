package com.application.wubin.serialnumberreader.view;

import android.graphics.Bitmap;


/**
 * Created by wubin on 2018/4/9.
 */

public interface ReaderView {
    void showDialog(String message);
    void dismissDialog();
    void setBitmap(Bitmap bitmap);
}
