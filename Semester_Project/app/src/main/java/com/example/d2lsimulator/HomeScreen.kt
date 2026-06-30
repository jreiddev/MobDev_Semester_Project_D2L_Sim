package com.example.d2lsimulator

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    onStartHere: () -> Unit,
    onModules: () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {

        Header("Home Page")

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp)
        ) {

            Spacer(modifier = Modifier.weight(1f)) //top spacer

            OutlinedButton(
                onClick = onStartHere,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
            ) {
                Text("START HERE")
            }

            Spacer(modifier = Modifier.height(40.dp)) //between buttons spacer

            OutlinedButton(
                onClick = onModules,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
            ) {
                Text("LEARNING MODULES")
            }

            Spacer(modifier = Modifier.weight(1f)) //below utton spacer
        }
    }
}
