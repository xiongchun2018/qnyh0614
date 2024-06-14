package com.qnyh.recordinginstrument.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MyViewController {

    @FXML
    private Label welcomeText;

    @FXML
    private Label showtext2;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onHelloButtonClick2() {
        showtext2.setText("alert 2");
    }
}