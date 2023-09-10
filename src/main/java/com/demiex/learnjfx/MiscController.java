package com.demiex.learnjfx;

import java.io.File;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class MiscController {
    @FXML
    private ImageView circleImg;
    @FXML
    private Label textBubble;

    @FXML
    protected void imageToMorning() {
        File morningF = new File("../resources/com/demiex/learnjfx/assets/morning.png");
        Image morning = new Image(morningF.toURI().toString());
        //"file:../resources/com/demiex/learnjfx/assets/morning.png"
        //Image morning = new Image("file:../resources/com/demiex/learnjfx/assets/morning.png");
        circleImg.setImage(morning);



        //Curently not working. Why?
        //Image is being changed? YES.
        //ImageFrame disappears? NO.
    }

    @FXML
    protected void checkStatus() {
        textBubble.setText("Birb seems do be doing well.");
    }

    @FXML
    protected void interact() {
        textBubble.setText("Birb chirps playfully");
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

        Stage currentStage = (Stage) circleImg.getScene().getWindow();
        currentStage.close();
    }
}
