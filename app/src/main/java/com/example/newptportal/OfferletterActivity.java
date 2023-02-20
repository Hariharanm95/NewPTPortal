package com.example.newptportal;

import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;
import android.os.Bundle;
import android.webkit.WebViewClient;


public class OfferletterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offerletter);
        String url = getIntent().getStringExtra("pdf_url");
        WebView webView= findViewById(R.id.web);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setJavaScriptEnabled(true);

        // Load the PDF document
        webView.loadUrl("https://drive.google.com/file/d/1talX20lYN9PRvTAxB2Jcz_MUk3K48SQ4/view?usp=sharing" + url);

    }
}