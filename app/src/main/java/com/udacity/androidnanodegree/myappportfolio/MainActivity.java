package com.udacity.androidnanodegree.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO - These methods are not very DRY, but they should be getting replaced soon!
        /**
         * Set up an event listener and display the toast for the Spotify app button.
         */
        Button spotifyButton = (Button) findViewById(R.id.button_spotify);

        spotifyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence spotifyText = "This button will launch my spotify streamer app!";
                int duration = Toast.LENGTH_SHORT;

                Toast.makeText(context, spotifyText, duration).show();
            }
        });

        /**
         * Set up an event listener and display the toast for the Scores app button.
         */
        Button scoresButton = (Button) findViewById(R.id.button_scores);

        scoresButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence scoresText = "This button will launch my scores app!";
                int duration = Toast.LENGTH_SHORT;

                Toast.makeText(context, scoresText, duration).show();
            }
        });

        /**
         * Set up an event listener and display the toast for the Library app button.
         */
        Button libraryButton = (Button) findViewById(R.id.button_library);

        libraryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence libraryText = "This button will launch my library app!";
                int duration = Toast.LENGTH_SHORT;

                Toast.makeText(context, libraryText, duration).show();
            }
        });

        /**
         * Set up an event listener and display the toast for the Build it Bigger app button.
         */
        Button buildButton = (Button) findViewById(R.id.button_build);

        buildButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence buildText = "This button will launch my build it bigger app!";
                int duration = Toast.LENGTH_SHORT;

                Toast.makeText(context, buildText, duration).show();
            }
        });

        /**
         * Set up an event listener and display the toast for the XYZ Reader app button.
         */
        Button readerButton = (Button) findViewById(R.id.button_reader);

        readerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence readerText = "This button will launch my xyz reader app!";
                int duration = Toast.LENGTH_SHORT;

                Toast.makeText(context, readerText, duration).show();
            }
        });

        /**
         * Set up an event listener and display the toast for the Capstone app button.
         */
        Button capstoneButton = (Button) findViewById(R.id.button_capstone);

        capstoneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence capstoneText = "This button will launch my capstone app!";
                int duration = Toast.LENGTH_SHORT;

                Toast.makeText(context, capstoneText, duration).show();
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



}
