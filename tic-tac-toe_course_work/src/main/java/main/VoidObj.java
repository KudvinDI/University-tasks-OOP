package main;

import javafx.scene.control.Button;

public class VoidObj {
    Button button;

    public VoidObj(Button button) {
        this.button = button;
        button.setText("");
    }
    public Button getButton() {
        return button;
    }
}
