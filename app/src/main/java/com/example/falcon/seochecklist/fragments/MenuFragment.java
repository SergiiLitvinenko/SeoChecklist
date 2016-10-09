package com.example.falcon.seochecklist.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.falcon.seochecklist.R;
import com.example.falcon.seochecklist.activities.MainActivity;

public class MenuFragment extends Fragment implements View.OnClickListener {
    Button btnFirst;

    IOnMyMenuButtonClickListener clickListener;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        btnFirst = (Button) view.findViewById(R.id.btnFirst);

        btnFirst.setOnClickListener(this);

        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        clickListener = (IOnMyMenuButtonClickListener) activity;
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnFirst:
            clickListener.menuButtonClick();
        }
    }


    public interface IOnMyMenuButtonClickListener {
        void menuButtonClick();
    }
}