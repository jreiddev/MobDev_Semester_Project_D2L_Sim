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
fun LabReportScreen(onBack: () -> Unit) {
    val context = LocalContext.current

    Column(modifier = Modifier.fillMaxSize()) {

        Header("LAB REPORT INSTRUCTIONS")

        Column(
            modifier = Modifier
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {

            TextButton(onClick = onBack) {
                Text("← Back")
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(""" 
            For each lab, please follow the lab manual instructions.
            
                1) At the end of each lab activity, please screenshot your
                   lab results in the coding IDE.
                
                2) Then, paste all the screenshots into a document,
                
                3) Name your lab as “ YourLastName_Lab_X_Report” 
                   (such as “John_Doe_2_Report”).
                
                Convert it into a PDF file to upload to D2L.
            """.trimIndent())

            Spacer(modifier = Modifier.height(20.dp))

            Text("Downloads:")

            TextButton(onClick = {
                openAssetFile(context, "Lab_Report_Instructions.pdf")
            }) {
                Text("Download Lab Instructions")
            }
        }
    }
}

