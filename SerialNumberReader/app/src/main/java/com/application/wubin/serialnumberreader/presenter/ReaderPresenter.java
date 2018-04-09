package com.application.wubin.serialnumberreader.presenter;

import android.content.Context;
import android.graphics.Bitmap;

import com.application.wubin.serialnumberreader.model.H8ReaderModel;
import com.application.wubin.serialnumberreader.model.InterfaceReaderBitmap;
import com.application.wubin.serialnumberreader.model.ReaderBitmapImpl;
import com.application.wubin.serialnumberreader.model.InterfaceReaderModel;
import com.application.wubin.serialnumberreader.view.ReaderView;

/**
 * Created by wubin on 2018/4/9.
 */

public class ReaderPresenter {
    private Context mContext;
    private ReaderView readerView;
    private InterfaceReaderModel interfaceReaderModel;
    private InterfaceReaderBitmap interfaceReaderBitmap;

    public ReaderPresenter(Context mContext, ReaderView callback){
        this.mContext = mContext;
        readerView = callback;
        interfaceReaderModel = new H8ReaderModel();
        interfaceReaderModel.setContext(this.mContext);
        interfaceReaderBitmap = new ReaderBitmapImpl();
    }

    public void startReader(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String btAddress = interfaceReaderModel.getBTAddress();
                Bitmap bitmap = interfaceReaderBitmap.getBitmap(btAddress);
                readerView.setBitmap(bitmap);
            }
        }).start();

    }
}
