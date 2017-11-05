package com.example.nathalie.nathalieborst_pset1;


import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView arms, ears, eyebrows, hat, glasses, eyes, mouth, nose, mustache, shoes;
    CheckBox ca, cea, cey, ch, cg, ceye, cmo, cn, cmu, cs;
    Boolean boolca, boolcea, boolcey, boolch, boolcg, boolceye, boolcmo, boolcn, boolcmu, boolcs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arms = findViewById(R.id.arms);
        ears = findViewById(R.id.ears);
        eyebrows = findViewById(R.id.eyebrows);
        hat = findViewById(R.id.hat);
        glasses = findViewById(R.id.glasses);
        eyes = findViewById(R.id.eyes);
        mouth = findViewById(R.id.mouth);
        nose = findViewById(R.id.nose);
        shoes = findViewById(R.id.shoes);
        mustache = findViewById(R.id.mustache);

        ca = findViewById(R.id.checkBoxArms);
        cea = findViewById(R.id.checkBoxEars);
        cey = findViewById(R.id.checkBoxEyebrows);
        ceye = findViewById(R.id.checkBoxEyes);
        ch = findViewById(R.id.checkBoxHat);
        cg = findViewById(R.id.checkBoxGlasses);
        cmo = findViewById(R.id.checkBoxMouth);
        cn = findViewById(R.id.checkBoxNose);
        cs  = findViewById(R.id.checkBoxShoes);
        cmu = findViewById(R.id.checkBoxMustache);


    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        if (ca.isChecked()){
            outState.putBoolean("ca",true);
        }
        if (cea.isChecked()){
            outState.putBoolean("cea",true);
        }
        if (cey.isChecked()){
            outState.putBoolean("cey",true);
        }
        if (ch.isChecked()){
            outState.putBoolean("ch",true);
        }
        if (cg.isChecked()){
            outState.putBoolean("cg",true);
        }
        if (ceye.isChecked()){
            outState.putBoolean("ceye",true);
        }
        if (cmo.isChecked()){
            outState.putBoolean("cmo",true);
        }
        if (cn.isChecked()){
            outState.putBoolean("cn",true);
        }
        if (cmu.isChecked()){
            outState.putBoolean("cmu",true);
        }
        if (cs.isChecked()){
            outState.putBoolean("cs",true);
        }


    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        boolca = savedInstanceState.getBoolean("ca");
        boolcea = savedInstanceState.getBoolean("cea");
        boolcey = savedInstanceState.getBoolean("cey");
        boolch = savedInstanceState.getBoolean("ch");
        boolcg = savedInstanceState.getBoolean("cg");
        boolceye = savedInstanceState.getBoolean("ceye");
        boolcmo = savedInstanceState.getBoolean("cmo");
        boolcn = savedInstanceState.getBoolean("cn");
        boolcmu = savedInstanceState.getBoolean("cmu");
        boolcs = savedInstanceState.getBoolean("cs");

        if (boolca) {
            arms.setVisibility(View.VISIBLE);
        }
        if (boolcea) {
            ears.setVisibility(View.VISIBLE);
        }
        if (boolcey) {
            eyebrows.setVisibility(View.VISIBLE);
        }
        if (boolch) {
            hat.setVisibility(View.VISIBLE);
        }
        if (boolcg) {
            glasses.setVisibility(View.VISIBLE);
        }
        if (boolceye) {
            eyes.setVisibility(View.VISIBLE);
        }
        if (boolcmo) {
            mouth.setVisibility(View.VISIBLE);
        }
        if (boolcn) {
            nose.setVisibility(View.VISIBLE);
        }
        if (boolcmu) {
            mustache.setVisibility(View.VISIBLE);
        }
        if (boolcs) {
            shoes.setVisibility(View.VISIBLE);
        }

    }

    public void onCheck (View view) {

        boolean clicked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.checkBoxArms:

                if (clicked) {
                    arms.setVisibility(View.VISIBLE);
                } else {

                    arms.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBoxEars:
                if (clicked) {
                    ears.setVisibility(View.VISIBLE);
                } else {

                    ears.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBoxEyebrows:
                if (clicked) {
                    eyebrows.setVisibility(View.VISIBLE);
                } else {

                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBoxHat:
                if (clicked) {
                    hat.setVisibility(View.VISIBLE);
                } else {

                    hat.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBoxGlasses:
                if (clicked) {
                    glasses.setVisibility(View.VISIBLE);
                } else {

                    glasses.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBoxEyes:
                if (clicked) {
                    eyes.setVisibility(View.VISIBLE);
                } else {

                    eyes.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBoxMouth:
                if (clicked) {
                    mouth.setVisibility(View.VISIBLE);
                } else {

                    mouth.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBoxMustache:
                if (clicked) {
                    mustache.setVisibility(View.VISIBLE);
                } else {

                    mustache.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBoxNose:
                if (clicked) {
                    nose.setVisibility(View.VISIBLE);
                } else {

                    nose.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBoxShoes:
                if (clicked) {
                    shoes.setVisibility(View.VISIBLE);
                } else {

                    shoes.setVisibility(View.INVISIBLE);
                }
                break;

        }





    }



}


