package com.fadil.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.fadil.bottomnavigation.fragment.HomeFragment
import com.fadil.bottomnavigation.fragment.NotificationFragment
import com.fadil.bottomnavigation.fragment.SettingFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val notificationFragment = NotificationFragment()
        val settingFragment = SettingFragment()

        makeCurrentFragment (homeFragment)

        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottom_navigation.setOnNavigationItemSelectedListener {
            
        }
            }

            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fram_nav, fragment)
            commit()
        }

    }
}