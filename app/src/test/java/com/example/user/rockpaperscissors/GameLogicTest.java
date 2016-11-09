package com.example.user.rockpaperscissors;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by user on 09/11/2016.
 */

public class GameLogicTest {

    @Test
    public void rockBeatsScissors() {
        assertEquals(1, GameLogic.getWinner("ROCK", "SCISSORS"));
    }

    @Test
    public void scissorsLosesToRock() {
        assertEquals(2, GameLogic.getWinner("SCISSORS", "ROCK"));
    }

    @Test
    public void paperDrawsPaper() {
        assertEquals(0, GameLogic.getWinner("PAPER", "PAPER"));
    }

    @Test
    public void spockDrawsSpock() {
        assertEquals(0, GameLogic.getWinner("SPOCK", "SPOCK"));
    }

    @Test
    public void lizardBeatsPaper() {
        assertEquals(1, GameLogic.getWinner("LIZARD", "PAPER"));
    }

    @Test
    public void paperLosesToLizard(){
        assertEquals(2, GameLogic.getWinner("PAPER", "LIZARD"));
    }
}
