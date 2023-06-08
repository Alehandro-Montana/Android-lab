package com.example.lab10

interface ApiService {
    @GET("users")
    suspend fun getUsers():List<User>
}