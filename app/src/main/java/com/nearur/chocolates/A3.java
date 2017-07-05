package com.nearur.chocolates;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class A3 extends AppCompatActivity {
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3);
        t=(TextView)findViewById(R.id.textViewResult);
        result();
    }

    public void result(){
        Intent r=getIntent();
        int n=r.getIntExtra("N",0);
        int m=r.getIntExtra("M",0);
        int i=0,j=0;
        do{
            i=i+m;
            j++;
        }while(i%n!=0);
        t.setText("Total Chocolates Eaten:"+String.valueOf(j));
    }
}
