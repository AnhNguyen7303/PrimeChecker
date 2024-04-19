module com.example.learn {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;


    opens com.example.learn to javafx.fxml;
    exports com.example.learn;
}