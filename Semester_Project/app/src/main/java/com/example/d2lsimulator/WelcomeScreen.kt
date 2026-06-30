package com.example.d2lsimulator

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WelcomeScreen(onBack: () -> Unit) {

    Column(modifier = Modifier.fillMaxSize()) {

        Header("WELCOME")

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
                Welcome to the class!
                Hello everyone, and welcome!

                My name is Jyothsna Dinadayalane, and you can call me Mrs. JD. I will be your instructor for this course, and I want you to know how excited I am to embark on this journey with you. I have been a full-time lecturer in the College of Computing and Software Engineering at Kennesaw State University for the past two years, and I feel truly privileged to share my knowledge and experiences with you. Before teaching at KSU, I spent twelve years as a software developer and three years as a part-time lecturer, which has given me valuable insights that I hope will benefit you in your studies.

                I am passionate about both teaching and coding, and I genuinely care about your learning experience. Outside of my professional life, I enjoy cooking and watching web series, which helps me unwind and stay creative. I am here to support you, and I am looking forward to a wonderful semester together!

                About the course:

                This course primarily focuses on mobile sensor application development and security for smartphones and mobile telecommunication systems. Its goals are to provide students with real-world relevant mobile sensor app development and improve their knowledge and skills in mobile application development and mobile security.

                Please review the SYLLABUS, FAQs, and Oral Presentation Rubrics in the 'Start Here' module in the 'Content' folder.

                The first week is dedicated to orientation and an introduction to the course and Kotlin Basics. Take some time to explore the materials in the 'Start Here' folder for the first week, and then complete the Orientation Assignment and Orientation Quiz for bonus points. Also, please do not forget to introduce yourself to the class by participating in the Introduce Yourself discussion post! All of these activities are due by January 20. 

                This is a hybrid class (50% online, 50% in person), and all learning materials are available on D2L, including additional slides and links, are available on D2L.

                You can reach out to me via email at jdinaday@kennesaw.edu. Please do not use the D2L email tool, as it may delay my response. My office hours are Wednesday from 12:30 pm to 2:30 pm on Teams, or we can schedule a meeting at another time by appointment. Feel free to contact me if you encounter any issues with the course.

                I hope we will have a great and productive semester, and I look forward to getting to know all of you!
                
            """.trimIndent())

            Spacer(modifier = Modifier.height(20.dp))

        }
    }
}