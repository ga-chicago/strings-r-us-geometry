package org.codeforcoffee.yeoldegeometryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mSumBtn;
    Intent mSumIntent;
    // group it together

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSumBtn = (Button) findViewById(R.id.btn_calc_sum);
        mSumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSumIntent = new Intent(MainActivity.this, SumActivity.class);
                startActivity(mSumIntent);
            }
        });

    }
}
