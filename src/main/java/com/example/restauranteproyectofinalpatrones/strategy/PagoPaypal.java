package com.example.restauranteproyectofinalpatrones.strategy;

import com.example.restauranteproyectofinalpatrones.model.singleton.Carrito;

public class PagoPaypal implements MetodoPago{

    @Override
    public void procesarPago(double total) {

        System.out.println("Pagando $" + total + " con PayPal.");

    }
}
