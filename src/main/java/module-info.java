module com.example.googlefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.googlefx to javafx.fxml;
    exports com.example.googlefx;
}