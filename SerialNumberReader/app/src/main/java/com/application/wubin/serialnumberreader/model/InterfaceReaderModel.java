package com.application.wubin.serialnumberreader.model;

import android.content.Context;

/**
 * Created by wubin on 2018/4/9.
 */

public interface InterfaceReaderModel {
    String getBTAddress();
    String getWLANAddress();
    String getIMEI1Number();
    String getIMEI2Number();
    String getMEIDNumber();
    void setContext(Context mContext);
}
