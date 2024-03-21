package com.example.restauranteproyectofinalpatrones.model;

public class Producto {

    private String nombre = "";
    private double precio = 0;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

}
