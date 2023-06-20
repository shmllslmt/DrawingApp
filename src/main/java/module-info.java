module com.shamilla.drawingapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.shamilla.drawingapp to javafx.fxml;
    exports com.shamilla.drawingapp;
}