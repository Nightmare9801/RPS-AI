package ai.sps;

import java.util.Random;

/**
 * Markov Chain based AI to calculate optimal RPS moves based on user playing habits
 */
public class AI {

    /**
     * Calculates and returns the move based on previous knowledge using Markov Chains
     *
     * @return The move based on previous moves
     */
    public static Type getMove() {
        int x = Count.getMostPlayedMove();

        if (x == -1) {
            return Type.values()[new Random().nextInt(3)];
        }

        return Type.values()[getOpposite(x)];
    }

    /**
     * Returns the opposite index of the move entered
     *
     * @param x Index of the input move
     * @return Index of the opposite of the input move
     */
    public static int getOpposite(int x) {
        if (x == 0) return 1;
        if (x == 1) return 2;
        return 0;
    }
}
