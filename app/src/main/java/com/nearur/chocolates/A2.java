package com.nearur.chocolates;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class A2 extends AppCompatActivity {
    EditText N;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);
        N=(EditText)findViewById(R.id.editTextN);
    }

    public void clN(View v){
        int n=Integer.parseInt(N.getText().toString().trim());
        Intent rcv=getIntent();
        int m=rcv.getIntExtra("M",0);
        Intent i=new Intent(this,A3.class);
        i.putExtra("M",m);
        i.putExtra("N",n);
        startActivity(i);
    }
}
