package com.pace.cs639spring.transitioning;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment {

    interface BackButtonClickListener {
        void onBackButtonClicked();
    }


    BackButtonClickListener mButtonBackListener;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mButtonBackListener = (BackButtonClickListener)activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(toString() + " must implement the BackButtonClickListener");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_b, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Bundle args = getArguments();
        String name = args.getString(ActivityC.ARGUMENT_NAME);

        TextView textView = getView().findViewById(R.id.text);

        textView.setText(getString(R.string.hello_person, name));

        getView().findViewById(R.id.bttn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mButtonBackListener.onBackButtonClicked();
            }
        });

    }
}
