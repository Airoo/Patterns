package ru.javago.behavioral.templateMethod.source;

import ru.javago.behavioral.templateMethod.source.base.Game;
import ru.javago.behavioral.templateMethod.source.base.GameCode;
import ru.javago.behavioral.templateMethod.source.games.Chess;
import ru.javago.behavioral.templateMethod.source.games.Monopoly;

public class Main {

    public static void main(String[] args) {
        final GameCode gameCode = GameCode.CHESS;

        Game game;

        switch (gameCode) {
            case CHESS:
                game = new Chess();
                break;
            case MONOPOLY:
                game = new Monopoly();
                break;
            default:
                throw new IllegalStateException();
        }

        game.playOneGame(2);
    }
}
