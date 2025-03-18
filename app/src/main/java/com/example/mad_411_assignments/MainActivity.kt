package com.example.mad_411_assignments


import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.ceil



class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var nameBox = findViewById<EditText>(R.id.nameBox);
        var resultBox = findViewById<TextView>(R.id.result)
        var button = findViewById<Button>(R.id.calc_button)

        button.setOnClickListener() {
            var nameText = nameBox.text
            resultBox.text = "Hello, $nameText !"

        }
    }
}
