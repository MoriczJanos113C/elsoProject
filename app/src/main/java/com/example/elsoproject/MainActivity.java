package com.example.elsoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    EditText karakter = findViewById(R.id.karakter);
    EditText Skin = findViewById(R.id.Skin);

    RadioGroup gombok = findViewById(R.id.gombok);

    Button kuldes = findViewById(R.id.kuldes);

    kuldes.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(MainActivity.this, NewActivity.class);
            i.putExtra("uzenet", karakter.getText().toString());
            i.putExtra("uzenet", Skin.getText().toString());

            i.putExtra("key","value");

            startActivity(i);

        }
    });

    }
}