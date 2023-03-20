package com.example.mynotes.di

import com.example.mynotes.data.repositories.MyRepo
import com.example.mynotes.ui.viewmodel.MyViewModel
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
    fun providesViewModel(repo: MyRepo): MyViewModel {
        return MyViewModel(repo)
    }

}