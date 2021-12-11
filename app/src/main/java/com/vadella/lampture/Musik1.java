package com.vadella.lampture;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Musik1 extends AppCompatActivity {
    VideoView vv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musik1);
        vv=findViewById(R.id.vv);
        String uriPath = "android.resource://"+getPackageName()+"/"+R.raw.lipanglipangdang;
        Uri uri = Uri.parse(uriPath);
        vv.setVideoURI(uri);
        MediaController med=new MediaController(this);
        vv.setMediaController(med);
        med.setAnchorView(vv);
        vv.start();
    }
}