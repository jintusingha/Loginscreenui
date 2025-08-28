
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.jintu.loginui.ui.Screens.LoginScreen


import com.jintu.loginui.ui.Screens.Signupscreen
import com.jintu.loginui.ui.Screens.WelcomeScreen

@Composable
fun ScreenNavigation(){
    val navController= rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ){

        composable("login"){
            Signupscreen(navController)
        }
        composable ("signup"){
            LoginScreen(navController)
        }
        composable ("welcome"){
            WelcomeScreen(navController)
        }



    }
}