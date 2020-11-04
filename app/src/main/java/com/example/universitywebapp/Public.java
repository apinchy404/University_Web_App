package com.example.universitywebapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Public extends AppCompatActivity {

    Button btnBuet,btnCuet,btnCu,btnDu,btnSust;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public);

        Button btnBuet = findViewById(R.id.btn_buet);
        Button btnCuet = findViewById(R.id.btn_cuet);
        Button btnCu = findViewById(R.id.btn_cu);
        Button btnDu = findViewById(R.id.btn_du);
        Button btnSust = findViewById(R.id.btn_sust);


        btnBuet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Public.this,Web.class);
                intent.putExtra("url","www.buet.ac.bd");
                startActivity(intent);

            }
        });
        btnCuet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Public.this,Web.class);
                intent.putExtra("url","www.cuet.ac.bd");
                startActivity(intent);

            }
        });
        btnCu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Public.this,Web.class);
                intent.putExtra("url","www.cu.ac.bd");
                startActivity(intent);

            }
        });
        btnDu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Public.this,Web.class);
                intent.putExtra("url","www.du.ac.bd");
                startActivity(intent);

            }
        });
        btnSust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Public.this,Web.class);
                intent.putExtra("url","www.sust.edu");
                startActivity(intent);

            }
        });


    }
}