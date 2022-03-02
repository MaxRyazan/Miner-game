package CloneGame;


public class GameTable {

    char[][] map = {


            {' ',' ',' '},
            {' ',' ',' '},
            {' ',' ',' '},
    };

    public boolean isEmpty(Square square) {
        return map[square.getRow()][square.getCol()] ==' ';
    }

    public char getSymbol(Square square) {
        return map[square.getRow()][square.getCol()];
    }

    public char setSymbol(Square square, final char symbol) {
        return map[square.getRow()][square.getCol()] = symbol;
    }


    public void printGameMapOnce() {
        System.out.println("Ваша игровая карта:");
        System.out.println("| 7 | 8 | 9 |");
        System.out.println("-------------");
        System.out.println("| 4 | 5 | 6 |");
        System.out.println("-------------");
        System.out.println("| 1 | 2 | 3 |");
        System.out.println("Пользователь ставит крестик, а компьютер играет ноликами");
        System.out.println("************************************");
        System.out.println("Начитайте!");
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
