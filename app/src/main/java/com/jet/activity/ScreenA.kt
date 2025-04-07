package com.jet.activity

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController



@Composable
fun ScreenA(navController: NavController)
{
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = "Screen A", style = TextStyle(
            fontWeight = FontWeight.ExtraBold,
            fontSize = 28.sp
        ))

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate(Routes.ScreenB)

        }) { Text(text = "Click to Go Screen B")}
    }

}