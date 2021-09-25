package com.example.mediaplayer

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.mediaplayer.databinding.ActivityMainBinding
import android.content.Intent




class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var stop: ImageView
    private lateinit var start: ImageView
    private lateinit var service: ServiceClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Initialize views
        stop = binding.stopBtn
        start = binding.startBtn

        // Initialize service class
        service = ServiceClass()

        start.setOnClickListener {
            startService(Intent(this, ServiceClass::class.java))
        }

        stop.setOnClickListener {
            stopService(Intent(this, ServiceClass::class.java))
        }
    }
}
