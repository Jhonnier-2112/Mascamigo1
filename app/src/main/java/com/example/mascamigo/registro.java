package com.example.mascamigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public void Anterior(View view){
        Intent anterior =new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
    public void Siguiente(View view){
        Intent siguiente =new Intent(this, RegistroM.class);
        startActivity(siguiente);
    }
}