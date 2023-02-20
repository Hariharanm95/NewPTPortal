package com.example.newptportal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Sem2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2);
        String url = getIntent().getStringExtra("sem2pdf_url");
        WebView webView= findViewById(R.id.sem2);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setJavaScriptEnabled(true);

        // Load the PDF document
        webView.loadUrl("https://drive.google.com/file/d/1iLi-jJhkcb7gW8Ec3HF5-tCWO_e2PIPi/view?usp=sharing" + url);
    }
}