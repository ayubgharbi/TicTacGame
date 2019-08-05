package com.ginggfreccs.startup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buSelect(view:View){
        val buChoise= view as Button
        var cellID=0
        when(buChoise.id){
            R.id.bu1-> cellID=1
            R.id.bu2-> cellID=2
            R.id.bu4-> cellID=3
            R.id.bu4-> cellID=4
            R.id.bu5-> cellID=5
            R.id.bu6-> cellID=6
            R.id.bu7-> cellID=7
            R.id.bu8-> cellID=8
            R.id.bu9-> cellID=9
        }
        Log.d("cellID:",cellID.toString())
        PlayGame(cellID,buChoise)
    }

        var player1=ArrayList<Int>()
        var player2=ArrayList<Int>()
        var activePlayer=1

        fun PlayGame(cellID:Int,buChoise:Button){

            if(activePlayer==1){
                buChoise.text="X"
                buChoise.setBackgroundResource(R.color.blue)
                player1.add(cellID)
                activePlayer=2
            }else{
                buChoise.text="O"
                buChoise.setBackgroundResource(R.color.darkgreen)
                player2.add(cellID)
                activePlayer=1
            }
            buChoise.isEnabled=false

            CheckWinner()
        }

        fun CheckWinner(){
            var winner=-1

            //row 1
            if(player1.contains(1) && player1.contains(2) && player1.contains(3)){
                winner=1
            }
            if(player2.contains(1) && player2.contains(2) && player2.contains(3)){
                winner=2
            }

            //row 2
            if(player1.contains(4) && player1.contains(5) && player1.contains(6)){
                winner=1
            }
            if(player2.contains(4) && player2.contains(5) && player2.contains(6)){
                winner=2
            }

            //row 3
            if(player1.contains(7) && player1.contains(8) && player1.contains(9)){
                winner=1
            }
            if(player2.contains(7) && player2.contains(8) && player2.contains(9)){
                winner=2
            }

            //col 1
            if(player1.contains(1) && player1.contains(4) && player1.contains(7)){
                winner=1
            }
            if(player2.contains(1) && player2.contains(4) && player2.contains(7)){
                winner=2
            }

            //col 2
            if(player1.contains(2) && player1.contains(5) && player1.contains(8)){
                winner=1
            }
            if(player2.contains(2) && player2.contains(5) && player2.contains(8)){
                winner=2
            }

            //col 3
            if(player1.contains(3) && player1.contains(6) && player1.contains(9)){
                winner=1
            }
            if(player2.contains(3) && player2.contains(6) && player2.contains(9)){
                winner=2
            }

            //case1
            if(player1.contains(1) && player1.contains(5) && player1.contains(9)){
                winner=1
            }
            if(player2.contains(1) && player2.contains(5) && player2.contains(9)){
                winner=2
            }

            //case2
            if(player1.contains(3) && player1.contains(5) && player1.contains(7)){
                winner=1
            }
            if(player2.contains(3) && player2.contains(5) && player2.contains(7)){
                winner=2
            }

            if (winner!=-1){

                if (winner==1){
                    Toast.makeText(this,"Player 1 win the game",Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this,"Player 2 win the game",Toast.LENGTH_LONG).show()
                }
            }
        }
}
