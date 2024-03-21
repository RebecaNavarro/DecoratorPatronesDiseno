package com.example.restauranteproyectofinalpatrones.command;

import com.example.restauranteproyectofinalpatrones.model.Producto;
import com.example.restauranteproyectofinalpatrones.model.singleton.Carrito;
import com.example.restauranteproyectofinalpatrones.strategy.MetodoPago;

public class RealizarPedido implements Command{

    private MetodoPago metodoPago;

    public RealizarPedido(MetodoPago metodoPago){
        this.metodoPago=metodoPago;
    }

    @Override
    public void execute() {
        Carrito carrito = Carrito.singleton(); //si ya está instanciada devuelve este para que se modifique sobre esta
        carrito.realizarPedido();
        metodoPago.procesarPago(carrito.getTotal());

    }

}
