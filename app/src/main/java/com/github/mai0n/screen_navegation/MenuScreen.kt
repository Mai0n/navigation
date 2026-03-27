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
fun MenuScreen(modifier: Modifier = Modifier, navController: NavController) {

    val nomeUsuario = "Henrique"
    val idadeUsuario = "19"
    val filtroPedidos = "finalizados"

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF2C4EC7))
            .padding(32.dp)
    ) {

        Text(
            text = "MENU PRINCIPAL",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.TopCenter)
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
        ) {

            Button(
                onClick = {
                    navController.navigate("perfil/$nomeUsuario/$idadeUsuario")
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                modifier = Modifier.size(width = 220.dp, height = 50.dp)
            ) {
                Text(
                    text = "Ver Perfil",
                    fontSize = 18.sp,
                    color = Color.Blue
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    navController.navigate("pedidos?status=$filtroPedidos")
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                modifier = Modifier.size(width = 220.dp, height = 50.dp)
            ) {
                Text(
                    text = "Meus Pedidos",
                    fontSize = 18.sp,
                    color = Color.Blue
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = { navController.navigate("login") },
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                modifier = Modifier.size(width = 220.dp, height = 50.dp)
            ) {
                Text(
                    text = "Sair",
                    fontSize = 18.sp,
                    color = Color.Blue
                )
            }
        }
    }
}