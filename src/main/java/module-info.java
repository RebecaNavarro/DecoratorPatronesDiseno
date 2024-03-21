module com.example.restauranteproyectofinalpatrones {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.restauranteproyectofinalpatrones to javafx.fxml;
    exports com.example.restauranteproyectofinalpatrones;
//    exports com.example.restauranteproyectofinalpatrones.controller;
//    opens com.example.restauranteproyectofinalpatrones.controller to javafx.fxml;
}