package com.example.a30daysgames

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.a30daysgames.data.dayChallenges
import com.example.a30daysgames.ui.theme.DayChallengeList
import com.example.a30daysgames.ui.theme.A30DaysGamesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            A30DaysGamesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ChallengeApp()
                }
            }
        }
    }
}

@Composable
fun ChallengeApp() {
    DayChallengeList(challenges = dayChallenges)
}