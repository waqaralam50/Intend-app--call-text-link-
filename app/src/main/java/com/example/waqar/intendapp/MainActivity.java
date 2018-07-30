package com.example.waqar.intendapp;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText data1;
    EditText data2;
    String st;
    String st1;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);
        btn5=findViewById(R.id.button5);
    data1=findViewById(R.id.editText1);
    data2=findViewById(R.id.editText2);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data1.setText("");
                data2.setText("");


            }
        });
    btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                st=data1.getText().toString();
                Uri uri = Uri.parse("http://"+ st+".com");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(it);

            }
        });
    btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

Intent intent=new Intent(Intent.ACTION_VIEW);
intent.setData(Uri.parse("smsto:" +st1));

intent.putExtra("sms_body",st);
startActivity(intent);
            }
        });
    btn2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            st1=data2.getText().toString();
            Uri uri = Uri.parse("tel:"+st1);
            Intent it = new Intent(Intent.ACTION_DIAL, uri);
            startActivity(it);

        }
    });
    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent(MainActivity.this,next_Activity.class);
            st=data1.getText().toString();
            st1=data2.getText().toString();
            i.putExtra("data1", st);
            i.putExtra("data2", st1);
            startActivity(i);
        }
    });
    }


}
