package com.example.miniapplicationauthentification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final String EXTRA_LOGIN = "login";
    final static String TAG = "MainActivity";
    private EditText login;
    private EditText password;
    private Button connection;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (EditText) findViewById(R.id.log);
        password = (EditText) findViewById(R.id.pass);
        connection = (Button) findViewById(R.id.connect);
        connection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((login.getText().toString()).equals("Etudiant") && (password.getText().toString()).equals("ISET2021")) {
                    Toast.makeText(getApplicationContext(), "Bon couple Login Mot de passe", Toast.LENGTH_SHORT).show();
                    goToNextActivity();
                } else {
                    Toast.makeText(getApplicationContext(), "Mauvais couple login mot de passe", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void goToNextActivity() {

        Intent i = new Intent(MainActivity.this, NextActivity.class);

        startActivity(i);

    }

    ;


}