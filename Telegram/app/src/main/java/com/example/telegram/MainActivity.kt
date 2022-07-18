package com.example.telegram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.telegram.databinding.ActivityMainBinding


private lateinit var mBinding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}