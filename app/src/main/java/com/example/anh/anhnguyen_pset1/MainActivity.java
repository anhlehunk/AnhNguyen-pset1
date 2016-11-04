package com.example.anh.anhnguyen_pset1;

import android.app.Activity;
import android.media.Image;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;




public class MainActivity extends AppCompatActivity {



    private static final String IMAGE_RESOURCE = "image-resource";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void selectItem(View view)
    {
        ImageView potato_arms = (ImageView) findViewById(R.id.potato_arms);
        ImageView potato_ears = (ImageView) findViewById(R.id.potato_ears);
        ImageView potato_eyebrows = (ImageView) findViewById(R.id.potato_eyebrows);
        ImageView potato_eyes = (ImageView) findViewById(R.id.potato_eyes);
        ImageView potato_glasses = (ImageView) findViewById(R.id.potato_glasses);
        ImageView potato_hat = (ImageView) findViewById(R.id.potato_hat);
        ImageView potato_mouth = (ImageView) findViewById(R.id.potato_mouth);
        ImageView potato_mustache = (ImageView) findViewById(R.id.potato_mustache);
        ImageView potato_nose = (ImageView) findViewById(R.id.potato_nose);
        ImageView potato_shoes = (ImageView) findViewById(R.id.potato_shoes);

        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.checkpotato_arms:
                if(checked)
                    potato_arms.setVisibility(View.VISIBLE);
                else
                    potato_arms.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkpotato_ears:
                if(checked)
                    potato_ears.setVisibility(View.VISIBLE);
                else
                    potato_ears.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkpotato_eyebrows:
                if(checked)
                    potato_eyebrows.setVisibility(View.VISIBLE);
                else
                    potato_eyebrows.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkpotato_eyes:
                if(checked)
                    potato_eyes.setVisibility(View.VISIBLE);
                else
                    potato_eyes.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkpotato_glasses:
                if(checked)
                    potato_glasses.setVisibility(View.VISIBLE);
                else
                    potato_glasses.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkpotato_hat:
                if(checked)
                    potato_hat.setVisibility(View.VISIBLE);
                else
                    potato_hat.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkpotato_mouth:
                if(checked)
                    potato_mouth.setVisibility(View.VISIBLE);
                else
                    potato_mouth.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkpotato_mustache:
                if(checked)
                    potato_mustache.setVisibility(View.VISIBLE);
                else
                    potato_mustache.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkpotato_nose:
                if(checked)
                    potato_nose.setVisibility(View.VISIBLE);
                else
                    potato_nose.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkpotato_shoes:
                if(checked)
                    potato_shoes.setVisibility(View.VISIBLE);
                else
                    potato_shoes.setVisibility(View.INVISIBLE);
                break;

        }

    }



   /* @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {

        super.onSaveInstanceState(savedInstanceState);


    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    } */
}






