package com.example.restauranteproyectofinalpatrones;

import com.example.restauranteproyectofinalpatrones.command.AgregarPedido;
import com.example.restauranteproyectofinalpatrones.command.Command;
import com.example.restauranteproyectofinalpatrones.command.RealizarPedido;
import com.example.restauranteproyectofinalpatrones.model.Producto;
import com.example.restauranteproyectofinalpatrones.model.singleton.Carrito;
import com.example.restauranteproyectofinalpatrones.strategy.MetodoPago;
import com.example.restauranteproyectofinalpatrones.strategy.PagoPaypal;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
//        launch();


        Producto producto1 = new Producto("Pizza", 10.99);
        Producto producto2 = new Producto("Hamburguesa", 8.99);

        Command agregarPizzaCommand = new AgregarPedido(producto1);
        Command agregarHamburguesaCommand = new AgregarPedido(producto2);

        agregarPizzaCommand.execute();
        agregarHamburguesaCommand.execute();

        MetodoPago metodoPago = new PagoPaypal();

        Command realizarPedidoCommand = new RealizarPedido(metodoPago);

        realizarPedidoCommand.execute();


    }
}