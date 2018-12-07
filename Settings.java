package com.ec327mtictactoe.tictactoe;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
public class Settings extends Activity implements OnClickListener{

    private TextView askSetting;
    private Button back;
    private Button bo1;
    private Button bo3;
    private int playerMode;
    private int bestOf;
    private TextView askingPrompt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Intent myIntent = getIntent();
        playerMode = myIntent.getIntExtra("playerMode", 0);
        //setting up the buttons for this screen
        bo1 = (Button) findViewById(R.id.button3);
        bo3 = (Button) findViewById(R.id.button4);
        back = (Button) findViewById(R.id.button5);
        bo1.setOnClickListener(this);
        bo3.setOnClickListener(this);
        back.setOnClickListener(this);
        askingPrompt = (TextView)findViewById(R.id.textView);

    }

    public void onClick(View v) {
        //selects mode
        switch (v.getId()) {

            case R.id.button3: {
                bestOf = 1;
                Intent gameScreen = new Intent(Settings.this, Game.class);
                gameScreen.putExtra("mode",playerMode);
                gameScreen.putExtra("bo",bestOf);
                startActivity(gameScreen);
                break;
            }
            case R.id.button4: {
                bestOf =3;
                Intent gameScreen = new Intent(Settings.this,Game.class);
                gameScreen.putExtra("mode",playerMode);
                gameScreen.putExtra("bo",bestOf);
                startActivity(gameScreen);
                break;
            }
            case R.id.button5: {
                Intent backToMainScreen = new Intent(Settings.this, MainActivity.class);
                startActivity(backToMainScreen);
                break;
            }
            default: {
                break;
            }
        }
    }
}
