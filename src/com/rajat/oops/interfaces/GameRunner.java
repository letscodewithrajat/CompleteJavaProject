package com.rajat.oops.interfaces;

/**
 * @author rajatsrivastava
 **/
public class GameRunner {
    public static void main(String[] args) {
        GamingConsole[] games = {new MarioGame(), new ChessGame()};
        // GamingConsole game = new ChessGame();
        for (GamingConsole game : games) {
            game.up();
            game.down();
            game.left();
            game.right();
        }
    }
}
