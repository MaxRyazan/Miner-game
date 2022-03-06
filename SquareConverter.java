package CloneGame;

public class SquareConverter {

    char[][] tempMap = {
            {'7', '8', '9'},
            {'4', '5', '6'},
            {'1', '2', '3'},
    };

    public Square toSquare(final char ch) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tempMap[i][j] == ch) {
                    return new Square(i, j);
                }
            }
        }
        return null;
    }

    public char toNumber(final Square square) {
      return   tempMap[square.getRow()][square.getCol()];
    }
}

