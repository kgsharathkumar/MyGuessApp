package com.sharath.myguessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var answer = 0
    var isGameOver = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //generateAnswer()
        startOver()
    }
    fun generateAnswer() {

        answer = Random.nextInt(1,25)

        val answerTextView = findViewById<TextView>(R.id.answer)
        answerTextView.text = answer.toString()

    }

    fun startOver() {
        isGameOver = false
        generateAnswer()
        val answerTextView = findViewById<TextView>(R.id.answer)
        answerTextView.text = answer.toString()

    }

    fun btnStartOverTapped(view: View) {
        startOver()
    }

    fun btnSubmitTapped(view: View) {
        // generateAnswer()

        isGameOver = true


        val answerTextView = findViewById<TextView>(R.id.answer)
        answerTextView.text = answer.toString()

    }
}