package com.example.harshasrikara.iattend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    EditText user;
    EditText pass;
    Button sign;

    int size = 10;
    String username[] = new String[size];
    String password[] = new String[size];

    boolean valid = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.userName);
        pass = findViewById(R.id.password);
        sign = findViewById(R.id.signin);

        username[0] = "abc123456";
        password[0] = "Password1";



    }

    public void checkSignIn(View view)
    {
        for(int i = 0;i<username.length;i++)
        {
            if(user.getText().toString().equals(username[i]))
            {
                if(pass.getText().toString().equals(password[i]))
                {
                    Toast.makeText(MainActivity.this, "it worked", Toast.LENGTH_SHORT).show();
                    valid = true;
//                    Intent intent = new Intent(getApplicationContext(),locationActivity.class);
//                    startActivity(intent);
                }
            }
        }
        if(!valid)
        {
            Toast.makeText(MainActivity.this, "it didnt work, please try again", Toast.LENGTH_SHORT).show();
        }
    }
}
