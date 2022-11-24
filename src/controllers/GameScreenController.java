package controllers;

import game.Commands;
import game.Screens;

import javafx.fxml.FXML;

import javafx.scene.control.Label;
import models.Player;


public class GameScreenController extends ScreenController {
    private Player player;
    
    @FXML
    private Label thePauseControlLabel;
    
    private boolean isGamePaused;
   
    @Override
    public void updateScene() {
        player = new Player("src/assets/textures/player.png", 64, 64, true);
        player.draw(scene);
    }

    @Override
    public void executeLoop() {
        if(Screens.isGameScreen()) {
            if(!isGamePaused) {
                thePauseControlLabel.setOpacity(0);
                if(Commands.isPlayerRight()) {
                    player.move(1, 0);
                }
                if(Commands.isPlayerLeft()) {
                    player.move(-1, 0);
                }
                if(Commands.isPlayerJump()) {
                    player.move(0, -1);
                }
                if(Commands.isPlayerDrop()) {
                    player.move(0, 1);
                }
            }
            if(Commands.isMenuReturn()) {
                if(isGamePaused) {
                    isGamePaused = false;
                    thePauseControlLabel.setText("PAUSE");
                }
                else{
                    isGamePaused = true;
                    thePauseControlLabel.setText("PAUSE");
                    thePauseControlLabel.setOpacity(1);
                 
                }
            }
        }    
          
   }
}

