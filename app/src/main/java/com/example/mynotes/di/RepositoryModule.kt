package com.example.mynotes.di

import androidx.lifecycle.ViewModel
import com.example.mynotes.data.repositories.MyRepo
import com.example.mynotes.data.repositories.MyRepoImpl
import com.example.mynotes.ui.viewmodel.MyViewModel
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