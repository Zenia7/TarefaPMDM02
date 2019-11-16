package com.example.tarea02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginAdmin extends AppCompatActivity {

    // Variables a usar
    EditText etUsuario, etContraseña;
    final String USUARIO_ADMIN = "admin";
    final String CONTRASEÑA_ADMIN = "abc123.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);
    }

    // Método para hacer el login
    public void entrarAdmin(View view){
        // Recogemos los datos introducidos
        etUsuario = (EditText)findViewById(R.id.editText_usuarioAdmin);
        etContraseña = (EditText)findViewById(R.id.editText_contraseñaAdmin);
        String usuarioIntroducido = etUsuario.getText().toString();
        String contraseñaIntroducida = etContraseña.getText().toString();

        // Comprobamos que lo introducido coincide con el admin registrado
        if(USUARIO_ADMIN.equals(usuarioIntroducido) && CONTRASEÑA_ADMIN.equals(contraseñaIntroducida)){
            Intent intentA1 = new Intent(this, HomeAdmin.class);
            startActivity(intentA1);
        }else{
            Intent intentA2 = new Intent(this, ErrorLogin.class);
            startActivity(intentA2);
        }
    }
}
