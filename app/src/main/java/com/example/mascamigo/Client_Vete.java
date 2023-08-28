package com.example.mascamigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Client_Vete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_vete);
    }
    public void Establecimiento(View view){
        Intent registrar = new Intent(this, registro.class);
        startActivity(registrar);
    }
    public void Cliente(View view){
        Intent registrar = new Intent(this, registro.class);
        startActivity(registrar);
    }
}