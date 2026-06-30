package com.example.d2lsimulator

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun ProjectScreen(onBack: () -> Unit) {

    Column(modifier = Modifier.fillMaxSize()) {
        val context = LocalContext.current

        Header("PROJECT INSTRUCTIONS")

        Column(
            modifier = Modifier
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {

            TextButton(onClick = onBack) {
                Text("← Back")
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text("All you need to know about the class project")

            Spacer(modifier = Modifier.height(20.dp))

            Text("Downloads:")

            TextButton(onClick = {
                openAssetFile(context, "Project_Guidelines.pdf")
            }) {
                Text("Download Project Instructions")
            }
        }
    }
}