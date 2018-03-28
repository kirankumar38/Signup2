package com.example.kiran.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Verification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);
    }

    public void action_btn(View v)
    {
        Intent i=new Intent(Verification.this,MainActivity.class);
        startActivity(i);
    }
    public void action_btn1(View v)
    {
        Intent i=new Intent(Verification.this,EnterNumber.class);
        startActivity(i);
    }
}
