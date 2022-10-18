package com.bignerdranch.androin.checkmass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    private lateinit var checkMass: Button
    private lateinit var inpR: EditText
    private lateinit var inpV: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkMass = findViewById(R.id.buttonCheck)
        inpR = findViewById(R.id.inpR)
        inpV = findViewById(R.id.inpV)



        checkMass.setOnClickListener {
            val checked = Intent(this, checkedActivity::class.java)
            val rost = inpR.text.toString().toDouble()
            val ves = inpV.text.toString().toInt()

            val imt: Double = ves / (rost / 100).pow(2)
            //val imt = ves/Math.pow(rost/100,2.0)
            checked.putExtra("IMP", imt.toString())
            startActivity(checked)
        }



    }
}