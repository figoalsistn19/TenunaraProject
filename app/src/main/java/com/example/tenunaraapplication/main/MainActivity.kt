package com.example.tenunaraapplication.main

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.tenunaraapplication.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
//        val navController = findNavController(R.id.fragment)
//        val appBarConfiguration = AppBarConfiguration(setOf(
//            R.id.explore_fragment,
//            R.id.home_fragment,
//            R.id.profile_fragment
//        ))
//
//        setupActionBarWithNavController(navController,appBarConfiguration)
//        bottomNavigationView.setupWithNavController(navController)
//
//        val mFragmentManager = supportFragmentManager
//        val mHomeFragment = HomeFragment()
//        val fragment = mFragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)
//
//        if (fragment !is HomeFragment) {
//            Log.d("MyFlexibleFragment", "Fragment Name :" + HomeFragment::class.java.simpleName)
//            mFragmentManager
//                .beginTransaction()
//                .add(R.id.frame_container, mHomeFragment, HomeFragment::class.java.simpleName)
//                .commit()
    }
}