package edu.cscc;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class RPSLSpockTest {
    public static final String ROCK = "rock";
    public static final String PAPER = "paper";
    public static final String SCISSORS = "scissors";
    public static final String LIZARD = "lizard";
    public static final String SPOCK = "spock";


    @Test
    void isValidPick() {
        boolean isValidPick = true;
            assertNull(ROCK);
            assertNull(PAPER);
            assertNull(SCISSORS);
            assertNull(LIZARD);
            assertNull(SPOCK);
    }

    @Test
    void generatePick() {
        String generatePick;
            assertNull(ROCK);
            assertNull(PAPER);
            assertNull(SCISSORS);
            assertNull(LIZARD);
            assertNull(SPOCK);
    }

    @Test
    void isComputerWin(String c_pick,String h_pick) {
        boolean isComputerWin = true;
            assertTrue(c_pick.equals(ROCK) && h_pick.equals(SCISSORS));
            assertTrue(c_pick.equals(PAPER) && (h_pick.equals(ROCK)));
            assertTrue(c_pick.equals(SCISSORS) && (h_pick.equals(PAPER)));
            assertTrue(c_pick.equals(LIZARD) && (h_pick.equals(PAPER)));
            assertTrue(c_pick.equals(SPOCK) && (h_pick.equals(ROCK)));
            assertTrue(c_pick.equals(ROCK) && (h_pick.equals(LIZARD)));
            assertTrue(c_pick.equals(PAPER) && (h_pick.equals(SPOCK)));
            assertTrue(c_pick.equals(SCISSORS) && (h_pick.equals(LIZARD)));
            assertTrue(c_pick.equals(LIZARD) && (h_pick.equals(SPOCK)));
            assertTrue(c_pick.equals(SPOCK) && (h_pick.equals(SCISSORS)));
            assertFalse(c_pick.equals(SPOCK) && (h_pick.equals(PAPER)));
    }
}