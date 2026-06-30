package com.example.d2lsimulator

import android.content.Context
//essentially legacy code, unable to finish in time
object AuthManager {

    private const val PREFS_NAME = "user_prefs"
    private const val KEY_EMAIL = "email"
    private const val KEY_PASSWORD = "password"

    fun register(context: Context, email: String, password: String) {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        prefs.edit()
            .putString(KEY_EMAIL, email)
            .putString(KEY_PASSWORD, password)
            .apply()
    }

    fun login(context: Context, email: String, password: String): Boolean {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val savedEmail = prefs.getString(KEY_EMAIL, null)
        val savedPassword = prefs.getString(KEY_PASSWORD, null)

        return email == savedEmail && password == savedPassword
    }

    fun isUserRegistered(context: Context): Boolean {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        return prefs.contains(KEY_EMAIL)
    }
}