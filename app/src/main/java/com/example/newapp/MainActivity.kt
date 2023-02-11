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

        if (textViewDiplay.text == "0")
            textViewDiplay.text = ""
        when (v.id) {
            // кнопка О1
            R.id.buttonNull -> textViewDiplay.text = textViewDiplay.text.toString() + "0"
            R.id.buttonOne -> textViewDiplay.text = textViewDiplay.text.toString() + "1"
            R.id.buttonTwo -> textViewDiplay.text = textViewDiplay.text.toString() + "2"
            R.id.buttonThree -> textViewDiplay.text = textViewDiplay.text.toString() + "3"
            R.id.buttonFour -> textViewDiplay.text = textViewDiplay.text.toString() + "4"
            R.id.buttonFive -> textViewDiplay.text = textViewDiplay.text.toString() + "5"
            R.id.buttonSix -> textViewDiplay.text = textViewDiplay.text.toString() + "6"
            R.id.buttonSeven -> textViewDiplay.text = textViewDiplay.text.toString() + "7"
            R.id.buttonEght -> textViewDiplay.text = textViewDiplay.text.toString() + "8"
            R.id.buttonNine -> textViewDiplay.text = textViewDiplay.text.toString() + "9"
        }
    }

    private var sign  = ""
    fun textAdd(view: View) {
        var temp: String

        when (view.id) {
            R.id.buttonDelenie -> {
                sign = "/"
                textViewDiplay.text = textViewDiplay.text.toString() + "/"

            }

            R.id.buttonPlus ->{
                textViewDiplay.text = textViewDiplay.text.toString() + "+"
                sign = "+"

            }

            R.id.buttonMinus -> {
                textViewDiplay.text = textViewDiplay.text.toString() + "-"
                sign = '-'.toString()
            }
            R.id.buttonUmnogenie -> {
                textViewDiplay.text = textViewDiplay.text.toString() + "*"
                sign = "*"
            }
            R.id.buttonRavno -> {

                temp = textViewDiplay.text.toString()
                var arr = temp.split(sign)
                var a: Double = arr[0].toDouble()
                //sign = arr[2]
                var b: Double = arr[1].toDouble()
                var c: Double = 0.0
                when (sign) {
                    "+" -> c = a + b
                    "-" -> c = a - b
                    "/" -> c = a / b
                    "*" -> c = a * b
                    else -> "error"

                }
                textViewDiplay.text = textViewDiplay.text.toString() + "="+ c
            }

            else -> sign += ""
        }
    }

    fun clearAll(view: View) {
        textViewDiplay.text = "0"
    }

    fun backspace(view: View) {
        val temp = textViewDiplay.text.chunked(1)
        var z = ""
        var i = 0
        while (i < temp.size - 1) {
            z += temp[i]
            i++
        }
        textViewDiplay.text = z
    }
}