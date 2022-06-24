package main;


import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class GameLogic  {
    private int playerTurn;
    private final Obj[] objects = new Obj[9];

    public GameLogic(){
        restartObj();
    }

    public void setupButton(Button button, Button[] buttons, Text mainText){
        button.setOnMouseClicked(mouseEvent ->{
            setPlayerSymbol(button, buttons);
            button.setDisable(true);
            checkEndGame(buttons, mainText);
        });
    }
    public void setupRestartButton(Button button, Button[] buttons, Text mainText){
        button.setOnMouseClicked(mouseEvent -> {
            restartGame(buttons, mainText);
        });
    }

    private void checkEndGame(Button[] buttons, Text mainText){       // ALL Combinations check

        for(int i=0; i<8; i++){
            String line = switch (i){
                case 0 -> objects[0].getChar() + objects[1].getChar() + objects[2].getChar();
                case 1 -> objects[3].getChar() + objects[4].getChar() + objects[5].getChar();
                case 2 -> objects[6].getChar() + objects[7].getChar() + objects[8].getChar();
                case 3 -> objects[0].getChar() + objects[4].getChar() + objects[8].getChar();
                case 4 -> objects[2].getChar() + objects[4].getChar() + objects[6].getChar();
                case 5 -> objects[0].getChar() + objects[3].getChar() + objects[6].getChar();
                case 6 -> objects[1].getChar() + objects[4].getChar() + objects[7].getChar();
                case 7 -> objects[2].getChar() + objects[5].getChar() + objects[8].getChar();
                default -> null;
            };
            if(line.equals("XXX")){
                mainText.setText("X won");
                endGame(buttons);

            }
            if (line.equals("OOO")){
                mainText.setText("O won");
                endGame(buttons);
            }
        }
    }
    private void endGame(Button[] buttons){ //SmbWon
        for(Button button : buttons){
            button.setDisable(true);
        }
        restartObj();
    }

    private void setPlayerSymbol(Button button, Button[] buttons){
        DrawToScene drawToScene = new DrawToScene(button);
        if(playerTurn %2 == 0){
            drawToScene.drawX();
            int index =-1;
            for(int i = 0; i < buttons.length; i++) {
                if(buttons[i].equals(button)) {
                    index = i;
                    break;
                }
            }
            objects[index] = new XObj(button);
            playerTurn = 1;
        }else{
            drawToScene.drawO();
            int index =-1;
            for(int i = 0; i < buttons.length; i++) {
                if(buttons[i].equals(button)) {
                    index = i;
                    break;
                }
            }
            objects[index] = new OObj(button);
            playerTurn = 0;
        }
    }
    private void restartObj(){
        for (int i = 0; i < objects.length; i++) {
            objects[i] = new Obj(new Button());

        }
    }
    private void restartGame(Button[] buttons, Text mainText){ //Clicked on restart
        for (Button b : buttons){
            DrawToScene drawToScene = new DrawToScene(b);
            drawToScene.drawVoid();
            b.setDisable(false);
        }
        playerTurn = 0;
        mainText.setText("Tic-Tac-Toe");
    }

    public int getPlayerTurn() {
        return playerTurn;
    }

    public void setPlayerTurn(int playerTurn) {
        this.playerTurn = playerTurn;
    }
}
