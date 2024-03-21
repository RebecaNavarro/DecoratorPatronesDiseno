package com.example.restauranteproyectofinalpatrones.strategy;

public class PagoEfectivo implements MetodoPago{
    @Override
    public void procesarPago(double total){
        System.out.println("Pagando $" + total + " con efectivo.");
        System.out.println("============================================");
    }
}
