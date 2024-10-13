package com.muhasib.rapisoft

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val searchFragment=SearchFragment()
        val publishFragment=PublishFragment()
        val inboxFragment=InboxFragment()
        val profileFragment=ProfileFragment()

        setCurrentFragment(searchFragment)
        val bottomNavigation=findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.searchCab_item->setCurrentFragment(searchFragment)
                R.id.PubishCab_item->setCurrentFragment(publishFragment)
                R.id.Inbox_item->setCurrentFragment(inboxFragment)
                R.id.ProfileItem->setCurrentFragment(profileFragment)
            }
            true
        }

    }
    private fun setCurrentFragment(fragment : Fragment){
        supportFragmentManager.beginTransaction().apply {

            replace(R.id.flFragment, fragment)
            commit()
        }
    }
}