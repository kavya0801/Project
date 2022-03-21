package com.app1.lisview

import com.app1.lisview.Network.getNews
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.lifecycle.lifecycleScope
import com.app1.lisview.R
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    var data = arrayOf(
        "News",
        "Myntra",
        "Shopee",
        "JioMart",
        "Flipkart",
        "Redbus",
        "News",
        "Myntra",
        "Shopee",
        "JioMart",
        "Flipkart",
        "Redbus"
    )
    var listView: ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycleScope.launch{
            getNews()
        }

    }
}