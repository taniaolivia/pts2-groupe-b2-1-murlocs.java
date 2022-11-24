package controllers;

import game.Commands;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;

public abstract class ScreenController implements Initializable {
    TimerTask timerTask;
    private Timer timer;
    protected Scene scene;
    
    
    public void setScene(Scene scene) {
        this.scene = scene;
        scene.setOnKeyPressed((KeyEvent event) -> {
            if("ENTER".equals(event.getCode().toString())) {
                Commands.setMenuOk(true);
            }
            if("ESCAPE".equals(event.getCode().toString())) {
                Commands.setMenuReturn(true);
            }
            if("UP".equals(event.getCode().toString())) {
                Commands.setMenuUp(true);
                Commands.setPlayerJump(true);
            }
            if("RIGHT".equals(event.getCode().toString())) {
                Commands.setPlayerRight(true);
            }
            if("DOWN".equals(event.getCode().toString())) {
                Commands.setMenuDown(true);
                Commands.setPlayerDrop(true);
            }
            if("LEFT".equals(event.getCode().toString())) {
                Commands.setPlayerLeft(true);
            }
            if("SPACE".equals(event.getCode().toString())) {
                Commands.setPlayerBubble(true);
            }
        });
        scene.setOnKeyReleased((KeyEvent event) -> {
            if("ENTER".equals(event.getCode().toString())) {
                Commands.setMenuOk(false);
            }
            if("ESCAPE".equals(event.getCode().toString())) {
                Commands.setMenuReturn(false);
            }
            if("UP".equals(event.getCode().toString())) {
                Commands.setMenuUp(false);
                Commands.setPlayerJump(false);
            }
            if("RIGHT".equals(event.getCode().toString())) {
                Commands.setPlayerRight(false);
            }
            if("DOWN".equals(event.getCode().toString())) {
                Commands.setMenuDown(false);
                Commands.setPlayerDrop(false);
            }
            if("LEFT".equals(event.getCode().toString())) {
                Commands.setPlayerLeft(false);
            }
            if("SPACE".equals(event.getCode().toString())) {
                Commands.setPlayerBubble(false);
            }
        });
        updateScene();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        timerTask = new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() -> {
                        executeLoop();
                    
                });
            }
        };
        timer = new Timer();
        timer.schedule(timerTask, 0, 10);
    }
    
    public void cancelTimer() {
        timer.cancel();
    }
    
    public abstract void updateScene();
    public abstract void executeLoop();
}