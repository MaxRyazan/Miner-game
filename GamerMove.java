package CloneGame;

import java.util.Scanner;

import static CloneGame.Symbol.X;

public class GamerMove {
    private  final  SquareConverter squareConverter;

    public GamerMove(final SquareConverter squareConverter) {
        this.squareConverter = squareConverter;
    }

    public Square userMove() {
        while (true) {
        final String userNumber = new Scanner(System.in).nextLine();
        if (userNumber.length() == 1) {
            char userChar = userNumber.charAt(0);
            if (userChar >= '1' && userChar <= '9') {
            return squareConverter.toSquare(userChar);
                }
            } else System.out.println("Введены не корректные данные. Попробуйте еще раз");
        }
    }

    public void  printUserMove(final GameTable gameTable) {
        while (true) {
        final Square square = userMove();
        if(gameTable.isEmpty(square)) {
            gameTable.setSymbol(square, X);
            return;
        } else System.out.println("Эта клетка занята. Попробуйте другую.");
        }
    }
}