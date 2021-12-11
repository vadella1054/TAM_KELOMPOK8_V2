package com.vadella.lampture;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Musik3 extends AppCompatActivity {
    VideoView vv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musik3);
        vv3=findViewById(R.id.vv3);
        String uriPath = "android.resource://"+getPackageName()+"/"+R.raw.bumilampung;
        Uri uri = Uri.parse(uriPath);
        vv3.setVideoURI(uri);
        MediaController med=new MediaController(this);
        vv3.setMediaController(med);
        med.setAnchorView(vv3);
        vv3.start();
    }
}