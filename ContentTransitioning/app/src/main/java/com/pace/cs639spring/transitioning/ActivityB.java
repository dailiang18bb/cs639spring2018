package com.pace.cs639spring.transitioning;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    TextView textDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_b);

        String name = getIntent().getStringExtra("name");
        textDisplay = findViewById(R.id.text);
        textDisplay.setText(getString(R.string.hello_person, name));


    }
}
