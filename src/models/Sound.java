package models;

import java.io.File;
import javafx.scene.media.AudioClip;

public class Sound {
    private AudioClip audioClip;

    public Sound(String url) {
        File file = new File(url);
        audioClip = new AudioClip(file.toURI().toString());
    }
    
    public void play(Boolean isStacked) {
        if(isStacked) {
            audioClip.play();
        } else {
            if(!audioClip.isPlaying()) {
                audioClip.isPlaying();
            }
        }
    }
    
    public void stop() {
        audioClip.stop();
    }
}