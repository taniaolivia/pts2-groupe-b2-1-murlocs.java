package game;

import controllers.GameScreenController;
import java.io.IOException;

public class GameScreen extends Screen {
    private final GameScreenController controller;

    public GameScreen(String url) throws IOException {
        super(url);
        controller = loader.getController();
        controller.setScene(scene);
    }

    public GameScreenController getController() {
        return controller;
    }
}