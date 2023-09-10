package com.demiex.learnjfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private Label mainLabel;
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;

    @FXML
    protected void login() throws IOException {
        if (usernameField.getText().isBlank() || passwordField.getText().isBlank()){
            mainLabel.setText("Invalid username or password.");
        } else {
            Stage miscWindow = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(Gadget.class.getResource("gadget-misc.fxml"));
            Scene regScene = new Scene(fxmlLoader.load(), 410, 600);
            miscWindow.setTitle("Miscellaneous window");
            miscWindow.setScene(regScene);
            miscWindow.setResizable(false);
            miscWindow.show();
            Stage currentStage = (Stage) mainLabel.getScene().getWindow();
            currentStage.close();
        }
    }

    @FXML
    protected void toRegisterWindow() throws IOException {
        Stage regWindow = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Gadget.class.getResource("gadget-register.fxml"));
        Scene regScene = new Scene(fxmlLoader.load(), 320, 240);
        regWindow.setTitle("Register window");
        regWindow.setScene(regScene);
        regWindow.setResizable(false);
        regWindow.show();

        Stage currentStage = (Stage) mainLabel.getScene().getWindow();
        currentStage.close();
    }
}