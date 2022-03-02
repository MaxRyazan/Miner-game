package CloneGame;

public class DrowCheckModul {
    public boolean drowCheck(GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameTable.isEmpty(new Square(i, j))) {
                    return false;
                }
            }
        }
        return true;
    }
}
