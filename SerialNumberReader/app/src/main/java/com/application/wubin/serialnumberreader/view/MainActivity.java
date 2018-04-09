package com.application.wubin.serialnumberreader.view;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.application.wubin.serialnumberreader.R;
import com.application.wubin.serialnumberreader.presenter.ReaderPresenter;

public class MainActivity extends AppCompatActivity implements ReaderView{
    private ReaderPresenter readerPresenter;
    private ImageView iv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = findViewById(R.id.iv);
        readerPresenter = new ReaderPresenter(this,this);
        readerPresenter.startReader();
    }

    @Override
    public void showDialog(String message) {

    }

    @Override
    public void dismissDialog() {

    }

    @Override
    public void setBitmap(final Bitmap bitmap) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        iv.setImageBitmap(bitmap);
                        Toast.makeText(MainActivity.this,"sssss",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }).start();

    }
}
