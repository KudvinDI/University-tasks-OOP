package main;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button buttonTopLeft;
    @FXML
    private Button buttonTopTop;
    @FXML
    private Button buttonTopRight;
    @FXML
    private Button buttonMidLeft;
    @FXML
    private Button buttonMidMid;
    @FXML
    private Button buttonMidRight;
    @FXML
    private Button buttonBotLeft;
    @FXML
    private Button buttonBotMid;
    @FXML
    private Button buttonBotRight;

    @FXML
    private Button resetButton;

    Button[] buttons;
    @FXML
    private Text mainText;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        GameLogic gameLogic = new GameLogic();
        buttons =  new Button[]{buttonTopLeft, buttonTopTop, buttonTopRight, buttonMidLeft, buttonMidMid, buttonMidRight, buttonBotLeft, buttonBotMid, buttonBotRight};
        gameLogic.setupRestartButton(resetButton, buttons, mainText);
        for (Button button : buttons) {
            gameLogic.setupButton(button, buttons, mainText);
            button.setFocusTraversable(false);
        }


    }

}
