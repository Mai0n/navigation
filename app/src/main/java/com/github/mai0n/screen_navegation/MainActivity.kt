package com.github.mai0n.screen_navegation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.*
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.github.mai0n.screen_navegation.ui.theme.Screen_navegationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Screen_navegationTheme {

                val navController = rememberNavController()

                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    NavHost(
                        navController = navController,
                        startDestination = "login"
                    ) {

                        composable("login") {
                            LoginScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController = navController
                            )
                        }

                        composable("menu") {
                            MenuScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController = navController
                            )
                        }

                        composable(
                            route = "pedidos?status={status}",
                            arguments = listOf(
                                navArgument("status") {
                                    type = NavType.StringType
                                    defaultValue = "ativos" // diferente do professor
                                    nullable = true
                                }
                            )
                        ) { backStackEntry ->

                            val status =
                                backStackEntry.arguments?.getString("status") ?: "ativos"

                            PedidosScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController = navController,
                                status = status
                            )
                        }

                        composable("perfil") {
                            PerfilScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController = navController,
                                nome = "Visitante",
                                idade = "0"
                            )
                        }

                        composable("perfil/{nome}/{idade}") { backStackEntry ->

                            val nome =
                                backStackEntry.arguments?.getString("nome") ?: "Usuário"

                            val idade =
                                backStackEntry.arguments?.getString("idade") ?: "18"

                            PerfilScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController = navController,
                                nome = nome,
                                idade = idade
                            )
                        }
                    }
                }
            }
        }
    }
}