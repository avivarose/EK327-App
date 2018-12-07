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
    private Button backToMenu;
    private Button playAgain;
    private int playerMode;
    private int bestOf;
    private TextView askingPrompt;
    private String whoWon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Intent myIntent = getIntent();
        playerMode = myIntent.getIntExtra("mode",0);
        bestOf = myIntent.getIntExtra("bo", 0);
        whoWon = myIntent.getStringExtra("winner");
        backToMenu = (Button) findViewById(R.id.buttonRes1);
        playAgain = (Button) findViewById(R.id.buttonRes2);
        backToMenu.setOnClickListener(this);
        playAgain.setOnClickListener(this);
        askingPrompt = (TextView)findViewById(R.id.textView);


    }

    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.buttonRes1: {
              //returns to main menu
                Intent gameScreen = new Intent(Results.this, MainActivity.class);
                startActivity(gameScreen);
            }
            case R.id.buttonRes2: {
                // starts another game right away with same setup
                Intent gameScreen = new Intent(Results.this, Game.class);
                gameScreen.putExtra("mode",playerMode);
                gameScreen.putExtra("bo",bestOf);
                startActivity(gameScreen);
            }
            default: {
                break;
            }
        }
    }
}