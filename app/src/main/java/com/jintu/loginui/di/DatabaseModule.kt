

// src/main/java/com/jintu/loginui/di/DatabaseModule.kt
package com.jintu.loginui.di

import android.content.Context
import androidx.room.Room
import com.jintu.loginui.data.AppDatabase
import com.jintu.loginui.data.UserDao
import com.jintu.loginui.data.Userrepositoryimpl
import com.jintu.loginui.domain.Userrepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext: Context): AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "user_database"
        ).build()
    }

    @Provides
    @Singleton
    fun provideUserDao(appDatabase: AppDatabase): UserDao {
        return appDatabase.userDao()
    }

    @Provides
    @Singleton
    fun provideUserRepository(userRepositoryImpl: Userrepositoryimpl): Userrepository {
        return userRepositoryImpl
    }
}