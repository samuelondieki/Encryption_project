package com.example.samuelkerosi.encryption_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnAES,btnRSA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAES = (Button) findViewById(R.id.btnAES);
        btnRSA =(Button) findViewById(R.id.btnRSA);

        //when clicking the AES encryption
        btnAES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AES = new Intent(MainActivity.this, AES.class);
                startActivity(AES);
            }
        });

        //when clicking the RSA encryption
        btnRSA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RSA = new Intent(MainActivity.this, RSA.class);
                startActivity(RSA);
            }
        });

    }
}
