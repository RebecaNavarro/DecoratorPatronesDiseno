package com.example.restauranteproyectofinalpatrones.command;

import com.example.restauranteproyectofinalpatrones.model.Producto;
import com.example.restauranteproyectofinalpatrones.model.singleton.Carrito;

public class EliminarPedido implements Command{
    private Producto producto;

    public EliminarPedido(Producto producto) {
        this.producto = producto;
    }

    @Override
    public void execute() {
        Carrito carrito = Carrito.singleton(); //si ya está instanciada devuelve este para que se modifique sobre esta
        carrito.eliminarProducto(producto);
        System.out.println("============================================");
    }
}
