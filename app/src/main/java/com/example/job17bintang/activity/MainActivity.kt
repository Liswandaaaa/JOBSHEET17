package com.example.job17bintang.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.job17bintang.R
import com.example.job17bintang.fragment.*
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tib = findViewById<TabLayout>(R.id.tab)
        var fragment : Fragment = Busana()

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.framelayout, fragment)
        fragmentTransaction.commit()

        tib.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when(tab!!.position) {
                    0 -> fragment = Busana()
                    1 -> fragment = Kuliner()
                    2 -> fragment = Pplg()
                    3 -> fragment = To()
                    4 -> fragment = Tpfl()
                }

                val fT =supportFragmentManager.beginTransaction()
                fT.replace(R.id.framelayout, fragment)
                fT.commit()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })
    }
}