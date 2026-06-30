package com.example.d2lsimulator

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale

@Composable
fun LoginScreen(onLogin: () -> Unit) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Spacer(modifier = Modifier.height(40.dp))

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("D2L", style = MaterialTheme.typography.displayLarge, fontWeight = FontWeight.Bold)
            Text("Desire 2 Learn",style = MaterialTheme.typography.titleMedium)
        }

        OutlinedButton(
            onClick = onLogin,
            modifier = Modifier
                .width(200.dp)
                .height(50.dp)
        ) {
            Text("Sign In")
        }
        Image(
            painter = painterResource(id = R.drawable.ksu_d2l),
            contentDescription = "KSU Logo",
            modifier = Modifier
                .padding(top = 30.dp)
                .height(80.dp),
            contentScale = ContentScale.Fit
        )

        Text("Kennesaw State University", modifier = Modifier.padding(bottom = 40.dp))
    }
}