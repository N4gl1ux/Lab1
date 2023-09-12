package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //global variable
    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = (TextView)findViewById(R.id.tvMain);
    }

    public void onBtnChangeTextClick(View view){

        this.tvMain.setText("Labas, linkiu grazios dienos!");
    }
}