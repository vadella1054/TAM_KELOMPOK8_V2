package com.vadella.lampture;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Rumah extends AppCompatActivity {
    private Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rumah);
        button1 = (Button) findViewById(R.id.rumah1btn);
        button2 = (Button) findViewById(R.id.rumah2btn);
        button3 = (Button) findViewById(R.id.rumah3btn);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            openActivity1();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            openActivity2();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
    }

    public void openActivity1(){
        Intent intent = new Intent(this, Rumah1.class);
        startActivity(intent);
    }

    public void openActivity2(){
        Intent intent = new Intent(this, Rumah2.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent = new Intent(this, Rumah3.class);
        startActivity(intent);
    }
}