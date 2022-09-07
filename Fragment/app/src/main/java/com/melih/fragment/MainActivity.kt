package com.melih.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.melih.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fm = supportFragmentManager
        val ft = fm.beginTransaction()

        ft.add(R.id.fragment_tutucu1,Fragment1())
        ft.add(R.id.fragment_tutucu2,Fragment2())
        ft.commit()
    }

}