package com.jintu.loginui.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jintu.loginui.data.User
import com.jintu.loginui.domain.Signupusecase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class Signupscreenviewmodel @Inject constructor(private val signupusecase: Signupusecase): ViewModel(){


    fun getuserdetails(username:String, password:String){



        val newuser = User(username = username, password = password)
        viewModelScope.launch {
            signupusecase.execute(newuser)
        }




    }



}