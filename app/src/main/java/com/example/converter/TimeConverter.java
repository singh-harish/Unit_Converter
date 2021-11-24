package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Formatter;

public class TimeConverter extends AppCompatActivity {

    private Button b1, b2;
    private TextView result;
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_converter);

        b1= findViewById(R.id.b1);
        b2= findViewById(R.id.b2);
        result= findViewById(R.id.result);
        et1= findViewById(R.id.et1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double hrs = Double.parseDouble(et1.getText().toString());
                    double result0 = hrs*60.0;
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
                    double min = Double.parseDouble(et1.getText().toString());
                    double result0 = min/60.0;
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