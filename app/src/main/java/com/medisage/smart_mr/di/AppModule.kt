package com.medisage.smart_mr.di

import android.app.Application
import com.medisage.smart_mr.data.manager.LocalUserManagerImpl
import com.medisage.smart_mr.domain.manager.LocalUserManager
import com.medisage.smart_mr.domain.usecases.AppEntryUseCases
import com.medisage.smart_mr.domain.usecases.ReadAppEntry
import com.medisage.smart_mr.domain.usecases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    @Singleton
    fun provideLocalUserManger(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    ): AppEntryUseCases = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )
}