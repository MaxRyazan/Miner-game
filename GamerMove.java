package CloneGame;

import java.util.Scanner;

public class GamerMove {

    char[][] tempMap = {
            {'7', '8', '9'},
            {'4', '5', '6'},
            {'1', '2', '3'},
    };


    public Square userMove() {
        while (true) {
        final String userNumber = new Scanner(System.in).nextLine();
        if (userNumber.length() == 1) {
            char userChar = userNumber.charAt(0);
            if (userChar >= '1' && userChar <= '9') {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (tempMap[i][j] == userChar) {
                            return new Square(i, j);
                        }
                    }
                }
                }
            } else System.out.println("Введены не корректные данные. Попробуйте еще раз");
        }
    }

    public void  printUserMove(final GameTable gameTable) {
        while (true) {
        final Square square = userMove();
        if(gameTable.isEmpty(square)) {
            gameTable.setSymbol(square, 'X');
            return;
        } else System.out.println("Эта клетка занята. Попробуйте другую.");
        }
    }
}