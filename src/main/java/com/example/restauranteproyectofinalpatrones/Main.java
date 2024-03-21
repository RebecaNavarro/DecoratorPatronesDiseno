package com.example.restauranteproyectofinalpatrones;

import com.example.restauranteproyectofinalpatrones.command.AgregarPedido;
import com.example.restauranteproyectofinalpatrones.command.Command;
import com.example.restauranteproyectofinalpatrones.command.EliminarPedido;
import com.example.restauranteproyectofinalpatrones.command.RealizarPedido;
import com.example.restauranteproyectofinalpatrones.model.Producto;
import com.example.restauranteproyectofinalpatrones.model.singleton.Carrito;
import com.example.restauranteproyectofinalpatrones.strategy.MetodoPago;
import com.example.restauranteproyectofinalpatrones.strategy.PagoEfectivo;
import com.example.restauranteproyectofinalpatrones.strategy.PagoPaypal;
import com.example.restauranteproyectofinalpatrones.strategy.PagoTarjeta;

import java.util.Scanner;

public class Main {

    private static Menu menu;

    static Producto producto1 = new Producto("Capuccino", 16.0);
    static Producto producto2 = new Producto("Té de Canela", 6.5);
    static Producto producto3 = new Producto("Frappé de Oreo", 15.0);
    static Producto producto4 = new Producto("Brownies y Helado de Vainilla", 20.0);
    static Producto producto5 = new Producto("Pedazo de Torta de Chocolate", 22.0);
    static Producto producto6 = new Producto("Panqueques con crema y frutas", 21.5);

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Carrito carrito = Carrito.singleton();
        MetodoPago metodoPago = null;

        while (true) {
            menu.menuPrincipal();
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    agregarProducto(carrito);
                    break;
                case 2:
                    eliminarProducto(carrito);
                    break;
                case 3:
                    metodoPago = seleccionarMetodoPago();
                    break;
                case 4:
                    realizarPedido(carrito, metodoPago);
                    break;
                case 5:
                    System.out.println("Gracias por visitarnos. ¡Hasta luego!");
                    System.out.println("============================================");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número válido del menú.");
                    break;
            }
        }
    }

    private static void agregarProducto(Carrito carrito) {
        System.out.print("Ingrese el número del producto que desea agregar:");
        int opcionProducto = scanner.nextInt();
        scanner.nextLine();

        Producto producto = null;
        switch (opcionProducto) {
            case 1:
                producto = producto1;
                break;
            case 2:
                producto = producto2;
                break;
            case 3:
                producto = producto3;
                break;
            case 4:
                producto = producto4;
                break;
            case 5:
                producto = producto5;
                break;
            case 6:
                producto = producto6;
                break;
            default:
                System.out.println("Opción inválida. No se agregó ningún producto al carrito.");
                System.out.println("============================================");
                return;
        }

        Command agregarPedido = new AgregarPedido(producto);
        agregarPedido.execute();
    }

    private static void eliminarProducto(Carrito carrito) {
        System.out.print("Ingrese el número del producto que desea eliminar:");
        int opcionProducto = scanner.nextInt();
        scanner.nextLine();

        Producto producto = null;
        switch (opcionProducto) {
            case 1:
                producto = producto1;
                break;
            case 2:
                producto = producto2;
                break;
            case 3:
                producto = producto3;
                break;
            case 4:
                producto = producto4;
                break;
            case 5:
                producto = producto5;
                break;
            case 6:
                producto = producto6;
                break;
            default:
                System.out.println("Opción inválida. No se eliminó ningún producto del carrito.");
                System.out.println("============================================");
                return;
        }

        Command eliminarPedido = new EliminarPedido(producto);
        eliminarPedido.execute();
    }

    public static MetodoPago seleccionarMetodoPago() {
        menu.menuMetodoPago();
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("Pago seleccionado: Paypal");
                System.out.println("============================================");
                return new PagoPaypal();
            case 2:
                System.out.println("Pago seleccionado: Efectivo");
                System.out.println("============================================");
                return new PagoEfectivo();
            case 3:
                System.out.println("Pago seleccionado: Tarjeta");
                System.out.println("============================================");
                return new PagoTarjeta();
            default:
                System.out.println("Método de pago inválido. Seleccionado Pago con Efectivo por defecto.");
                System.out.println("============================================");
                return new PagoEfectivo();
        }
    }

    private static void realizarPedido(Carrito carrito, MetodoPago metodoPago) {
        if (metodoPago == null) {
            System.out.println("Selecciona el método de pago primero.");
            return;
        }
        Command realizarPedido = new RealizarPedido(metodoPago);
        realizarPedido.execute();

    }
}
