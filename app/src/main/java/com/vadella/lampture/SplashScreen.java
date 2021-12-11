package com.vadella.lampture;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    private static int progress = 0;
    private int status = 0;
    ProgressBar progressBar;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        progressBar = (ProgressBar)findViewById(R.id.progressBar1);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (status < 100){
                    status = loading();
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setProgress(status);
                        }
                    });
                }
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Intent pindah = new Intent(SplashScreen.this,MainActivity.class);
                        startActivity(pindah);
                        finish();
                    }
                });
            }
            public int loading(){
                try {
                    Thread.sleep(50);
                }
                catch (InterruptedException ie){
                    ie.printStackTrace();
                }
                return ++progress;
            }
        }).start();

    }}
