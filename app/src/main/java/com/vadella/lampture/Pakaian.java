package com.vadella.lampture;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Pakaian extends AppCompatActivity {
        private Button button1,button2,button3;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pakaian);
        button1 = (Button) findViewById(R.id.pakaian1btn);
        button2 = (Button) findViewById(R.id.pakaian2btn);

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
}

        public void openActivity1(){
                Intent intent = new Intent(this, Pakaian1.class);
                startActivity(intent);
        }

        public void openActivity2(){
                Intent intent = new Intent(this, Pakaian2.class);
                startActivity(intent);
        }

}