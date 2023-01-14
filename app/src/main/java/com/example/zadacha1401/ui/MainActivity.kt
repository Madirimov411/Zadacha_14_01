package com.example.zadacha1401.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.example.zadacha1401.R
import com.example.zadacha1401.fragment.RecentsFragment
import com.example.zadacha1401.fragment.SearchFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        val search=findViewById<LinearLayout>(R.id.ll_search)
        val recents=findViewById<LinearLayout>(R.id.ll_recents)
        val searchFragment= SearchFragment()
        val recentsFragment= RecentsFragment()
        search.setOnClickListener {
            setFragment(searchFragment)
        }
        recents.setOnClickListener {
            setFragment(recentsFragment)
        }
    }

    private fun setFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.container,fragment).commit()
    }

}