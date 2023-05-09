package com.example.lab5

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            Toast.makeText(this, "Кнопка нажата", Toast.LENGTH_SHORT).show()
        }

        binding.editText.setOnclickListener {
            Toast.makeText(this, "Текстовое поле нажато", Toast.LENGTH_SHORT).show()
        }

        binding.editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start:Int, count:Int, after:Int){
                //вызывается перед изменением текста
            }
            override fun onTextChanged(s: CharSquence?, start:Int, before:Int, count:Int){
                //при изменении текста
            }
            override fun afterTextChanged(s: Editable?){
                //после изменения текста
            }
        })
        //обработка события фокуса на текст.поле
        binding.editText.setOnFocusChangeListener { _, hasFocus ->
            if(hasFocus) {
                binding.editText.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary))
            }else {
                binding.editText.setTextColor(ContextCompat.getColor(this, R.color.black))
            }
        }
    }
}
class MyEventHandler(private val context: Context) {

    fun onButtonClick() {
        Toast.makeText(context, "", Toast.LENGTH_SHORT).show()
    }
    fun onEditTextClick() {
        Toast.makeText
    }
}