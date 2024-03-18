package com.example.restauranteproyectofinalpatrones.command;

import com.example.restauranteproyectofinalpatrones.model.singleton.Carrito;
import com.example.restauranteproyectofinalpatrones.model.Producto;

public class AgregarPedido implements Command{
    private Producto producto;

    public AgregarPedido(Producto producto) {
        this.producto = producto;
    }

    @Override
    public void execute() {
        Carrito carrito = Carrito.singleton(); //Llama para que se instancie la clase al agregar un pedido
        carrito.agregarProducto(producto);
        System.out.println("Producto '" + producto.getNombre() + "' agregado al carrito.");
    }
}
