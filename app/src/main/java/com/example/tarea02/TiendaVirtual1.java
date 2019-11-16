package com.example.tarea02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class TiendaVirtual1 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinnerCat, spinnerProd, spinnerCanti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienda_virtual1);

        spinnerCat = (Spinner)findViewById(R.id.spinnerCategoría);
        spinnerProd = (Spinner)findViewById(R.id.spinnerProducto);

        // Por defecto, rellenamos el spinner del producto con la categoría de informática
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.categoria_informatica,
                android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerCat.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        int[] categorias = {R.array.categoria_informatica, R.array.categoria_electronica, R.array.categoria_moviles};

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(
                this,
                categorias[position],
                android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerProd.setAdapter(adapter2);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    // Método para pasar a la pantalla de introducción de datos de envío
    public void siguiente(View view){
        Intent intentTV = new Intent(this, TiendaVirtual2.class);
        spinnerCat = (Spinner)findViewById(R.id.spinnerCategoría);
        spinnerProd = (Spinner)findViewById(R.id.spinnerProducto);
        spinnerCanti = (Spinner)findViewById(R.id.spinnerCantidad);

        intentTV.putExtra("categoria", spinnerCat.getSelectedItem().toString());
        intentTV.putExtra("producto", spinnerProd.getSelectedItem().toString());
        intentTV.putExtra("cantidad", spinnerCanti.getSelectedItem().toString());
        startActivity(intentTV);
    }
}
