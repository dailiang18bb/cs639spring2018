package com.pace.cs639spring.transitioning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityA extends AppCompatActivity {


    EditText mMessageText;
    Button myHiBttn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_a);
        mMessageText = findViewById(R.id.edit_text);
    }

    public void sendName(View view) {
        String message = mMessageText.getText().toString();
        if (message.isEmpty()) {
            Toast.makeText(this, R.string.message_cannot_be_empty, Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(this, ActivityB.class);
        intent.putExtra("name", message);
        startActivity(intent);
    }



}
