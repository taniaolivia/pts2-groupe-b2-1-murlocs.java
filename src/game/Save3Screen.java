package game;

import controllers.Save3ScreenController;
import java.io.IOException;

public class Save3Screen extends Screen {
    private final Save3ScreenController controller;

    public Save3Screen(String url) throws IOException {
        super(url);
        controller = loader.getController();
        controller.setScene(scene);
    }

    public Save3ScreenController getController() {
        return controller;
    }
}