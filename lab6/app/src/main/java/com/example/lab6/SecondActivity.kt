package com.example.lab6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val message = intent.getStringExtra("EXTRA_MESSAGE")
        val count = intent.getIntExtra("EXTRA_COUNT", 0)

        messageTextView.text = message
        countTextView.text = "Count: $count"

        backButton.setOnClickListener {
            val replyIntent = Intent()
            replyIntent.putExtra("EXTRA_REPLY","Cпасибо за посещение")
            setResult(RESULT_OK, replyIntent)
            finish()
        }
    }
}