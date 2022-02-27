package com.example.sevenminutesworkoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sevenminutesworkoutapp.databinding.ActivityFinishBinding

class FinishActivity : AppCompatActivity() {

    private var binding: ActivityFinishBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFinishBinding.inflate(layoutInflater)
        setContentView(binding?.root)


    }
}