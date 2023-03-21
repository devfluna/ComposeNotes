package com.example.mynotes.di

import com.example.mynotes.data.repositories.MyRepo
import com.example.mynotes.data.repositories.MyRepoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindsMyRepo(impl: MyRepoImpl): MyRepo

}