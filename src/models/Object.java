package models;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public abstract class Object {
    private Texture texture;
    private int sizeX;
    private int sizeY;
    private double positionX;
    private double positionY;
    private double velocityX;
    private double velocityY;
    private boolean affectedByGravity;

    public Object(String textureUrl, int sizeX, int sizeY, boolean isAffectedByGravity) {
        texture = new Texture(textureUrl, sizeX, sizeY);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        positionX = 0;
        positionY = 0;
        velocityX = 0;
        velocityY = 0;
        this.affectedByGravity = isAffectedByGravity;
    }

    public Object(int sizeX, int sizeY) {
        texture = null;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        positionX = 0;
        positionY = 0;
        velocityX = 0;
        velocityY = 0;
        affectedByGravity = false;
    }
    
    public void draw(Scene scene) {
        ((Pane)scene.getRoot()).getChildren().add(texture.getImageView());
    }
    
    public void move(double distanceX, double distanceY) {
        if(texture != null) {
            positionX += distanceX;
            positionY += distanceY;
            texture.getImageView().setLayoutX(texture.getImageView().getLayoutX() + distanceX);
            texture.getImageView().setLayoutY(texture.getImageView().getLayoutY() + distanceY);
        }
    }
}