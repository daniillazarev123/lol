package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Shop extends AppCompatActivity {

    static  public float countmoney = 0;
    static public  float money = 0.01f;
    Button next_day , improve  ;
    static TextView textmoney;
    SharedPreferences preferences ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        next_day = (Button) findViewById(R.id.next_day);
        improve = (Button) findViewById(R.id.improve);
        textmoney = (TextView) findViewById(R.id.money);
        Next_day();
    }
    void Next_day(){
        next_day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countmoney += money;
                textmoney.setText(countmoney + "\uD83C\uDF49");

            }
        });
        improve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Shop.this , com.example.myapplication.improve.class);
                startActivity(intent);
            }
        });




    }

}