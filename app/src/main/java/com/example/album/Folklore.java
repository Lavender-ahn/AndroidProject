package com.example.album;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.song.Cardigan;
import com.example.song.Tear;

public class Folklore extends AppCompatActivity
{
    Button cardigan;
    Button tears;
    Button homePage;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folklore);

        cardigan = findViewById(R.id.cardigan);
        tears = findViewById(R.id.tears);
        homePage = findViewById(R.id.homePage);

        cardigan.setOnClickListener(view ->
        {
            Intent viewAlbum = new Intent(Folklore.this, Cardigan.class);
            startActivity(viewAlbum);
        });

        tears.setOnClickListener(view ->
        {
            Intent viewAlbum = new Intent(Folklore.this, Tear.class);
            startActivity(viewAlbum);
        });

        homePage.setOnClickListener(view ->
        {
            Intent viewAlbum = new Intent(Folklore.this, MainActivity.class);
            startActivity(viewAlbum);
        });
    }
}
