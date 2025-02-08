package com.example.universitasmobile

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    //Deklarasi Variabel
    lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.myWB)

        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://universitasmandiri.ac.id/")

        val webSettings = webView.settings

        //pengaturan agar javascript dan komponen web lainnya aktif
        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true
        }
    }