package com.ec327mtictactoe.tictactoe;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Results extends Activity implements OnClickListener{

    private EditText winner;
    private EditText scoreBoard;
    private Button backToMenu;
    private Button playAgain;
    private int playerMode;
    private int bestOf;
    private String whoWon;
    private String scoreResult;
    int p1Score;
    int p2Score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Intent myIntent = getIntent();
        playerMode = myIntent.getIntExtra("mode",0);
        bestOf = myIntent.getIntExtra("bo", 0);
        whoWon = myIntent.getStringExtra("winner");
        scoreResult = myIntent.getStringExtra("score");
        p1Score = myIntent.getIntExtra("p1",0);
        p2Score = myIntent.getIntExtra("p2",0);
        backToMenu = (Button) findViewById(R.id.button26);
        playAgain = (Button) findViewById(R.id.button25);

        backToMenu.setOnClickListener(this);
        playAgain.setOnClickListener(this);
        winner = findViewById(R.id.editText3);
        winner.setText(whoWon);
        scoreBoard = findViewById(R.id.editText4);
        scoreBoard.setText(""+p1Score+" : " + p2Score);
        if((bestOf == 3))
        {
            String fix = "Play Again";
            playAgain.setText(fix);
            if((p1Score != 2 )&& (p2Score !=2))
            {   fix = "Play Next Set";
                playAgain.setText(fix);

            }
        }
        else
        {
            String fix = "Play Again";
            playAgain.setText(fix);
        }
        winner.setEnabled(false);
        scoreBoard.setEnabled(false);


    }

    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.button26: {
              //returns to main menu
                Intent gameScreen = new Intent(Results.this, MainActivity.class);
                startActivity(gameScreen);
                break;
            }
            case R.id.button25: {
                // starts another game right away with same setup
                Intent gameScreen = new Intent(Results.this, Game.class);
                gameScreen.putExtra("mode",playerMode);
                gameScreen.putExtra("bo",bestOf);
                gameScreen.putExtra("score",scoreResult);
                if(bestOf ==1) {
                    gameScreen.putExtra("p1",0);
                    gameScreen.putExtra("p2",0);
                    startActivity(gameScreen);

                }
                else
                {
                    if(p1Score == 2 ||p2Score ==2){
                        gameScreen.putExtra("p1",0);
                        gameScreen.putExtra("p2",0);
                        startActivity(gameScreen);
                    }
                    else
                    {
                        gameScreen.putExtra("p1",p1Score);
                        gameScreen.putExtra("p2",p2Score);
                        startActivity(gameScreen);
                    }

                }
                break;
            }
            default: {
                break;
            }
        }
    }
}