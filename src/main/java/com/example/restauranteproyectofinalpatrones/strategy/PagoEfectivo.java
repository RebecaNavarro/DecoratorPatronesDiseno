package com.example.restauranteproyectofinalpatrones.strategy;

import com.example.restauranteproyectofinalpatrones.model.singleton.Carrito;

public class PagoEfectivo implements MetodoPago{

    Carrito carrito;
    @Override
    public void procesarPago(double total){

        System.out.println("Pagando $" + total + " con efectivo.");

    }
}
