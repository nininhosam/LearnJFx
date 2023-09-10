package com.demiex.learnjfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterController {
    @FXML
    private Label mainLabel;
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;
    @FXML
    private TextField emailField;


    @FXML
    protected void register(){
        if (usernameField.getText().isBlank() || passwordField.getText().isBlank() || emailField.getText().isBlank()){
            mainLabel.setText("Invalid username or password.");
        } else {
            mainLabel.setText("To be added.");
        }
    }

    @FXML
    protected void toLoginWindow() throws IOException {
        Stage logWindow = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Gadget.class.getResource("gadget-login.fxml"));
        Scene logScene = new Scene(fxmlLoader.load(), 320, 200);
        logWindow.setTitle("Login window");
        logWindow.setScene(logScene);
        logWindow.setResizable(false);
        logWindow.show();

        Stage currentStage = (Stage) mainLabel.getScene().getWindow();
        currentStage.close();
    }

}