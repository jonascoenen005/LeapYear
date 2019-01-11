package com.example.jonas.leapyear;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LeapYearActivity extends AppCompatActivity {
    private TextView tv_result;
    private EditText et_year_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leap_year);

        tv_result = (TextView) findViewById(R.id.tv_result);
        et_year_input = (EditText) findViewById(R.id.et_year_input);
    }

    public void btnCalculateClicked(View view) {
        String inputYear = et_year_input.getText().toString();

        if (LeapYearCalculator.isLeapYear(Integer.parseInt(inputYear))) {
            tv_result.setText(getString(R.string.is_leap_year, inputYear));
            tv_result.setTextColor(Color.GREEN);
        } else {
            tv_result.setText(getString(R.string.is_not_leap_year, inputYear));
            tv_result.setTextColor(Color.RED);
        }
    }
}
