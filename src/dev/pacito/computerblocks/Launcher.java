package dev.pacito.computerblocks;

public class Launcher {

    public static Game game;

    public static void main(String[] args) {
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓ Pacito: Computer Blocks » Alpha v0.01 ▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓ -- Joshua Briant and Liam Brennen --  ▓▓▓▓▓▓▓▓▓▓▓▓");
        game = new Game("Computer Blocks", 1280, 720);
        game.start();
    }

}
