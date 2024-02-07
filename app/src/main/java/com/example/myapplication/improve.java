package com.example.myapplication;

import static com.example.myapplication.Shop.countmoney;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class improve extends AppCompatActivity {
    Button laptot , lolita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_improve);
        laptot = (Button)findViewById(R.id.laptot);
        laptot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (countmoney >= 300) {
                    MainActivity.money += 5;
                    countmoney -= 300;
                    MainActivity.textmoney.setText(countmoney + "");



                            }
                        }
                    });


                }
            }
