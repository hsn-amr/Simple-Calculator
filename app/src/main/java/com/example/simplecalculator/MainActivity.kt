package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.tv)

        val input1 = findViewById<EditText>(R.id.input1)
        val input2 = findViewById<EditText>(R.id.input2)

        val add = findViewById<Button>(R.id.add)
        val sub = findViewById<Button>(R.id.sub)
        val multi = findViewById<Button>(R.id.multi)
        val div = findViewById<Button>(R.id.div)

        add.setOnClickListener {
            if(input1.text.isNotEmpty() && input2.text.isNotEmpty()){
                tv.text = "${input1.text.toString().toDouble() + input2.text.toString().toDouble()}"
            }else{
                Toast.makeText(this, "Please, Enter Numbers", Toast.LENGTH_LONG).show()
            }
        }

        sub.setOnClickListener {
            if(input1.text.isNotEmpty() && input2.text.isNotEmpty()){
                tv.text = "${input1.text.toString().toDouble() - input2.text.toString().toDouble()}"
            }else{
                Toast.makeText(this, "Please, Enter Numbers", Toast.LENGTH_LONG).show()
            }
        }

        multi.setOnClickListener {
            if(input1.text.isNotEmpty() && input2.text.isNotEmpty()){
                tv.text = "${input1.text.toString().toDouble() * input2.text.toString().toDouble()}"
            }else{
                Toast.makeText(this, "Please, Enter Numbers", Toast.LENGTH_LONG).show()
            }
        }

        div.setOnClickListener {
            if(input1.text.isNotEmpty() && input2.text.isNotEmpty()){
                try {
                    tv.text = "${input1.text.toString().toDouble() / input2.text.toString().toDouble()}"
                }catch (e: Exception){
                    Toast.makeText(this, "You Can't Divide By Zero", Toast.LENGTH_LONG).show()
                    tv.text = ""
                }
            }else{
                Toast.makeText(this, "Please, Enter Numbers", Toast.LENGTH_LONG).show()
            }
        }
    }
}