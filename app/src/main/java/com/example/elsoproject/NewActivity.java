package com.example.elsoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        TextView Kiiras = findViewById(R.id.Kiiras);
        TextView Kiiras2 = findViewById(R.id.Kiiras2);
        Bundle extras =getIntent().getExtras();

        if (extras!=null){
            Kiiras.setText(extras.getString("uzenet")+" "+extras.getString("key"));
            Kiiras2.setText(extras.getString("uzenet2")+" "+extras.getString("key2"));
        }
    }
}