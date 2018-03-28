package com.example.kiran.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Select_state extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_state);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner);
    }
    public void action_btn(View v)
    {
        Intent i=new Intent(Select_state.this,EnterNumber.class);
        startActivity(i);
    }
}
