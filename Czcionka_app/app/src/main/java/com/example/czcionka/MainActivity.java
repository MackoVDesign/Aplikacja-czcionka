package com.example.czcionka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    TextView wartosc;
    TextView cytat;
    Button button;
    SeekBar suwak;
    int i = 0;
    int wartosc2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wartosc = findViewById(R.id.rozmiar_text);
        suwak = findViewById(R.id.suwak);
        cytat = findViewById(R.id.cytat);
        button = findViewById(R.id.button);

        String[] cytaty = {"Dzień dobry", "Good morning", "Buenos dias"};


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cytat.setText(cytaty[i]);

                if (i < cytaty.length-1){
                    i++;
                }
                else {
                    i = 0;
                }
            }
        });

        suwak.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {


            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                wartosc.setText("Rozmiar: " + String.valueOf(progress));
                cytat.setTextSize(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

    }

}