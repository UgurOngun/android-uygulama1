package com.example.dev;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    int deger;
    private Button stringüreticibutton1;
    private Button stringüreticibutton2;
    private Button stringüreticibutton;
    private TextView textView;
    private Button submitButton;
    private EditText editText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editTextNumber);
        stringüreticibutton = (Button) findViewById(R.id.string_üretici);
        textView = (TextView)findViewById(R.id.textview);
        stringüreticibutton1 = (Button) findViewById(R.id.string_üretici2);
        textView = (TextView)findViewById(R.id.textview);
        stringüreticibutton2 = (Button) findViewById(R.id.string_üretici3);
        textView= (TextView)findViewById(R.id.textview);

        submitButton =(Button) findViewById(R.id.deger1);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger = Integer.valueOf(editText.getText().toString());
            }
        });


        stringüreticibutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {GENERATE1();
            }
        });

        stringüreticibutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {GENERATE2();
            }
        });

        stringüreticibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {GENERATE();
            }
        });
    }
    private void GENERATE() {
        randomstring randomstring= new randomstring();

        String sonuc= randomstring.harflisireuret(deger);
        textView.setText(sonuc);
        }
    private void GENERATE1() {
        randomstring randomstring= new randomstring();

        String sonuc= randomstring.sayilisiralama(deger);
        textView.setText(sonuc);
    }
    private void GENERATE2() {
        randomstring randomstring= new randomstring();

        String sonuc= randomstring.alfabetiksayiuret(deger);
        textView.setText(sonuc);
    }
    }