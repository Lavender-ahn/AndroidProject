package com.example.album;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.song.Blank;
import com.example.song.Shake;

public class Taylor extends AppCompatActivity
{
    Button blankSpace;
    Button shakeOff;
    Button homePage;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taylor);

        blankSpace = findViewById(R.id.blankSpace);
        shakeOff = findViewById(R.id.ShakeOff);
        homePage = findViewById(R.id.homePage);

        blankSpace.setOnClickListener(view ->
        {
            Intent viewAlbum = new Intent(Taylor.this, Blank.class);
            startActivity(viewAlbum);
        });

        shakeOff.setOnClickListener(view ->
        {
            Intent viewAlbum = new Intent(Taylor.this, Shake.class);
            startActivity(viewAlbum);
        });

        homePage.setOnClickListener(view ->
        {
            Intent viewAlbum = new Intent(Taylor.this, MainActivity.class);
            startActivity(viewAlbum);
        });
    }
}