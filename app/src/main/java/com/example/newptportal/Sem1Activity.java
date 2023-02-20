package com.example.newptportal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Sem1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1);
        String url = getIntent().getStringExtra("sem1pdf_url");
        WebView webView= findViewById(R.id.sem1);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setJavaScriptEnabled(true);

        // Load the PDF document
        webView.loadUrl("https://drive.google.com/file/d/1UeX9t_eEVNpFwVK-T8Xvj-2dGPGu2VVl/view?usp=sharing" + url);
    }
}