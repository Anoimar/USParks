package com.thernat.mapcompare.di

import com.thernat.mapcompare.api.NPService
import com.thernat.mapcompare.data.source.remote.ParkRemoteDataSource
import com.thernat.mapcompare.repository.ParkRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class NetworkModule {

    @Singleton
    @Provides
    fun provideNPService(): NPService {
        return NPService.create()
    }

    @Singleton
    @Provides
    fun provideNPRepository(remoteDataSource: ParkRemoteDataSource,
                          ) =
        ParkRepository(remoteDataSource)
}