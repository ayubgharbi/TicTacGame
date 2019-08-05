package com.ginggfreccs.startup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

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

        buChoise.setBackgroundResource(R.color.blue)
    }
}
