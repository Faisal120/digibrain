package com.example.digibrainmedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.get
import androidx.fragment.app.Fragment
import com.example.digibrainmedia.databinding.ActivityDashboardBinding
import com.example.digibrainmedia.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class Dashboard : AppCompatActivity() {

    private lateinit var  binding: ActivityDashboardBinding
    private lateinit var currentFragment : Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        val view : View = binding.root
        setContentView(view)

        binding.bottomNav.background = null
        binding.bottomNav.menu.get(2).isEnabled = false

        supportFragmentManager.beginTransaction().replace(R.id.fragment2,HomeFragment()).commit()

        binding.bottomNav.setOnNavigationItemSelectedListener(navlistener)
    }
    val navlistener = BottomNavigationView.OnNavigationItemSelectedListener {
        when (it.itemId) {
            R.id.home -> {
                currentFragment = HomeFragment()
            }
            R.id.history ->{
                currentFragment = HomeFragment()
            }
            R.id.cards ->
            {
                currentFragment = HomeFragment()
            }
            R.id.profile ->
            {
                currentFragment = HomeFragment()
            }
        }
        supportFragmentManager.beginTransaction().replace(R.id.fragment2, currentFragment)
            .commit()
        true

    }
}