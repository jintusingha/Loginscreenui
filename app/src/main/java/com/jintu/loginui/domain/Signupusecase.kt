package com.jintu.loginui.domain

import com.jintu.loginui.data.User


class Signupusecase (private val userrepository:Userrepository){

    suspend fun execute(user: User){

        userrepository.saveuser(user)






    }


}