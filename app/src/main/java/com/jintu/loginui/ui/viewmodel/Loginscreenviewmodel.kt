package com.jintu.loginui.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jintu.loginui.data.User
import com.jintu.loginui.domain.Signupusecase
import kotlinx.coroutines.launch


class Loginscreenviewmodel (private val signupusecase: Signupusecase): ViewModel(){


    fun getuserdetails(username:String, password:String){

        val newuser= User(1,username,password)
        viewModelScope.launch {
            signupusecase.execute(newuser)
        }




    }



}