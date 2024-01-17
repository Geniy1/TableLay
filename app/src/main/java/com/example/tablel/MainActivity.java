package com.example.tablel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText lg=findViewById(R.id.lg); //find end bind variable login EditText
                EditText pw=findViewById(R.id.pswd); //find end bind variable password EditText

                String login=lg.getText().toString(); //Creating variable login
                String password=pw.getText().toString();

                Intent i=new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("Login",login);
                i.putExtra("Password", password);
                startActivity(i);
            }
        });
    }
}