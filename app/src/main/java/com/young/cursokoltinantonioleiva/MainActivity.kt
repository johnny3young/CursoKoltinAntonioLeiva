package com.young.cursokoltinantonioleiva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast("Mi primera función jejejeje...")

        val tvMessage: EditText = findViewById(R.id.etmessage)
        val button:Button = findViewById(R.id.button)

        button.setOnClickListener {
            toast("Hola ${tvMessage.text}")
        }


    }


}