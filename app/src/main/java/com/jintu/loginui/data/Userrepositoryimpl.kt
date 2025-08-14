package com.jintu.loginui.data

import com.jintu.loginui.domain.Userrepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Userrepositoryimpl @Inject constructor (private val userDao: UserDao): Userrepository{

    override suspend fun saveuser(user: User) {

        userDao.insertuser(user)

    }

}