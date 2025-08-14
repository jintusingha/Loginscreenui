package com.jintu.loginui.domain

import com.jintu.loginui.data.User


interface Userrepository{
    suspend fun   saveuser(user: User)
}