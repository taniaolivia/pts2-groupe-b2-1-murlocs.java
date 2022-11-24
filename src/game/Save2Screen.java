package game;

import controllers.Save2ScreenController;
import java.io.IOException;

public class Save2Screen extends Screen {
    private final Save2ScreenController controller;

    public Save2Screen(String url) throws IOException {
        super(url);
        controller = loader.getController();
        controller.setScene(scene);
    }

    public Save2ScreenController getController() {
        return controller;
    }
}