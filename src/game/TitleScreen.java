package game;

import controllers.TitleScreenController;
import java.io.IOException;

public class TitleScreen extends Screen {
    private final TitleScreenController controller;

    public TitleScreen(String url) throws IOException {
        super(url);
        controller = loader.getController();
        controller.setScene(scene);
    }

    public TitleScreenController getController() {
        return controller;
    }
}