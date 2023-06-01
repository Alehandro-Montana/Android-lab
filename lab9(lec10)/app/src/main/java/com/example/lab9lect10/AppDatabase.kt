package com.example.lab9lect10

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [UserData::class], version = 1)

abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}