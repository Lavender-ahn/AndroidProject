package com.example.album;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    Button btn1989;
    Button folklorebtn;
    Button midnightbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1989 = findViewById(R.id.btn1989);
        folklorebtn = findViewById(R.id.folklorebtn);
        midnightbtn = findViewById(R.id.midnightbtn);

        btn1989.setOnClickListener(view ->
        {
            Intent viewAlbum = new Intent(MainActivity.this, Taylor.class);
            startActivity(viewAlbum);
        });

        folklorebtn.setOnClickListener(view ->
        {
            Intent viewAlbum = new Intent(MainActivity.this, Folklore.class);
            startActivity(viewAlbum);
        });

        midnightbtn.setOnClickListener(view ->
        {
            Intent viewAlbum = new Intent(MainActivity.this, Midnight.class);
            startActivity(viewAlbum);
        });

    }
}