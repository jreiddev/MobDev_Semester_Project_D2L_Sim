package com.example.d2lsimulator

import androidx.compose.runtime.*
import androidx.compose.material3.*
import androidx.compose.foundation.layout.*

@Composable
fun App() {
    var currentScreen by remember { mutableStateOf("login") }

    when (currentScreen) {
        "login" -> LoginScreen { currentScreen = "credentials" }
        "credentials" -> CredentialScreen { currentScreen = "home" }
        "home" -> HomeScreen(
            onStartHere = { currentScreen = "start_here" },
            onModules = { currentScreen = "modules" }
        )
        "start_here" -> StartHereScreen(
            onBack = { currentScreen = "home" },
            onNavigate = { screen -> currentScreen = screen }
        )
        "modules" -> ModulesScreen { currentScreen = "home" }
        "welcome" -> WelcomeScreen { currentScreen = "start_here" }
        "syllabus" -> SyllabusScreen { currentScreen = "start_here" }
        "lab" -> LabReportScreen { currentScreen = "start_here" }
        "project" -> ProjectScreen { currentScreen = "start_here" }
    }
}