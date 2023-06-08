package com.example.lab10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private  val apiService = ApiClient.apiService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.IO).launch {
            try {
                val users = apiService.getUsers()
                saveUsersToFile(users)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    private fun saveUsersToFile(users: List<User>)
        val file = File("data.txt")
        file.writeText(users.toString())
}