package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void addTreeForTeamA (View view) {
        scoreTeamA = scoreTeamA + 3;
        displayOfTeamA(scoreTeamA);
    }

    public  void addTwoForTeamA (View view) {
        scoreTeamA = scoreTeamA + 2;
        displayOfTeamA(scoreTeamA);
    }

    public  void addOneForTeamA (View view) {
        scoreTeamA = scoreTeamA + 1;
        displayOfTeamA(scoreTeamA);
    }

    public void addTreeForTeamB (View view) {
        scoreTeamB = scoreTeamB + 3;
        displayOfTeamB(scoreTeamB);
    }

    public void addTwoForTeamB (View view) {
        scoreTeamB = scoreTeamB + 2;
        displayOfTeamB(scoreTeamB);
    }

    public void addOneForTeamB (View view) {
        scoreTeamB = scoreTeamB + 1;
        displayOfTeamB(scoreTeamB);
    }

    public void displayOfTeamA (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayOfTeamB (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore (View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayOfTeamB(scoreTeamB);
        displayOfTeamA(scoreTeamA);
    }

}