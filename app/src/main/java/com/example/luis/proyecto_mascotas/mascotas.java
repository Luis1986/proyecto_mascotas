package com.example.luis.proyecto_mascotas;

/**
 * Created by Luis on 26/06/2016.
 */
public class mascotas {
    private int imagen;
    private String nombre;

    private String display;

    public mascotas(int imagen,String nombre,String display) {
        this.imagen = imagen;
        this.nombre = nombre;

        this.display= display;
    }
    public String getNombre() {
        return nombre;
    }
    public int getImagen() {
        return imagen;
    }

    public String getDisplay() {
        return display;
    }
}
