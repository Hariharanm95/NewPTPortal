package com.example.newptportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class AcademicsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);

        Button button = findViewById(R.id.viewsem1);
        Button button1 = findViewById(R.id.viewsem2);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(AcademicsActivity.this, Sem1Activity.class);
            intent.putExtra("sem1pdf_url","https://drive.google.com/file/d/1UeX9t_eEVNpFwVK-T8Xvj-2dGPGu2VVl/view?usp=sharing");
            startActivity(intent);
        });
        button1.setOnClickListener(v -> {
            Intent intent = new Intent(AcademicsActivity.this, Sem2Activity.class);
            intent.putExtra("sem2pdf_url","https://drive.google.com/file/d/1iLi-jJhkcb7gW8Ec3HF5-tCWO_e2PIPi/view?usp=sharing");
            startActivity(intent);
        });

    }
}