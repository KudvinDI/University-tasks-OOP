package main;

import javafx.scene.control.Button;

public class DrawToScene {
    private Button button;
    public DrawToScene(Button button) {
        this.button = button;
    }

    public void drawX(){
        this.button = new XObj(button).getButton();
    }
    public void drawO(){
        this.button = new OObj(button).getButton();
    }
    public void drawVoid(){
        this.button = new VoidObj(button).getButton();
    }
}
