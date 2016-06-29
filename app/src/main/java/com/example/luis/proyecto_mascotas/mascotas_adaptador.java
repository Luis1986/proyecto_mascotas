package com.example.luis.proyecto_mascotas;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;

/**
 * Created by Luis on 26/06/2016.
 */

public class mascotas_adaptador extends RecyclerView.Adapter<mascotas_adaptador.MascotasViewHolder> {
        private List<mascotas> items;


    public static class MascotasViewHolder extends RecyclerView.ViewHolder {
            // Campos respectivos de un item
            public ImageView imagen;
            public TextView nombre;
            public ImageButton sumar;
            public TextView display;


            public MascotasViewHolder(final View v) {
                super(v);
                imagen = (ImageView) v.findViewById(R.id.imagen);
                nombre = (TextView) v.findViewById(R.id.nombre);
                //sumar raiting para las mascotas
                display = (TextView) v.findViewById(R.id.textView);
                sumar =(ImageButton) v.findViewById(R.id.BtnImagen);


                MascotasViewHolder.this.sumar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(new MainActivity(),"Hola", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }

        public mascotas_adaptador(List<mascotas> items) {
            this.items = items;
        }

        @Override
        public int getItemCount() {
            return items.size();
        }

        @Override
        public MascotasViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View v = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.fotos_mascotas, viewGroup, false);

            return new MascotasViewHolder(v);
        }

        @Override
        public void onBindViewHolder(MascotasViewHolder viewHolder, int i) {


            viewHolder.imagen.setImageResource(items.get(i).getImagen());
            viewHolder.nombre.setText(items.get(i).getNombre());
            viewHolder.display.setText(items.get(i).getDisplay());



        }

    }

