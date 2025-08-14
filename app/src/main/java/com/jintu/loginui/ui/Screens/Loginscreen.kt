package com.jintu.loginui.ui.Screens

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.jintu.loginui.ui.viewmodel.Loginscreenviewmodel

@Composable
fun Loginscreen(navController: NavController,viewModel: Loginscreenviewmodel){
    var username by remember { mutableStateOf("") }
    var password by remember {mutableStateOf("")}
    val context=LocalContext.current

    Column(modifier = Modifier.
    fillMaxSize().padding(16.dp),
        verticalArrangement =
            Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {

        // now we will use for first input field for our username
        OutlinedTextField(
            value = username,
            onValueChange = {username=it },
            label = {Text("Username")},
            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value=password,
            onValueChange ={password=it},
            label = {Text("Password")},
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))


        Button(modifier = Modifier.fillMaxWidth(),
            onClick = {

                viewModel.getuserdetails(username,password)







            }) {
            Text("Login")
        }


    }

}