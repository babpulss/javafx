package sample.fxml;

import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

public class Root implements Initializable {
    @FXML
    private Label label;
    @FXML
    private Slider bar;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bar.valueProperty();
    }
}
