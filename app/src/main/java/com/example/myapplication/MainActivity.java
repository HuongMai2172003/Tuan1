package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //kHAI BAO CÁC CONtrol
    EditText txt1,txt2;
    Button btn1;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //anh xa
        txt1=findViewById(R.id.demotext1);
        txt2=findViewById(R.id.demotext2);
        btn1=findViewById(R.id.button);
        tv1=findViewById(R.id.textView2);
        //xu ly su kien
        btn1.setOnClickListener(v->{
            // goi ham tinh tong
            tinhTong();
        });
    }

    private void tinhTong() {
        // lay du lieu nhap vao EditText1
        String str1=txt1.getText().toString();
        float so1= Float.parseFloat(str1);
        // lay du lieu nhap vao EditText2
        String str2=txt2.getText().toString();
        float so2= Float.parseFloat(str2);
        // tinh tong
        float tong=so1+so2 ;
        //in ra
        tv1.setText(String.valueOf(tong));
    }
}