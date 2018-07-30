package com.example.waqar.intendapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class next_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_);
    Bundle bundle=getIntent().getExtras();
    String data_1=bundle.getString("data1");
    String data_2=bundle.getString("data2");

        TextView textView1=(TextView) findViewById(R.id.textView1);
        TextView textView2=(TextView) findViewById(R.id.textView2);
    textView1.setText(data_1);
    textView2.setText(data_2);


    }
}
