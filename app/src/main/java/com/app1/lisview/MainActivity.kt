package com.app1.lisview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.app1.lisview.Network.getNews
import com.google.gson.JsonElement
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var response: JsonElement


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycleScope.launch {
            response = getNews()
        }

        //TODO parse the response from the network and out it in an Arraylist

    }
}