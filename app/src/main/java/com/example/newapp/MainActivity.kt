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
        textViewDiplay = findViewById(R.id.textViewDisplay)
        buttonPlus = findViewById(R.id.buttonPlus)

    }


    fun onClick(v: View) {
        // по id определеяем кнопку, вызвавшую этот обработчик
        when(v.id) {
            // кнопка О1
                R.id.


            R.id.btnOk -> tvOut.text = "Нажата кнопка ОК"
            // кнопка Cancel
            R.id.btnCancel -> tvOut.text = "Нажата кнопка Cancel"
        }
    }

    fun textAdd(view: View) {
        textViewDiplay.text = textViewDiplay.text.toString() + buttonPlus.text.toString()
    }

    fun clearAll(view: View) {
        textViewDiplay.text = "0"
    }

    fun backspace(view: View)
    {
        val temp  = textViewDiplay.text.chunked(1)
        var z = ""
        var i = 0
        while (i<temp.size-1)
        {
            z+=temp[i]
            i++
        }
        textViewDiplay.text = z
    }




}