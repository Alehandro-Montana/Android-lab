package com.example.lab6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        btn_start.setOnClickListener {
            val name = et_name.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("name",name)

            startActivity(intent)
        }


    }
}