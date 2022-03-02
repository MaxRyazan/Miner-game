package CloneGame;

public class WinCheckModul {

    public boolean gamerWin(final GameTable gameTable) {
        return winCheck(gameTable, 'X');
    }

    public boolean compWin(final GameTable gameTable) {
        return winCheck(gameTable, 'O');
    }


    private boolean winCheck(final GameTable gameTable, final char symbol) {
    return  winCheckByCols(gameTable , symbol) ||
               winCheckByRows(gameTable , symbol) ||
                  winCheckByDiagonalOne(gameTable , symbol)  ||
                     winCheckByDiagonalTwo(gameTable , symbol);
    }

    private boolean winCheckByRows(GameTable gameTable, final char symbol) {
        for (int i = 0; i < 3; i++) {
            if (gameTable.getSymbol(new Square(i, 0)) == gameTable.getSymbol(new Square(i, 1)) &&
                    gameTable.getSymbol(new Square(i, 1)) == gameTable.getSymbol(new Square(i, 2)) &&
                    gameTable.getSymbol(new Square(i, 2)) == symbol) {
            return true;
        }
    }
        return false;
    }

    private boolean winCheckByCols(GameTable gameTable, final char symbol) {
        for (int i = 0; i < 3; i++) {
                if (gameTable.getSymbol(new Square(0, i)) == gameTable.getSymbol(new Square(1, i)) &&
                        gameTable.getSymbol(new Square(1, i)) == gameTable.getSymbol(new Square(2, i)) &&
                        gameTable.getSymbol(new Square(2, i)) == symbol) {
                    return true;
                }
        }
        return false;
    }

    private boolean winCheckByDiagonalOne(GameTable gameTable, final char symbol) {

        return gameTable.getSymbol(new Square(0, 0)) == gameTable.getSymbol(new Square(1, 1)) &&
                gameTable.getSymbol(new Square(1, 1)) == gameTable.getSymbol(new Square(2, 2)) &&
                gameTable.getSymbol(new Square(2, 2)) == symbol;

    }

    private boolean winCheckByDiagonalTwo(GameTable gameTable, final char symbol) {

       return gameTable.getSymbol(new Square(0, 2)) == gameTable.getSymbol(new Square(1, 1)) &&
               gameTable.getSymbol(new Square(1, 1)) == gameTable.getSymbol(new Square(2, 0)) &&
                gameTable.getSymbol(new Square(2, 0)) == symbol ;
    }
}
