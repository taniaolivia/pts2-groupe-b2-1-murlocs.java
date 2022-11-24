package game;

import controllers.Save1ScreenController;
import java.io.IOException;

public class Save1Screen extends Screen {
    private final Save1ScreenController controller;

    public Save1Screen(String url) throws IOException {
        super(url);
        controller = loader.getController();
        controller.setScene(scene);
    }

    public Save1ScreenController getController() {
        return controller;
    }
}