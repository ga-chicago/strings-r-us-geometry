package org.codeforcoffee.yeoldegeometryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SumActivity extends AppCompatActivity {

    Button mBtnCalc;
    EditText firstNum;
    EditText secondNum;
    TextView txtSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        mBtnCalc = (Button) findViewById(R.id.btn_calc);
        firstNum = (EditText) findViewById(R.id.text_first_num);
        secondNum = (EditText) findViewById(R.id.text_second_num);
        txtSum = (TextView) findViewById(R.id.text_sum);

        mBtnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double numOne = Double.parseDouble(firstNum.getText().toString());
                Double numTwo = Double.parseDouble(secondNum.getText().toString());
                Sum total = new Sum(numOne, numTwo);
                txtSum.setText(String.valueOf(total.getTotal()));
            }
        });
    }
}
