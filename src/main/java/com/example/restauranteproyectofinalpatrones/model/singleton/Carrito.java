package com.example.restauranteproyectofinalpatrones.model.singleton;

import com.example.restauranteproyectofinalpatrones.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Producto> productos;
    private static Carrito carrito;
    double total = 0;
    public Carrito() {
        this.productos = new ArrayList<>();
    }

    // Singleton que instancia una sola clase carrito y devuelve este
    public static Carrito singleton() {
        if (carrito == null) {
            carrito = new Carrito();
        }
        return carrito;
    }

    public double getTotal(){
        return total;
    }

    // Método para agregar y eliminar un producto al carrito
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public double totalCompras() {

        for (Producto producto : productos) { //es un foreach  pra cada producto de la lista
            total += producto.getPrecio();
        }
        return total;
    }

    public void vaciarCarrito() {
        productos.clear();
    }

    public void realizarPedido(){

        if (productos.isEmpty()) {
            System.out.println("No hay nada que comprar.");
            return; //no devuelve nada
        }

        System.out.println("Procesando pedido");

        System.out.println("Detalles del pedido:");
        for (Producto producto : productos) {//foreach para mostrar cada producto del carrito
            System.out.println("- " + producto.getNombre() + ": $" + producto.getPrecio());
        }

        System.out.println("El total del pedido será: $" + totalCompras());

        productos.clear();

    }

}
