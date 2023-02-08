module com.example.tabpane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tabpane to javafx.fxml;
    exports com.example.tabpane;
}