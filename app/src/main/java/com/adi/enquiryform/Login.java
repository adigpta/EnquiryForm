package com.adi.enquiryform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    EditText no,password;
    Button login;
    TextView register;
    String mobile,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        no = findViewById(R.id.phoneNo);
        password = findViewById(R.id.psw);
        login = findViewById(R.id.button3);
        register = findViewById(R.id.textView3);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mobile = no.getText().toString();
                pass = password.getText().toString();
                Intent home = new Intent(Login.this,HomeActivity.class);
                startActivity(home);
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerintent = new Intent(Login.this,Register.class);
                startActivity(registerintent);
            }
        });
    }
}

