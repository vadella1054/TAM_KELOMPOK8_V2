package com.vadella.lampture;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Tari extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5,button6,button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tari);
        button1 = (Button) findViewById(R.id.tari1btn);
        button2 = (Button) findViewById(R.id.tari2btn);
        button3 = (Button) findViewById(R.id.tari3btn);
        button4 = (Button) findViewById(R.id.tari4btn);
        button5 = (Button) findViewById(R.id.tari5btn);
        button6 = (Button) findViewById(R.id.tari6btn);
        button7 = (Button) findViewById(R.id.tari7btn);

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
        Intent intent = new Intent(this, Tari1.class);
        startActivity(intent);
    }

    public void openActivity2(){
        Intent intent = new Intent(this, Tari2.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent = new Intent(this, Tari3.class);
        startActivity(intent);
    }

    public void openActivity4(){
        Intent intent = new Intent(this, Tari4.class);
        startActivity(intent);
    }

    public void openActivity5(){
        Intent intent = new Intent(this, Tari5.class);
        startActivity(intent);
    }

    public void openActivity6(){
        Intent intent = new Intent(this, Tari6.class);
        startActivity(intent);
    }

    public void openActivity7(){
        Intent intent = new Intent(this, Tari7.class);
        startActivity(intent);
    }
}