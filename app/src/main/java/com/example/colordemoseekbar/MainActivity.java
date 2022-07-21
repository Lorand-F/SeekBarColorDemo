package com.example.colordemoseekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    View vColor;
    TextView tvCode, tvValue;
    SeekBar sbRed, sbGreen, sbBlue;
    int red = 0, green = 0, blue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vColor = findViewById(R.id.v_color);
        tvCode = findViewById(R.id.tv_code);
        tvValue = findViewById(R.id.tv_value);
        sbRed = findViewById(R.id.sb_red);
        sbGreen = findViewById(R.id.sb_green);
        sbBlue = findViewById(R.id.sb_blue);

        sbRed.setOnSeekBarChangeListener(this);
        sbGreen.setOnSeekBarChangeListener(this);
        sbBlue.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        switch (seekBar.getId()) {
            case R.id.sb_red:
                red = i;
                break;
            case R.id.sb_green:
                green = i;
                break;
            case R.id.sb_blue:
                blue = i;
                break;
        }
        vColor.setBackgroundColor(Color.rgb(red,green,blue));
        String code=HexCode(red,green,blue);
        tvCode.setText(code.toUpperCase());
        tvValue.setText(String.format("RGB (%d, %d, %d)",red,green,blue));
    }

    private String HexCode(int red, int green, int blue) {
        String code;
        code="#";
        code+=Integer.toHexString(red);
        code+=Integer.toHexString(green);
        code+=Integer.toHexString(blue);
        return code;
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}