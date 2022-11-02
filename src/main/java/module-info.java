module com.example.labomba {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.labomba to javafx.fxml;
    exports com.example.labomba;
}