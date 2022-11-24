package game;

public class Commands {
    private static boolean menuOk;
    private static boolean menuReturn;
    private static boolean menuUp;
    private static boolean menuDown;
    private static boolean playerRight;
    private static boolean playerLeft;
    private static boolean playerJump;
    private static boolean playerDrop;
    private static boolean playerBubble;

    public static boolean isMenuOk() {
        return menuOk;
    }

    public static boolean isMenuReturn() {
        return menuReturn;
    }

    public static boolean isMenuUp() {
        return menuUp;
    }

    public static boolean isMenuDown() {
        return menuDown;
    }

    public static boolean isPlayerRight() {
        return playerRight;
    }

    public static boolean isPlayerLeft() {
        return playerLeft;
    }

    public static boolean isPlayerJump() {
        return playerJump;
    }

    public static boolean isPlayerDrop() {
        return playerDrop;
    }
    
    public static boolean isPlayerBubble() {
        return playerBubble;
    }

    public static void setMenuOk(boolean menuOk) {
        Commands.menuOk = menuOk;
    }

    public static void setMenuReturn(boolean menuReturn) {
        Commands.menuReturn = menuReturn;
    }

    public static void setMenuUp(boolean menuUp) {
        Commands.menuUp = menuUp;
    }

    public static void setMenuDown(boolean menuDown) {
        Commands.menuDown = menuDown;
    }

    public static void setPlayerRight(boolean playerRight) {
        Commands.playerRight = playerRight;
    }

    public static void setPlayerLeft(boolean playerLeft) {
        Commands.playerLeft = playerLeft;
    }

    public static void setPlayerJump(boolean playerJump) {
        Commands.playerJump = playerJump;
    }

    public static void setPlayerDrop(boolean playerDrop) {
        Commands.playerDrop = playerDrop;
    }
    
    public static void setPlayerBubble(boolean playerBubble) {
        Commands.playerBubble = playerBubble;
    }
}