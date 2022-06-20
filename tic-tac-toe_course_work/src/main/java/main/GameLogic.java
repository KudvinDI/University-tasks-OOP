package main;


import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class GameLogic  {
    private int playerTurn;

    public void setupButton(Button button, Button[] buttons, Text mainText){
        button.setOnMouseClicked(mouseEvent ->{
            setPlayerSymbol(button);
            button.setDisable(true);
            checkEndGame(buttons, mainText);
        });
    }
    public void setupRestartButton(Button button, Button[] buttons, Text mainText){
        button.setOnMouseClicked(mouseEvent -> {
            restartGame(buttons, mainText);
        });
    }
    //TODO rework 2d array ???
    private void checkEndGame(Button[] buttons, Text mainText){       // ALL Combinations check
        for(int i=0; i<8; i++){
            String line = switch (i){
                case 0 -> buttons[0].getText() + buttons[1].getText() + buttons[2].getText();
                case 1 -> buttons[3].getText() + buttons[4].getText() + buttons[5].getText();
                case 2 -> buttons[6].getText() + buttons[7].getText() + buttons[8].getText();
                case 3 -> buttons[0].getText() + buttons[4].getText() + buttons[8].getText();
                case 4 -> buttons[2].getText() + buttons[4].getText() + buttons[6].getText();
                case 5 -> buttons[0].getText() + buttons[3].getText() + buttons[6].getText();
                case 6 -> buttons[1].getText() + buttons[4].getText() + buttons[7].getText();
                case 7 -> buttons[2].getText() + buttons[5].getText() + buttons[8].getText();
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
    }

    private void setPlayerSymbol(Button button){
        DrawToScene drawToScene = new DrawToScene(button);
        if(playerTurn %2 == 0){
            drawToScene.drawX();
            playerTurn = 1;
        }else{
            drawToScene.drawO();
            playerTurn = 0;
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
