package com.ec327mtictactoe.tictactoe;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
// Declare variable
    private Button button1;
    private Button button2;
    private int playerMode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         // TextView title = (TextView) findViewById(R.id.mainTitle);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);


    }
    public void onClick(View v) {
        //selects mode
        switch (v.getId()) {

            case R.id.button: {
                playerMode = 1;
                break;
            }
            case R.id.button2: {
                playerMode = 2;
                break;
            }
            default: {
                break;
            }
        }
        launchBestOfSetting(playerMode);
    }


    // carries over the playerMode value to bestofsetting before launching next screen
    private void launchBestOfSetting(int pMode)
    {
        Intent settingSetUp = new Intent(MainActivity.this, Settings.class);
        settingSetUp.putExtra("playerMode",pMode);
        startActivity(settingSetUp);
    }
}
