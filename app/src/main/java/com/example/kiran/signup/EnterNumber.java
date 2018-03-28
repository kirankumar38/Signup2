package com.example.kiran.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EnterNumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_number);
    }

    public void action_btn(View v)
    {
        Intent i=new Intent(EnterNumber.this,Verification.class);
        startActivity(i);
    }
}
