package com.example.intent_navigation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Standard Android setup
        setContentView(R.layout.activity_second); // Load the second layout

        // Reference to the back button
        Button buttonGoBack = findViewById(R.id.buttonGoBack);

        // Handle click to go back
        buttonGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Finish current activity to go back to MainActivity
                finish(); // This destroys SecondActivity and returns to the previous one
            }
        });
    }
}
