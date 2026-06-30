package com.example.d2lsimulator

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StartHereScreen(
    onBack: () -> Unit,
    onNavigate: (String) -> Unit
) {

    Column(modifier = Modifier.fillMaxSize()) {

        Header("START HERE")
        TextButton(
            onClick = onBack,
            modifier = Modifier.padding(start = 16.dp, top = 8.dp)
        ) {
            Text("← Back")
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Top
        ) {

            OutlinedButton(
                onClick = { onNavigate("welcome") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .padding(vertical = 8.dp)
            ) {
                Text("WELCOME")
            }

            OutlinedButton(
                onClick = { onNavigate("syllabus") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .padding(vertical = 8.dp)
            ) {
                Text("SYLLABUS")
            }

            OutlinedButton(
                onClick = { onNavigate("lab") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .padding(vertical = 8.dp)
            ) {
                Text("LAB REPORT INSTRUCTIONS")
            }

            OutlinedButton(
                onClick = { onNavigate("project") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .padding(vertical = 8.dp)
            ) {
                Text("PROJECT INSTRUCTIONS")
            }
        }
    }
}