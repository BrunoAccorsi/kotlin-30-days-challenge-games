package com.example.a30daysgames.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import com.example.a30daysgames.model.DayChallenge

@Composable
fun DayChallengeList(
    challenges: List<DayChallenge>, 
    contentPadding: PaddingValues = PaddingValues(
        top = 80.dp, // Safe zone for top system UI/menu
        bottom = 80.dp, // Safe zone for bottom navigation
        start = 0.dp,
        end = 0.dp
    )
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(BackgroundDarkBlue, BackgroundPurple)
                )
            ),
        contentPadding = contentPadding
    ) {
        itemsIndexed(challenges) { index, challenge ->
            DayChallengeCard(dayChallenge = challenge)
            
            if (index < challenges.size - 1) {
                GradientDivider()
            }
        }
    }
}

@Composable
fun GradientDivider() {
    Box(
        modifier = Modifier
            .padding(horizontal = 32.dp)
            .fillMaxWidth()
            .height(1.dp)
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        NeonPurple.copy(alpha = 0.1f),
                        NeonBlue.copy(alpha = 0.3f),
                        NeonPink.copy(alpha = 0.1f)
                    )
                )
            )
    )
}