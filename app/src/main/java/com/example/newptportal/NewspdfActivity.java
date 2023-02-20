package com.example.newptportal;

import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;
import android.os.Bundle;
import android.webkit.WebViewClient;


public class NewspdfActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newspdf);
        String url = getIntent().getStringExtra("newspdf_url");
        WebView webView= findViewById(R.id.web);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setJavaScriptEnabled(true);

        // Load the PDF document
        webView.loadUrl("https://drive.google.com/file/d/1RUzEQJKHce08w0RLY4myB2WhHYJ5-rP-/view?usp=sharing" + url);

    }
}