package com.medisage.smart_mr.di

import android.app.Application
import com.medisage.smart_mr.data.manager.LocalUserManagerImpl
import com.medisage.smart_mr.data.remote.NewsApi
import com.medisage.smart_mr.data.repository.NewsRepositoryImpl
import com.medisage.smart_mr.domain.manager.LocalUserManager
import com.medisage.smart_mr.domain.repository.NewsRepository
import com.medisage.smart_mr.domain.usecases.app_entry.AppEntryUseCases
import com.medisage.smart_mr.domain.usecases.app_entry.ReadAppEntry
import com.medisage.smart_mr.domain.usecases.app_entry.SaveAppEntry
import com.medisage.smart_mr.domain.usecases.news.GetNews
import com.medisage.smart_mr.domain.usecases.news.NewsUseCases
import com.medisage.smart_mr.domain.usecases.news.SearchNews
import com.medisage.smart_mr.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
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

    @Provides
    @Singleton
    fun provideNewsApi(): NewsApi{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NewsApi::class.java)
    }

    @Provides
    @Singleton
    fun provideNewsRepository(
        newsApi: NewsApi
    ): NewsRepository = NewsRepositoryImpl(newsApi)


    @Provides
    @Singleton
    fun provideNewUseCases(
        newsRepository: NewsRepository
    ): NewsUseCases {
        return NewsUseCases(
            getNews = GetNews(newsRepository),
            searchNews = SearchNews(newsRepository)
        )
    }
}