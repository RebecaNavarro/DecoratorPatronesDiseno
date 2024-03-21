package com.example.restauranteproyectofinalpatrones;

public class Menu {
    public static void menuPrincipal() {
        System.out.println("Menú:");
        System.out.println("1. Agregar Producto al Carrito");
        System.out.println("2. Eliminar Producto del Carrito (añade productos primero)");
        System.out.println("3. Seleccionar Método de Pago");
        System.out.println("4. Realizar Pedido (añade productos y selecciona un método de pago primero)");
        System.out.println("5. Salir");
        System.out.println("--------------------------------------------------");
        System.out.println("Productos Disponibles:");
        System.out.println("1. Capuccino - $16.0");
        System.out.println("2. Té de Canela - $6.5");
        System.out.println("3. Frappé de Oreo - $15.0");
        System.out.println("4. Brownies y Helado de Vainilla - $20.0");
        System.out.println("5. Pedazo de Torta de Chocolate - $22.0");
        System.out.println("6. Panqueques con crema y frutas - $21.5");
        System.out.print("Ingrese el número de su selección: ");
    }

    public static void menuMetodoPago() {
        System.out.println("Seleccione el método de pago:");
        System.out.println("1. Pago con Paypal");
        System.out.println("2. Pago con Efectivo");
        System.out.println("3. Pago con Tarjeta");
        System.out.print("Ingrese el número de su selección: ");
    }
}
