package com.example.lab9lect10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import android.content.Context
import android.content.SharedPreferences
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity() {

    companion object {
        const val PREF_NAME = "MyAppPrefs"
        const val KEY_SETTING_1 = "setting_1"
        const val KEY_SETTING_2 = "setting_2"
    }

    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        sharedPreferences = getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        loadSettings()

        saveButton.setOnClickListener {
            saveSettings()
        }

    }
    private fun loadSettings() {
        val setting1Value = sharedPreferences.getString(KEY_SETTING_1, "")
        val setting2Value = sharedPreferences.getString(KEY_SETTING_2, "")

        setting1EditText.setText(setting1Value)
        setting2EditText.setText(setting2Value)
    }
    private fun saveSettings() {
        val setting1Value = setting1EditText.text.toString()
        val setting2Value = setting2EditText.text.toString()

        val editor = sharedPreferences.edit()
        editor.putString(KEY_SETTING_1, setting1Value)
        editor.putString(KEY_SETTING_2, setting2Value)
        editor.apply()

        finish()

    }

}