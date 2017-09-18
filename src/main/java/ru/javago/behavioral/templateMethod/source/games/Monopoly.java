package ru.javago.behavioral.templateMethod.source.games;

import ru.javago.behavioral.templateMethod.source.base.Game;

public class Monopoly extends Game {
    @Override
    protected void initializeGame() {
        System.out.println("Initializing monopoly game!");
    }

    @Override
    protected void playGame() {
        System.out.println("Playing monopoly game!");
    }

    @Override
    protected void endGame() {
        System.out.println("Ending monopoly game");
    }

    @Override
    protected void printWinner() {
        System.out.println("Winner of monopoly game!");
    }
}
