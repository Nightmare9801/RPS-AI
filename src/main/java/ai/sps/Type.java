package ai.sps;

/**
 * RPS Options
 */
public enum Type {
    ROCK(0),
    PAPER(1),
    SCISSORS(2);

    public int i = -1;

    Type(int i) {
        this.i = i;
    }

    public int getIDX() {
        return this.i;
    }
}
