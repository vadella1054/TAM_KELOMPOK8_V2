package com.vadella.lampture;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Musik extends AppCompatActivity {
    private Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musik);
        button1 = (Button) findViewById(R.id.musik1btn);
        button2 = (Button) findViewById(R.id.musik2btn);
        button3 = (Button) findViewById(R.id.musik3btn);

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

    public void openActivity1() {
        Intent intent = new Intent(this, Musik1.class);
        startActivity(intent);
    }

    public void openActivity2() {
        Intent intent = new Intent(this, Musik2.class);
        startActivity(intent);
    }

    public void openActivity3() {
        Intent intent = new Intent(this, Musik3.class);
        startActivity(intent);
    }
}