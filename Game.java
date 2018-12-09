package com.ec327mtictactoe.tictactoe;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Game extends Activity implements OnClickListener {

    private EditText currentScore; //for displaying currentScore on top
    private EditText whoseTurn;  // for displaying whose turn it is currently;
    private int turn;
    private int buttonPressed;
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
    private Button returnMenu;
    private int gameStatus;
    private int p1Score;
    private int p2Score;
    private int numHumanPlayers;
    private int gameMode;
    private String turnKeeper;
    private String buttonSelectTracker;
    private String boxString;
    private int pressedNumber;
    private int numOne,numTwo,numThree,numFour,numFive,numSix,numSeven,numEight,numNine;
    private int drawCheck;
    private int end;
    private int last = 0;

    static{
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Intent myIntent = getIntent();
        //digging up game setup info from previous screen
        numHumanPlayers = myIntent.getIntExtra("mode", 0);
        gameMode = myIntent.getIntExtra("bo", 0);
        String scoreTitle = myIntent.getStringExtra("score");
        //gamestatus keeps track of whose turn it is internally
        gameStatus = 1;
        //pressedNumber keeps track of whether number was pressed previously for click/unclick function
        pressedNumber = 30;
        //drawCheck checks for potential draws
        drawCheck = 0;
        //setting up dynamic buttons for interaction goes here
        one = findViewById(R.id.button6);
        one.setOnClickListener(this);
        three = findViewById(R.id.button7);
        three.setOnClickListener(this);
        five = findViewById(R.id.button8);
        five.setOnClickListener(this);
        seven = findViewById(R.id.button9);
        seven.setOnClickListener(this);
        nine =  findViewById(R.id.button10);
        nine.setOnClickListener(this);
        two =  findViewById(R.id.button11);
        two.setOnClickListener(this);
        four =  findViewById(R.id.button12);
        four.setOnClickListener(this);
        six =  findViewById(R.id.button13);
        six.setOnClickListener(this);
        eight =  findViewById(R.id.button14);
        eight.setOnClickListener(this);
        R1C1 =  findViewById(R.id.button15);
        R1C1.setOnClickListener(this);
        R2C1 = findViewById(R.id.button20);
        R2C1.setOnClickListener(this);
        R3C1 = findViewById(R.id.button21);
        R3C1.setOnClickListener(this);
        R1C2 =  findViewById(R.id.button16);
        R1C2.setOnClickListener(this);
        R2C2 =  findViewById(R.id.button19);
        R2C2.setOnClickListener(this);
        R3C2 =  findViewById(R.id.button22);
        R3C2.setOnClickListener(this);
        R1C3 =  findViewById(R.id.button17);
        R1C3.setOnClickListener(this);
        R2C3 =  findViewById(R.id.button18);
        R2C3.setOnClickListener(this);
        R3C3 =  findViewById(R.id.button23);
        R3C3.setOnClickListener(this);

        returnMenu = findViewById(R.id.button24);
        returnMenu.setOnClickListener(this);
        //setting up score and turn textboxes
        currentScore = findViewById(R.id.editText);
        currentScore.setText(scoreTitle);
        turnKeeper = "Player 1's Turn";
        whoseTurn =  findViewById(R.id.editText2);
        whoseTurn.setText(turnKeeper);


    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button6: {
                //corresponds to block #1
                if(pressedNumber != 1 && gameStatus == 1) //this returns true if this number is clicked for first time
                {
                  pressedNumber = 1;
                  buttonSelectTracker = "1 Selected"; // fixes the text Message on top
                  whoseTurn.setText(buttonSelectTracker);
                  break;
                }
                else {
                    pressedNumber = 30;// this correspond to unclick action of button;
                    buttonSelectTracker = "Choose a number"; //fixes the text Message on top
                    whoseTurn.setText(buttonSelectTracker);
                    break;
                }
            }
            case R.id.button11: {
                //corresponds to block #2
                if(pressedNumber != 2 && gameStatus == 2) //this returns true if this number is clicked for first time && for player 2
                {
                    pressedNumber = 2;
                    buttonSelectTracker = "2 Selected";
                    whoseTurn.setText(buttonSelectTracker);
                    break;
                }
                else {
                    pressedNumber = 30; // this correspond to unclick action of button;
                    buttonSelectTracker = "Choose a number";
                    whoseTurn.setText(buttonSelectTracker);
                    break;
                }
            }
            case R.id.button7: {
                //corresponds to block #3
                if(pressedNumber != 3 && gameStatus == 1) //this returns true if this number is clicked for first time
                {
                    pressedNumber = 3;
                    buttonSelectTracker = "3 Selected";
                    whoseTurn.setText(buttonSelectTracker);
                    break;
                }
                else {
                    pressedNumber = 30; // this correspond to unclick action of button;
                    buttonSelectTracker = "Choose a number";
                    whoseTurn.setText(buttonSelectTracker);
                    break;
                }
            }
            case R.id.button12: {
                //corresponds to block #4
                if(pressedNumber != 4 && gameStatus == 2) //this returns true if this number is clicked for first time
                {
                    pressedNumber = 4;
                    buttonSelectTracker = "4 Selected";
                    whoseTurn.setText(buttonSelectTracker);
                    break;
                }
                else {
                    pressedNumber = 30; // this correspond to unclick action of button;
                    buttonSelectTracker = "Choose a number";
                    whoseTurn.setText(buttonSelectTracker);
                    break;
                }
            }
            case R.id.button8: {
                //corresponds to block #5
                if(pressedNumber != 5 && gameStatus == 1) //this returns true if this number is clicked for first time
                {
                    pressedNumber = 5;
                    buttonSelectTracker = "5 Selected";
                    whoseTurn.setText(buttonSelectTracker);
                    break;
                }
                else {
                    pressedNumber = 30; // this correspond to unclick action of button;
                    buttonSelectTracker = "Choose a number";
                    whoseTurn.setText(buttonSelectTracker);
                    break;
                }
            }
            case R.id.button13: {
                //corresponds to block #6
                if(pressedNumber != 6 && gameStatus == 2) //this returns true if this number is clicked for first time
                {
                    pressedNumber = 6;
                    buttonSelectTracker = "6 Selected";
                    whoseTurn.setText(buttonSelectTracker);
                    break;
                }
                else {
                    pressedNumber = 30; // this correspond to unclick action of button;
                    buttonSelectTracker = "Choose a number";
                    whoseTurn.setText(buttonSelectTracker);
                    break;
                }
            }
            case R.id.button9: {
                //corresponds to block #7
                if(pressedNumber != 7 && gameStatus == 1) //this returns true if this number is clicked for first time
                {
                    pressedNumber = 7;
                    buttonSelectTracker = "7 Selected";
                    whoseTurn.setText(buttonSelectTracker);
                    break;
                }
                else {
                    pressedNumber = 30; // this correspond to unclick action of button;
                    buttonSelectTracker = "Choose a number";
                    whoseTurn.setText(buttonSelectTracker);
                    break;
                }
            }
            case R.id.button14: {
                //corresponds to block #8
                if(pressedNumber != 8 && gameStatus == 2) //this returns true if this number is clicked for first time
                {
                    pressedNumber = 8;
                    buttonSelectTracker = "8 Selected";
                    whoseTurn.setText(buttonSelectTracker);
                    break;
                }
                else {
                    pressedNumber = 30; // this correspond to unclick action of button;
                    buttonSelectTracker = "Choose a number";
                    whoseTurn.setText(buttonSelectTracker);
                    break;
                }
            }
            case R.id.button10: {
                //corresponds to block #9
                if(pressedNumber != 9 && gameStatus == 1) //this returns true if this number is clicked for first time
                {
                    pressedNumber = 9;
                    buttonSelectTracker = "9 Selected";
                    whoseTurn.setText(buttonSelectTracker);
                    break;
                }
                else {
                    pressedNumber = 30; // this correspond to unclick action of button;
                    buttonSelectTracker = "Choose a number";
                    whoseTurn.setText(buttonSelectTracker);
                    break;
                }
            }
            case R.id.button15: {//Row1Col1 on board
                boxString = ""+ R1C1.getText(); //reads the text value in the button(should be empty string if not filled up yet)
                if(boxString.isEmpty() && pressedNumber >= 1  && pressedNumber <= 9) // will only process the number into board if an unused number block was chosen && if the box is unused.
                {
                R1C1.setText(""+pressedNumber);
                last = pressedNumber;
                drawCheck+= pressedNumber;
                processBoard();
                removeButton(pressedNumber);
                 end = checkEnd(numOne,numTwo,numThree,numFour,numFive,numSix,numSeven,numEight,numNine, last);
                    if(end == 1)
                    {
                        Intent toResult = new Intent(Game.this, Results.class);
                        int winnerResult = winner(numOne,numTwo,numThree,numFour,numFive,numSix,numSeven,numEight,numNine, last);
                        toResult.putExtra("mode",numHumanPlayers);
                        toResult.putExtra("bo", gameMode);
                        toResult.putExtra("winner","Player"+ winnerResult+ " won!");
                        startActivity(toResult);
                    }
                    else
                    {
                        if(drawCheck == 45) {
                            Intent toResult = new Intent(Game.this, Results.class);
                            toResult.putExtra("mode",numHumanPlayers);
                            toResult.putExtra("bo",gameMode);
                            toResult.putExtra("winner", "Draw");
                            startActivity(toResult);
                        }
                    }
                    if(gameStatus == 1)
                        gameStatus = 2;
                    else
                        gameStatus = 1;
                }
                else
                {
                    if(pressedNumber < 1 || pressedNumber >9)//number was not chosen before choosing the location on board
                    {
                        buttonSelectTracker = "Please Choose a number first";
                        whoseTurn.setText(buttonSelectTracker);
                    }
                    if(!((R1C1.getText().toString()).equals("")))
                    {
                        buttonSelectTracker = "Already filled in, choose another slot";
                        whoseTurn.setText(buttonSelectTracker);
                    }

                }
                break;
            }
            case R.id.button20: {//Row2Col1
                boxString = "" + R2C1.getText(); //reads the text value in the button(should be empty string if not filled up yet)
                if(boxString.isEmpty() && pressedNumber >= 1  && pressedNumber <= 9) // will only process the number into board if an unused number block was chosen && if the box is unused.
                {
                    R2C1.setText(""+pressedNumber);
                    last = pressedNumber;
                    drawCheck+= pressedNumber;
                    processBoard();
                    removeButton(pressedNumber);
                    //process using c++ files
                    end = checkEnd(numOne,numTwo,numThree,numFour,numFive,numSix,numSeven,numEight,numNine,last);
                    if(end==1)
                    {
                        Intent toResult = new Intent(Game.this, Results.class);
                        int winnerResult = winner(numOne,numTwo,numThree,numFour,numFive,numSix,numSeven,numEight,numNine, last);
                        toResult.putExtra("mode",numHumanPlayers);
                        toResult.putExtra("bo", gameMode);
                        toResult.putExtra("winner","Player"+ winnerResult+ " won!");
                        startActivity(toResult);
                    }
                    else
                    {
                        if(drawCheck == 45) {
                            Intent toResult = new Intent(Game.this, Results.class);
                            toResult.putExtra("mode",numHumanPlayers);
                            toResult.putExtra("bo",gameMode);
                            toResult.putExtra("winner", "Draw");
                            startActivity(toResult);
                        }
                    }
                    if(gameStatus == 1)
                        gameStatus = 2;
                    else
                        gameStatus = 1;
                }
                else
                {
                    if(pressedNumber < 1 || pressedNumber >9)//number was not chosen before choosing the location on board
                    {
                        buttonSelectTracker = "Please Choose a number first";
                        whoseTurn.setText(buttonSelectTracker);
                    }
                    if(!((R2C1.getText().toString()).equals("")))
                    {
                        buttonSelectTracker = "Already filled in, choose another slot";
                        whoseTurn.setText(buttonSelectTracker);
                    }

                }
                break;
            }
            case R.id.button21: {//Row3Col1
                boxString = "" + R3C1.getText(); //reads the text value in the button(should be empty string if not filled up yet)
                if(boxString.isEmpty() && pressedNumber >= 1  && pressedNumber <= 9) // will only process the number into board if an unused number block was chosen && if the box is unused.
                {
                    R3C1.setText(""+pressedNumber);
                    last = pressedNumber;
                    drawCheck+= pressedNumber;
                    processBoard();
                    removeButton(pressedNumber);
                    //process using c++ files
                    end = checkEnd(numOne,numTwo,numThree,numFour,numFive,numSix,numSeven,numEight,numNine,last);
                    if(end==1)
                    {
                        Intent toResult = new Intent(Game.this, Results.class);
                        int winnerResult = winner(numOne,numTwo,numThree,numFour,numFive,numSix,numSeven,numEight,numNine, last);
                        toResult.putExtra("mode",numHumanPlayers);
                        toResult.putExtra("bo", gameMode);
                        toResult.putExtra("score","1 : 0");
                        toResult.putExtra("winner","Player"+ winnerResult+ " won!");
                        startActivity(toResult);
                    }
                    else
                    {
                        if(drawCheck == 45) {
                            Intent toResult = new Intent(Game.this, Results.class);
                            toResult.putExtra("mode",numHumanPlayers);
                            toResult.putExtra("bo",gameMode);
                            toResult.putExtra("score","1 : 0");
                            toResult.putExtra("winner", "Draw");
                            startActivity(toResult);
                        }
                    }
                    if(gameStatus == 1)
                        gameStatus = 2;
                    else
                        gameStatus = 1;
                }
                else
                {
                    if(pressedNumber < 1 || pressedNumber >9)//number was not chosen before choosing the location on board
                    {
                        buttonSelectTracker = "Please Choose a number first";
                        whoseTurn.setText(buttonSelectTracker);
                    }
                    if(!((R3C1.getText().toString()).equals("")))
                    {
                        buttonSelectTracker = "Already filled in, choose another slot";
                        whoseTurn.setText(buttonSelectTracker);
                    }

                }
                break;
            }
            case R.id.button16: {//Ro1Col2
                boxString ="" + R1C2.getText(); //reads the text value in the button(should be empty string if not filled up yet)
                if(boxString.isEmpty() && pressedNumber >= 1  && pressedNumber <= 9) // will only process the number into board if an unused number block was chosen && if the box is unused.
                {
                    R1C2.setText(""+pressedNumber);
                    last = pressedNumber;
                    drawCheck+= pressedNumber;
                    processBoard();
                    removeButton(pressedNumber);
                    //process using c++ files
                    end = checkEnd(numOne,numTwo,numThree,numFour,numFive,numSix,numSeven,numEight,numNine,last);
                    if(end==1)
                    {
                        Intent toResult = new Intent(Game.this, Results.class);
                        int winnerResult = winner(numOne,numTwo,numThree,numFour,numFive,numSix,numSeven,numEight,numNine, last);
                        toResult.putExtra("mode",numHumanPlayers);
                        toResult.putExtra("bo", gameMode);
                        toResult.putExtra("score","1 : 0");
                        toResult.putExtra("winner","Player"+ winnerResult+ " won!");
                        startActivity(toResult);
                    }
                    else
                    {
                        if(drawCheck == 45) {
                            Intent toResult = new Intent(Game.this, Results.class);
                            toResult.putExtra("mode",numHumanPlayers);
                            toResult.putExtra("bo",gameMode);
                            toResult.putExtra("score","1 : 0");
                            toResult.putExtra("winner", "Draw");
                            startActivity(toResult);
                        }
                    }
                    if(gameStatus == 1)
                        gameStatus = 2;
                    else
                        gameStatus = 1;
                }
                else
                {
                    if(pressedNumber < 1 || pressedNumber >9)//number was not chosen before choosing the location on board
                    {
                        buttonSelectTracker = "Please Choose a number first";
                        whoseTurn.setText(buttonSelectTracker);
                    }
                    if(!((R1C2.getText().toString()).equals("")))
                    {
                        buttonSelectTracker = "Already filled in, choose another slot";
                        whoseTurn.setText(buttonSelectTracker);
                    }

                }
                break;
            }
            case R.id.button19: {//Row2Col2
                boxString ="" + R2C2.getText(); //reads the text value in the button(should be empty string if not filled up yet)
                if(boxString.isEmpty() && pressedNumber >= 1  && pressedNumber <= 9) // will only process the number into board if an unused number block was chosen && if the box is unused.
                {
                    R2C2.setText(""+pressedNumber);
                    last = pressedNumber;
                    drawCheck += pressedNumber;
                    processBoard();
                    removeButton(pressedNumber);
                    //process using c++ files

                    end = checkEnd(numOne,numTwo,numThree,numFour,numFive,numSix,numSeven,numEight,numNine,last);
                   if(end==1)
                   {
                       Intent toResult = new Intent(Game.this, Results.class);
                       int winnerResult = winner(numOne,numTwo,numThree,numFour,numFive,numSix,numSeven,numEight,numNine, last);
                       toResult.putExtra("mode",numHumanPlayers);
                       toResult.putExtra("bo", gameMode);
                       toResult.putExtra("score","1 : 0");
                       toResult.putExtra("winner","Player"+ winnerResult+ " won!");
                       startActivity(toResult);
                   }
                   else
                   {
                       if(drawCheck == 45) {
                           Intent toResult = new Intent(Game.this, Results.class);
                           toResult.putExtra("mode",numHumanPlayers);
                           toResult.putExtra("bo",gameMode);
                           toResult.putExtra("score","1 : 0");
                           toResult.putExtra("winner", "Draw");
                           startActivity(toResult);
                       }
                   }
                    if(gameStatus == 1)
                        gameStatus = 2;
                    else
                        gameStatus = 1;
                }
                else
                {
                    if(pressedNumber < 1 || pressedNumber >9)//number was not chosen before choosing the location on board
                    {
                        buttonSelectTracker = "Please Choose a number first";
                        whoseTurn.setText(buttonSelectTracker);
                    }
                    if(!((R2C2.getText().toString()).equals("")))
                    {
                        buttonSelectTracker = "Already filled in, choose another slot";
                        whoseTurn.setText(buttonSelectTracker);
                    }

                }
                break;
            }

            case R.id.button22: {//Row3Col2
                boxString ="" + R3C2.getText(); //reads the text value in the button(should be empty string if not filled up yet)
                if(boxString.isEmpty() && pressedNumber >= 1  && pressedNumber <= 9) // will only process the number into board if an unused number block was chosen && if the box is unused.
                {
                    R3C2.setText(""+pressedNumber);
                    last = pressedNumber;
                    drawCheck += pressedNumber;
                    processBoard();
                    removeButton(pressedNumber);
                    //process using c++ files

                    end = checkEnd(numOne,numTwo,numThree,numFour,numFive,numSix,numSeven,numEight,numNine,last);
                    if(end==1)
                    {
                        Intent toResult = new Intent(Game.this, Results.class);
                        int winnerResult = winner(numOne,numTwo,numThree,numFour,numFive,numSix,numSeven,numEight,numNine, last);
                        toResult.putExtra("mode",numHumanPlayers);
                        toResult.putExtra("bo", gameMode);
                        toResult.putExtra("score","1 : 0");
                        toResult.putExtra("winner","Player"+ winnerResult+ " won!");
                        startActivity(toResult);
                    }
                    else
                    {
                        if(drawCheck == 45) {
                            Intent toResult = new Intent(Game.this, Results.class);
                            toResult.putExtra("mode",numHumanPlayers);
                            toResult.putExtra("bo",gameMode);
                            toResult.putExtra("score","1 : 0");
                            toResult.putExtra("winner", "Draw");
                            startActivity(toResult);
                        }
                    }
                    if(gameStatus == 1)
                        gameStatus = 2;
                    else
                        gameStatus = 1;
                }
                else
                {
                    if(pressedNumber < 1 || pressedNumber >9)//number was not chosen before choosing the location on board
                    {
                        buttonSelectTracker = "Please Choose a number first";
                        whoseTurn.setText(buttonSelectTracker);
                    }
                    if(!((R2C2.getText().toString()).equals("")))
                    {
                        buttonSelectTracker = "Already filled in, choose another slot";
                        whoseTurn.setText(buttonSelectTracker);
                    }

                }
                break;
            }

            case R.id.button17: {//Row1Col3
                boxString ="" + R1C3.getText(); //reads the text value in the button(should be empty string if not filled up yet)
                if(boxString.isEmpty() && pressedNumber >= 1  && pressedNumber <= 9) // will only process the number into board if an unused number block was chosen && if the box is unused.
                {
                    R1C3.setText(""+pressedNumber);
                    last = pressedNumber;
                    processBoard();
                    removeButton(pressedNumber);
                    drawCheck+=pressedNumber;
                    //process using c++ files
                    end = checkEnd(numOne,numTwo,numThree,numFour,numFive,numSix,numSeven,numEight,numNine,last);
                    if(end==1)
                    {
                        Intent toResult = new Intent(Game.this, Results.class);
                        int winnerResult = winner(numOne,numTwo,numThree,numFour,numFive,numSix,numSeven,numEight,numNine, last);
                        toResult.putExtra("mode",numHumanPlayers);
                        toResult.putExtra("bo", gameMode);
                        toResult.putExtra("score","1 : 0");
                        toResult.putExtra("winner","Player"+ winnerResult+ " won!");
                        startActivity(toResult);
                    }
                    else
                    {
                        if(drawCheck == 45) {
                            Intent toResult = new Intent(Game.this, Results.class);
                            toResult.putExtra("mode",numHumanPlayers);
                            toResult.putExtra("bo",gameMode);
                            toResult.putExtra("score","1 : 0");
                            toResult.putExtra("winner", "Draw");
                            startActivity(toResult);
                        }
                    }
                    if(gameStatus == 1)
                        gameStatus = 2;
                    else
                        gameStatus = 1;
                }
                else
                {
                    if(pressedNumber < 1 || pressedNumber >9)//number was not chosen before choosing the location on board
                    {
                        buttonSelectTracker = "Please Choose a number first";
                        whoseTurn.setText(buttonSelectTracker);
                    }
                    if(!((R1C3.getText().toString()).equals("")))
                    {
                        buttonSelectTracker = "Already filled in, choose another slot";
                        whoseTurn.setText(buttonSelectTracker);
                    }

                }
                break;
            }
            case R.id.button18: {//Row2Col3
                boxString ="" + R2C3.getText(); //reads the text value in the button(should be empty string if not filled up yet)
                if(boxString.isEmpty() && pressedNumber >= 1  && pressedNumber <= 9) // will only process the number into board if an unused number block was chosen && if the box is unused.
                {
                    R2C3.setText(""+pressedNumber);
                    last = pressedNumber;
                    processBoard();
                    drawCheck+= pressedNumber;
                    removeButton(pressedNumber);
                    //process using c++ files
                    end = checkEnd(numOne,numTwo,numThree,numFour,numFive,numSix,numSeven,numEight,numNine,last);
                    if(end==1)
                    {
                        Intent toResult = new Intent(Game.this, Results.class);
                        int winnerResult = winner(numOne,numTwo,numThree,numFour,numFive,numSix,numSeven,numEight,numNine, last);
                        toResult.putExtra("mode",numHumanPlayers);
                        toResult.putExtra("bo", gameMode);
                        toResult.putExtra("score","1 : 0");
                        toResult.putExtra("winner","Player"+ winnerResult+ " won!");
                        startActivity(toResult);
                    }
                    else
                    {
                        if(drawCheck == 45) {
                            Intent toResult = new Intent(Game.this, Results.class);
                            toResult.putExtra("mode",numHumanPlayers);
                            toResult.putExtra("bo",gameMode);
                            toResult.putExtra("score","1 : 0");
                            toResult.putExtra("winner", "Draw");
                            startActivity(toResult);
                        }
                    }
                    if(gameStatus == 1)
                        gameStatus = 2;
                    else
                        gameStatus = 1;

                }
                else
                {
                    if(pressedNumber < 1 || pressedNumber >9)//number was not chosen before choosing the location on board
                    {
                        buttonSelectTracker = "Please Choose a number first";
                        whoseTurn.setText(buttonSelectTracker);
                    }
                    if(!((R2C3.getText().toString()).equals("")))
                    {
                        buttonSelectTracker = "Already filled in, choose another slot";
                        whoseTurn.setText(buttonSelectTracker);
                    }

                }
                break;
            }
            case R.id.button23: {//Row3Col3
                boxString ="" + R3C3.getText(); //reads the text value in the button(should be empty string if not filled up yet)
                if(boxString.isEmpty() && pressedNumber >= 1  && pressedNumber <= 9) // will only process the number into board if an unused number block was chosen && if the box is unused.
                {
                    R3C3.setText(""+pressedNumber);
                    last = pressedNumber;
                    processBoard();
                    drawCheck += pressedNumber;
                    removeButton(pressedNumber);
                    //process using c++ files
                    end = checkEnd(numOne,numTwo,numThree,numFour,numFive,numSix,numSeven,numEight,numNine,last);
                    if(end==1)
                    {
                        Intent toResult = new Intent(Game.this, Results.class);
                        int winnerResult = winner(numOne,numTwo,numThree,numFour,numFive,numSix,numSeven,numEight,numNine, last);
                        toResult.putExtra("mode",numHumanPlayers);
                        toResult.putExtra("bo", gameMode);
                        toResult.putExtra("score","1 : 0");
                        toResult.putExtra("winner","Player"+ winnerResult+ " won!");
                        startActivity(toResult);
                    }
                    else
                    {
                        if(drawCheck == 45) {
                            Intent toResult = new Intent(Game.this, Results.class);
                            toResult.putExtra("mode",numHumanPlayers);
                            toResult.putExtra("bo",gameMode);
                            toResult.putExtra("score","1 : 0");
                            toResult.putExtra("winner", "Draw");
                            startActivity(toResult);
                        }
                    }
                    if(gameStatus == 1)
                        gameStatus = 2;
                    else
                        gameStatus = 1;
                }
                else
                {
                    if(pressedNumber < 1 || pressedNumber >9)//number was not chosen before choosing the location on board
                    {
                        buttonSelectTracker = "Please Choose a number first";
                        whoseTurn.setText(buttonSelectTracker);
                    }
                    if(!((R3C3.getText().toString()).equals("")))
                    {
                        buttonSelectTracker = "Already filled in, choose another slot";
                        whoseTurn.setText(buttonSelectTracker);
                    }

                }
                break;
            }
            case R.id.button24:{
                Intent backToMainScreen = new Intent(Game.this, MainActivity.class);
                startActivity(backToMainScreen);
                break;
            }

            default: {
                break;
            }

        }
    }
    public void processBoard()
    {

        numOne = Integer.parseInt(0+R1C1.getText().toString());
        numTwo = Integer.parseInt(0+R2C1.getText().toString());
        numThree = Integer.parseInt(0+R3C1.getText().toString());
        numFour = Integer.parseInt(0+R1C2.getText().toString());
        numFive = Integer.parseInt(0+R2C2.getText().toString());
        numSix = Integer.parseInt(0+R3C2.getText().toString());
        numSeven = Integer.parseInt(0+R1C3.getText().toString());
        numEight = Integer.parseInt(0+R2C3.getText().toString());
        numNine = Integer.parseInt(0+R3C3.getText().toString());
    }
    private native int checkEnd(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int last);
    private native int winner(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int last);

    public void removeButton(int pressedNumber) // removes the buttons on side once they are used
    {
        int buttonToRemove = pressedNumber;
        if(Integer.parseInt(0+one.getText().toString())== buttonToRemove)
            one.setVisibility(View.GONE);
        if(Integer.parseInt(0+two.getText().toString())== buttonToRemove)
            two.setVisibility(View.GONE);
        if(Integer.parseInt(0+three.getText().toString())== buttonToRemove)
            three.setVisibility(View.GONE);
        if(Integer.parseInt(0+four.getText().toString())== buttonToRemove)
            four.setVisibility(View.GONE);
        if(Integer.parseInt(0+five.getText().toString())== buttonToRemove)
            five.setVisibility(View.GONE);
        if(Integer.parseInt(0+six.getText().toString())== buttonToRemove)
            six.setVisibility(View.GONE);
        if(Integer.parseInt(0+seven.getText().toString())== buttonToRemove)
            seven.setVisibility(View.GONE);
        if(Integer.parseInt(0+eight.getText().toString())== buttonToRemove)
            eight.setVisibility(View.GONE);
        if(Integer.parseInt(0+nine.getText().toString())== buttonToRemove)
            nine.setVisibility(View.GONE);
    }
}
