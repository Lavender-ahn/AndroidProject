package com.example.album;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.song.Bejeweled;
import com.example.song.Cardigan;
import com.example.song.Mastermind;
import com.example.song.Tear;

public class Midnight extends AppCompatActivity
{
    Button mastermind;
    Button bejeweled;
    Button homePage;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midnight);

        mastermind = findViewById(R.id.mastermind);
        bejeweled = findViewById(R.id.bejeweled);
        homePage = findViewById(R.id.homePage);

        mastermind.setOnClickListener(view ->
        {
                Intent viewAlbum = new Intent(Midnight.this, Mastermind.class);
            startActivity(viewAlbum);
        });

        bejeweled.setOnClickListener(view ->
        {
            Intent viewAlbum = new Intent(Midnight.this, Bejeweled.class);
            startActivity(viewAlbum);
        });

        homePage.setOnClickListener(view ->
        {
            Intent viewAlbum = new Intent(Midnight.this, MainActivity.class);
            startActivity(viewAlbum);
        });
    }
}