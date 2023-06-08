package com.example.lab10


import java.io.File

class LoggingInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()

        val response = chain.proceed(request)

        val responseBody = response.body()?.string()
        responseBody?.let {
            val file = File("data.txt")
            file.writeText(responseBody)
        }

        return response
    }
}