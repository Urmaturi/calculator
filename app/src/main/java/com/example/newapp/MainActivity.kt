package com.example.newapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textViewDiplay: TextView
    lateinit var buttonPlus: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textViewDiplay = findViewById(R.id.buttonPlus)

    }



    fun textAdd(view: View)
    {

    }


}