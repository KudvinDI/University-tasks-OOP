package main;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class XObj extends Obj {
    public XObj(Button button) {
        super(button);
        button.setText("X");
        button.setTextFill(Color.RED);
    }
}
