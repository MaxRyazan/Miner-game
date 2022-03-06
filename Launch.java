package CloneGame;

public class Launch {
    public static void main(String[] args) {
        final  SquareConverter squareConverter = new SquareConverter();
        Game game = new Game(
                new GameTable(squareConverter),
                new GamerMove(squareConverter),
                new CompMove(),
                new WinCheckModul(),
                new DrowCheckModul()
        );

        game.play();
    }
}
