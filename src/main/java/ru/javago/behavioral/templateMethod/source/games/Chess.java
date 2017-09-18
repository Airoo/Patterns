package ru.javago.behavioral.templateMethod.source.games;

import ru.javago.behavioral.templateMethod.source.base.Game;

public class Chess extends Game {
    @Override
    protected void initializeGame() {
        System.out.println("Initializing chess game!");
    }

    @Override
    protected void playGame() {
        System.out.println("Playing chess game!");
    }

    @Override
    protected void endGame() {
        System.out.println("Ending chess game");
    }

    @Override
    protected void printWinner() {
        System.out.println("Winner of chess game!");
    }
}
