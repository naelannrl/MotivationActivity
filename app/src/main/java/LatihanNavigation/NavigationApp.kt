package LatihanNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationApp() {
    val navController = rememberNavController() //dipakai unk screen saat button diklik akan kmn
    NavHost(
        navController = navController,
        startDestination = "screen_satu"
    ) {
        composable("screen_satu") {
            ScreenSatu(navController)
        }
        composable("screen_dua") {
            ScreenDua(navController)
        }
    }
}