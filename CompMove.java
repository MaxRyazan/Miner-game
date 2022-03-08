package CloneGame;

import java.util.Random;

import static CloneGame.Symbol.O;
import static CloneGame.Symbol.X;

public class CompMove {

    GameTable gameTable;


    public boolean tacticMove(GameTable gameTable) {
    return    compMovePreventGamerWinByRows(gameTable) ||
              compMovePreventGamerWinByCols(gameTable)  ||
              compMovePreventGamerWinByDiagonalOne(gameTable) ||
              compMovePreventGamerWinByDiagonalTwo(gameTable) ||
              randomComputerMove(gameTable);

    }

    public boolean randomComputerMove(GameTable gameTable) {
        Random random = new Random();
        while (true) {
            final int row = random.nextInt(3);
            final int col = random.nextInt(3);

            Square randomSquare = new Square(row, col);


            if (gameTable.isEmpty(randomSquare)) {
                gameTable.setSymbol(randomSquare, O);
                return  true;
            }
        }
    }

    public boolean compMovePreventGamerWinByRows(GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
            if ((gameTable.getSymbol(i, 0) == X) && (gameTable.getSymbol(i, 1) == X) &&
                    gameTable.isEmpty(i, 2)) {
                gameTable.setSymbol(i, 2, O);
                return  true;
            } else {
                if ((gameTable.getSymbol(i, 0) == X) && (gameTable.getSymbol(i, 2) == X) &&
                        gameTable.isEmpty(i, 1)) {
                    gameTable.setSymbol(i, 1, O);
                    return  true;
                } else {
                    if ((gameTable.getSymbol(i, 1) == X) && (gameTable.getSymbol(i, 2) == X) &&
                            gameTable.isEmpty(i, 0)) {
                        gameTable.setSymbol(i, 0, O);
                        return  true;
                    }
                }
            }
        }
        return false;
    }

    public boolean compMovePreventGamerWinByCols(GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((gameTable.getSymbol(0, j) == X) && (gameTable.getSymbol(1, j) == X) &&
                        gameTable.isEmpty(2, j)) {
                    gameTable.setSymbol(2, j, O);
                    return  true;
                } else {
                    if ((gameTable.getSymbol(0, j) == X) && (gameTable.getSymbol(2, j) == X) &&
                            gameTable.isEmpty(1, j)) {
                        gameTable.setSymbol(1, j, O);
                        return  true;
                    } else {
                        if ((gameTable.getSymbol(1, j) == X) && (gameTable.getSymbol(2, j) == X) &&
                                gameTable.isEmpty(0, j)) {
                            gameTable.setSymbol(0, j, O);
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean compMovePreventGamerWinByDiagonalOne(GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((gameTable.getSymbol(0, 0) == X) && (gameTable.getSymbol(1, 1) == X) &&
                        gameTable.isEmpty(2, 2)) {
                    gameTable.setSymbol(2, 2, O);
                    return  true;
                } else {
                    if ((gameTable.getSymbol(0, 0) == X) && (gameTable.getSymbol(2, 2) == X) &&
                            gameTable.isEmpty(1, 1)) {
                        gameTable.setSymbol(1, 1, O);
                        return  true;
                    } else {
                        if ((gameTable.getSymbol(1, 1) == X) && (gameTable.getSymbol(2, 2) == X) &&
                                gameTable.isEmpty(0, 0)) {
                            gameTable.setSymbol(0, 0, O);
                            return  true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean compMovePreventGamerWinByDiagonalTwo(GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((gameTable.getSymbol(2, 0) == X) && (gameTable.getSymbol(1, 1) == X) &&
                        gameTable.isEmpty(0, 2)) {
                    gameTable.setSymbol(0, 2, O);
                    return  true;
                } else {
                    if ((gameTable.getSymbol(2, 0) == X) && (gameTable.getSymbol(0, 2) == X) &&
                            gameTable.isEmpty(1, 1)) {
                        gameTable.setSymbol(1, 1, O);
                        return  true;
                    } else {
                        if ((gameTable.getSymbol(1, 1) == X) && (gameTable.getSymbol(0, 2) == X) &&
                                gameTable.isEmpty(2, 0)) {
                            gameTable.setSymbol(2, 0, O);
                            return  true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
