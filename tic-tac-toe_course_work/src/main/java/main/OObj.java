package main;


import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class OObj {
   Button button;
    public OObj(Button button) {
        this.button = button;
        button.setText("O");
        button.setTextFill(Color.GREEN);
    }
    public Button getButton() {
        return button;
    }

}
