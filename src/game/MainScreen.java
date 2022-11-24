package game;

import controllers.MainScreenController;
import java.io.IOException;

public class MainScreen extends Screen {
    private final MainScreenController controller;

    public MainScreen(String url) throws IOException {
        super(url);
        controller = loader.getController();
        controller.setScene(scene);
    }

    public MainScreenController getController() {
        return controller;
    }
}