package com.example.colormatching;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListener();
    }

    private void addListener() {
        EditText.OnEditorActionListener listener = new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionID, KeyEvent event) {
                if (actionID == EditorInfo.IME_ACTION_DONE) {
                    Shuffle(null);

                    InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);

                    return true;
                }

                return false;

            }
        };
        EditText input = findViewById(R.id.color1);
        input.setOnEditorActionListener(listener);
        EditText input2 = findViewById(R.id.color2);
        input2.setOnEditorActionListener(listener);
        EditText input3 = findViewById(R.id.color3);
        input3.setOnEditorActionListener(listener);
        EditText input4 = findViewById(R.id.color4);
        input4.setOnEditorActionListener(listener);
        EditText input5 = findViewById(R.id.color5);
        input5.setOnEditorActionListener(listener);
        EditText input6 = findViewById(R.id.color6);
        input6.setOnEditorActionListener(listener);

    }

    public void Shuffle (View view) {
        String[] colors = getResources().getStringArray(R.array.colors);

        // make if statements to protect against randomness
        int randomColor1 = (int) (colors.length * Math.random());
        int randomColor2 = (int) (colors.length * Math.random());
        if (randomColor1 == randomColor2) {
            while (randomColor1 == randomColor2) {
                randomColor2 = (int) (colors.length * Math.random());
            }
            }
        int randomColor3 = (int) (colors.length * Math.random());
        if (randomColor3 == randomColor2 || randomColor3 == randomColor1) {
            while (randomColor3 == randomColor2 || randomColor3 == randomColor1) {
                randomColor3 = (int) (colors.length * Math.random());
            }
        }
        int randomColor4 = (int) (colors.length * Math.random());
        if (randomColor4 == randomColor2 || randomColor4 == randomColor1 || randomColor4 == randomColor3) {
            while (randomColor4 == randomColor2 || randomColor4 == randomColor1 || randomColor4 == randomColor3) {
                randomColor4 = (int) (colors.length * Math.random());
            }
        }
        int randomColor5 = (int) (colors.length * Math.random());
        if (randomColor5 == randomColor2 || randomColor5 == randomColor1 || randomColor5 == randomColor3 || randomColor5 == randomColor4) {
            while (randomColor5 == randomColor2 || randomColor5 == randomColor1 || randomColor5 == randomColor3 || randomColor5 == randomColor4) {
                randomColor5 = (int) (colors.length * Math.random());
            }
        }
        int randomColor6 = (int) (colors.length * Math.random());
        if (randomColor6 == randomColor2 || randomColor6 == randomColor1 || randomColor6 == randomColor3 || randomColor6 == randomColor4 || randomColor6 == randomColor5) {
            while (randomColor6 == randomColor2 || randomColor6 == randomColor1 || randomColor6 == randomColor3 || randomColor6 == randomColor4 || randomColor6 == randomColor5) {
                randomColor6 = (int) (colors.length * Math.random());
            }
        }

        setColor1(colors[randomColor1]);
        setColor2(colors[randomColor2]);
        setColor3(colors[randomColor3]);
        setColor4(colors[randomColor4]);
        setColor5(colors[randomColor5]);
        setColor6(colors[randomColor6]);
    }
    // make it so that you can ask for the right color and respond for yes or no.
    private void setColor1(String name) {
        int colorID = getResources().getIdentifier(name, "color", this.getPackageName());

        int color = ContextCompat.getColor(this, colorID );

        findViewById(R.id.ouput1).setBackgroundColor(color);

    }
    private void setColor2(String name) {
        int colorID = getResources().getIdentifier(name, "color", this.getPackageName());

        int color = ContextCompat.getColor(this, colorID );

        findViewById(R.id.ouput2).setBackgroundColor(color);

    }
    private void setColor3(String name) {
        int colorID = getResources().getIdentifier(name, "color", this.getPackageName());

        int color = ContextCompat.getColor(this, colorID );

        findViewById(R.id.ouput3).setBackgroundColor(color);

    }
    private void setColor4(String name) {
        int colorID = getResources().getIdentifier(name, "color", this.getPackageName());

        int color = ContextCompat.getColor(this, colorID );

        findViewById(R.id.ouput4).setBackgroundColor(color);

    }
    private void setColor5(String name) {
        int colorID = getResources().getIdentifier(name, "color", this.getPackageName());

        int color = ContextCompat.getColor(this, colorID );

        findViewById(R.id.ouput5).setBackgroundColor(color);

    }
    private void setColor6(String name) {
        int colorID = getResources().getIdentifier(name, "color", this.getPackageName());

        int color = ContextCompat.getColor(this, colorID );

        findViewById(R.id.ouput6).setBackgroundColor(color);

    }

}
