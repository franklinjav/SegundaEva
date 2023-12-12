module com.example.segundaeva {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.segundaeva to javafx.fxml;
    exports com.example.segundaeva;
}