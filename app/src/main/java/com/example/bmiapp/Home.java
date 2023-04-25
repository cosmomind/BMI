package com.example.bmiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        EditText edwt,edhtf,edhti;
        Button subm;
        TextView res;

        edwt = findViewById(R.id.button1);
        edhtf = findViewById(R.id.button2);
        edhti = findViewById(R.id.button3);

        res = findViewById(R.id.txtvw);
        subm = findViewById(R.id.sub);

        subm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             float wt = Integer.parseInt(edwt.getText().toString());
                int htf = Integer.parseInt(edhtf.getText().toString());
                float hti = Integer.parseInt(edhti.getText().toString());

                float totin = htf * 12 + hti;
                double totcm = totin * 2.53;
                double totm = totcm/100;

                double bmi  = wt/ (totm * totm);
                String b = String.format("%.2f",bmi);
                if(bmi > 25){
                    res.setText(b +" - Overweight!");
                }
                else if(bmi < 18){
                    res.setText(b +" - Underweight!");
                }
                else{
                    res.setText(b +" - Healthy!");
                }


            }
        });
    }
}