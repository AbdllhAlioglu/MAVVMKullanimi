package com.example.mvvmkullanimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewResult;
    private TextView textViewResultScreen;
    private EditText editTextNumber1;
    private EditText editTextNumber2;
    private Button buttonTopla;
    private Button buttonCıkar;
    private Button buttonCarp;
    private Button buttonBol;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = findViewById(R.id.textViewResult);
        textViewResultScreen = findViewById(R.id.textViewResultScreen);
        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        buttonTopla = findViewById(R.id.buttonTopla);
        buttonCıkar = findViewById(R.id.buttonCıkar);
        buttonCarp = findViewById(R.id.buttonCarp);
        buttonBol = findViewById(R.id.buttonBol);


        buttonTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String alinanSayi1 = editTextNumber1.getText().toString();
                String alinanSayi2 = editTextNumber2.getText().toString();

                long sayi1 = Long.parseLong(alinanSayi1);
                long sayi2 = Long.parseLong(alinanSayi2);

                long sonuc = sayi1 + sayi2;

                textViewResultScreen.setText(String.valueOf(sonuc));
            }
        });


        buttonCıkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alinanSayi1 = editTextNumber1.getText().toString();
                String alinanSayi2 = editTextNumber2.getText().toString();

                int sayi1 = Integer.parseInt(alinanSayi1);
                int sayi2 = Integer.parseInt(alinanSayi2);

               if (sayi1>=sayi2){
                   int sonuc = sayi1 - sayi2 ;
                   textViewResultScreen.setText(String.valueOf(sonuc));
               }
               else {
                   textViewResultScreen.setText("Hatalı İşlem");
               }

            }
        });
        buttonCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alinanSayi1 = editTextNumber1.getText().toString();
                String alinanSayi2 = editTextNumber2.getText().toString();

                int sayi1 = Integer.parseInt(alinanSayi1);
                int sayi2 = Integer.parseInt(alinanSayi2);

                int sonuc = sayi1 * sayi2;

                textViewResultScreen.setText(String.valueOf(sonuc));
            }
        });

        buttonBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alinanSayi1 = editTextNumber1.getText().toString();
                String alinanSayi2 = editTextNumber2.getText().toString();

                int sayi1 = Integer.parseInt(alinanSayi1);
                int sayi2 = Integer.parseInt(alinanSayi2);

                float sonuc = (float)sayi1 / sayi2;

                textViewResultScreen.setText(String.valueOf(sonuc));
            }
        });
    }


}