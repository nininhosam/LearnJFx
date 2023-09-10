module com.demiex.learnjfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.demiex.learnjfx to javafx.fxml;
    exports com.demiex.learnjfx;
}