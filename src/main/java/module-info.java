module com.example.lab92gitmerging {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab92gitmerging to javafx.fxml;
    exports com.example.lab92gitmerging;
}