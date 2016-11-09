package com.example.user.rockpaperscissors;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 09/11/2016.
 */

public class SpicyActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mRockButton;
    private Button mPaperButton;
    private Button mScissorsButton;
    private Button mSpockButton;
    private Button mLizardButton;
    private TextView mWinnerTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_spicy);

        mRockButton = (Button) findViewById( R.id.ROCK );
        mPaperButton = (Button) findViewById( R.id.PAPER );
        mScissorsButton = (Button) findViewById( R.id.SCISSORS );
        mSpockButton = (Button) findViewById( R.id.SPOCK );
        mLizardButton = (Button) findViewById( R.id.LIZARD );
        mWinnerTextView = (TextView) findViewById( R.id.winner_text_view );

        mRockButton.setOnClickListener( this );
        mPaperButton.setOnClickListener( this );
        mScissorsButton.setOnClickListener( this );
        mSpockButton.setOnClickListener( this );
        mLizardButton.setOnClickListener( this );
    }


    @Override
    public void onClick(View view) {

        Button button = (Button) view;

        String playerHand = button.getText().toString();
        String computerHand = GameLogic.getRandomHand();

        int winner = GameLogic.getWinner( playerHand, computerHand );

        String winnerString = "Your hand: " + playerHand + "\n";
        winnerString += "Computer hand: " + computerHand + "\n";

        switch (winner) {
            case 0: winnerString += "Its a DRAW";
                break;
            case 1: winnerString += "You WON";
                break;
            case 2: winnerString += "You LOSE!!!";
                break;
        }

        mWinnerTextView.setText( winnerString );
    }
}
