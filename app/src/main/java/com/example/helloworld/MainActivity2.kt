package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val buttonInput : Button = findViewById(R.id.btnInput)
        val textInput : TextView = findViewById(R.id.textHasil);
        val inputForm : EditText = findViewById(R.id.input)
        val butonMove : Button = findViewById(R.id.move)
        buttonInput.setOnClickListener{
            textInput.setText(inputForm.text.toString())
        }

        butonMove.setOnClickListener {
            startActivity(Intent(this , MainActivity3::class.java))
        }
    }
}