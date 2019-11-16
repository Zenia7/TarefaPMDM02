package com.example.tarea02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeCliente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_cliente);
    }

    // Método para salir del home de cliente
    public void salirCliente(View view){
        Intent intentHC1 = new Intent(this, MainActivity.class);
        startActivity(intentHC1);
    }

    // Método para hacer un pedido
    public void hacerPedido(View view){
        Intent intentHC2 = new Intent(this, TiendaVirtual1.class);
        startActivity(intentHC2);
    }

    // Método para ver los pedidos en trámite
    public void verPedidosTramite(View view){
        Intent intentHC3 = new Intent(this, PedidosEnTramite.class);
        startActivity(intentHC3);
    }

    // Método para ver las compras realizadas
    public void verComprasRealizadas(View view){
        Intent intentHC4 = new Intent(this, ComprasRealizadas.class);
        startActivity(intentHC4);
    }
}
