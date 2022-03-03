package CloneGame;

import java.util.Random;

public class CompMove {

    public void randomComputerMove(GameTable gameTable) {
        Random random = new Random();
        while (true) {
            final int row = random.nextInt(3);
            final int col = random.nextInt(3);

            Square randomSquare = new Square(row, col);

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (gameTable.isEmpty(randomSquare)) {
                        gameTable.setSymbol(randomSquare, 'O');
                        return;
                    }
                }
            }
        }
    }

    public void compMovePreventGamerWinByRows(GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
            if ((gameTable.getSymbol(new Square(i, 0)) == 'X') && (gameTable.getSymbol(new Square(i, 1)) == 'X') &&
                    gameTable.isEmpty(new Square(i, 2))) {
                gameTable.setSymbol(new Square(i, 2), 'O');
            } else {
                if ((gameTable.getSymbol(new Square(i, 0)) == 'X') && (gameTable.getSymbol(new Square(i, 2)) == 'X') &&
                        gameTable.isEmpty(new Square(i, 1))) {
                    gameTable.setSymbol(new Square(i, 1), 'O');
                } else {
                    if ((gameTable.getSymbol(new Square(i, 1)) == 'X') && (gameTable.getSymbol(new Square(i, 2)) == 'X') &&
                            gameTable.isEmpty(new Square(i, 0))) {
                        gameTable.setSymbol(new Square(i, 0), 'O');
                    }
                }
            }
        }
    }

    public void compMovePreventGamerWinByCols(GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((gameTable.getSymbol(new Square(0, j)) == 'X') && (gameTable.getSymbol(new Square(1, j)) == 'X') &&
                        gameTable.isEmpty(new Square(2, j))) {
                    gameTable.setSymbol(new Square(2, j), 'O');
                } else {
                    if ((gameTable.getSymbol(new Square(0, j)) == 'X') && (gameTable.getSymbol(new Square(2, j)) == 'X') &&
                            gameTable.isEmpty(new Square(1, j))) {
                        gameTable.setSymbol(new Square(1, j), 'O');
                    } else {
                        if ((gameTable.getSymbol(new Square(1, j)) == 'X') && (gameTable.getSymbol(new Square(2, j)) == 'X') &&
                                gameTable.isEmpty(new Square(0, j))) {
                            gameTable.setSymbol(new Square(0, j), 'O');
                        }
                    }
                }
            }
        }
    }

    public void compMovePreventGamerWinByDiagonalOne(GameTable gameTable) {
                if ((gameTable.getSymbol(new Square(0, 0)) == 'X') && (gameTable.getSymbol(new Square(1, 1)) == 'X') &&
                        gameTable.isEmpty(new Square(2, 2))) {
                    gameTable.setSymbol(new Square(2, 2), 'O');
                } else {
                    if ((gameTable.getSymbol(new Square(0, 0)) == 'X') && (gameTable.getSymbol(new Square(2, 2)) == 'X') &&
                            gameTable.isEmpty(new Square(1, 1))) {
                        gameTable.setSymbol(new Square(1, 1), 'O');
                    } else {
                        if ((gameTable.getSymbol(new Square(1, 1)) == 'X') && (gameTable.getSymbol(new Square(2, 2)) == 'X') &&
                                gameTable.isEmpty(new Square(0, 0))) {
                            gameTable.setSymbol(new Square(0, 0), 'O');
                        }
            }
        }
    }

    public void compMovePreventGamerWinByDiagonalTwo(GameTable gameTable) {
        if ((gameTable.getSymbol(new Square(2, 0)) == 'X') && (gameTable.getSymbol(new Square(1, 1)) == 'X') &&
                gameTable.isEmpty(new Square(0, 2))) {
            gameTable.setSymbol(new Square(0, 2), 'O');
        } else {
            if ((gameTable.getSymbol(new Square(2, 0)) == 'X') && (gameTable.getSymbol(new Square(0, 2)) == 'X') &&
                    gameTable.isEmpty(new Square(1, 1))) {
                gameTable.setSymbol(new Square(1, 1), 'O');
            } else {
                if ((gameTable.getSymbol(new Square(1, 1)) == 'X') && (gameTable.getSymbol(new Square(0, 2)) == 'X') &&
                        gameTable.isEmpty(new Square(2, 0))) {
                    gameTable.setSymbol(new Square(2, 0), 'O');
                }
            }
        }
    }




}
