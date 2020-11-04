package com.example.universitywebapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Private extends AppCompatActivity {


    Button btnBrac,btnAuw,btnPu,btnNsu,btnIiuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private);

        Button btnBrac = findViewById(R.id.btn_brac);
        Button btnAuw= findViewById(R.id.btn_auw);
        Button btnPu = findViewById(R.id.btn_pu);
        Button btnNsu = findViewById(R.id.btn_nsu);
        Button btnIiuc = findViewById(R.id.btn_iiuc);

        btnBrac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Private.this,Web.class);
                intent.putExtra("url","www.bracu.ac.bd");
                startActivity(intent);

            }
        });

        btnAuw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Private.this,Web.class);
                intent.putExtra("url","www.asian-university.org");
                startActivity(intent);

            }
        });

        btnPu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Private.this,Web.class);
                intent.putExtra("url","www.puc.ac.bd");
                startActivity(intent);

            }
        });

        btnNsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Private.this,Web.class);
                intent.putExtra("url","www.northsouth.edu");
                startActivity(intent);

            }
        });

        btnIiuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Private.this,Web.class);
                intent.putExtra("url","www.iiuc.ac.bd");
                startActivity(intent);

            }
        });

    }
}