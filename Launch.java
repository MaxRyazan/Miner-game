package CloneGame;

public class Launch {
    public static void main(String[] args) {
        Game game = new Game(new GameTable(), new GamerMove(), new CompMove(), new WinCheckModul(), new DrowCheckModul());
        game.play();
    }
}
