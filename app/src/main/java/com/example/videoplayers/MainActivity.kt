package com.example.videoplayers

import android.net.Uri
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.MediaController
import android.widget.VideoView
import com.example.videoplayers.databinding.ActivityMainBinding
import java.util.logging.Level.parse

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val videoView = findViewById<VideoView>(binding.testView.id)

// creating media controller
        val mediacontroller = MediaController(this)
        mediacontroller.setAnchorView(videoView)

// specify the location of media file
        val uri: Uri = Uri.parse(
            "android.resource://$packageName/raw/test"
        )

//setting media controller and URI, then starting the videoView
        videoView.setMediaController(mediacontroller)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()


    }


}