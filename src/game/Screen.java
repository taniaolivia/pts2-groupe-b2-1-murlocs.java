package game;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public abstract class Screen {
    protected final FXMLLoader loader;
    private final Parent root;
    protected Scene scene;
    
    public Screen(String url) throws IOException {
        loader = new FXMLLoader();
        root = loader.load(getClass().getResource(url).openStream());
        scene = new Scene(root);
    }
    
    public Scene getScene() {
        return scene;
    }
}