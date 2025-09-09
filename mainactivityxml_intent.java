package com.example.intent_navigation;

import android.content.Intent; // For intent
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.intent_navigation.SecondActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Required to set up the activity
        setContentView(R.layout.activity_main); // Load the XML layout for MainActivity

        // Get a reference to the button
        Button buttonOpenSecond = findViewById(R.id.buttonOpenSecond);

        // Set a click listener
        buttonOpenSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an explicit Intent to open SecondActivity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                // Start the new activity
                startActivity(intent);
            }
        });
    }
}
