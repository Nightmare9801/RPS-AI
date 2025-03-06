package ai.sps;

/**
 * Maintains the counts of the move sequences of the player to help in decision making
 */
public class Count {
    private static Move lastMove;

    private static int count[][];

    /**
     * Starts and initializes the counters
     */
    public static void start() {
        lastMove = null;

        count = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                count[i][j] = 0;
            }
        }
    }

    /**
     * Updates the counters with the current move of the player
     *
     * @param move Current move of the player
     */
    public static void update(Move move) {
        if (lastMove == null) {
            lastMove = move;
            return;
        }

        count[lastMove.t.i][move.t.i] += 1;

        lastMove = move;
    }

    /**
     * Returns the index of the most played move based on the last played move of the user
     *
     * @return The index of the most played move
     */
    public static int getMostPlayedMove() {

        if (lastMove == null) return -1;

        int x = count[lastMove.t.i][0];
        int y = count[lastMove.t.i][1];
        int z = count[lastMove.t.i][2];

        if (x >= y && x >= z) {
            return 0;
        } else if (y >= x && y >= z) {
            return 1;
        } else {
            return 2;
        }
    }

}
