package com.example.lastapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class Login extends AppCompatActivity {
    EditText username, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText)findViewById(R.id.txtUsername);
        password = (EditText)findViewById(R.id.txtPassword);
        login = (Button)findViewById(R.id.btnlogin);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && Objects.equals(password.getText().toString(), "12")) {
                    Intent pindah = new Intent(Login.this,mainmenu.class);
                    pindah.putExtra("user", username.getText().toString());
                    startActivity(pindah);
                }else{
                    Toast.makeText(Login.this, "Username Atau Password Salah", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}