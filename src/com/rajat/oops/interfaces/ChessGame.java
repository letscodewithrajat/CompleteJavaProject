package com.rajat.oops.interfaces;

/**
 * @author rajatsrivastava
 **/
public class ChessGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Move piece up");
    }

    @Override
    public void down() {
        System.out.println("Move piece down");
    }

    @Override
    public void left() {
        System.out.println("move piece left");
    }

    @Override
    public void right() {
        System.out.println("move piece right");
    }

    
}
