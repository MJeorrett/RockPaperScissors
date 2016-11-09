package com.example.user.rockpaperscissors;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 09/11/2016.
 */

public class GameLogic {

    enum Hand {
        ROCK,
        PAPER,
        SCISSORS
    }

    private static final HashMap<Hand, Hand> WIN_AGAINST;
    static {
        WIN_AGAINST = new HashMap<>();
        WIN_AGAINST.put( Hand.ROCK, Hand.SCISSORS );
        WIN_AGAINST.put( Hand.PAPER, Hand.ROCK );
        WIN_AGAINST.put( Hand.SCISSORS, Hand.PAPER );
    }
}

