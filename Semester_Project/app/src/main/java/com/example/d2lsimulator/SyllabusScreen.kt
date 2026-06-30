package com.example.d2lsimulator

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.platform.LocalContext

@Composable
fun SyllabusScreen(onBack: () -> Unit) {
    val context = LocalContext.current
    Column(modifier = Modifier.fillMaxSize()) {

        Header("SYLLABUS")

        Column(
            modifier = Modifier
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {

            TextButton(onClick = onBack) {
                Text("← Back")
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text("Syllabus for CS 4322:")

            Spacer(modifier = Modifier.height(20.dp))

            Text("Downloads:")

            TextButton(onClick = {
                openAssetFile(context, "4322_syllabus.pdf")
            }) {
                Text("Download Syllabus")
            }
        }
    }
}