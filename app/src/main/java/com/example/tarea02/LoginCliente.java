package com.example.tarea02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginCliente extends AppCompatActivity {

    // Variables a usar
    EditText etUsuario1, etContraseña1;
    final String USUARIO_CLIENTE = "cliente1";
    final String CONTRASEÑA_CLIENTE = "abc123.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_cliente);
    }

    // Método para hacer el login
    public void entrarCliente(View view){
        // Recogemos los datos introducidos
        etUsuario1 = (EditText)findViewById(R.id.editText_usuarioCliente);
        etContraseña1 = (EditText)findViewById(R.id.editText_contraseñaCliente);
        String usuarioIntroducido = etUsuario1.getText().toString();
        String contraseñaIntroducida = etContraseña1.getText().toString();

        // Comprobamos que lo introducido coincide con el cliente registrado
        if(usuarioIntroducido.equals(USUARIO_CLIENTE) && contraseñaIntroducida.equals(CONTRASEÑA_CLIENTE)){
            Intent intentC1 = new Intent(this, HomeCliente.class);
            startActivity(intentC1);
        }else{
            Intent intentC2 = new Intent(this, ErrorLogin.class);
            startActivity(intentC2);
        }
    }
}
