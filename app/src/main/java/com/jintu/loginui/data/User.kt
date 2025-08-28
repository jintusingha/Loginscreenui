package com.jintu.loginui.data

import androidx.room.Dao
import androidx.room.Database
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.RoomDatabase
import kotlinx.serialization.descriptors.PrimitiveKind


@Entity(tableName = "users")
data class User(

    @PrimaryKey(autoGenerate = true)

    val id: Int = 0,
    val username: String,
    val password: String
)




@Dao
interface UserDao {

    @Insert
    suspend fun insertuser(user:User)

    @Query("select * from users where username=:username AND password=:password")
    suspend fun getusernameandpassword(username:String,password: String):User?
    
}


@Database(entities = [User::class], version = 1)
abstract class AppDatabase: RoomDatabase(){



    abstract fun userDao(): UserDao
}