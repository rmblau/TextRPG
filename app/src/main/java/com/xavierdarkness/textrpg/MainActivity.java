package com.xavierdarkness.textrpg;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
    private Button chestFiveButton;
    private String chestItem;
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
        chestFiveButton = (Button) (findViewById(R.id.chestFiveButton));
        storyText = (TextView) findViewById(R.id.storyText);


        // listeners

        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storyText.setText("You enter the room directly in front of you.\n" + "There are items all around you\n" +
                        "Looking around you see a piece of paper on the ground");
                chestThreeButton.setVisibility(View.VISIBLE);
                chestTwoButton.setVisibility(View.INVISIBLE);
                chestFourButton.setVisibility(View.INVISIBLE);
                chestOneButton.setVisibility(View.INVISIBLE);
                inventoryCheck();


            }
        });
        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storyText.setText("You enter the room below you and look around for more clues. \n" + "you see a desk");
                chestTwoButton.setVisibility(View.VISIBLE);
                chestThreeButton.setVisibility(View.INVISIBLE);
                chestOneButton.setVisibility(View.INVISIBLE);
                chestFourButton.setVisibility(View.INVISIBLE);
                inventoryCheck();
            }
        });
        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storyText.setText("In front of you is a piece of paper with more clues");
                chestTwoButton.setVisibility(View.VISIBLE);
                chestThreeButton.setVisibility(View.INVISIBLE);
                chestOneButton.setVisibility(View.INVISIBLE);
                chestFourButton.setVisibility(View.INVISIBLE);
                inventoryCheck();
            }
        });
        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storyText.setText("Looking around you find a few papers on the ground ");
                chestTwoButton.setVisibility(View.INVISIBLE);
                chestThreeButton.setVisibility(View.INVISIBLE);
                chestOneButton.setVisibility(View.INVISIBLE);
                chestFourButton.setVisibility(View.VISIBLE);
                inventoryCheck();
            }
        });


        chestTwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storyText.setText("Clarice was a violent ghost, beware of her");
            }
        });


        chestOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storyText.setText("Opening the desk you find another piece of paper. \n" + "The ghost that haunts this school is named Clarice");
            }
        });


        chestThreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storyText.setText("You pick up the piece of paper and read it:\n" + "This school is " +
                        "haunted\n" +
                        "each room tells the story of the haunting, good luck on your quest. Beware of " +
                        "enemies that you may encounter on your journey.");
                chestItem = "key";
                inventory.add(chestItem);
            }
        });
        chestFourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storyText.setText("Among the papers you see a slightly yellowed piece of paper." + "\n" +
                "Clarice has haunted this school for years, her spirit resides within these walls ");
                Context context = getApplicationContext();
                CharSequence text = "You have discovered the secret! You win, congrats!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();


            }
        });

        //battle chest
        chestFiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Game g = new Game();
                g.battle();
                storyText.setText("Battle outcome: " + "\n" + Game.eHealth + "\n" + Game.eLevel +
                        "\n" + Game.eStrength + "\n" +
                        Game.pHealth + "\n" + Game.aliveText);
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

    public void inventoryCheck() {
        if (inventory.contains("key")) {
            chestFiveButton.setVisibility(View.VISIBLE);
        }
    }
}
