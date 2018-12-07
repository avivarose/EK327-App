package com.ec327mtictactoe.tictactoe;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Game extends Activity implements OnClickListener{

    private EditText currentScore; //for displaying currentScore on top
    private EditText whoseTurn;  // for displaying whose turn it is currently;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button returnToMainMenu;
    private Button R1C1;
    private Button R2C1;
    private Button R3C1;
    private Button R1C2;
    private Button R2C2;
    private Button R3C2;
    private Button R1C3;
    private Button R2C3;
    private Button R3C3;
    private int gameStatus;
    private int p1Score;
    private int p2Score;
    private int numHumanPlayers;
    private int gameMode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Intent myIntent = getIntent();
        numHumanPlayers = myIntent.getIntExtra("mode",0);
        gameMode = myIntent.getIntExtra("bo",0);
        currentScore.setText("0 : 0");
        //setting up dynamic buttons for interaction goes here
        //prepares game depending on what setting player choose
        if(numHumanPlayers == 1 && gameMode == 1) {
        //setup single player bo1

        }
        if(numHumanPlayers == 2 && gameMode == 1){
        //setup 1v1 bo1


        }
        if(numHumanPlayers ==1 && gameMode == 3){
            //setup single player bo3
        }
        if(numHumanPlayers == 2 && gameMode ==3){
            //setup 1v1 bo3

        }



    }

    public void onClick(View v) {
        switch (v.getId()) {

            default: {
                break;
            }
        }
    }
}
