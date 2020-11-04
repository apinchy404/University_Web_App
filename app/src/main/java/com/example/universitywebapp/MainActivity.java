package com.example.universitywebapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnPublic,btnPrivate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnPublic = findViewById(R.id.btn_public);
        Button btnPrivate = findViewById(R.id.btn_private);

        btnPublic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Public.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "Public University List", Toast.LENGTH_SHORT).show();

            }
        });

        btnPrivate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Private.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "Private University List", Toast.LENGTH_SHORT).show();

            }
        });

    }
}