package com.example.customimagepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customimagepicker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val pictureManager = PictureManager()

        viewBinding.btnPermission.setOnClickListener {
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
                pictureManager.checkPermission(this)
            }
        }
    }
}