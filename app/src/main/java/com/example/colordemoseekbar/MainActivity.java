package com.example.colordemoseekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    View vColor;
    TextView tvCode, tvValue;
    SeekBar sbRed, sbGreen, sbBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vColor=findViewById(R.id.v_color);
        tvCode=findViewById(R.id.tv_code);
        tvValue=findViewById(R.id.tv_value);
        sbRed=findViewById(R.id.sb_red);
        sbGreen=findViewById(R.id.sb_green);
        sbBlue=findViewById(R.id.sb_blue);
    }
}