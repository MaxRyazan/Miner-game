package CloneGame;

import java.util.Random;

import static CloneGame.Symbol.O;
import static CloneGame.Symbol.X;

public class CompMove {

    public void tacticMove(GameTable gameTable) {
        if (compMovePreventGamerWinByRows(gameTable)) {
            return;
        } else {
            if (compMovePreventGamerWinByCols(gameTable)) {
                return;
            } else {
                if (compMovePreventGamerWinByDiagonalOne(gameTable)) {
                    return;
                } else {
                    if (compMovePreventGamerWinByDiagonalTwo(gameTable)) {
                        return;
                    } else {
                        if (randomComputerMove(gameTable)) {
                            return;
                        }
                    }
                }
            }
        }
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
            if ((gameTable.getSymbol(new Square(i, 0)) == X) && (gameTable.getSymbol(new Square(i, 1)) == X) &&
                    gameTable.isEmpty(new Square(i, 2))) {
                gameTable.setSymbol(new Square(i, 2), O);
                return  true;
            } else {
                if ((gameTable.getSymbol(new Square(i, 0)) == X) && (gameTable.getSymbol(new Square(i, 2)) == X) &&
                        gameTable.isEmpty(new Square(i, 1))) {
                    gameTable.setSymbol(new Square(i, 1), O);
                    return  true;
                } else {
                    if ((gameTable.getSymbol(new Square(i, 1)) == X) && (gameTable.getSymbol(new Square(i, 2)) == X) &&
                            gameTable.isEmpty(new Square(i, 0))) {
                        gameTable.setSymbol(new Square(i, 0), O);
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
                if ((gameTable.getSymbol(new Square(0, j)) == X) && (gameTable.getSymbol(new Square(1, j)) == X) &&
                        gameTable.isEmpty(new Square(2, j))) {
                    gameTable.setSymbol(new Square(2, j), O);
                    return  true;
                } else {
                    if ((gameTable.getSymbol(new Square(0, j)) == X) && (gameTable.getSymbol(new Square(2, j)) == X) &&
                            gameTable.isEmpty(new Square(1, j))) {
                        gameTable.setSymbol(new Square(1, j), O);
                        return  true;
                    } else {
                        if ((gameTable.getSymbol(new Square(1, j)) == X) && (gameTable.getSymbol(new Square(2, j)) == X) &&
                                gameTable.isEmpty(new Square(0, j))) {
                            gameTable.setSymbol(new Square(0, j), O);
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
                if ((gameTable.getSymbol(new Square(0, 0)) == X) && (gameTable.getSymbol(new Square(1, 1)) == X) &&
                        gameTable.isEmpty(new Square(2, 2))) {
                    gameTable.setSymbol(new Square(2, 2), O);
                    return  true;
                } else {
                    if ((gameTable.getSymbol(new Square(0, 0)) == X) && (gameTable.getSymbol(new Square(2, 2)) == X) &&
                            gameTable.isEmpty(new Square(1, 1))) {
                        gameTable.setSymbol(new Square(1, 1), O);
                        return  true;
                    } else {
                        if ((gameTable.getSymbol(new Square(1, 1)) == X) && (gameTable.getSymbol(new Square(2, 2)) == X) &&
                                gameTable.isEmpty(new Square(0, 0))) {
                            gameTable.setSymbol(new Square(0, 0), O);
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
                if ((gameTable.getSymbol(new Square(2, 0)) == X) && (gameTable.getSymbol(new Square(1, 1)) == X) &&
                        gameTable.isEmpty(new Square(0, 2))) {
                    gameTable.setSymbol(new Square(0, 2), O);
                    return  true;
                } else {
                    if ((gameTable.getSymbol(new Square(2, 0)) == X) && (gameTable.getSymbol(new Square(0, 2)) == X) &&
                            gameTable.isEmpty(new Square(1, 1))) {
                        gameTable.setSymbol(new Square(1, 1), O);
                        return  true;
                    } else {
                        if ((gameTable.getSymbol(new Square(1, 1)) == X) && (gameTable.getSymbol(new Square(0, 2)) == X) &&
                                gameTable.isEmpty(new Square(2, 0))) {
                            gameTable.setSymbol(new Square(2, 0), O);
                            return  true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
