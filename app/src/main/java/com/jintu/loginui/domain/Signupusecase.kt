package com.jintu.loginui.domain

import com.jintu.loginui.data.User
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Signupusecase @Inject constructor (private val userrepository:Userrepository){

    suspend fun execute(user: User){

        userrepository.saveuser(user)






    }


}