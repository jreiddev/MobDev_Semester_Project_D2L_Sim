package com.example.d2lsimulator

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext

@Composable
fun ModulesScreen(onBack: () -> Unit) {

    var selectedModule by remember { mutableStateOf<Int?>(null) }
    val context = LocalContext.current
    Column(modifier = Modifier.fillMaxSize()) {
        TextButton(
            onClick = onBack,
            modifier = Modifier.padding(start = 16.dp, top = 8.dp)
        ) {
            Text("← Back")
        }

        Header("LEARNING MODULES")

        if (selectedModule == null) {

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                    contentPadding = PaddingValues(bottom = 50.dp)
            ) {
                items((1..13).toList()) { module ->
                    OutlinedButton(
                        onClick = { selectedModule = module },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(70.dp)
                            .padding(vertical = 8.dp)
                    ) {
                        Text("MODULE $module")
                    }
                }
            }

        } else {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text("Module $selectedModule")

                Spacer(modifier = Modifier.height(20.dp))

                Row {
                    OutlinedButton(onClick = {
                        if (selectedModule!! > 1) selectedModule = selectedModule!! - 1
                    }) {
                        Text("<")
                    }

                    Spacer(modifier = Modifier.width(10.dp))

                    OutlinedButton(onClick = {
                        if (selectedModule!! < 13) selectedModule = selectedModule!! + 1
                    }) {
                        Text(">")
                    }
                }

                Spacer(modifier = Modifier.height(40.dp))

                TextButton(onClick = {
                    openAssetFile(
                        context,
                        "module${selectedModule}_Slides.pdf"
                    )
                }) {
                    Text("Slides")
                }

                Spacer(modifier = Modifier.height(40.dp))

                Divider(modifier = Modifier.fillMaxWidth())

                Spacer(modifier = Modifier.height(40.dp))

                TextButton(onClick = {
                    openLink(
                        context,
                        getLabLink(selectedModule!!)
                    )
                }) {
                    Text("Lab")
                }
            }
        }
    }
}



fun getLabLink(module: Int): String {
    return when (module) { //android compose has 20 lessons, course has 13 modules with 10 labs, exact link to some labs became unavailable.
        1 -> "https://developer.android.com/courses/pathways/android-basics-compose-unit-1-pathway-2"
        2 -> "https://developer.android.com/courses/pathways/android-basics-compose-unit-1-pathway-3"
        3 -> "https://developer.android.com/courses/pathways/android-basics-compose-unit-2-pathway-1"
        4 -> "https://developer.android.com/courses/pathways/android-basics-compose-unit-2-pathway-2"
        5 -> "https://developer.android.com/courses/pathways/android-basics-compose-unit-4-pathway-1"
        6 -> "https://developer.android.com/courses/pathways/android-basics-compose-unit-4-pathway-2"
        7 -> "https://developer.android.com/courses/pathways/android-architecture"
        8 -> "https://developer.android.com/courses/pathways/android-basics-compose-unit-4-pathway-3"
        9 -> "https://developer.android.com/courses/pathways/android-development-with-kotlin-9"
        10 -> "https://developer.android.com/courses/pathways/android-basics-compose-unit-5-pathway-1"
        11 -> "https://developer.android.com/courses/pathways/android-basics-compose-unit-7-pathway-1"
        12 -> "https://developer.android.com/courses/pathways/android-basics-compose-unit-8-pathway-1"
        13 -> "https://developer.android.com/courses/pathways/android-basics-compose-unit-8-pathway-2"
        else -> ""
    }
}