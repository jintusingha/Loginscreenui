
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument


import com.jintu.loginui.ui.Screens.Loginscreen
import com.jintu.loginui.ui.Screens.WelcomeScreen

@Composable
fun ScreenNavigation(){
    val navController= rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ){

        composable("login"){
            Loginscreen(navController)
        }


        composable("welcome/{username}") { backStackEntry ->
            val username = backStackEntry.arguments?.getString("username")
            WelcomeScreen(username)
    }}
}