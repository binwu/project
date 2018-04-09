package com.application.wubin.serialnumberreader.model;

import android.content.Context;
import android.graphics.Bitmap;

import com.google.zxing.WriterException;
import com.zxing.encoding.EncodingHandler;

/**
 * Created by wubin on 2018/4/9.
 */

public class ReaderBitmapImpl implements InterfaceReaderBitmap {
    private Context mContext;

    @Override
    public Bitmap getBitmap(String s) {
        Bitmap qrCodeBitmap = null;
        try {
            qrCodeBitmap = EncodingHandler.createQRCode(s, 300);
        } catch (WriterException e) {
            e.printStackTrace();
        }
        return qrCodeBitmap;
    }

    @Override
    public void setContext(Context mContext) {
        this.mContext = mContext;
    }
}
