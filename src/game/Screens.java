package game;

public class Screens {
    private static boolean screenLoaded;
    private static boolean mainScreen;
    private static boolean save1Screen;
    private static boolean save2Screen;
    private static boolean save3Screen;
    private static boolean gameScreen;
    private static boolean pauseGame;

    public static void setAllFalse() {
        screenLoaded = false;
        mainScreen = false;
        save1Screen = false;
        save2Screen = false;
        save3Screen = false;
        gameScreen = false;
        pauseGame = false;
    }

    public static boolean isScreenLoaded() {
        return screenLoaded;
    }
    
    public static boolean isMainScreen() {
        return mainScreen;
    }

    public static boolean isSave1Screen() {
        return save1Screen;
    }

    public static boolean isSave2Screen() {
        return save2Screen;
    }

    public static boolean isSave3Screen() {
        return save3Screen;
    }

    public static boolean isGameScreen() {
        return gameScreen;
    }
    
    public static boolean isPauseGame() {
        return pauseGame;
    }
    
    public static void setScreenLoaded() {
        screenLoaded = true;
    }
    
    public static void loadMainScreen() {
        setAllFalse();
        mainScreen = true;
    }

    public static void loadSave1Screen() {
        setAllFalse();
        save1Screen = true;
    }
    
    public static void loadSave2Screen() {
        setAllFalse();
        save2Screen = true;
    }
    
    public static void loadSave3Screen() {
        setAllFalse();
        save3Screen = true;
    }
    
    public static void loadGameScreen() {
        setAllFalse();
        gameScreen = true;
    }
    
    public static void loadPauseGame() {
        setAllFalse();
        pauseGame = true;
    }
}