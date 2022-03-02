package CloneGame;

import java.util.Random;

public class CompMove {

    public void make(GameTable gameTable) {
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
}
