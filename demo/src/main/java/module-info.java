module com.jafaapp.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jafaapp.demo to javafx.fxml;
    exports com.jafaapp.demo;
}