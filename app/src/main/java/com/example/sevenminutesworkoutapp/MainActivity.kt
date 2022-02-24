package com.example.sevenminutesworkoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import com.example.sevenminutesworkoutapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding:ActivityMainBinding? = null
    //ActivityNameoffileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        // layout inflator prepares the binding object
        setContentView(binding?.root)
        // constraint layout is the root of this binding object

        //val flStartButton : FrameLayout = findViewById(R.id.flStart)

        binding?.flStart?.setOnClickListener{
            val intent = Intent(this, ExerciseActivity::class.java)
            startActivity(intent)

        }
    }
}