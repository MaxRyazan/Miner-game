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

    public Symbol getSymbol(Square square) {
        return map[square.getRow()][square.getCol()];
    }

    public Symbol setSymbol(Square square, final Symbol symbol) {
        return map[square.getRow()][square.getCol()] = symbol;
    }



    public void printGameMapOnce() {
        System.out.println("Ваша игровая карта:");
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + squareConverter.toNumber(new Square(i, j)) + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
        System.out.println("Пользователь ставит крестик, а компьютер играет ноликами");
        System.out.println("************************************");
        System.out.println("Начинайте!");
    }


    public void printGameMapRefresh(final  GameTable gameTable){
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + gameTable.getSymbol(new Square(i, j)) + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }
}
