package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkBtn.setOnClickListener{checkPrime()}
        // Write your code here

    }

    private fun checkPrime () {
        try {
            editText.text.toString().toInt()
        } catch (E:NumberFormatException) {
            textView.text = "error"
            return
        }
        var count: Int = 0
        var chislo: Int = editText.text.toString().toInt()

        for (i in 1 until chislo+1 ) {
           if (chislo % i == 0) count++
        }

        if (count == 2) textView.text = "prime" else textView.text = "not prime"
    }
}
