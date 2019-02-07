package com.example.user.radio;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {


    RadioGroup RG1;
    RadioButton RB1,RB2,RB3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RG1 = (RadioGroup)findViewById(R.id.RG1);
        RB1 = (RadioButton)findViewById(R.id.RB1);
        RB2 = (RadioButton)findViewById(R.id.RB2);
        RB3 = (RadioButton)findViewById(R.id.RB3);

    }

    public void changebackgroudcolor(View view) {
        if(RB1.isChecked()){
            RG1.setBackgroundColor(Color.RED);
        }
        if(RB2.isChecked()){
            RG1.setBackgroundColor(Color.BLUE);
        }
        if(RB3.isChecked()){
            RG1.setBackgroundColor(Color.GREEN);
        }
    }

    public void resetbackgroundcolor(View view) {
        RG1.setBackgroundColor(Color.WHITE);
    }
}
