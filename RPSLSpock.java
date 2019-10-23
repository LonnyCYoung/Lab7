package edu.cscc;
import java.util.Random;

/**
 * Rock, Paper, Scissors, Lizard, Spock class.
 * @author Lonny Young
 */

public class RPSLSpock {

    static Random rand = new Random(System.currentTimeMillis());

    public static final String ROCK = "rock";
    public static final String PAPER = "paper";
    public static final String SCISSORS = "scissors";
    public static final String LIZARD = "lizard";
    public static final String SPOCK = "spock";

    public static boolean isValidPick(String pick) {
        if (pick == null) {
            return false;

            /**
             * @param isValidPick is the name of the method during which the human player picks one of the five options.
             */

            /**
             * @return false This returns a false for the boolean check that declares an invalid selection in the case of a null entry.
             */

        }
        pick = pick.trim();
        return (ROCK.equalsIgnoreCase(pick) ||
                PAPER.equalsIgnoreCase(pick) ||
                SCISSORS.equalsIgnoreCase(pick) ||
                LIZARD.equalsIgnoreCase(pick) ||
                SPOCK.equalsIgnoreCase(pick));

        /**
         * @return ROCK is the choice rock - case is ignored.
         * @return PAPER is the choice paper - case is ignored.
         * @return SCISSORS is the choice scissors - case is ignored.
         * @return LIZARD is the choice lizard - case is ignored.
         * @return SPOCK is the choice spock - case is ignored.
         */

    }

    public static String generatePick() {
        String pick = null;
        switch (rand.nextInt(5)) {
            case 0:
                pick = ROCK;
                break;
            case 1:
                pick = PAPER;
                break;
            case 2:
                pick = SCISSORS;
                break;
            case 3:
                pick = LIZARD;
                break;
            case 4:
                pick = SPOCK;
                break;

            /**
             * @param generatePick is the name of the method that generates a pick for the computer.
             */

        }
        return pick;

        /**
         * @return pick returns the choice of the computer from the five possible options.
         */

    }

    public static boolean isComputerWin(String c_pick,String h_pick) {
        h_pick = h_pick.toLowerCase();
        return ((ROCK.equals(c_pick) && (SCISSORS.equals(h_pick) || LIZARD.equals(h_pick))) ||
                (PAPER.equals(c_pick) && (ROCK.equals(h_pick) || SPOCK.equals(h_pick))) ||
                (SCISSORS.equals(c_pick) && (PAPER.equals(h_pick) || LIZARD.equals(h_pick))) ||
                (LIZARD.equals(c_pick) && (PAPER.equals(h_pick) || SPOCK.equals(h_pick))) ||
                (SPOCK.equals(c_pick) && (ROCK.equals(h_pick) || SCISSORS.equals(h_pick))));

        /**
         * @param isComputerWin lists all of the win conditions for given picks.
         */

        /**
         * @return ROCK beats SCISSORS and LIZARD
         * @return PAPER beats ROCK and SPOCK
         * @return SCISSORS beats PAPER and LIZARD
         * @return LIZARD beats PAPER and SPOCK
         * @return SPOCK beats ROCK and SCISSORS
         */

    }
}