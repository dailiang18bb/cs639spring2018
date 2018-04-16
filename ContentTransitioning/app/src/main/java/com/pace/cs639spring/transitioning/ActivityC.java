package com.pace.cs639spring.transitioning;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ActivityC  extends AppCompatActivity implements FragmentA.SayHiButtonClickListener,
        FragmentB.BackButtonClickListener {

    public static final String ARGUMENT_NAME = "name";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        getFragmentManager().beginTransaction().add(R.id.container, new FragmentA()).commit();
    }

    @Override
    public void onButtonClicked(String name) {
        if (!name.isEmpty()) {
            Bundle args = new Bundle();
            args.putString(ARGUMENT_NAME, name);
            FragmentB fragmentB = new FragmentB();
            fragmentB.setArguments(args);
            getFragmentManager().beginTransaction().replace(R.id.container, fragmentB).commit();

        }
    }

    private void revertToFragmentA() {

    }

    @Override
    public void onBackButtonClicked() {
        getFragmentManager().beginTransaction().replace(R.id.container, new FragmentA()).commit();
    }
}
