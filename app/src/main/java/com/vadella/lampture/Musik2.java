package com.vadella.lampture;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Musik2 extends AppCompatActivity {
    VideoView vv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musik2);
        vv2=findViewById(R.id.vv2);
        String uriPath = "android.resource://"+getPackageName()+"/"+R.raw.sangbumiruwajurai;
        Uri uri = Uri.parse(uriPath);
        vv2.setVideoURI(uri);
        MediaController med=new MediaController(this);
        vv2.setMediaController(med);
        med.setAnchorView(vv2);
        vv2.start();
    }
}