package CloneGame;


public class Game {

    private final GameTable gameTable;
    private final GamerMove gamerMove;
    private final CompMove compMove;
    private final  WinCheckModul winCheckModul;
    private final DrowCheckModul drowCheckModul;

    public Game(final GameTable gameTable,
                final GamerMove gamerMove,
                final CompMove compMove,
                final WinCheckModul winCheckModul,
                final DrowCheckModul drowCheckModul) {
        this.gameTable = gameTable;
        this.gamerMove = gamerMove;
        this.compMove = compMove;
        this.winCheckModul=winCheckModul;
        this.drowCheckModul=drowCheckModul;
    }

    public void play() {
       gameTable.printGameMapOnce();

while(true) {
    gamerMove.printUserMove(gameTable);
    gameTable.printGameMapRefresh(gameTable);
    if(winCheckModul.gamerWin(gameTable)) {
      System.out.println("Игрок выиграл!");
      System.out.println("GAME OVER");
      break;
  }
    if(drowCheckModul.drowCheck(gameTable)){
        System.out.println("НИЧЬЯ!");
        System.out.println("GAME OVER");
        break;
    }
    compMove.compMovePreventGamerWinByCols(gameTable);
    compMove.compMovePreventGamerWinByRows(gameTable);
    compMove.compMovePreventGamerWinByDiagonalOne(gameTable);
    compMove.compMovePreventGamerWinByDiagonalTwo(gameTable);
    compMove.randomComputerMove(gameTable);
    gameTable.printGameMapRefresh(gameTable);
    if(winCheckModul.compWin(gameTable)){
        System.out.println("Компьютер выиграл!");
        System.out.println("GAME OVER");
        break;
    }
    if(drowCheckModul.drowCheck(gameTable)){
        System.out.println("НИЧЬЯ!");
        System.out.println("GAME OVER");
        break;
    }
}
    }
}
