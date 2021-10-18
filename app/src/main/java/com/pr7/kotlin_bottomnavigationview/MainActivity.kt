package com.pr7.kotlin_bottomnavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomnavigationview.setOnNavigationItemSelectedListener { item ->

            when(item.itemId){
                R.id.item1->{supportFragmentManager.beginTransaction().replace(R.id.linearlay,BlankFragment()).commit()}
                R.id.item2->{supportFragmentManager.beginTransaction().replace(R.id.linearlay,BlankFragment2()).commit()}
            }
            true
        }
    }
}