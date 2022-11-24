package controllers;

import game.Screens;
import models.Music;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class TitleScreenController extends ScreenController {
    
    @FXML
    private void getToMainScreen(ActionEvent event) {
        Screens.loadMainScreen();
    }

    @Override
    public void updateScene() {
        Music.play("src/assets/musics/main_menu.mp3");
    }

    @Override
    public void executeLoop() {

    }
    
}
