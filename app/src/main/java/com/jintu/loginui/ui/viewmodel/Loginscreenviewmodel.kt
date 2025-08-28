package com.jintu.loginui.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.jintu.loginui.data.UserDao
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class Loginscreenviewmodel @Inject constructor(private val userDao: UserDao): ViewModel(){

    fun login(userinput:String,passwordinput:String,onResult: (Boolean) -> Unit){
        viewModelScope.launch {
            try {
                val user=userDao.getusernameandpassword(userinput,passwordinput)
                onResult(user!=null)
                if(user!=null){
                    Log.d("Loginscreen","login successfull for :${user.username}")
                }else{
                    Log.d("Loginscreen","login not successfull")

                }
            }catch (e: Exception){
                Log.e("LoginScreen", "Login failed due to an error: ${e.message}")

            }
        }
    }
}