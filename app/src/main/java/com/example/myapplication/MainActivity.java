package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.text.BreakIterator;


public class MainActivity extends AppCompatActivity {


    public static BreakIterator textmoney;
    public static int money;
    private Button bottomsheet;
    private BottomSheetDialog bottomSheetDialog;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomsheet=findViewById(R.id.bottomsheete);
        bottomsheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialog=new BottomSheetDialog(MainActivity.this,R.style.Theme_MyApplication);
                View sheetview= LayoutInflater.from(getApplicationContext()).inflate(R.layout.activity_shop,null);





                bottomSheetDialog.setContentView(sheetview);
                bottomSheetDialog.show();

            }
        });



    }
}

