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

    public static Carrito singleton() {
        if (carrito == null) {
            carrito = new Carrito();
        }
        return carrito;
    }

    public double getTotal(){
        return total;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    public void eliminarProducto(Producto producto) {
        if(productos.contains(producto)) {
            System.out.println("Producto '" + producto.getNombre() + "' eliminado del carrito.");
            productos.remove(producto);
        } else if (!productos.contains(producto)) {
            System.out.println("No se añadió el producto al carrito");
        }
    }
    public void vaciarCarrito() { productos.clear(); }

    public double totalCompras() {
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void realizarPedido(){
        if (productos.isEmpty()) {
            System.out.println("No hay nada que comprar.");
            return;
        } else {
            System.out.println("Procesando pedido");

            System.out.println("Detalles del pedido:");
            for (Producto producto : productos) {
                System.out.println("- " + producto.getNombre() + ": $" + producto.getPrecio());
            }

            System.out.println("El total del pedido será: $" + totalCompras());

            vaciarCarrito();
            System.out.println("Pedido exitoso.");

        }
    }

}
