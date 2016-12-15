package edu.rosehulman.keinslc.hellobutton;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mNumClicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Capturing the views
        final TextView textView = (TextView) findViewById(R.id.textView); // Grabs views from the layout
        Button button = (Button) findViewById(R.id.button); // Same thing for the button

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNumClicks++;
                if(mNumClicks > 10){
                    // Getting a color
                    int backgroundColor = ContextCompat.getColor(MainActivity.this, R.color.background);
                    textView.setTextColor(backgroundColor);
                    // Or
                    // TextView.setVisibility(TextVeiw.INVISIBLE);
                }
                textView.setText(getResources().getQuantityString(R.plurals.message_format, mNumClicks, mNumClicks));
            }
        });
    }
}
