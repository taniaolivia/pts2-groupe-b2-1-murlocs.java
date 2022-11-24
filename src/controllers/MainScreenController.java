package controllers;

import game.Screens;
import models.Music;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainScreenController extends ScreenController {
    @FXML
    private void getToSave1Screen(ActionEvent event) {
        Screens.loadSave1Screen();
    }
    
    @FXML
    private void getToSave2Screen(ActionEvent event) {
        Screens.loadSave2Screen();
    }
    
    @FXML
    private void getToSave3Screen(ActionEvent event) {
        Screens.loadSave3Screen();
    }

    @Override
    public void updateScene() {
        Music.play("src/assets/musics/main_menu.mp3"); 
    }

    @Override
    public void executeLoop() {

    }
}