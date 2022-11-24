package models;

import java.io.File;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Texture {
    private ImageView imageView;
    
    public Texture(String url, int sizeX, int sizeY) {
        File file = new File(url);
        Image image = new Image(file.toURI().toString(), sizeX, sizeY, false, false);
        imageView = new ImageView(image);
    }
    
    public ImageView getImageView(){
        return imageView;
    }
}