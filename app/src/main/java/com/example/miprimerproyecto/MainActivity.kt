package com.example.miprimerproyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("TAG", "onCreate:  aqui un  xxxxxx programa")
        Log.d("TAG", "onCreate:  aqui un programa xxxxxxxxxx")
    }
}
