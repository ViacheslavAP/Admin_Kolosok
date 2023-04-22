package ru.perelyginva.adminkolosok.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.perelyginva.adminkolosok.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding?.root)


    }
}