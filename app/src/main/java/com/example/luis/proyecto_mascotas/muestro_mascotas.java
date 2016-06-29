package com.example.luis.proyecto_mascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class muestro_mascotas extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muestro_mascotas);

        Toolbar toolbar = (Toolbar) findViewById(R.id.miActionbar);
        setSupportActionBar(toolbar);
        Bundle parametros = this.getIntent().getExtras(); //Definimos el contenedor de parametros
        String nombre = parametros.getString("nombre"); //Guardamos el parametro nombre en la variable nombre
        TextView campo_texto = (TextView) findViewById(R.id.nombre);
        campo_texto.setText(nombre); //Mostramos el texto

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        getMenuInflater().inflate(R.menu.activity_segunda, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.miCompose:
                // User chose the "Settings" item, show the app settings UI...

                return true;

            case R.id.miProfile:
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
                Intent a = new Intent(this,MainActivity.class);
                //Inicia la actividad
                startActivity(a);
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
}
