package CloneGame;

public  enum Symbol {
    X,

    O,

    EMPTY;

    @Override
    public String toString() {
        if (this == EMPTY) {
            return " ";
        }
        else  return  name();
    }
}
