package com.sample.customview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.sample.customview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        setupLoadingButton()
    }
    private fun setupLoadingButton(){
        binding.button.setOnClickListener {
            binding.button.startAnimation()

            Handler().postDelayed({
                binding.button.revertAnimation()
            },2000)
        }
    }
}