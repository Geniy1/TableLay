package com.example.tablel;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
Button btn;
TextView tv;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView tv=findViewById(R.id.about);
        Intent gt=getIntent();
        String login=gt.getStringExtra("Login");
        String password=gt.getStringExtra("Password");
        String dsptxt="Ваш логин: "+login+"\nВаш парол: "+password;
        tv.setText(dsptxt);



    }
}