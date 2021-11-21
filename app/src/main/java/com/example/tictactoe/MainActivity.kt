package com.example.tictactoe

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.graphics.toColorFilter

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    private lateinit var resetButton: Button
    private lateinit var score1: TextView
    private lateinit var score2: TextView


    private var activePlayer = 1
    private var firstPlayer = ArrayList<Int>()
    private var secondPlayer = ArrayList<Int>()

    var first = 0
    var second = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

    }

    private fun init() {
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)
        score1 = findViewById(R.id. score1)
        score2 = findViewById(R.id. score2)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)

        resetButton = findViewById(R.id.resetButton)

    }


    override fun onClick(ClickedView: View?) {

        if (ClickedView is Button) {
            var buttonNumber = 0

            when (ClickedView.id) {
                R.id.button1 -> buttonNumber = 1
                R.id.button2 -> buttonNumber = 2
                R.id.button3 -> buttonNumber = 3
                R.id.button4 -> buttonNumber = 4
                R.id.button5 -> buttonNumber = 5
                R.id.button6 -> buttonNumber = 6
                R.id.button7 -> buttonNumber = 7
                R.id.button8 -> buttonNumber = 8
                R.id.button9 -> buttonNumber = 9
            }
            if (buttonNumber != 0) {
                PlayGame(ClickedView, buttonNumber)
            }
        }

    }

    private fun PlayGame(clickedView: Button, buttonNumber: Int) {
        if (activePlayer == 1) {
            activePlayer = 2
            clickedView.text = "X"
            clickedView.setBackgroundColor(Color.WHITE)
            firstPlayer.add(buttonNumber)
        } else {
            activePlayer = 1
            clickedView.text = "O"
            clickedView.setBackgroundColor(Color.WHITE)
            secondPlayer.add(buttonNumber)
        }

        resetButton.setOnClickListener {
            button1.isEnabled = true
            button1.text = ""
            firstPlayer.remove(1)
            secondPlayer.remove(1)
            button1.setBackgroundColor(Color.rgb(1, 135, 134))

            button2.isEnabled = true
            button2.text = ""
            firstPlayer.remove(2)
            secondPlayer.remove(2)
            button2.setBackgroundColor(Color.rgb(1, 135, 134))

            button3.isEnabled = true
            button3.text = ""
            firstPlayer.remove(3)
            secondPlayer.remove(3)
            button3.setBackgroundColor(Color.rgb(1, 135, 134))

            button4.isEnabled = true
            button4.text = ""
            firstPlayer.remove(4)
            secondPlayer.remove(4)
            button4.setBackgroundColor(Color.rgb(1, 135, 134))

            button5.isEnabled = true
            button5.text = ""
            firstPlayer.remove(5)
            secondPlayer.remove(5)
            button5.setBackgroundColor(Color.rgb(1, 135, 134))

            button6.isEnabled = true
            button6.text = ""
            firstPlayer.remove(6)
            secondPlayer.remove(6)
            button6.setBackgroundColor(Color.rgb(1, 135, 134))

            button7.isEnabled = true
            button7.text = ""
            firstPlayer.remove(7)
            secondPlayer.remove(7)
            button7.setBackgroundColor(Color.rgb(1, 135, 134))

            button8.isEnabled = true
            button8.text = ""
            firstPlayer.remove(8)
            secondPlayer.remove(8)
            button8.setBackgroundColor(Color.rgb(1, 135, 134))

            button9.isEnabled = true
            button9.text = ""
            firstPlayer.remove(9)
            secondPlayer.remove(9)
            button9.setBackgroundColor(Color.rgb(1, 135, 134))


        }
        clickedView.isEnabled = false
        check()
    }
    private fun disableButtons(){
        button1.isEnabled = false
        button2.isEnabled = false
        button3.isEnabled = false
        button4.isEnabled = false
        button5.isEnabled = false
        button6.isEnabled = false
        button7.isEnabled = false
        button8.isEnabled = false
        button9.isEnabled = false
    }


    private fun check() {
        var winnerPlayer = 0
        if (firstPlayer.contains(1) && firstPlayer.contains(2) && firstPlayer.contains(3)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(1) && secondPlayer.contains(2) && secondPlayer.contains(3)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(4) && firstPlayer.contains(5) && firstPlayer.contains(6)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(4) && secondPlayer.contains(5) && secondPlayer.contains(6)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(7) && firstPlayer.contains(8) && firstPlayer.contains(9)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(7) && secondPlayer.contains(8) && secondPlayer.contains(9)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(1) && firstPlayer.contains(4) && firstPlayer.contains(7)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(1) && secondPlayer.contains(4) && secondPlayer.contains(7)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(2) && firstPlayer.contains(5) && firstPlayer.contains(8)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(2) && secondPlayer.contains(5) && secondPlayer.contains(8)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(3) && firstPlayer.contains(6) && firstPlayer.contains(9)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(3) && secondPlayer.contains(6) && secondPlayer.contains(9)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(1) && firstPlayer.contains(5) && firstPlayer.contains(9)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(1) && secondPlayer.contains(5) && secondPlayer.contains(9)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(3) && firstPlayer.contains(5) && firstPlayer.contains(7)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(3) && secondPlayer.contains(5) && secondPlayer.contains(7)) {
            winnerPlayer = 2
        }
//        if(firstPlayer.contains(1) || secondPlayer.contains(1)
//            &&firstPlayer.contains(2) || secondPlayer.contains(2)
//            &&firstPlayer.contains(3) || secondPlayer.contains(3)
//            &&firstPlayer.contains(4) || secondPlayer.contains(4)
//            &&firstPlayer.contains(5) || secondPlayer.contains(5)
//            &&firstPlayer.contains(6) || secondPlayer.contains(6)
//            &&firstPlayer.contains(7) || secondPlayer.contains(7)
//            &&firstPlayer.contains(8) || secondPlayer.contains(8)
//            &&firstPlayer.contains(9) || secondPlayer.contains(9)){
//            winnerPlayer = 3
//        }



        if (winnerPlayer == 1) {
            first ++
            score1.text = first.toString()
            disableButtons()
            Toast.makeText(this, "the winner is player1", Toast.LENGTH_SHORT).show()
        } else if (winnerPlayer == 2) {
            second ++
            score2.text = second.toString()
            disableButtons()
            Toast.makeText(this, "the winner is player2", Toast.LENGTH_SHORT).show()
        }
//        if (winnerPlayer !==1 && winnerPlayer!== 2 && winnerPlayer == 3) {
//            Toast.makeText(this, "draw", Toast.LENGTH_SHORT).show()
//        }
    }
}


