package com.techreviewsandhelp.codingqa;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Color_background_main extends AppCompatActivity {
    private Color_background_colors mColor = new Color_background_colors();
    // Declare our View variables
    private Button mNext;
    private LinearLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_background);

        // ID
        mNext = (Button) findViewById(R.id.color_background_next);
        mLayout = (LinearLayout) findViewById(R.id.color_background_background);

        // when next is click then do the following
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = mColor.getColor();

                //Update the screen with a color
                mLayout.setBackgroundColor(color);
                mNext.setTextColor(color);
            }
        };
        mNext.setOnClickListener(listener);
    }
}
