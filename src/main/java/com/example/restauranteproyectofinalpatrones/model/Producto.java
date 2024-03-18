package com.example.restauranteproyectofinalpatrones.model;

public class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //para asignar el precio y nombre de un producto
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //para dar el valor y que otras clases lo utilicen
    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

}
