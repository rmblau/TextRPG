package com.xavierdarkness.textrpg;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    private Button upButton;
    private Button downButton;
    private Button leftButton;
    private Button rightButton;
    private Button resetButton;
    private Button chestOneButton;
    private Button chestTwoButton;
    private Button chestThreeButton;
    private Button chestFourButton;
    private Button battleChest;
    private Button inventoryButton;
    private TextView msgTextView;
    private String msgText;
    private String msgToast;
    private TextView storyText;
   ArrayList<String> inventory = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        upButton = (Button) (findViewById(R.id.upButton));
        downButton = (Button) (findViewById(R.id.downButton));
        leftButton = (Button) (findViewById(R.id.leftButton));
        rightButton = (Button) (findViewById(R.id.rightButton));
        chestOneButton = (Button) (findViewById(R.id.chestOneButton));
        chestTwoButton = (Button) (findViewById(R.id.chestTwoButton));
        chestThreeButton = (Button) (findViewById(R.id.chestThreeButton));
        chestFourButton = (Button) (findViewById(R.id.chestFourButton));
        battleChest = (Button) findViewById(R.id.battleChest);
        inventoryButton = (Button) (findViewById(R.id.inventoryButton));
        storyText = (TextView) findViewById(R.id.storyText);



        // listeners

        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storyText.setText("You enter the room directly in front of you.\n" + "There is a dead body and items lying around the body");

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
         v.getId();
    }
}
