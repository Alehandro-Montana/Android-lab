package com.example.lab9lect10

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {
    @Query("SELECT * FROM user_data")
    suspend fun getAllUsers(): List<UserData>

    @Insert
    suspend fun  insertUser(user: UserData)
}