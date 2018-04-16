package com.pace.cs639spring.transitioning;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class FragmentA extends Fragment {

    interface SayHiButtonClickListener {
        void onButtonClicked(String name);
    }

    EditText mEditText;

    SayHiButtonClickListener mButtonClickListener;


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mButtonClickListener = (SayHiButtonClickListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement SayHiButtonClickListener");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_a, container, false);
        mEditText = view.findViewById(R.id.edit_text);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getView().findViewById(R.id.bttn_hi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mEditText.getText().toString().trim();
                mButtonClickListener.onButtonClicked(name);
            }
        });
    }

}
