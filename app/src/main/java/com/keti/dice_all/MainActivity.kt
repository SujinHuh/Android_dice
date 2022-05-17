package com.keti.dice_all

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.keti.dice_all.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.diceStartBtn.setOnClickListener {

            Toast.makeText(this, "주사위 Go", Toast.LENGTH_LONG).show()
            Log.d("MainActivity", Random.nextInt(1, 6).toString())
            Log.d("MainActivity", Random.nextInt(1, 6).toString())


        }
    }
}