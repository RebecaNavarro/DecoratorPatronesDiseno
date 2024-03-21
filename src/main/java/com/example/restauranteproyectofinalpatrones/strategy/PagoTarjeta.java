package com.example.restauranteproyectofinalpatrones.strategy;
public class PagoTarjeta implements MetodoPago{
    @Override
    public void procesarPago(double total){
        System.out.println("Pagando $" + total + " con tarjeta de crédito.");
        System.out.println("============================================");
    }
}
