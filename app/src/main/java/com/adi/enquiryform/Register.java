package com.adi.enquiryform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    EditText inname,mob,email,state,password,cpassword;
    Button register;
    TextView login;
    String ins,mobile,emailid,states,passw,cpassw;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        inname = findViewById(R.id.name);
        mob = findViewById(R.id.mob);
        email = findViewById(R.id.emailid);
        state = findViewById(R.id.state);
        password = findViewById(R.id.pass);
        cpassword = findViewById(R.id.cpass);
        register = findViewById(R.id.button4);
        login = findViewById(R.id.textView5);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ins = inname.getText().toString();
                mobile = mob.getText().toString();
                emailid = email.getText().toString();
                states = state.getText().toString();
                passw = password.getText().toString();
                cpassw = cpassword.getText().toString();
                Intent home = new Intent(Register.this,HomeActivity.class);
                startActivity(home);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(Register.this,Login.class);
                startActivity(loginIntent);
            }
        });

    }
}
