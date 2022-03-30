package com.jechegoyen.navigationmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class LogeoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logeo);
    }

    public void logearse(View v){
        EditText number= findViewById(R.id.editTextNumber);
        EditText clave= findViewById(R.id.editTextTextPassword);

        String x= number.getText().toString();
        String y= clave.getText().toString();

        Log.i("====>", x);
        Log.i("====>", y);

        startActivity(new Intent(this, MainActivity.class));
    }
}