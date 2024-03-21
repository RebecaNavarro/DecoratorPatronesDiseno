package com.example.restauranteproyectofinalpatrones.strategy;

public class PagoPaypal implements MetodoPago{
    @Override
    public void procesarPago(double total) {
        System.out.println("Pagando $" + total + " con PayPal.");
        System.out.println("============================================");
    }
}
