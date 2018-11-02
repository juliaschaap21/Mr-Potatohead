package com.example.julia.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // checkbox functionality: which picture to show when clicked
    public void checkClicked(View v) {
        CheckBox checkbox = (CheckBox) v;
//        String name = checkbox.getText().toString();

        switch(v.getId()) {
            case R.id.checkbox_ears :
                ImageView ears = (ImageView) findViewById(R.id.ears);
                if (checkbox.isChecked())
                {
                    ears.setVisibility(View.VISIBLE);
                }
                else
                {
                    ears.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkbox_eyebrows :
                ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
                if (checkbox.isChecked())
                {
                    eyebrows.setVisibility(View.VISIBLE);
                }
                else
                {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkbox_eyes :
                ImageView eyes = (ImageView) findViewById(R.id.eyes);
                if (checkbox.isChecked())
                {
                    eyes.setVisibility(View.VISIBLE);
                }
                else
                {
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkbox_mustache :
                ImageView mustache = (ImageView) findViewById(R.id.mustache);
                if (checkbox.isChecked())
                {
                    mustache.setVisibility(View.VISIBLE);
                }
                else
                {
                    mustache.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkbox_glasses :
                ImageView glasses = (ImageView) findViewById(R.id.glasses);
                if (checkbox.isChecked())
                {
                    glasses.setVisibility(View.VISIBLE);
                }
                else
                {
                    glasses.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkbox_nose :
                ImageView nose = (ImageView) findViewById(R.id.nose);
                if (checkbox.isChecked())
                {
                    nose.setVisibility(View.VISIBLE);
                }
                else
                {
                    nose.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkbox_mouth :
                ImageView mouth = (ImageView) findViewById(R.id.mouth);
                if (checkbox.isChecked())
                {
                    mouth.setVisibility(View.VISIBLE);
                }
                else
                {
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkbox_shoes :
                ImageView shoes = (ImageView) findViewById(R.id.shoes);
                if (checkbox.isChecked())
                {
                    shoes.setVisibility(View.VISIBLE);
                }
                else
                {
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkbox_arms :
                ImageView arms = (ImageView) findViewById(R.id.arms);
                if (checkbox.isChecked())
                {
                    arms.setVisibility(View.VISIBLE);
                }
                else
                {
                    arms.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkbox_hat :
                ImageView hat = (ImageView) findViewById(R.id.hat);
                if (checkbox.isChecked())
                {
                    hat.setVisibility(View.VISIBLE);
                }
                else
                {
                    hat.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("arms", findViewById(R.id.arms).getVisibility());
        outState.putInt("eyebrows", findViewById(R.id.eyebrows).getVisibility());
        outState.putInt("eyes", findViewById(R.id.eyes).getVisibility());
        outState.putInt("nose", findViewById(R.id.nose).getVisibility());
        outState.putInt("hat", findViewById(R.id.hat).getVisibility());
        outState.putInt("ears", findViewById(R.id.ears).getVisibility());
        outState.putInt("mustache", findViewById(R.id.mustache).getVisibility());
        outState.putInt("glasses", findViewById(R.id.glasses).getVisibility());
        outState.putInt("shoes", findViewById(R.id.shoes).getVisibility());
        outState.putInt("mouth", findViewById(R.id.mouth).getVisibility());
    }

    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);
        findViewById(R.id.arms).setVisibility(inState.getInt("arms"));
        findViewById(R.id.eyebrows).setVisibility(inState.getInt("eyebrows"));
        findViewById(R.id.eyes).setVisibility(inState.getInt("eyes"));
        findViewById(R.id.nose).setVisibility(inState.getInt("nose"));
        findViewById(R.id.hat).setVisibility(inState.getInt("hat"));
        findViewById(R.id.ears).setVisibility(inState.getInt("ears"));
        findViewById(R.id.mustache).setVisibility(inState.getInt("mustache"));
        findViewById(R.id.glasses).setVisibility(inState.getInt("glasses"));
        findViewById(R.id.shoes).setVisibility(inState.getInt("shoes"));
        findViewById(R.id.mouth).setVisibility(inState.getInt("mouth"));

        }
}