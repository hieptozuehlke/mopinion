package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mopinion.mopinionsdkweb.Mopinion

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val mOpinion = Mopinion(this, "MuPH6tKX3OGVqT18CrFBIaTxWDEV8bBKX5OZK6qR", true);

        mOpinion.event("_button")
    }
}