package com.example.project230823

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.project230823.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var number = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            txtNumber.text = number.toString()

            // change background color
            txtNumber.setBackgroundResource(R.color.teal_700)


            btnCount.setOnClickListener {
                number++
                txtNumber.text = number.toString()
            }
            btnToast.setOnClickListener {
                Toast.makeText(this@MainActivity, "Last count: $number", Toast.LENGTH_SHORT).show()
            }
        }
    }
}