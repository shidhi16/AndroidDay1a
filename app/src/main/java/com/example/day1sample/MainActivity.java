package com.example.day1sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Map;

public class MainActivity extends AppCompatActivity {
EditText edtUserEmail;

EditText edtPassword;
Button btnLogin;
TextView txtLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUserEmail = (EditText)findViewById(R.id.edtUserEmail);
        edtPassword =  findViewById((R.id.edtPassword));
        btnLogin = findViewById(R.id.btnLogin);
        txtLabel = findViewById(R.id.txtLabel);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtLabel.setText("Hello World");
                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
