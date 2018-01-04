package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyTextView;
    Button topButton;
    Button bottomButton;
    private int mIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topButton = (Button) findViewById(R.id.buttonTop);
        bottomButton = (Button) findViewById(R.id.buttonBottom);
        storyTextView = (TextView) findViewById(R.id.storyTextView);

        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                topPath();
            }
        });

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomPath();
            }
        });


    }

    public void topPath() {
        if(mIndex == 1 || mIndex == 3) {
            storyTextView.setText(R.string.T3_Story);
            topButton.setText(R.string.T3_Ans1);
            bottomButton.setText(R.string.T3_Ans2);
            mIndex = 2;
        }else if(mIndex ==2){
            storyTextView.setText(R.string.T6_End);
            topButton.setVisibility(View.GONE);
            bottomButton.setVisibility(View.GONE);
        }
    }

    public void bottomPath() {
        if(mIndex == 1) {
            storyTextView.setText(R.string.T2_Story);
            topButton.setText(R.string.T2_Ans1);
            bottomButton.setText(R.string.T2_Ans2);
            mIndex = 3;
        }else if(mIndex ==2){
            storyTextView.setText(R.string.T5_End);
            topButton.setVisibility(View.GONE);
            bottomButton.setVisibility(View.GONE);
        }else if(mIndex == 3){
            storyTextView.setText(R.string.T4_End);
            topButton.setVisibility(View.GONE);
            bottomButton.setVisibility(View.GONE);
        }
    }
}
