package com.jintu.loginui

import ScreenNavigation
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.jintu.loginui.ui.Screens.Loginscreen
import com.jintu.loginui.ui.theme.LoginuiTheme




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginuiTheme {
                ScreenNavigation()

            }
        }
    }
}

