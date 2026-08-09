package com.example.menuwebviewmad8

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webView)
        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true

        webView.loadUrl("https://www.google.com")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_home -> {
                webView.loadUrl("https://www.google.com")
                Toast.makeText(this, "Loading Home", Toast.LENGTH_SHORT).show()
            }
            R.id.menu_wikipedia -> {
                webView.loadUrl("https://www.wikipedia.org")
                Toast.makeText(this, "Loading Wikipedia", Toast.LENGTH_SHORT).show()
            }
            R.id.menu_about -> {
                Toast.makeText(this, "WebView Demo App - MAD Experiment 8", Toast.LENGTH_LONG).show()
            }
            R.id.menu_exit -> {
                finish()
            }
        }
        return true
    }

    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}