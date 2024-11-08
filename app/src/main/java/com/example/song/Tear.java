package com.example.song;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.album.MainActivity;
import com.example.album.R;

public class Tear extends AppCompatActivity
{
    Button homePage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tear);

        homePage = findViewById(R.id.homePage);

        homePage.setOnClickListener(view ->
        {
            Intent viewAlbum = new Intent(Tear.this, MainActivity.class);
            startActivity(viewAlbum);
        });
    }
}