module com.example.googlefx {
    requires java.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.api.client;
    requires com.google.api.client.json.gson;
    requires google.api.client;
    requires com.google.api.client.extensions.jetty.auth;
    requires com.google.api.client.extensions.java6.auth;
    requires com.google.api.client.auth;
    requires com.google.api.services.docs;
    requires com.google.gson;


    opens com.example.googlefx to javafx.fxml;
    exports com.example.googlefx;
}