package CloneGame;


import static CloneGame.Symbol.EMPTY;

public class GameTable {

    private  final  SquareConverter squareConverter;


    public GameTable(final SquareConverter squareConverter) {
        this.squareConverter = squareConverter;
    }

    Symbol [][] map = {
                    {EMPTY,EMPTY,EMPTY},
                    {EMPTY,EMPTY,EMPTY},
                    {EMPTY,EMPTY,EMPTY},
    };

    public boolean isEmpty(Square square) {
        return map[square.getRow()][square.getCol()] == EMPTY;
    }

    public boolean isEmpty(int i, int j) {
        return map[i][j] == EMPTY;
    }

    public Symbol getSymbol(Square square) {
        return map[square.getRow()][square.getCol()];
    }

    public Symbol getSymbol(int i, int j) {
        return map[i][j];
    }


    public void setSymbol(Square square, final Symbol symbol) {
        map[square.getRow()][square.getCol()] = symbol;
    }

    public void setSymbol(int i, int j, final Symbol symbol) {
        map[i][j] = symbol;
    }



    public void printGameMapOnce() {
        System.out.println("Ваша игровая карта:");

            print((i, j) -> String.valueOf(squareConverter.toNumber(new Square(i, j)))) ;

        System.out.println("-------------");
        System.out.println("Пользователь ставит крестик, а компьютер играет ноликами");
        System.out.println("************************************");
        System.out.println("Начинайте!");
    }


    public void printGameMapRefresh(final  GameTable gameTable){


        print((i, j) -> String.valueOf(gameTable.getSymbol(new Square(i, j)))) ;
    }


    public void print(final Lambda lambda){
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + lambda.getValue(i , j) + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }


private interface  Lambda {
        String getValue(int i, int j);
}
}
