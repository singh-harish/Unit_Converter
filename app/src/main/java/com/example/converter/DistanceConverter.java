package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.Formatter;

public class DistanceConverter extends AppCompatActivity {

    private Button b1, b2;
    private TextView result;
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance_converter);

        b1= findViewById(R.id.b1);
        b2= findViewById(R.id.b2);
        result= findViewById(R.id.result);
        et1= findViewById(R.id.et1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double km = Double.parseDouble(et1.getText().toString());
                    double result0 = km/1.6;
                    Formatter formatter = new Formatter();
                    formatter.format("%.3f", result0);
                    result.setText(formatter.toString());
                }
                catch (Exception e){
                    result.setText("N/A");
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double mile = Double.parseDouble(et1.getText().toString());
                    double result0 = mile*1.6;
                    Formatter formatter = new Formatter();
                    formatter.format("%.3f", result0);
                    result.setText(formatter.toString());
                }
                catch (Exception e){
                    result.setText("N/A");
                }
            }
        });
    }

}