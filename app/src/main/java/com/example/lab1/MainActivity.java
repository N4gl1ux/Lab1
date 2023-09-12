package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;
    private TextView textColorChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = (TextView)findViewById(R.id.tvMain);
        this.textColorChange = (TextView)findViewById(R.id.textColorChange);
    }

    public void onBtnChangeTextClick(View view){

        this.tvMain.setText("Labas, linkiu grazios dienos!");
    }

    public void onBtnChangeTextColor(View view){

        this.textColorChange.setTextColor(Color.RED);
    }
}