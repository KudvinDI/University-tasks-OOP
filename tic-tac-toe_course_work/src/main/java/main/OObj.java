package main;


import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class OObj extends Obj {
    public OObj(Button button) {
        super(button);
        button.setText("O");
        button.setTextFill(Color.GREEN);
    }
}
