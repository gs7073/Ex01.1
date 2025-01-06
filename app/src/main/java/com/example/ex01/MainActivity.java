package com.example.ex01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button btn;
        btn = findViewById(R.id.btnClickMe);
        btn.setOnClickListener(new View.OnClickListener() {
            int count = 0;


            @Override
            public void onClick(View v) {
                count++;
                btn.setText("This is a click number:" + count+"\n");

            }


        });
        };
    }
