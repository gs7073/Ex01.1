package com.example.ex01;

import android.annotation.SuppressLint;
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


            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                count++;

                if (count%7==0) {
                    btn.setText("Boom!\n");
                }
                else if(count>=10){
                    int temp=count;
                    boolean found=false;
                    while (temp>0) {
                        if (temp % 10 == 7) {
                            found=true;
                            break;
                        }
                        temp /= 10;

                    }
                    if(found){
                        btn.setText(" Boom!\n");
                    }
                    else{
                        btn.setText("This is a click number:" + count + "\n");
                    }


                }
                else{
                    btn.setText("This is a click number:" + count + "\n");
                }

            }


        });
        };
    }
