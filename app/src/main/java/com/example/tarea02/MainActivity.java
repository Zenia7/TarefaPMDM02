package com.example.tarea02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Método botón cliente
    public void loginCliente (View view){
        Intent intent1 = new Intent(this, LoginCliente.class);
        startActivity(intent1);
    }

    // Método botón administrador
    public void loginAdmin (View view){
        Intent intent2 = new Intent(this, LoginAdmin.class);
        startActivity(intent2);
    }
}
