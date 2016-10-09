package com.example.falcon.seochecklist.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.falcon.seochecklist.R;
import com.example.falcon.seochecklist.fragments.MenuFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,
        MenuFragment.IOnMyMenuButtonClickListener {
    FrameLayout fragmentContainer;
    FragmentTransaction fTrans;
    Fragment menuFragment, checklistFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentContainer = (FrameLayout) findViewById(R.id.flFragmentContainer);

        menuFragment = new MenuFragment();
        fTrans = getSupportFragmentManager().beginTransaction();
        fTrans.replace(R.id.flFragmentContainer, menuFragment);
        fTrans.commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.btnFirst:
                menuButtonClick();
        }
    }

    @Override
    public void menuButtonClick() {
        Toast.makeText(this, "Yay! Button clicked!", Toast.LENGTH_SHORT).show();
        Log.v("myLog", "menuButtonClick");
    }
}