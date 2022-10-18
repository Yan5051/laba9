package com.bignerdranch.androin.checkmass

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.text.Layout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class checkedActivity : AppCompatActivity() {
    private lateinit var result: TextView
    private lateinit var viewActivity: ConstraintLayout
    private lateinit var bgc: ConstraintLayout

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checked)
        val int = intent.getStringExtra("IMP")

        result = findViewById(R.id.ResultTextView)

        bgc = findViewById(R.id.bgc)


        if (int != null) {
            if(int.toDouble() >= 18.5 && int.toDouble() <= 25) {
                result.text = "Результат: " + Math.round(int.toDouble())
                bgc.setBackgroundResource(R.color.normal)
            } else if(int.toDouble() >= 0.0 && int.toDouble() <= 18.4) {
                result.text = "Результат: " + Math.round(int.toDouble())
                bgc.setBackgroundResource(R.color.mid)
            } else if(int.toDouble() >= 25.1 && int.toDouble() <= 70.0) {
                result.text = "Результат: " + Math.round(int.toDouble())
                bgc.setBackgroundResource(R.color.bad)
            }

        }
    }
}