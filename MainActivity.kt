package com.example.example_app

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun Beep(view: View)
    {
        val mp = MediaPlayer.create(this, R.raw.sound);
        if(mp.isPlaying)
        {
            mp.pause()
        }
        else
        {
            mp.start()
        }
    }
    fun Buzz(view: View)
    {
        val mp = MediaPlayer.create(this, R.raw.sound_1);
        if(mp.isPlaying)
        {
            mp.pause()
        }
        else
        {
            mp.start()
        }
    }
}
