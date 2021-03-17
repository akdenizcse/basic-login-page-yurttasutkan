package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String myMail = "yurttasutkan@gmail.com";
    String myPassword = "1234";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        EditText editText1 = findViewById(R.id.editTextTextPersonName);
        EditText editText2 = findViewById(R.id.editTextTextPassword);
        String email = editText1.getText().toString();
        String password = editText2.getText().toString();



        if(email.equals(myMail)==false || password.equals(myPassword)==false) {
            Toast.makeText(MainActivity.this, "Username or password is wrong.", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this, "Login successful.", Toast.LENGTH_SHORT).show();
            intent.putExtra("email2",email);
            startActivity(intent);
        }


    }
}