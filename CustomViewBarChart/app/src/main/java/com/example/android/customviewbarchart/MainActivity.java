package com.example.android.customviewbarchart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CharlesView mCharlesView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCharlesView = findViewById(R.id.charles_view);
    }

    public void addData (View view){ mCharlesView.add();}
}
