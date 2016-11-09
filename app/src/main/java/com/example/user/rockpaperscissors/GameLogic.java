package com.example.user.rockpaperscissors;

import android.support.v4.content.res.TypedArrayUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.*;

/**
 * Created by user on 09/11/2016.
 */

public class GameLogic {

//    private enum Hands {
//        ROCK("ROCK"),
//        PAPER("PAPER"),
//        SCISSORS("SCISSORS");
//
//        String title;
//
//        Hands( String string ) {
//            this.title = string;
//        }
//
//        String getTitle() {
//            return this.title;
//        }
//    }

    private static final LinkedHashMap<String, String[]> WIN_AGAINST;
    static {
        WIN_AGAINST = new LinkedHashMap<>();
        String[] rockWins = {"SCISSORS", "LIZARD"};
        String[] paperWins = {"ROCK", "SPOCK"};
        String[] scissorsWins = {"PAPER", "LIZARD"};
        String[] spockWins = {"SCISSORS", "ROCK"};
        String[] lizardWins = {"PAPER", "SPOCK"};

        WIN_AGAINST.put( "ROCK", rockWins );
        WIN_AGAINST.put( "PAPER", paperWins );
        WIN_AGAINST.put( "SCISSORS", scissorsWins );
        WIN_AGAINST.put( "SPOCK", spockWins);
        WIN_AGAINST.put( "LIZARD", lizardWins);
    }

    public static int getWinner(String hand1, String hand2){
        if (hand1.equals(hand2)){
            return 0;
        }
        String[] hand1Beats = WIN_AGAINST.get(hand1);

        if (GameLogic.arrayContains(hand1Beats, hand2)){
            return 1;
        }
        return 2;
    }

    private static boolean arrayContains(String[] array, String searchString){
        for (String string : array){
            if (searchString.equals(string)){
                return true;
            }
        }
        return false;
    }

    public static String getRandomHand( boolean extended ) {

        Object[] options = WIN_AGAINST.keySet().toArray();

        Random rand = new Random();
        int maxIndex = extended ? 5 : 3;
        int randIndex = rand.nextInt( maxIndex );

        String result = (String) options[randIndex];

        return result;
    }
}