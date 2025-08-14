package com.jintu.loginui.data

import com.jintu.loginui.domain.Userrepository


class Userrepositoryimpl (private val userDao: UserDao): Userrepository{

    override suspend fun saveuser(user: User) {

        userDao.insertuser(user)

    }

}