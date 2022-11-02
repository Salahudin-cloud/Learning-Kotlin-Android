package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val angka : TextView = findViewById(R.id.angka)
        val btnCount : Button = findViewById(R.id.buttonCount)
        val btnClear : Button = findViewById(R.id.buttonClear)
        val btnMovee : Button = findViewById(R.id.moveBtn)
        var i = 0;
        btnCount.setOnClickListener{
            i++;
            angka.setText(i.toString())
        }

        btnClear.setOnClickListener{
            i = 0;
            angka.setText("0")
        }

        btnMovee.setOnClickListener {
            startActivity(Intent(this, MainActivity4::class.java))
        }
    }
}