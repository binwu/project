package com.application.wubin.serialnumberreader.model;

import android.content.Context;

/**
 * Created by wubin on 2018/4/9.
 */

public abstract  class BaseReaderModel implements InterfaceReaderModel {
    public Context mContext;

    @Override
    public String getBTAddress() {
        return "getBTAddress";
    }

    @Override
    public String getWLANAddress() {
        return "getWLANAddress";
    }

    @Override
    public String getIMEI1Number() {
        return "getIMEI1Number";
    }

    @Override
    public String getIMEI2Number() {
        return "getIMEI2Number";
    }

    @Override
    public String getMEIDNumber() {
        return "getMEIDNumber";
    }

}
