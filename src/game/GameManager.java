package game;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class GameManager extends Application {
    private TimerTask timerTask;
    private Timer timer;
    private TitleScreen titleScreen;
    private MainScreen mainScreen;
    private Save1Screen save1Screen;
    private Save2Screen save2Screen;
    private Save3Screen save3Screen;
    private GameScreen gameScreen;
    
    @Override
    public void start(Stage stage) throws Exception {
        titleScreen = new TitleScreen("/views/TitleScreen.fxml");
        stage.setScene(titleScreen.getScene());
        stage.setTitle("Bubble Booble");
        File file = new File("src/assets/textures/icon.png");
        Image icon = new Image(file.toURI().toString());
        stage.getIcons().add(icon);
        stage.show();
        
        mainScreen = new MainScreen("/views/MainScreen.fxml");
        save1Screen = new Save1Screen("/views/Save1Screen.fxml");
        save2Screen = new Save2Screen("/views/Save2Screen.fxml");
        save3Screen = new Save3Screen("/views/Save3Screen.fxml");
        gameScreen = new GameScreen("/views/GameScreen.fxml");
        
        timerTask = new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() -> {
                    if(!Screens.isScreenLoaded()) {
                        if(Screens.isMainScreen()) {
                            stage.setScene(mainScreen.getScene());
                        }
                        if(Screens.isSave1Screen()) {
                            stage.setScene(save1Screen.getScene());
                        }
                        if(Screens.isSave2Screen()) {
                            stage.setScene(save2Screen.getScene());
                        }
                        if(Screens.isSave3Screen()) {
                            stage.setScene(save3Screen.getScene());
                        }
                        if(Screens.isGameScreen()) {
                            stage.setScene(gameScreen.getScene());
                        }
                        Screens.setScreenLoaded();
                    }
                });
            }
        };
        timer = new Timer();
        timer.schedule(timerTask, 0, 10);
    }
    
    @Override
    public void stop() {
        timer.cancel();
        mainScreen.getController().cancelTimer();
        save1Screen.getController().cancelTimer();
        save2Screen.getController().cancelTimer();
        save3Screen.getController().cancelTimer();
        gameScreen.getController().cancelTimer();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}