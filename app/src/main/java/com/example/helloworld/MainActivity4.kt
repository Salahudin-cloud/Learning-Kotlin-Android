package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        var input1 : EditText = findViewById(R.id.inputNumber1)
        var input2 : EditText = findViewById(R.id.inputNumber2)
        val tambah : Button  = findViewById(R.id.buttonTambah)
        val kali : Button = findViewById(R.id.buttonKali)
        val bagi : Button = findViewById(R.id.buttonBagi)
        val kurang : Button = findViewById(R.id.buttonKurang)
        val modul : Button = findViewById(R.id.buttonMod)
        val hasil : TextView = findViewById(R.id.hasil)

        tambah.setOnClickListener {
            var value = input1.text.toString().toInt() + input2.text.toString().toInt()
            hasil.setText(value.toString())
        }

        kali.setOnClickListener {
            var value = input1.text.toString().toInt() * input2.text.toString().toInt()
            hasil.setText(value.toString())
        }
        bagi.setOnClickListener {
            var value = input1.text.toString().toDouble() / input2.text.toString().toDouble()
            hasil.setText(value.toString())
        }
        kurang.setOnClickListener {
            var value = input1.text.toString().toInt() - input2.text.toString().toInt()
            hasil.setText(value.toString())
        }
        modul.setOnClickListener {
            var value = input1.text.toString().toDouble() % input2.text.toString().toDouble()
            hasil.setText(value.toString())
        }
    }


}

