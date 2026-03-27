package com.github.mai0n.screen_navegation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun PerfilScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    nome: String,
    idade: String
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF329F6B))
            .padding(32.dp)
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.align(Alignment.Center)
        ) {

            Text(
                text = "PERFIL",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Nome: $nome",
                fontSize = 20.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Idade: $idade anos",
                fontSize = 20.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { navController.navigate("menu") },
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                modifier = Modifier.size(width = 180.dp, height = 48.dp)
            ) {
                Text(
                    text = "Voltar",
                    fontSize = 18.sp,
                    color = Color.Blue
                )
            }
        }
    }
}