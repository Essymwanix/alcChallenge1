package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity
{
    String url = "https://andela.com/alc/";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutalc);

       WebView webView = findViewById(R.id.webView);
       webView.setWebViewClient(new WebViewClient(){
           @Override
           public void onReceivedSslError (WebView view, SslErrorHandler handler, SslError error)
           {
               handler.proceed();
           }
       });
       webView.loadUrl(url);
    }

}
