package com.example.newptportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlacementsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placements);

        Button button = findViewById(R.id.viewPDF);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(PlacementsActivity.this, OfferletterActivity.class);
            intent.putExtra("pdf_url","https://drive.google.com/file/d/1talX20lYN9PRvTAxB2Jcz_MUk3K48SQ4/view?usp=sharing");
            startActivity(intent);
        });

    }
}