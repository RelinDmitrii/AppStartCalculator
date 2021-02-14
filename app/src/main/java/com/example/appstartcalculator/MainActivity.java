package com.example.appstartcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButton();
        setClickButton();
    }

    @Override
    public void onClick(View v) {
        Intent calculateIntent = new Intent();
        calculateIntent.setAction("com.example.calculator.MainActivity");
        ActivityInfo activityInfo = calculateIntent.resolveActivityInfo(getPackageManager(), calculateIntent.getFlags());
        if (activityInfo != null) {
            startActivity(calculateIntent);
        }
    }

    public void initButton(){
        button = findViewById(R.id.start_Button);
    }
    public void setClickButton(){
        button.setOnClickListener(this);
    }
}