package com.example.week_3_assignment_fulyaaa

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

class ProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        setupNavController()
    }

    private fun setupNavController(){
        val navHostFragment =supportFragmentManager.findFragmentById(R.id.fragment_container_view) as NavHostFragment
    }
}