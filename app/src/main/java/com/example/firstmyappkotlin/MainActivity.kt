package com.example.firstmyappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClicMe = findViewById<Button>(R.id.mybutton)
        val tvMyTextView = findViewById<TextView>(R.id.textView)
        var timesClicked =0
        btnClicMe.setOnClickListener{

            timesClicked += 1
            tvMyTextView.text = timesClicked.toString()
            Toast.makeText(this, "WITAJ RBBITV" , Toast.LENGTH_LONG).show()
        }
    }
}