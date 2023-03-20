package com.example.mynotes.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.mynotes.data.repositories.MyRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlin.random.Random

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repo: MyRepo
): ViewModel() {

    private var selectedTab = 0

    fun getMyMessage(): String = repo.getString()

    fun onAddButtonClicked(){}

    fun getRandomNumber(): Int = Random.nextInt()

    fun setScreenFromPagerState(currentPage: Int){
        this.selectedTab = currentPage
        Log.d("TEST", "State is: $currentPage")
    }
}