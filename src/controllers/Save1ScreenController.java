package controllers;

import game.Screens;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import models.Music;

public class Save1ScreenController extends ScreenController {
    @FXML
    private void getToGameScreen(ActionEvent event) {
        Screens.loadGameScreen();
        Music.stop();
        Music.play("src/assets/musics/level_1.mp3");
    }
    
    @FXML
    private void getToMainScreen(ActionEvent event) {
        Screens.loadMainScreen();
    }
    
    @Override
    public void updateScene() {
        
    }
    
    @Override
    public void executeLoop() {
        
    }
}