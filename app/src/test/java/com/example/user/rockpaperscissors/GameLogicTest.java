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
    public void canDraw() {
        assertEquals(0, GameLogic.getWinner("PAPER", "PAPER"));
    }


}
