package com.example.lab9lect10

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.preference.PreferenceManager
import androidx.room.Room
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var appDatabase: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        appDatabase = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "my-database"
        ).build()

        val openSettingsButton = findViewById<Button>(R.id.openSettingsButton)
        openSettingsButton.setOnClickListener {
            openSettings()
        }
    }
    private fun openSettings() {
        val dialog = SettingsDialogFragment()
        dialog.show(supportFragmentManager, "SettingsDialog")
    }

    fun saveUserData(userData: UserData) {
        GlobalScope.launch(Dispatchers.IO) {
            appDatabase.userDao().insertUser(userData)
        }
    }

    fun getAllUserData(callback: (List<UserData>) -> Unit) {
        GlobalScope.launch(Dispatchers.IO) {
            val allUsers = appDatabase.userDao().getAllUsers()
            runOnUiThread {
                callback(allUsers)
            }

        }
    }
}
