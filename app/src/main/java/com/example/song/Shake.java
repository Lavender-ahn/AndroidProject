package com.example.song;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.album.MainActivity;
import com.example.album.R;

public class Shake extends AppCompatActivity {

    Button homePage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shake);

        homePage = findViewById(R.id.homePage);

        homePage.setOnClickListener(view ->
        {
            Intent viewAlbum = new Intent(Shake.this, MainActivity.class);
            startActivity(viewAlbum);
        });
    }
}