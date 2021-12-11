package com.vadella.lampture;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Makanan extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5,button6,button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.makanan);
        button1 = (Button) findViewById(R.id.makanan1btn);
        button2 = (Button) findViewById(R.id.makanan2btn);
        button3 = (Button) findViewById(R.id.makanan3btn);
        button4 = (Button) findViewById(R.id.makanan4btn);
        button5 = (Button) findViewById(R.id.makanan5btn);
        button6 = (Button) findViewById(R.id.makanan6btn);
        button7 = (Button) findViewById(R.id.makanan7btn);

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
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity5();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openActivity6();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity7();
            }
        });

    }

    public void openActivity1(){
        Intent intent = new Intent(this, Makanan1.class);
        startActivity(intent);
    }

    public void openActivity2(){
        Intent intent = new Intent(this, Makanan2.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent = new Intent(this, Makanan3.class);
        startActivity(intent);
    }

    public void openActivity4(){
        Intent intent = new Intent(this, Makanan4.class);
        startActivity(intent);
    }

    public void openActivity5(){
        Intent intent = new Intent(this, Makanan5.class);
        startActivity(intent);
    }

    public void openActivity6(){
        Intent intent = new Intent(this, Makanan6.class);
        startActivity(intent);
    }

    public void openActivity7(){
        Intent intent = new Intent(this, Makanan7.class);
        startActivity(intent);
    }
}