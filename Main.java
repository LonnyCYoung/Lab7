package edu.cscc;
import java.util.Scanner;

/*
Lonny Young
10-21-2019
Lab 7 is designed to allow us to test the RPSLS game using junit.
https://github.com/LonnyCYoung/Lab7
*/

/**
 * Main class for the Rock, Paper, Scissors, Lizard, Spock game.
 * @author Lonny Young
 */

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String h_pick;
        String c_pick;
        String answer;
        boolean isValid;

    /**
     * @param h_pick The player's pick.
     * @param c_pick The computer's pick.
     * @param answer This is announces the victor of the round.
     * @param isValid This checks to make sure that the player's pick is a valid pick.  A valid pick must be spelled correctly and be one of the choices presented.
     */

        do {
            System.out.println("Let's play rock, paper, scissors, lizard, spock");
            do {
                System.out.print("Enter your choice: ");
                h_pick = input.nextLine();
                isValid = RPSLSpock.isValidPick(h_pick);
                if (!isValid) {
                    System.out.println(h_pick + " is not a valid choice");
                }
            } while (!isValid);

            c_pick = RPSLSpock.generatePick();
            System.out.print("Computer picked " + c_pick + "  ");

            if (c_pick.equalsIgnoreCase(h_pick)) {
                System.out.println("Tie!");
            } else if (RPSLSpock.isComputerWin(c_pick, h_pick)) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }

            System.out.print("Play again ('y' or 'n'): ");
            answer = input.nextLine();
        } while ("Y".equalsIgnoreCase(answer));
        System.out.println("Live long and prosper!");
    }
}