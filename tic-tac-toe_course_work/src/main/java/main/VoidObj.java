package main;

import javafx.scene.control.Button;

public class VoidObj extends Obj{
    public VoidObj(Button button) {
        super(button);
        button.setText("");
    }

    @Override
    public String getChar() {
        return " ";
    }
}
