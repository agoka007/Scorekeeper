package com.example.android.soccer;

import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int redCardTeamA = 0;
    int redCardTeamB = 0;
    int yellowCardTeamA = 0;
    int yellowCardTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Add one to Team A score.
     */
    public void addScoreToTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamA_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add one to Team B score.
     */

    public void addScoreToTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamB_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add one yellow card to Team A.
     */


    public void addYellowCardToTeamA(View v) {
        yellowCardTeamA = yellowCardTeamA + 1;
        displayYellowCardForTeamA(yellowCardTeamA);
    }

    /**
     * Displays the given yellow card for Team A.
     */

    public void displayYellowCardForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamA_yellow_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add one yellow card to Team B.
     */

    public void addYellowCardToTeamB(View v) {
        yellowCardTeamB = yellowCardTeamB + 1;
        displayYellowCardForTeamB(yellowCardTeamB);
    }

    /**
     * Displays the given yellow card for Team B.
     */

    public void displayYellowCardForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamB_yellow_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add one red card to Team A.
     */

    public void addRedCardToTeamA(View v) {
        redCardTeamA = redCardTeamA + 1;
        displayRedCardForTeamA(redCardTeamA);
    }

    /**
     * Displays the given red card for Team A.
     */

    public void displayRedCardForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamA_red_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add one red card to Team B.
     */

    public void addRedCardToTeamB(View v) {
        redCardTeamB = redCardTeamB + 1;
        displayRedCardForTeamB(redCardTeamB);
    }

    /**
     * Displays the given red card for Team A.
     */

    public void displayRedCardForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamB_red_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset everithing to 0.
     */

    public void resetResult(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        redCardTeamA = 0;
        redCardTeamB = 0;
        yellowCardTeamA = 0;
        yellowCardTeamB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
        displayRedCardForTeamA(0);
        displayRedCardForTeamB(0);
        displayYellowCardForTeamA(0);
        displayYellowCardForTeamB(0);
    }

}