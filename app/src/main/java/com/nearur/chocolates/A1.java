package com.nearur.chocolates;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class A1 extends AppCompatActivity {
    EditText M;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);
        M=(EditText)findViewById(R.id.editTextM);
    }

    public void clM(View v){
        Intent i=new Intent(this,A2.class);
        int m=Integer.parseInt(M.getText().toString().trim());
        i.putExtra("M",m);
        startActivity(i);
    }
}
