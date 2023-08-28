package com.example.mascamigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistroM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_m);
    }
    public void Anterior(View view){
        Intent anterior =new Intent(this, registro.class);
        startActivity(anterior);
    }
}