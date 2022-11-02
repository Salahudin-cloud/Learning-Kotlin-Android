package com.example.helloworld

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var text : TextView
    private lateinit var button : Button
    private lateinit var buttonMove : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inisialisasi komponen
        text = findViewById(R.id.text)
        button = findViewById(R.id.btn)
        buttonMove = findViewById(R.id.btnMove)


        button.setOnClickListener{
            text.setText("Hi From Kotlin!")
            Toast.makeText(this, "Hello World ", Toast.LENGTH_SHORT ).show()
        }

        buttonMove.setOnClickListener{
//            val intent  = Intent(this , MainActivity2::class.java)
//            startActivity(intent)

            //shorthand jika tidak ada data yang dikirimkan ke activty lain ( cuman berpindah saja)
            startActivity(Intent(this , MainActivity2::class.java))
        }
    }
}