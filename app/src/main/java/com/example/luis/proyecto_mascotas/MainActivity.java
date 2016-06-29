package com.example.luis.proyecto_mascotas;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Toolbar toolbar = (Toolbar) findViewById(R.id.miActionbar);
        setSupportActionBar(toolbar);

        List items = new ArrayList();

        items.add(new mascotas(R.drawable.perro1,"TOBBY","5"));
        items.add(new mascotas(R.drawable.perro2,"PUPPY","3"));
        items.add(new mascotas(R.drawable.perro3,"LOBBY","2"));
        items.add(new mascotas(R.drawable.perro4,"TATU","1"));
        items.add(new mascotas(R.drawable.perro5,"TACO","3"));
// Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

// Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

// Crear un nuevo adaptador
        adapter = new mascotas_adaptador(items);
        recycler.setAdapter(adapter);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.miCompose:
                TextView campo_texto = (TextView) findViewById(R.id.nombre);
                String nombre_usuario = campo_texto.getText().toString();

                //Define el bundle
                Bundle parametros = new Bundle();
                parametros.putString("nombre", nombre_usuario);
                //Define la actividad
                Intent i = new Intent(this,muestro_mascotas.class);
                i.putExtras(parametros);
                //Inicia la actividad
                startActivity(i);
                return true;

            case R.id.miProfile:
                // User chose the "Favorite" action, mark the current item

                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }


}
