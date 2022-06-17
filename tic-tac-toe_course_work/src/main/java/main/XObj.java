package main;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class XObj {
    Button button;
    public XObj(Button button) {
        this.button = button;
        button.setText("X");
        button.setTextFill(Color.RED);
    }

    public Button getButton() {
        return button;
    }
}
