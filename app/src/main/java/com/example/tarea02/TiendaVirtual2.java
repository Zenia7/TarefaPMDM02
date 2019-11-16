package com.example.tarea02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class TiendaVirtual2 extends AppCompatActivity {

    // Datos que mostrará el toast
    private String categoria, producto, cantidad, direccion, ciudad, codigoPostal;
    // EditTexts de esta activity
    private EditText etDirec, etCiudad, etCP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienda_virtual2);
    }

    public void finalizarPedido(View view){
        etDirec = (EditText)findViewById(R.id.etDireccion);
        etCiudad = (EditText)findViewById(R.id.etCiudad);
        etCP = (EditText)findViewById(R.id.etCodigoPostal);

        // Recogemos los datos seleccionados en la activity anterior
        Bundle extras = getIntent().getExtras();
        String categoria = extras.getString("categoria");
        String producto = extras.getString("producto");
        String cantidad = extras.getString("cantidad");

        // Mostramos el pedido mediante un Toast
        String mensajeMostrado = "Categoría: " + categoria +
                "\nProducto: " + producto +
                "\nCantidad: " + cantidad +
                "\nDirección de envío: " + etDirec.getText().toString() +
                "\nCiudad: " + etCiudad.getText().toString() +
                "\nCódigo Postal: " + etCP.getText().toString();
        Toast toast = Toast.makeText(this, mensajeMostrado, Toast.LENGTH_LONG);
        toast.show();

        // Volvemos al home del cliente
        Intent intentTV2 = new Intent(this, HomeCliente.class);
        startActivity(intentTV2);
    }
}
