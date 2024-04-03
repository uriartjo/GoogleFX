package com.example.googlefx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label label_textName;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void loadAppName() {
        String appName = null;
        try {
            appName = DocsQuickstart.getDocTitle();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        welcomeText.setText(appName);
    }
}