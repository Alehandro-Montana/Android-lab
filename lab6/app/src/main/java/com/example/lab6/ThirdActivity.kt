package com.example.lab6

import android.os.Parcel
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val person = intent.getParcelableExtra<Person>("person")
        val nameTextView = findViewById<TextView>(R.id.nameTextView)
        val ageTextView = findViewById<TextView>(R.id.ageTextView)

        nameTextView.text = person.name
        ageTextView.text = person.age.toString()
    }
}