package com.nikosis.triviatubeapp.di

import com.nikosis.triviatubeapp.common.Constants
import com.nikosis.triviatubeapp.data.api.TriviaApi
import com.nikosis.triviatubeapp.data.repository.TriviaRepo
import com.nikosis.triviatubeapp.data.repository.TriviaRepoImplement
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTriviaApi(): TriviaApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(TriviaApi::class.java)
    }

    @Provides
    @Singleton
    fun provideTriviaRepo(api: TriviaApi): TriviaRepo {
        return TriviaRepoImplement(api)
    }
}